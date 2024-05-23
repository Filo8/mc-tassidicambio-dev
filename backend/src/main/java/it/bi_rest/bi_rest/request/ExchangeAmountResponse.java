package it.bi_rest.bi_rest.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ExchangeAmountResponse {

  public double exchangeAmount;

  public ExchangeAmountResponse() {}

  public ExchangeAmountResponse(double exchangeAmount2) {
    this.exchangeAmount = exchangeAmount2;
  }
}
