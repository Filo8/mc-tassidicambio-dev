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
 * ExchangeAmountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeAmountRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float exchangeRateApplied;

  private Float paidAmount;

  private Float sentFeesPercent;

  private Float receivedFeesPercent;

  public ExchangeAmountRequest exchangeRateApplied(Float exchangeRateApplied) {
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

  public ExchangeAmountRequest paidAmount(Float paidAmount) {
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

  public ExchangeAmountRequest sentFeesPercent(Float sentFeesPercent) {
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

  public ExchangeAmountRequest receivedFeesPercent(Float receivedFeesPercent) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeAmountRequest exchangeAmountRequest = (ExchangeAmountRequest) o;
    return Objects.equals(this.exchangeRateApplied, exchangeAmountRequest.exchangeRateApplied) &&
        Objects.equals(this.paidAmount, exchangeAmountRequest.paidAmount) &&
        Objects.equals(this.sentFeesPercent, exchangeAmountRequest.sentFeesPercent) &&
        Objects.equals(this.receivedFeesPercent, exchangeAmountRequest.receivedFeesPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRateApplied, paidAmount, sentFeesPercent, receivedFeesPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeAmountRequest {\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    sentFeesPercent: ").append(toIndentedString(sentFeesPercent)).append("\n");
    sb.append("    receivedFeesPercent: ").append(toIndentedString(receivedFeesPercent)).append("\n");
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

