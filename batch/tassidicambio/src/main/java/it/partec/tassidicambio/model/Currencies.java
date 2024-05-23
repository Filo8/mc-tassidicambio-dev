package it.partec.tassidicambio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "currencies")
public class Currencies implements Serializable {


    private String currencyISO;
    private String currencyName;
    private String country;
    private String countryISO;
    private Date validityStartDate;
    private Date validityEndDate;
    private Date tmsInsert;


}
