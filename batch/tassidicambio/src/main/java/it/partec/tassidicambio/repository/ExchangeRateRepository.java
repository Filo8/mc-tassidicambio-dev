package it.partec.tassidicambio.repository;

import it.partec.tassidicambio.model.ExchangeRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ExchangeRateRepository extends MongoRepository<ExchangeRate, String> {

    void deleteByReferenceDateAndReferenceCurrency(LocalDate referenceDate, String referenceCurrency);

}
