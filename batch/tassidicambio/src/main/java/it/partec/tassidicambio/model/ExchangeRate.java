package it.partec.tassidicambio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "exchangeRate")
public class ExchangeRate implements Serializable {


    private String country;
    private String currency;
    private String isoCode;
    private String uicCode;
    private String avgRate;
    private String exchangeConvention;
    private String exchangeConventionCode;
    private LocalDate referenceDate;
    private String referenceCurrency;
    private Date tmsInsert;

}
