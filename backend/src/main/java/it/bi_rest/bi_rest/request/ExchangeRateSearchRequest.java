package it.bi_rest.bi_rest.request;

public class ExchangeRateSearchRequest {

  private String isoCode;
  private String referenceDate;

  // Getters and Setters
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public String getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(String referenceDate) {
    this.referenceDate = referenceDate;
  }
}
