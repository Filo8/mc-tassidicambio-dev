package com.example.restservice.model;

import java.net.URI;
import java.util.Objects;
import com.example.restservice.model.Fee;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExchangeRatesFeesResponseExchangeRatesFees
 */

@JsonTypeName("ExchangeRatesFeesResponse_exchangeRatesFees")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRatesFeesResponseExchangeRatesFees implements Serializable {

  private static final long serialVersionUID = 1L;

  private Fee sentFeesCurrencyFrom;

  private Fee feeExchangeRateCurrencyFrom;

  private Fee receivedFeesCurrencyFrom;

  private Fee totalFeeCurrencyFrom;

  private Fee sentFeesCurrencyTo;

  private Fee feeExchangeRateCurrencyTo;

  private Fee receivedFeesCurrencyTo;

  private Fee totalFeeCurrencyTo;

  public ExchangeRatesFeesResponseExchangeRatesFees sentFeesCurrencyFrom(Fee sentFeesCurrencyFrom) {
    this.sentFeesCurrencyFrom = sentFeesCurrencyFrom;
    return this;
  }

  /**
   * Get sentFeesCurrencyFrom
   * @return sentFeesCurrencyFrom
  */
  @Valid 
  @Schema(name = "sentFeesCurrencyFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sentFeesCurrencyFrom")
  public Fee getSentFeesCurrencyFrom() {
    return sentFeesCurrencyFrom;
  }

  public void setSentFeesCurrencyFrom(Fee sentFeesCurrencyFrom) {
    this.sentFeesCurrencyFrom = sentFeesCurrencyFrom;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees feeExchangeRateCurrencyFrom(Fee feeExchangeRateCurrencyFrom) {
    this.feeExchangeRateCurrencyFrom = feeExchangeRateCurrencyFrom;
    return this;
  }

  /**
   * Get feeExchangeRateCurrencyFrom
   * @return feeExchangeRateCurrencyFrom
  */
  @Valid 
  @Schema(name = "feeExchangeRateCurrencyFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feeExchangeRateCurrencyFrom")
  public Fee getFeeExchangeRateCurrencyFrom() {
    return feeExchangeRateCurrencyFrom;
  }

  public void setFeeExchangeRateCurrencyFrom(Fee feeExchangeRateCurrencyFrom) {
    this.feeExchangeRateCurrencyFrom = feeExchangeRateCurrencyFrom;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees receivedFeesCurrencyFrom(Fee receivedFeesCurrencyFrom) {
    this.receivedFeesCurrencyFrom = receivedFeesCurrencyFrom;
    return this;
  }

  /**
   * Get receivedFeesCurrencyFrom
   * @return receivedFeesCurrencyFrom
  */
  @Valid 
  @Schema(name = "receivedFeesCurrencyFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivedFeesCurrencyFrom")
  public Fee getReceivedFeesCurrencyFrom() {
    return receivedFeesCurrencyFrom;
  }

  public void setReceivedFeesCurrencyFrom(Fee receivedFeesCurrencyFrom) {
    this.receivedFeesCurrencyFrom = receivedFeesCurrencyFrom;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees totalFeeCurrencyFrom(Fee totalFeeCurrencyFrom) {
    this.totalFeeCurrencyFrom = totalFeeCurrencyFrom;
    return this;
  }

  /**
   * Get totalFeeCurrencyFrom
   * @return totalFeeCurrencyFrom
  */
  @Valid 
  @Schema(name = "totalFeeCurrencyFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalFeeCurrencyFrom")
  public Fee getTotalFeeCurrencyFrom() {
    return totalFeeCurrencyFrom;
  }

  public void setTotalFeeCurrencyFrom(Fee totalFeeCurrencyFrom) {
    this.totalFeeCurrencyFrom = totalFeeCurrencyFrom;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees sentFeesCurrencyTo(Fee sentFeesCurrencyTo) {
    this.sentFeesCurrencyTo = sentFeesCurrencyTo;
    return this;
  }

  /**
   * Get sentFeesCurrencyTo
   * @return sentFeesCurrencyTo
  */
  @Valid 
  @Schema(name = "sentFeesCurrencyTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sentFeesCurrencyTo")
  public Fee getSentFeesCurrencyTo() {
    return sentFeesCurrencyTo;
  }

  public void setSentFeesCurrencyTo(Fee sentFeesCurrencyTo) {
    this.sentFeesCurrencyTo = sentFeesCurrencyTo;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees feeExchangeRateCurrencyTo(Fee feeExchangeRateCurrencyTo) {
    this.feeExchangeRateCurrencyTo = feeExchangeRateCurrencyTo;
    return this;
  }

  /**
   * Get feeExchangeRateCurrencyTo
   * @return feeExchangeRateCurrencyTo
  */
  @Valid 
  @Schema(name = "feeExchangeRateCurrencyTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feeExchangeRateCurrencyTo")
  public Fee getFeeExchangeRateCurrencyTo() {
    return feeExchangeRateCurrencyTo;
  }

  public void setFeeExchangeRateCurrencyTo(Fee feeExchangeRateCurrencyTo) {
    this.feeExchangeRateCurrencyTo = feeExchangeRateCurrencyTo;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees receivedFeesCurrencyTo(Fee receivedFeesCurrencyTo) {
    this.receivedFeesCurrencyTo = receivedFeesCurrencyTo;
    return this;
  }

  /**
   * Get receivedFeesCurrencyTo
   * @return receivedFeesCurrencyTo
  */
  @Valid 
  @Schema(name = "receivedFeesCurrencyTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivedFeesCurrencyTo")
  public Fee getReceivedFeesCurrencyTo() {
    return receivedFeesCurrencyTo;
  }

  public void setReceivedFeesCurrencyTo(Fee receivedFeesCurrencyTo) {
    this.receivedFeesCurrencyTo = receivedFeesCurrencyTo;
  }

  public ExchangeRatesFeesResponseExchangeRatesFees totalFeeCurrencyTo(Fee totalFeeCurrencyTo) {
    this.totalFeeCurrencyTo = totalFeeCurrencyTo;
    return this;
  }

  /**
   * Get totalFeeCurrencyTo
   * @return totalFeeCurrencyTo
  */
  @Valid 
  @Schema(name = "totalFeeCurrencyTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalFeeCurrencyTo")
  public Fee getTotalFeeCurrencyTo() {
    return totalFeeCurrencyTo;
  }

  public void setTotalFeeCurrencyTo(Fee totalFeeCurrencyTo) {
    this.totalFeeCurrencyTo = totalFeeCurrencyTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRatesFeesResponseExchangeRatesFees exchangeRatesFeesResponseExchangeRatesFees = (ExchangeRatesFeesResponseExchangeRatesFees) o;
    return Objects.equals(this.sentFeesCurrencyFrom, exchangeRatesFeesResponseExchangeRatesFees.sentFeesCurrencyFrom) &&
        Objects.equals(this.feeExchangeRateCurrencyFrom, exchangeRatesFeesResponseExchangeRatesFees.feeExchangeRateCurrencyFrom) &&
        Objects.equals(this.receivedFeesCurrencyFrom, exchangeRatesFeesResponseExchangeRatesFees.receivedFeesCurrencyFrom) &&
        Objects.equals(this.totalFeeCurrencyFrom, exchangeRatesFeesResponseExchangeRatesFees.totalFeeCurrencyFrom) &&
        Objects.equals(this.sentFeesCurrencyTo, exchangeRatesFeesResponseExchangeRatesFees.sentFeesCurrencyTo) &&
        Objects.equals(this.feeExchangeRateCurrencyTo, exchangeRatesFeesResponseExchangeRatesFees.feeExchangeRateCurrencyTo) &&
        Objects.equals(this.receivedFeesCurrencyTo, exchangeRatesFeesResponseExchangeRatesFees.receivedFeesCurrencyTo) &&
        Objects.equals(this.totalFeeCurrencyTo, exchangeRatesFeesResponseExchangeRatesFees.totalFeeCurrencyTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentFeesCurrencyFrom, feeExchangeRateCurrencyFrom, receivedFeesCurrencyFrom, totalFeeCurrencyFrom, sentFeesCurrencyTo, feeExchangeRateCurrencyTo, receivedFeesCurrencyTo, totalFeeCurrencyTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRatesFeesResponseExchangeRatesFees {\n");
    sb.append("    sentFeesCurrencyFrom: ").append(toIndentedString(sentFeesCurrencyFrom)).append("\n");
    sb.append("    feeExchangeRateCurrencyFrom: ").append(toIndentedString(feeExchangeRateCurrencyFrom)).append("\n");
    sb.append("    receivedFeesCurrencyFrom: ").append(toIndentedString(receivedFeesCurrencyFrom)).append("\n");
    sb.append("    totalFeeCurrencyFrom: ").append(toIndentedString(totalFeeCurrencyFrom)).append("\n");
    sb.append("    sentFeesCurrencyTo: ").append(toIndentedString(sentFeesCurrencyTo)).append("\n");
    sb.append("    feeExchangeRateCurrencyTo: ").append(toIndentedString(feeExchangeRateCurrencyTo)).append("\n");
    sb.append("    receivedFeesCurrencyTo: ").append(toIndentedString(receivedFeesCurrencyTo)).append("\n");
    sb.append("    totalFeeCurrencyTo: ").append(toIndentedString(totalFeeCurrencyTo)).append("\n");
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

