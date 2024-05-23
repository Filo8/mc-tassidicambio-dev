package com.example.restservice.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExchangeRatesFeesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRatesFeesRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float exchangeRateApplied;

  private Float paidAmount;

  private Float sentFeesPercent;

  private Float receivedFeesPercent;

  private Float exchangeRateMkt;

  private String fromCurrency;

  private String toCurrency;

  public ExchangeRatesFeesRequest exchangeRateApplied(Float exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
    return this;
  }

  /**
   * Get exchangeRateApplied
   * @return exchangeRateApplied
  */
  
  @Schema(name = "exchangeRateApplied", example = "1.08", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeRateApplied")
  public Float getExchangeRateApplied() {
    return exchangeRateApplied;
  }

  public void setExchangeRateApplied(Float exchangeRateApplied) {
    this.exchangeRateApplied = exchangeRateApplied;
  }

  public ExchangeRatesFeesRequest paidAmount(Float paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

  /**
   * Get paidAmount
   * @return paidAmount
  */
  
  @Schema(name = "paidAmount", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paidAmount")
  public Float getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(Float paidAmount) {
    this.paidAmount = paidAmount;
  }

  public ExchangeRatesFeesRequest sentFeesPercent(Float sentFeesPercent) {
    this.sentFeesPercent = sentFeesPercent;
    return this;
  }

  /**
   * Get sentFeesPercent
   * @return sentFeesPercent
  */
  
  @Schema(name = "sentFeesPercent", example = "0.01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sentFeesPercent")
  public Float getSentFeesPercent() {
    return sentFeesPercent;
  }

  public void setSentFeesPercent(Float sentFeesPercent) {
    this.sentFeesPercent = sentFeesPercent;
  }

  public ExchangeRatesFeesRequest receivedFeesPercent(Float receivedFeesPercent) {
    this.receivedFeesPercent = receivedFeesPercent;
    return this;
  }

  /**
   * Get receivedFeesPercent
   * @return receivedFeesPercent
  */
  
  @Schema(name = "receivedFeesPercent", example = "0.01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivedFeesPercent")
  public Float getReceivedFeesPercent() {
    return receivedFeesPercent;
  }

  public void setReceivedFeesPercent(Float receivedFeesPercent) {
    this.receivedFeesPercent = receivedFeesPercent;
  }

  public ExchangeRatesFeesRequest exchangeRateMkt(Float exchangeRateMkt) {
    this.exchangeRateMkt = exchangeRateMkt;
    return this;
  }

  /**
   * Get exchangeRateMkt
   * @return exchangeRateMkt
  */
  
  @Schema(name = "exchangeRateMkt", example = "1.07", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeRateMkt")
  public Float getExchangeRateMkt() {
    return exchangeRateMkt;
  }

  public void setExchangeRateMkt(Float exchangeRateMkt) {
    this.exchangeRateMkt = exchangeRateMkt;
  }

  public ExchangeRatesFeesRequest fromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
    return this;
  }

  /**
   * Get fromCurrency
   * @return fromCurrency
  */
  
  @Schema(name = "fromCurrency", example = "EUR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fromCurrency")
  public String getFromCurrency() {
    return fromCurrency;
  }

  public void setFromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  public ExchangeRatesFeesRequest toCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
    return this;
  }

  /**
   * Get toCurrency
   * @return toCurrency
  */
  
  @Schema(name = "toCurrency", example = "USD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toCurrency")
  public String getToCurrency() {
    return toCurrency;
  }

  public void setToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRatesFeesRequest exchangeRatesFeesRequest = (ExchangeRatesFeesRequest) o;
    return Objects.equals(this.exchangeRateApplied, exchangeRatesFeesRequest.exchangeRateApplied) &&
        Objects.equals(this.paidAmount, exchangeRatesFeesRequest.paidAmount) &&
        Objects.equals(this.sentFeesPercent, exchangeRatesFeesRequest.sentFeesPercent) &&
        Objects.equals(this.receivedFeesPercent, exchangeRatesFeesRequest.receivedFeesPercent) &&
        Objects.equals(this.exchangeRateMkt, exchangeRatesFeesRequest.exchangeRateMkt) &&
        Objects.equals(this.fromCurrency, exchangeRatesFeesRequest.fromCurrency) &&
        Objects.equals(this.toCurrency, exchangeRatesFeesRequest.toCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRateApplied, paidAmount, sentFeesPercent, receivedFeesPercent, exchangeRateMkt, fromCurrency, toCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRatesFeesRequest {\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    sentFeesPercent: ").append(toIndentedString(sentFeesPercent)).append("\n");
    sb.append("    receivedFeesPercent: ").append(toIndentedString(receivedFeesPercent)).append("\n");
    sb.append("    exchangeRateMkt: ").append(toIndentedString(exchangeRateMkt)).append("\n");
    sb.append("    fromCurrency: ").append(toIndentedString(fromCurrency)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
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

