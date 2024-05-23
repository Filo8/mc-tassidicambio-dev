package com.example.restservice.model;

import java.net.URI;
import java.util.Objects;
import com.example.restservice.model.SortData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ExchangeRatesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-09T14:26:53.298332800+02:00[Europe/Rome]")
public class ExchangeRatesRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate from;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate to;

  private String referenceCurrency;

  @Valid
  private List<String> isoCurrencies;

  private Long page;

  private Long nrElement;

  private SortData sort;

  public ExchangeRatesRequest from(LocalDate from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  @Valid 
  @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public LocalDate getFrom() {
    return from;
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public ExchangeRatesRequest to(LocalDate to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  @Valid 
  @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public LocalDate getTo() {
    return to;
  }

  public void setTo(LocalDate to) {
    this.to = to;
  }

  public ExchangeRatesRequest referenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
    return this;
  }

  /**
   * Get referenceCurrency
   * @return referenceCurrency
  */
  
  @Schema(name = "referenceCurrency", example = "EUR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceCurrency")
  public String getReferenceCurrency() {
    return referenceCurrency;
  }

  public void setReferenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
  }

  public ExchangeRatesRequest isoCurrencies(List<String> isoCurrencies) {
    this.isoCurrencies = isoCurrencies;
    return this;
  }

  public ExchangeRatesRequest addIsoCurrenciesItem(String isoCurrenciesItem) {
    if (this.isoCurrencies == null) {
      this.isoCurrencies = new ArrayList<>();
    }
    this.isoCurrencies.add(isoCurrenciesItem);
    return this;
  }

  /**
   * Get isoCurrencies
   * @return isoCurrencies
  */
  
  @Schema(name = "isoCurrencies", example = "[\"USD\",\"AUD\",\"GBP\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isoCurrencies")
  public List<String> getIsoCurrencies() {
    return isoCurrencies;
  }

  public void setIsoCurrencies(List<String> isoCurrencies) {
    this.isoCurrencies = isoCurrencies;
  }

  public ExchangeRatesRequest page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  
  @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public ExchangeRatesRequest nrElement(Long nrElement) {
    this.nrElement = nrElement;
    return this;
  }

  /**
   * Get nrElement
   * @return nrElement
  */
  
  @Schema(name = "nrElement", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nrElement")
  public Long getNrElement() {
    return nrElement;
  }

  public void setNrElement(Long nrElement) {
    this.nrElement = nrElement;
  }

  public ExchangeRatesRequest sort(SortData sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  @Valid 
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public SortData getSort() {
    return sort;
  }

  public void setSort(SortData sort) {
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
    ExchangeRatesRequest exchangeRatesRequest = (ExchangeRatesRequest) o;
    return Objects.equals(this.from, exchangeRatesRequest.from) &&
        Objects.equals(this.to, exchangeRatesRequest.to) &&
        Objects.equals(this.referenceCurrency, exchangeRatesRequest.referenceCurrency) &&
        Objects.equals(this.isoCurrencies, exchangeRatesRequest.isoCurrencies) &&
        Objects.equals(this.page, exchangeRatesRequest.page) &&
        Objects.equals(this.nrElement, exchangeRatesRequest.nrElement) &&
        Objects.equals(this.sort, exchangeRatesRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, referenceCurrency, isoCurrencies, page, nrElement, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRatesRequest {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    referenceCurrency: ").append(toIndentedString(referenceCurrency)).append("\n");
    sb.append("    isoCurrencies: ").append(toIndentedString(isoCurrencies)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    nrElement: ").append(toIndentedString(nrElement)).append("\n");
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

