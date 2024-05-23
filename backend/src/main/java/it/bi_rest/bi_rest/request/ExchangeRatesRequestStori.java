package it.bi_rest.bi_rest.request;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRatesRequestStori {

  public Date from;
  public Date to;
  public String referenceCurrency;
  public List<String> isoCurrencies;
}
