package it.partec.tassidicambio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency implements Serializable {

    private String isoCode;
    private String name;
    private boolean graph;
    private List<Country> countries;

    @Override
    public String toString() {
        return "Currency{" +
                "isoCode='" + isoCode + '\'' +
                ", name='" + name + '\'' +
                ", graph=" + graph +
                ", countries=" + countries +
                '}';
    }

    public Currency() {
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGraph() {
        return graph;
    }

    public void setGraph(boolean graph) {
        this.graph = graph;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
