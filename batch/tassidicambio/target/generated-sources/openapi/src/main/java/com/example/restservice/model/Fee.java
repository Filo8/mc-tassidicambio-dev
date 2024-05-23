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
 * Fee
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class Fee implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float amount;

  private Float percent;

  public Fee amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", example = "0.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Fee percent(Float percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
  */
  
  @Schema(name = "percent", example = "1.01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percent")
  public Float getPercent() {
    return percent;
  }

  public void setPercent(Float percent) {
    this.percent = percent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fee fee = (Fee) o;
    return Objects.equals(this.amount, fee.amount) &&
        Objects.equals(this.percent, fee.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fee {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

