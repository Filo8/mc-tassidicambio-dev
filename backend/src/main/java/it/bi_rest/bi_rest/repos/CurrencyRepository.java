package it.bi_rest.bi_rest.repos;

import it.bi_rest.bi_rest.domain.Currency;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String> {
  List<Currency> findByCurrencyISO(String currencyISO);
}
