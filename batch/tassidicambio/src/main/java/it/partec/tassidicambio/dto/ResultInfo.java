package it.partec.tassidicambio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultInfo implements Serializable {

    private Integer totalRecords;
    private String timezoneReference;

    public ResultInfo() {
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "totalRecords=" + totalRecords +
                ", timezoneReference='" + timezoneReference + '\'' +
                '}';
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getTimezoneReference() {
        return timezoneReference;
    }

    public void setTimezoneReference(String timezoneReference) {
        this.timezoneReference = timezoneReference;
    }
}
