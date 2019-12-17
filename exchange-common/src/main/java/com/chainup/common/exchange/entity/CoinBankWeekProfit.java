package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CoinBankWeekProfit {
    private Integer id;

    private Integer bankOrId;

    private String coinCode;

    private String coinName;

    private BigDecimal amount;

    private BigDecimal fee;

    private Byte type;

    private Date accountStime;

    private Date accountEtime;

    private BigDecimal profit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankOrId() {
        return bankOrId;
    }

    public void setBankOrId(Integer bankOrId) {
        this.bankOrId = bankOrId;
    }

    public String getCoinCode() {
        return coinCode;
    }

    public void setCoinCode(String coinCode) {
        this.coinCode = coinCode == null ? null : coinCode.trim();
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName == null ? null : coinName.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getAccountStime() {
        return accountStime;
    }

    public void setAccountStime(Date accountStime) {
        this.accountStime = accountStime;
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getAccountEtime() {
        return accountEtime;
    }

    public void setAccountEtime(Date accountEtime) {
        this.accountEtime = accountEtime;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }
}