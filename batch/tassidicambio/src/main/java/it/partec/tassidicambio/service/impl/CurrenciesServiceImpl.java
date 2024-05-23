package it.partec.tassidicambio.service.impl;

import it.partec.tassidicambio.dto.Country;
import it.partec.tassidicambio.dto.Currency;
import it.partec.tassidicambio.dto.CurrencyResponse;
import it.partec.tassidicambio.model.Currencies;
import it.partec.tassidicambio.repository.CurrencyRepository;
import it.partec.tassidicambio.service.CurrenciesService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class CurrenciesServiceImpl implements CurrenciesService {

    @Value("${url.bancaitalia}")
    private String url;


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CurrencyRepository currencyRepository;


    @Override
    public CurrencyResponse getAllCurrencys() {
        return restTemplate.getForObject(url, CurrencyResponse.class);
    }

    @Transactional
    @Override
    public void saveCurrencies(CurrencyResponse dto) {
        List<Currency> listCurrencies = dto.getCurrencies();
        List<Currencies> listSave = new ArrayList<>();
        for(Currency currencie : listCurrencies){
            for(Country country : currencie.getCountries()){
                final Currencies currency = getCurrencies(currencie, country);
                listSave.add(currency);
            }
        }
        currencyRepository.saveAll(listSave);
    }

    private static Currencies getCurrencies(Currency currencie, Country country) {
        Currencies currency = new Currencies();
        currency.setCurrencyISO(currencie.getIsoCode());
        currency.setCurrencyName(currencie.getName());
        currency.setCountry(country.getCountry());
        currency.setCountryISO(country.getCountryISO());
        currency.setValidityStartDate(country.getValidityStartDate());
        currency.setValidityEndDate(country.getValidityEndDate());
        currency.setTmsInsert(new Date());
        return currency;
    }

    @Transactional
    @Override
    public void deleteAll() {
        currencyRepository.deleteAll();
    }
}
