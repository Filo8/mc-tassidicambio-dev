package it.bi_rest.bi_rest.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "currencies")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Currency {

  //@NotNull
  //@Id
  //private String isoCode;

  // private String name;

  //private String graph;

  @Size(max = 255)
  private String currencyISO;

  private String currencyName;

  @Size(max = 255)
  private String country;

  @Size(max = 255)
  private String countryISO;

  private String uicCode;

  private Date validityStartDate;

  private Date validityEndDate;

  private Date tmsInsert;
}
