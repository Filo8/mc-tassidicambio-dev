package it.bi_rest.bi_rest.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ExchangeAmountRequest {

  public float exchangeRateApplied;
  public float paidAmount;
  public float sentFeesPercent;
  public float receivedFeesPercent;
}
