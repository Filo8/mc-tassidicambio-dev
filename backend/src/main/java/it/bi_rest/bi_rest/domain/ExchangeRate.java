package it.bi_rest.bi_rest.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@Document(collection = "exchangeRate")
public class ExchangeRate {

  @Size(max = 255)
  private String country;

  @Size(max = 255)
  private String currency;

  @Size(max = 255)
  private String isoCode;

  private Integer uicCode;

  @Size(max = 255)
  private String avgRate;

  private String referenceCurrency;

  @Size(max = 255)
  private String exchangeConvention;

  private Date referenceDate;

  private Date tmsInsert;
}
