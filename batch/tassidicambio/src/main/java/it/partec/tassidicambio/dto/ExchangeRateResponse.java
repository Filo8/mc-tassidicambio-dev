package it.partec.tassidicambio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRateResponse implements Serializable {

    private ResultInfo resultInfo;
    private List<Rate> rates;

    public ExchangeRateResponse() {
    }

    @Override
    public String toString() {
        return "ExchangeRateResponse{" +
                "resultInfo=" + resultInfo +
                ", rates=" + rates +
                '}';
    }

    public ResultInfo getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
