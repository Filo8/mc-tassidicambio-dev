package it.bi_rest.bi_rest.controller;

import it.bi_rest.bi_rest.model.CurrencyDTO;
import it.bi_rest.bi_rest.service.CurrencyService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/currencies")
public class CurrencyController {

  private final CurrencyService currencyService;

  public CurrencyController(CurrencyService currencyService) {
    this.currencyService = currencyService;
  }

  @GetMapping
  public ResponseEntity<List<CurrencyDTO>> getAllCurrencies() {
    List<CurrencyDTO> currencies = currencyService.getAllCurrencies();
    return ResponseEntity.ok(currencies);
  }

  @GetMapping("/currencyISO")
  public ResponseEntity<List<CurrencyDTO>> getCurrenciesByCurrencyISO() {
    List<CurrencyDTO> currencies = currencyService.getCurrenciesByCurrencyISO();
    return ResponseEntity.ok(currencies);
  }
}
