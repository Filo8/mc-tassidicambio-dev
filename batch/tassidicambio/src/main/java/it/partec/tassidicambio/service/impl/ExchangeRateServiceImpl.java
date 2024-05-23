package it.partec.tassidicambio.service.impl;

import it.partec.tassidicambio.dto.ExchangeRateResponse;
import it.partec.tassidicambio.dto.Rate;
import it.partec.tassidicambio.model.ExchangeRate;
import it.partec.tassidicambio.repository.ExchangeRateRepository;
import it.partec.tassidicambio.service.ExchangeRateService;
import it.partec.tassidicambio.util.Costants;
import it.partec.tassidicambio.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class ExchangeRateServiceImpl implements ExchangeRateService {


    @Value("${url.tassidicambio}")
    private String url;

    @Value("${inizio.data.storico}")
    private String dataStorico;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;


    private ExchangeRateResponse getExchangeRate(String data, String valuta){

        String urlIso = url + "?referenceDate=" + data + "&currencyIsoCode=" + valuta;
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<ExchangeRateResponse> entity = new HttpEntity<>(headers);

         return restTemplate.getForObject(urlIso,  ExchangeRateResponse.class, entity);
    }


    @Transactional
    private void saveExchenge(ExchangeRateResponse resp, String valuta) {
        List<ExchangeRate> exchangeRateList = new ArrayList<>();
        for(Rate ex : resp.getRates()){
            ExchangeRate exchangeRate = new ExchangeRate();
            BeanUtils.copyProperties(ex, exchangeRate);
            exchangeRate.setReferenceCurrency(valuta);
            exchangeRate.setTmsInsert(new Date());
            exchangeRateList.add(exchangeRate);
        }

        exchangeRateRepository.saveAll(exchangeRateList);
    }

    @Transactional
    private void deleteByreferenceDateAndReferenceCurrency(LocalDate dateYesterday, String valuta) {
        exchangeRateRepository.deleteByReferenceDateAndReferenceCurrency(dateYesterday, valuta);
    }

    @Override
    public void inserimentoStorico() {
        log.info("Scarico lo storico fino ad oggi...");
        dataStorico = DateUtil.convertiData(dataStorico);
        do{

            ExchangeRateResponse resp = getExchangeRate(dataStorico,Costants.EURO);
            if(resp != null) {
                deleteByreferenceDateAndReferenceCurrency(DateUtil.convertiLocalDate(dataStorico), Costants.EURO);
                saveExchenge(resp, Costants.EURO);
            }
            resp = getExchangeRate(dataStorico, Costants.DOLLARO);
            if(resp != null) {
                deleteByreferenceDateAndReferenceCurrency(DateUtil.convertiLocalDate(dataStorico), Costants.DOLLARO);
                saveExchenge(resp, Costants.DOLLARO);
            }

            dataStorico = DateUtil.addDay(dataStorico);

        } while (DateUtil.compareDate(dataStorico, LocalDate.now()));
    }

    @Override
    public void inserimentoGiornaliero() {
        log.info("Scarico le valute di scambio in EURO..");
        ExchangeRateResponse resp = getExchangeRate(DateUtil.getYesterday() ,Costants.EURO);
        if(resp != null) {
            log.info("cancello i vecchi dati sulla tabella in base alla data e la currency EUR...");
            deleteByreferenceDateAndReferenceCurrency(DateUtil.getDateYesterday(), Costants.EURO);
            log.info("salvo i dati sul db...");
            saveExchenge(resp, Costants.EURO);
        }
        log.info("Scarico le valute di scambio in DOLLARO..");
        resp = getExchangeRate(DateUtil.getYesterday(), Costants.DOLLARO);
        if(resp != null) {
            log.info("cancello i vecchi dati sulla tabella in base alla data e la currency DOLLARO...");
            deleteByreferenceDateAndReferenceCurrency(DateUtil.getDateYesterday(), Costants.DOLLARO);
            log.info("salvo i dati sul db...");
            saveExchenge(resp, Costants.DOLLARO);
        }
    }


}
