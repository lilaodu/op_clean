package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Transient;

public class CoinBankDayProfit {
    private Integer id;

    private Integer bankOrId;

    private String coinCode;

    private String coinName;

    private BigDecimal amount;

    private BigDecimal fee;

    private Byte type;

    private Date accountTime;

    private BigDecimal profit;

    private Byte status;
    
    @Transient
    private String coinBankName;
    @Transient
    private String website;
    @Transient
    private String contactName;
    @Transient
    private String contactPhoneNumber;
    @Transient
    private Byte level;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

	public String getCoinBankName() {
		return coinBankName;
	}

	public void setCoinBankName(String coinBankName) {
		this.coinBankName = coinBankName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
	}
    
    
}