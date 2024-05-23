package it.partec.tassidicambio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyResponse implements Serializable {

    private ResultInfo resultsInfo;
    private List<Currency> currencies;

    public CurrencyResponse() {
    }

    public ResultInfo getResultsInfo() {
        return resultsInfo;
    }

    public void setResultsInfo(ResultInfo resultsInfo) {
        this.resultsInfo = resultsInfo;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }
}
