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
 * ExchangeRatesSpreadRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRatesSpreadRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float exchangeRateApplied;

  private Float exchangeRateMkt;

  public ExchangeRatesSpreadRequest exchangeRateApplied(Float exchangeRateApplied) {
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

  public ExchangeRatesSpreadRequest exchangeRateMkt(Float exchangeRateMkt) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRatesSpreadRequest exchangeRatesSpreadRequest = (ExchangeRatesSpreadRequest) o;
    return Objects.equals(this.exchangeRateApplied, exchangeRatesSpreadRequest.exchangeRateApplied) &&
        Objects.equals(this.exchangeRateMkt, exchangeRatesSpreadRequest.exchangeRateMkt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRateApplied, exchangeRateMkt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRatesSpreadRequest {\n");
    sb.append("    exchangeRateApplied: ").append(toIndentedString(exchangeRateApplied)).append("\n");
    sb.append("    exchangeRateMkt: ").append(toIndentedString(exchangeRateMkt)).append("\n");
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

