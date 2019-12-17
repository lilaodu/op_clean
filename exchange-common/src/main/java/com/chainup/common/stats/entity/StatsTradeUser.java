package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatsTradeUser {
    private Integer id;

    private Date createdDate;

    private Integer uid;

    private String symbol;

    private String symbolBase;

    private String symbolQuote;

    private BigDecimal volume;

    private BigDecimal amount;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getSymbolBase() {
        return symbolBase;
    }

    public void setSymbolBase(String symbolBase) {
        this.symbolBase = symbolBase == null ? null : symbolBase.trim();
    }

    public String getSymbolQuote() {
        return symbolQuote;
    }

    public void setSymbolQuote(String symbolQuote) {
        this.symbolQuote = symbolQuote == null ? null : symbolQuote.trim();
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}