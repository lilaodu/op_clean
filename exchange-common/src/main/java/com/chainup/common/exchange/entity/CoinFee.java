package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CoinFee {
    private Integer id;

    //币种名称
    private String symbol;
    //最小提币数量
    private BigDecimal depositMin;
    //最大提币数量
    private BigDecimal depositMax;
    //提币手续费
    private BigDecimal depositFee;
    //交易手续费
    private BigDecimal exchangeFee;

    private Date ctime;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public BigDecimal getDepositMin() {
        return depositMin;
    }

    public void setDepositMin(BigDecimal depositMin) {
        this.depositMin = depositMin;
    }

    public BigDecimal getDepositMax() {
        return depositMax;
    }

    public void setDepositMax(BigDecimal depositMax) {
        this.depositMax = depositMax;
    }

    public BigDecimal getDepositFee() {
        return depositFee;
    }

    public void setDepositFee(BigDecimal depositFee) {
        this.depositFee = depositFee;
    }

    public BigDecimal getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(BigDecimal exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}