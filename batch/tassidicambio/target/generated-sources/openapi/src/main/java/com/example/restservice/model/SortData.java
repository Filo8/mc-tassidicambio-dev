package com.example.restservice.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SortData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class SortData implements Serializable {

  private static final long serialVersionUID = 1L;

  private String field;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SortEnum sort;

  public SortData field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  
  @Schema(name = "field", example = "avgRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SortData sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  
  @Schema(name = "sort", example = "ASC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortData sortData = (SortData) o;
    return Objects.equals(this.field, sortData.field) &&
        Objects.equals(this.sort, sortData.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortData {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

