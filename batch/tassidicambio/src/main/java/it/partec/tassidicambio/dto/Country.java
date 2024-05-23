package it.partec.tassidicambio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country implements Serializable {


    private String currencyISO;

    private String country;

    private String countryISO;

    private Date validityStartDate;

    private Date validityEndDate;

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "currencyISO='" + currencyISO + '\'' +
                ", country='" + country + '\'' +
                ", countryISO='" + countryISO + '\'' +
                ", validityStartDate=" + validityStartDate +
                ", validityEndDate=" + validityEndDate +
                '}';
    }

    public String getCurrencyISO() {
        return currencyISO;
    }

    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryISO() {
        return countryISO;
    }

    public void setCountryISO(String countryISO) {
        this.countryISO = countryISO;
    }

    public Date getValidityStartDate() {
        return validityStartDate;
    }

    public void setValidityStartDate(Date validityStartDate) {
        this.validityStartDate = validityStartDate;
    }

    public Date getValidityEndDate() {
        return validityEndDate;
    }

    public void setValidityEndDate(Date validityEndDate) {
        this.validityEndDate = validityEndDate;
    }
}
