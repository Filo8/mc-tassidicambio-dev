package com.example.restservice.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExchangeRate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRate implements Serializable {

  private static final long serialVersionUID = 1L;

  private String country;

  private String currency;

  private String isoCode;

  private Long uicCode;

  private Float avgRate;

  private String exchangeConvention;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate referenceDate;

  private String referenceCurrency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime tmsInsert;

  public ExchangeRate country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", example = "AUSTRALIA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ExchangeRate currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  
  @Schema(name = "currency", example = "Dollaro Australiano", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ExchangeRate isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

  /**
   * Get isoCode
   * @return isoCode
  */
  
  @Schema(name = "isoCode", example = "AUD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isoCode")
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public ExchangeRate uicCode(Long uicCode) {
    this.uicCode = uicCode;
    return this;
  }

  /**
   * Get uicCode
   * @return uicCode
  */
  
  @Schema(name = "uicCode", example = "109", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uicCode")
  public Long getUicCode() {
    return uicCode;
  }

  public void setUicCode(Long uicCode) {
    this.uicCode = uicCode;
  }

  public ExchangeRate avgRate(Float avgRate) {
    this.avgRate = avgRate;
    return this;
  }

  /**
   * Get avgRate
   * @return avgRate
  */
  
  @Schema(name = "avgRate", example = "1.6515", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgRate")
  public Float getAvgRate() {
    return avgRate;
  }

  public void setAvgRate(Float avgRate) {
    this.avgRate = avgRate;
  }

  public ExchangeRate exchangeConvention(String exchangeConvention) {
    this.exchangeConvention = exchangeConvention;
    return this;
  }

  /**
   * Get exchangeConvention
   * @return exchangeConvention
  */
  
  @Schema(name = "exchangeConvention", example = "Quantità di valuta estera per 1 Euro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeConvention")
  public String getExchangeConvention() {
    return exchangeConvention;
  }

  public void setExchangeConvention(String exchangeConvention) {
    this.exchangeConvention = exchangeConvention;
  }

  public ExchangeRate referenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * Get referenceDate
   * @return referenceDate
  */
  @Valid 
  @Schema(name = "referenceDate", example = "Mon Feb 26 01:00:00 CET 2024", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceDate")
  public LocalDate getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
  }

  public ExchangeRate referenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
    return this;
  }

  /**
   * Get referenceCurrency
   * @return referenceCurrency
  */
  
  @Schema(name = "referenceCurrency", example = "EUR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceCurrency")
  public String getReferenceCurrency() {
    return referenceCurrency;
  }

  public void setReferenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
  }

  public ExchangeRate tmsInsert(OffsetDateTime tmsInsert) {
    this.tmsInsert = tmsInsert;
    return this;
  }

  /**
   * Get tmsInsert
   * @return tmsInsert
  */
  @Valid 
  @Schema(name = "tmsInsert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tmsInsert")
  public OffsetDateTime getTmsInsert() {
    return tmsInsert;
  }

  public void setTmsInsert(OffsetDateTime tmsInsert) {
    this.tmsInsert = tmsInsert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRate exchangeRate = (ExchangeRate) o;
    return Objects.equals(this.country, exchangeRate.country) &&
        Objects.equals(this.currency, exchangeRate.currency) &&
        Objects.equals(this.isoCode, exchangeRate.isoCode) &&
        Objects.equals(this.uicCode, exchangeRate.uicCode) &&
        Objects.equals(this.avgRate, exchangeRate.avgRate) &&
        Objects.equals(this.exchangeConvention, exchangeRate.exchangeConvention) &&
        Objects.equals(this.referenceDate, exchangeRate.referenceDate) &&
        Objects.equals(this.referenceCurrency, exchangeRate.referenceCurrency) &&
        Objects.equals(this.tmsInsert, exchangeRate.tmsInsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, currency, isoCode, uicCode, avgRate, exchangeConvention, referenceDate, referenceCurrency, tmsInsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRate {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    uicCode: ").append(toIndentedString(uicCode)).append("\n");
    sb.append("    avgRate: ").append(toIndentedString(avgRate)).append("\n");
    sb.append("    exchangeConvention: ").append(toIndentedString(exchangeConvention)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    referenceCurrency: ").append(toIndentedString(referenceCurrency)).append("\n");
    sb.append("    tmsInsert: ").append(toIndentedString(tmsInsert)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

