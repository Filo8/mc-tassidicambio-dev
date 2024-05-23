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
 * Currency
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class Currency implements Serializable {

  private static final long serialVersionUID = 1L;

  private String currencyISO;

  private String currencyName;

  private String country;

  private String countryISO;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validityStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validityEndDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime tmsInsert;

  public Currency currencyISO(String currencyISO) {
    this.currencyISO = currencyISO;
    return this;
  }

  /**
   * Get currencyISO
   * @return currencyISO
  */
  
  @Schema(name = "currencyISO", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyISO")
  public String getCurrencyISO() {
    return currencyISO;
  }

  public void setCurrencyISO(String currencyISO) {
    this.currencyISO = currencyISO;
  }

  public Currency currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }

  /**
   * Get currencyName
   * @return currencyName
  */
  
  @Schema(name = "currencyName", example = "Dollaro USA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyName")
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public Currency country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", example = "STATI UNITI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Currency countryISO(String countryISO) {
    this.countryISO = countryISO;
    return this;
  }

  /**
   * Get countryISO
   * @return countryISO
  */
  
  @Schema(name = "countryISO", example = "US", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryISO")
  public String getCountryISO() {
    return countryISO;
  }

  public void setCountryISO(String countryISO) {
    this.countryISO = countryISO;
  }

  public Currency validityStartDate(LocalDate validityStartDate) {
    this.validityStartDate = validityStartDate;
    return this;
  }

  /**
   * Get validityStartDate
   * @return validityStartDate
  */
  @Valid 
  @Schema(name = "validityStartDate", example = "Wed Jan 02 01:00:00 CET 1918", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityStartDate")
  public LocalDate getValidityStartDate() {
    return validityStartDate;
  }

  public void setValidityStartDate(LocalDate validityStartDate) {
    this.validityStartDate = validityStartDate;
  }

  public Currency validityEndDate(LocalDate validityEndDate) {
    this.validityEndDate = validityEndDate;
    return this;
  }

  /**
   * Get validityEndDate
   * @return validityEndDate
  */
  @Valid 
  @Schema(name = "validityEndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityEndDate")
  public LocalDate getValidityEndDate() {
    return validityEndDate;
  }

  public void setValidityEndDate(LocalDate validityEndDate) {
    this.validityEndDate = validityEndDate;
  }

  public Currency tmsInsert(OffsetDateTime tmsInsert) {
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
    Currency currency = (Currency) o;
    return Objects.equals(this.currencyISO, currency.currencyISO) &&
        Objects.equals(this.currencyName, currency.currencyName) &&
        Objects.equals(this.country, currency.country) &&
        Objects.equals(this.countryISO, currency.countryISO) &&
        Objects.equals(this.validityStartDate, currency.validityStartDate) &&
        Objects.equals(this.validityEndDate, currency.validityEndDate) &&
        Objects.equals(this.tmsInsert, currency.tmsInsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyISO, currencyName, country, countryISO, validityStartDate, validityEndDate, tmsInsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    currencyISO: ").append(toIndentedString(currencyISO)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryISO: ").append(toIndentedString(countryISO)).append("\n");
    sb.append("    validityStartDate: ").append(toIndentedString(validityStartDate)).append("\n");
    sb.append("    validityEndDate: ").append(toIndentedString(validityEndDate)).append("\n");
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

