package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CoinBankUserProfit {
    private Integer id;

    private Integer coinBankAccountId;

    private Integer uid;

    private String dealCoin;

    private String dealSymbol;

    private String coinName;

    private BigDecimal amount;

    private BigDecimal fee;

    private Date accountTime;
    @Transient
    private String email;
    @Transient
    private String mobile;
    @Transient
    private String authLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAuthLevel() {
		return authLevel;
	}

	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}
    
}