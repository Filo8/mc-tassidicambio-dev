package it.partec.tassidicambio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {

    private String country;
    private String currency;
    private String isoCode;
    private String uicCode;
    private String avgRate;
    private String exchangeConvention;
    private String exchangeConventionCode;
    private LocalDate referenceDate;

    @Override
    public String toString() {
        return "Rate{" +
                "country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", uicCode=" + uicCode +
                ", avgRate=" + avgRate +
                ", exchangeConvention='" + exchangeConvention + '\'' +
                ", exchangeConventionCode='" + exchangeConventionCode + '\'' +
                ", referenceDate=" + referenceDate +
                '}';
    }

    public Rate() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getUicCode() {
        return uicCode;
    }

    public void setUicCode(String uicCode) {
        this.uicCode = uicCode;
    }

    public String getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(String avgRate) {
        this.avgRate = avgRate;
    }

    public String getExchangeConvention() {
        return exchangeConvention;
    }

    public void setExchangeConvention(String exchangeConvention) {
        this.exchangeConvention = exchangeConvention;
    }

    public String getExchangeConventionCode() {
        return exchangeConventionCode;
    }

    public void setExchangeConventionCode(String exchangeConventionCode) {
        this.exchangeConventionCode = exchangeConventionCode;
    }

    public LocalDate getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(LocalDate referenceDate) {
        this.referenceDate = referenceDate;
    }
}
