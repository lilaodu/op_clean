package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RedPacketDetail {
    private Integer id;

    private Integer redPacketId;

    private String mobilePhone;

    private BigDecimal amount;

    private Date ctime;

    private Date mtime;

    private Byte status;

    private Integer type;
    @Transient
    private String mobilefrom;
    @Transient
    private String emailfrom;
    @Transient
    private String coinCode;
    @Transient
    private BigDecimal totalAmount;
    @Transient
    private BigDecimal totalNumbers;
    @Transient
    private String url;

    public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Integer redPacketId) {
        this.redPacketId = redPacketId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

	public String getMobilefrom() {
		return mobilefrom;
	}

	public void setMobilefrom(String mobilefrom) {
		this.mobilefrom = mobilefrom;
	}

	public String getEmailfrom() {
		return emailfrom;
	}

	public void setEmailfrom(String emailfrom) {
		this.emailfrom = emailfrom;
	}

	public String getCoinCode() {
		return coinCode;
	}

	public void setCoinCode(String coinCode) {
		this.coinCode = coinCode;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalNumbers() {
		return totalNumbers;
	}

	public void setTotalNumbers(BigDecimal totalNumbers) {
		this.totalNumbers = totalNumbers;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
}