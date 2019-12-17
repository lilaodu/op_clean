package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatsTradeDay {
    private Integer id;

    private Date createdDate;

    private String symbol;

    private String symbolBase;

    private String symbolQuote;

    private BigDecimal volume;

    private BigDecimal amount;

    private Integer tradeCount;

    private Integer userCount;

    private Integer maxTradeUid;

    private BigDecimal maxTradeVol;

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

    public Integer getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getMaxTradeUid() {
        return maxTradeUid;
    }

    public void setMaxTradeUid(Integer maxTradeUid) {
        this.maxTradeUid = maxTradeUid;
    }

    public BigDecimal getMaxTradeVol() {
        return maxTradeVol;
    }

    public void setMaxTradeVol(BigDecimal maxTradeVol) {
        this.maxTradeVol = maxTradeVol;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}