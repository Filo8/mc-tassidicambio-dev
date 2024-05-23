package it.bi_rest.bi_rest.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ExchangeRatesSpreadRequest {

  public float exchangeRateApplied;
  public float exchangeRateMkt;

  public ExchangeRatesSpreadRequest() {}

  public ExchangeRatesSpreadRequest(
    float exchangeRateApplied,
    float exchangeRateMkt
  ) {
    this.exchangeRateApplied = exchangeRateApplied;
    this.exchangeRateMkt = exchangeRateMkt;
  }
}
