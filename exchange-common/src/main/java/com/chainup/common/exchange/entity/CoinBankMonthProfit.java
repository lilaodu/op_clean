package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CoinBankMonthProfit {
    private Integer id;

    private Integer bankOrId;

    private String coinCode;

    private String coinName;

    private BigDecimal amount;

    private BigDecimal fee;

    private Byte type;

    private Date accountMonth;

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
    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    public Date getAccountMonth() {
        return accountMonth;
    }

    public void setAccountMonth(Date accountMonth) {
        this.accountMonth = accountMonth;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }
}