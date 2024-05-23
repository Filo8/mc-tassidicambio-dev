package it.bi_rest.bi_rest.request;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateStatistics {

  private double media;
  private double massimo;
  private double minimo;
  private Date fromDate;
  private Date toDate;
}
