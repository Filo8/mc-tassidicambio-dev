package it.bi_rest.bi_rest.controller;

import it.bi_rest.bi_rest.model.ExchangeRateDTO;
import it.bi_rest.bi_rest.request.ExchangeAmountRequest;
import it.bi_rest.bi_rest.request.ExchangeAmountResponse;
import it.bi_rest.bi_rest.request.ExchangeRateRequest;
import it.bi_rest.bi_rest.request.ExchangeRateResponse;
import it.bi_rest.bi_rest.request.ExchangeRatesRequestStori;
import it.bi_rest.bi_rest.request.ExchangeRatesSpreadRequest;
import it.bi_rest.bi_rest.request.ExchangeRatesSpreadResponse;
import it.bi_rest.bi_rest.service.ExchangeRateService;
import it.bi_rest.bi_rest.util.NotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/dailyExchangeRates") //, produces = MediaType.APPLICATION_JSON_VALUE)
public class ExchangeRateController {

  private final ExchangeRateService exchangeRateService;

  public ExchangeRateController(final ExchangeRateService exchangeRateService) {
    this.exchangeRateService = exchangeRateService;
  }

  @PostMapping("/exchangeSpread")
  public ExchangeRatesSpreadResponse exchangeSpread(
    @RequestBody ExchangeRatesSpreadRequest exchangeRatesSpreadRequest
  ) {
    float exchangeRateApplied = exchangeRatesSpreadRequest.getExchangeRateApplied();
    float exchangeRateMkt = exchangeRatesSpreadRequest.getExchangeRateMkt();
    float exchangeRateSpread =
      ((1 - exchangeRateApplied / exchangeRateMkt) * 100);

    return new ExchangeRatesSpreadResponse(exchangeRateSpread);
  }

  @PostMapping("/exchangeAmount")
  public ExchangeAmountResponse exchangeAmount(
    @RequestBody ExchangeAmountRequest request
  ) {
    double exchangeAmount = exchangeRateService.calculateExchangeAmount(
      request
    );

    return new ExchangeAmountResponse(exchangeAmount);
  }

  @PostMapping
  public ResponseEntity<?> getExchangeRateByIso(
    @RequestBody ExchangeRateRequest request
  ) throws ParseException {
    try {
      Date datee = this.convertStringToDate(request.getReferenceDate());
      List<ExchangeRateDTO> exchangeRateDTOs;
      if (
        request.getIsoCurrencies() != null &&
        !request.getIsoCurrencies().isEmpty()
      ) {
        exchangeRateDTOs =
          exchangeRateService.getExchangeRateByIso(
            request.getReferenceCurrency(),
            datee,
            request.getIsoCurrencies()
          );
      } else {
        exchangeRateDTOs =
          exchangeRateService.getExchangeRatesByReferenceDateAndIsoCode(
            request.getReferenceCurrency(),
            datee
          );
      }

      return ResponseEntity.ok(exchangeRateDTOs);
    } catch (NotFoundException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping("/referenceCurrency")
  public ResponseEntity<List<ExchangeRateDTO>> findReferenceCurrency() {
    List<ExchangeRateDTO> referenceCurrencies = exchangeRateService.findReferenceCurrency();
    return ResponseEntity.ok(referenceCurrencies);
  }

  @PostMapping("/isoCode")
  public ResponseEntity<List<ExchangeRateDTO>> getExchangeRatesByIsoCodeAndReferenceDate(
    @RequestBody ExchangeRateRequest request
  ) {
    try {
      Date datee = this.convertStringToDate(request.getReferenceDate());

      List<ExchangeRateDTO> exchangeRateDTOs = exchangeRateService.getExchangeRatesByReferenceDateAndIsoCode(
        request.getReferenceCurrency(),
        datee
      );

      return ResponseEntity.ok(exchangeRateDTOs);
    } catch (NotFoundException | ParseException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping("/history")
  public ResponseEntity<?> getHistoryExchangeRates(
    @RequestBody ExchangeRatesRequestStori request
  ) throws ParseException {
    try {
      List<ExchangeRateResponse> exchangeRateDTOs;
      exchangeRateDTOs = exchangeRateService.getHistoryExchangeRates(request);

      return ResponseEntity.ok(exchangeRateDTOs);
    } catch (NotFoundException e) {
      return ResponseEntity.notFound().build();
    }
  }

  public Date convertStringToDate(String dateString) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    return dateFormat.parse(dateString);
  }
}
