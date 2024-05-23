package com.example.restservice.model;

import java.net.URI;
import java.util.Objects;
import com.example.restservice.model.ExchangeRatesFeesResponseExchangeRatesFees;
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
 * ExchangeRatesFeesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRatesFeesResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private ExchangeRatesFeesResponseExchangeRatesFees exchangeRatesFees;

  public ExchangeRatesFeesResponse exchangeRatesFees(ExchangeRatesFeesResponseExchangeRatesFees exchangeRatesFees) {
    this.exchangeRatesFees = exchangeRatesFees;
    return this;
  }

  /**
   * Get exchangeRatesFees
   * @return exchangeRatesFees
  */
  @Valid 
  @Schema(name = "exchangeRatesFees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeRatesFees")
  public ExchangeRatesFeesResponseExchangeRatesFees getExchangeRatesFees() {
    return exchangeRatesFees;
  }

  public void setExchangeRatesFees(ExchangeRatesFeesResponseExchangeRatesFees exchangeRatesFees) {
    this.exchangeRatesFees = exchangeRatesFees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRatesFeesResponse exchangeRatesFeesResponse = (ExchangeRatesFeesResponse) o;
    return Objects.equals(this.exchangeRatesFees, exchangeRatesFeesResponse.exchangeRatesFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRatesFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRatesFeesResponse {\n");
    sb.append("    exchangeRatesFees: ").append(toIndentedString(exchangeRatesFees)).append("\n");
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

