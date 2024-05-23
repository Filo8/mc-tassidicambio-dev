package it.bi_rest.bi_rest.repos;

import it.bi_rest.bi_rest.domain.ExchangeRate;
import it.bi_rest.bi_rest.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class ExchangeRateListener
  extends AbstractMongoEventListener<ExchangeRate> {

  private final PrimarySequenceService primarySequenceService;

  public ExchangeRateListener(
    final PrimarySequenceService primarySequenceService
  ) {
    this.primarySequenceService = primarySequenceService;
  }

  @Override
  public void onBeforeConvert(final BeforeConvertEvent<ExchangeRate> event) {
    /*
    if (event.getSource().getId() == null) {
      event.getSource().setId(primarySequenceService.getNextValue());
    }
    */
  }
}
