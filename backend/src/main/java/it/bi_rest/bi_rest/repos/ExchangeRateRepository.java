package it.bi_rest.bi_rest.repos;

import it.bi_rest.bi_rest.domain.ExchangeRate;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExchangeRateRepository
  extends MongoRepository<ExchangeRate, Long> {
  List<ExchangeRate> findByReferenceCurrency(String referenceCurrency);
}
