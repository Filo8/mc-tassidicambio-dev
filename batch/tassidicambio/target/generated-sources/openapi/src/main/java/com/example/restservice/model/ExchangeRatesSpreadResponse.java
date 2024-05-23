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
 * ExchangeRatesSpreadResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRatesSpreadResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float exchangeRateSpread;

  public ExchangeRatesSpreadResponse exchangeRateSpread(Float exchangeRateSpread) {
    this.exchangeRateSpread = exchangeRateSpread;
    return this;
  }

  /**
   * Get exchangeRateSpread
   * @return exchangeRateSpread
  */
  
  @Schema(name = "exchangeRateSpread", example = "-0.93", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeRateSpread")
  public Float getExchangeRateSpread() {
    return exchangeRateSpread;
  }

  public void setExchangeRateSpread(Float exchangeRateSpread) {
    this.exchangeRateSpread = exchangeRateSpread;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRatesSpreadResponse exchangeRatesSpreadResponse = (ExchangeRatesSpreadResponse) o;
    return Objects.equals(this.exchangeRateSpread, exchangeRatesSpreadResponse.exchangeRateSpread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRateSpread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRatesSpreadResponse {\n");
    sb.append("    exchangeRateSpread: ").append(toIndentedString(exchangeRateSpread)).append("\n");
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

