package org.kodluyoruz.mybank.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Exchange {

    @JsonProperty("rates")
    private Rates rates;
    private String base;
    private Date date;

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
