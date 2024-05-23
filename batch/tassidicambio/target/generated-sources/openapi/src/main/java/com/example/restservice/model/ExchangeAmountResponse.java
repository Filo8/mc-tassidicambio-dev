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
 * ExchangeAmountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeAmountResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float exchangeAmount;

  public ExchangeAmountResponse exchangeAmount(Float exchangeAmount) {
    this.exchangeAmount = exchangeAmount;
    return this;
  }

  /**
   * Get exchangeAmount
   * @return exchangeAmount
  */
  
  @Schema(name = "exchangeAmount", example = "10.59", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangeAmount")
  public Float getExchangeAmount() {
    return exchangeAmount;
  }

  public void setExchangeAmount(Float exchangeAmount) {
    this.exchangeAmount = exchangeAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeAmountResponse exchangeAmountResponse = (ExchangeAmountResponse) o;
    return Objects.equals(this.exchangeAmount, exchangeAmountResponse.exchangeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeAmountResponse {\n");
    sb.append("    exchangeAmount: ").append(toIndentedString(exchangeAmount)).append("\n");
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

