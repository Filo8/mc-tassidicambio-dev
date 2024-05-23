package it.bi_rest.bi_rest.service;

import it.bi_rest.bi_rest.domain.Currency;
import it.bi_rest.bi_rest.model.CurrencyDTO;
import it.bi_rest.bi_rest.repos.CurrencyRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

  private final CurrencyRepository currencyRepository;

  public CurrencyService(CurrencyRepository currencyRepository) {
    this.currencyRepository = currencyRepository;
  }

  public List<CurrencyDTO> getAllCurrencies() {
    List<Currency> currencies = currencyRepository.findAll();
    return currencies.stream().map(this::mapToDTO).collect(Collectors.toList());
  }

  ////////////////////////////////////////////////////////////////
  public List<CurrencyDTO> getCurrenciesByCurrencyISO() {
    List<Currency> currencies = currencyRepository.findAll();

    // Rimuovi i duplicati utilizzando un set
    Set<String> seen = new HashSet<>();
    List<Currency> uniqueCurrencies = currencies
      .stream()
      .filter(c -> seen.add(c.getCurrencyISO()))
      .collect(Collectors.toList());

    // Mappa i risultati in CurrencyDTO
    return uniqueCurrencies
      .stream()
      .map(this::mapToDTO)
      .collect(Collectors.toList());
  }

  private CurrencyDTO mapToDTO(Currency currency) {
    CurrencyDTO dto = new CurrencyDTO();
    dto.setCurrencyISO(currency.getCurrencyISO());
    dto.setCountry(currency.getCountry());
    dto.setCountryISO(currency.getCountryISO());
    dto.setCurrencyName(currency.getCurrencyName());
    dto.setValidityStartDate(currency.getValidityStartDate());
    dto.setValidityEndDate(currency.getValidityEndDate());
    dto.setTmsInsert(currency.getTmsInsert());
    return dto;
  }
}
