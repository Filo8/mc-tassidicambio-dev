package it.partec.tassidicambio.service;

import it.partec.tassidicambio.dto.CurrencyResponse;

public interface CurrenciesService {


    CurrencyResponse getAllCurrencys();

    void saveCurrencies(CurrencyResponse dto);

    void deleteAll();
}
