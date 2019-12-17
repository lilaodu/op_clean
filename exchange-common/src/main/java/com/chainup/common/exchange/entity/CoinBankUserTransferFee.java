package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CoinBankUserTransferFee {
    private Integer id;

    private Integer coinBankId;

    private Integer coinBankAccountId;

    private Integer uid;

    private String dealCoin;

    private String dealSymbol;

    private Integer feeCoinType;

    private String feeCoinName;

    private BigDecimal fee;

    private Date accountTime;

    private BigDecimal profit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoinBankId() {
        return coinBankId;
    }

    public void setCoinBankId(Integer coinBankId) {
        this.coinBankId = coinBankId;
    }

    public Integer getCoinBankAccountId() {
        return coinBankAccountId;
    }

    public void setCoinBankAccountId(Integer coinBankAccountId) {
        this.coinBankAccountId = coinBankAccountId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getDealCoin() {
        return dealCoin;
    }

    public void setDealCoin(String dealCoin) {
        this.dealCoin = dealCoin == null ? null : dealCoin.trim();
    }

    public String getDealSymbol() {
        return dealSymbol;
    }

    public void setDealSymbol(String dealSymbol) {
        this.dealSymbol = dealSymbol == null ? null : dealSymbol.trim();
    }

    public Integer getFeeCoinType() {
        return feeCoinType;
    }

    public void setFeeCoinType(Integer feeCoinType) {
        this.feeCoinType = feeCoinType;
    }

    public String getFeeCoinName() {
        return feeCoinName;
    }

    public void setFeeCoinName(String feeCoinName) {
        this.feeCoinName = feeCoinName == null ? null : feeCoinName.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }
}