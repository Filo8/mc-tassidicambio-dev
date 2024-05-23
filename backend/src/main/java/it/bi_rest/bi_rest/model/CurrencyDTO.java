package it.bi_rest.bi_rest.model;

import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "currencies")
@Getter
@Setter
public class CurrencyDTO {

  private int id;

  @Size(max = 255)
  private String currencyISO;

  private String currencyName;

  @Size(max = 255)
  private String country;

  @Size(max = 255)
  private String countryISO;

  private Date validityStartDate;

  private Date validityEndDate;

  private Date tmsInsert;

  public CurrencyDTO() {
    Random random = new Random();
    this.id = random.nextInt(Integer.MAX_VALUE); // Generazione di un ID casuale come intero
  }

  // Costruttore con ID casuale generato
  public CurrencyDTO(
    String currencyISO,
    String currencyName,
    String country,
    String countryISO,
    Date validityStartDate,
    Date validityEndDate,
    Date tmsInsert
  ) {
    Random random = new Random();
    this.id = random.nextInt(Integer.MAX_VALUE); // Generazione di un ID casuale come intero
    this.currencyISO = currencyISO;
    this.currencyName = currencyName;
    this.country = country;
    this.countryISO = countryISO;
    this.validityStartDate = validityStartDate;
    this.validityEndDate = validityEndDate;
    this.tmsInsert = tmsInsert;
  }

  // Override del metodo equals() per confrontare due oggetti CurrencyDTO
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrencyDTO that = (CurrencyDTO) o;
    return id == that.id;
  }

  // Override del metodo hashCode() per garantire la coerenza con equals()
  @Override
  public int hashCode() {
    return Integer.hashCode(id);
  }
}
