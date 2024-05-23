package it.bi_rest.bi_rest.request;

import java.util.List;

public class ExchangeRateRequest {

  private List<String> isoCurrencies;
  private String referenceDate;
  public String referenceCurrency;

  public String getReferenceDate() {
    return this.referenceDate;
  }

  public void setReferenceDate(String referenceDate) {
    this.referenceDate = referenceDate;
  }

  public String getReferenceCurrency() {
    return this.referenceCurrency;
  }

  public void setReferenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
  }

  public List<String> getIsoCurrencies() {
    return this.isoCurrencies;
  }

  public void setIsoCurrencies(List<String> isoCurrencies) {
    this.isoCurrencies = isoCurrencies;
  }
}
