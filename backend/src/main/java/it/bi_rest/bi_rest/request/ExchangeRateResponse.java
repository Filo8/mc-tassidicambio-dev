package it.bi_rest.bi_rest.request;

import it.bi_rest.bi_rest.model.ExchangeRateDTO;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateResponse {

  private List<ExchangeRateDTO> exchangeRates;
  private ExchangeRateStatistics stats;
}
