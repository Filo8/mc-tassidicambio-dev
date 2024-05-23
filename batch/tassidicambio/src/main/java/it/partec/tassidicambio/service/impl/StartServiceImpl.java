package it.partec.tassidicambio.service.impl;

import it.partec.tassidicambio.dto.CurrencyResponse;
import it.partec.tassidicambio.service.CurrenciesService;
import it.partec.tassidicambio.service.ExchangeRateService;
import it.partec.tassidicambio.service.StartService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StartServiceImpl implements StartService {

    private static final Logger log = LoggerFactory.getLogger(StartServiceImpl.class);

    @Value("${flag.storico}")
    private Boolean flagStorico;

    @Autowired
    private CurrenciesService currenciesService;

    @Autowired
    private ExchangeRateService exchangeRateService;

    @Override
    public void start() {
        log.info("Scarico i dati dalla Banca d'Italia ...");
        CurrencyResponse dto = currenciesService.getAllCurrencys();
        log.info("cancello i vecchi dati sulla tabella...");
        currenciesService.deleteAll();
        log.info("salvo i dati sul db...");
        currenciesService.saveCurrencies(dto);

        if(flagStorico) {
            exchangeRateService.inserimentoStorico();
        } else {
            exchangeRateService.inserimentoGiornaliero();
        }
    }
}
