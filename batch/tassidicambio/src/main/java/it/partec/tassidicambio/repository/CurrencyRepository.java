package it.partec.tassidicambio.repository;



import it.partec.tassidicambio.model.Currencies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends MongoRepository<Currencies, Long> {

}
