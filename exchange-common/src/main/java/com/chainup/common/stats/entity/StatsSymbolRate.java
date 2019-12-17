package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatsSymbolRate {
    private Integer id;

    private String baseSymbol;

    private String quoteSymbol;

    private BigDecimal rate;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBaseSymbol() {
        return baseSymbol;
    }

    public void setBaseSymbol(String baseSymbol) {
        this.baseSymbol = baseSymbol == null ? null : baseSymbol.trim();
    }

    public String getQuoteSymbol() {
        return quoteSymbol;
    }

    public void setQuoteSymbol(String quoteSymbol) {
        this.quoteSymbol = quoteSymbol == null ? null : quoteSymbol.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}