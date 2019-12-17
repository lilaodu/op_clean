package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IecProjectUser {
    private Integer id;

    private Integer iecProjectId;

    private Integer uid;

    private BigDecimal amount;

    private BigDecimal effectiveAmount;

    private Date ctime;

    private Date mtime;

    private Byte status;

    private Integer copies;

    private Integer takeCopies;
    
    private String email;
    
    private String mobileNumber;
    
    private String nickname;
    
    private BigDecimal realMoney;
    
	public BigDecimal getRealMoney() {
		return realMoney;
	}

	public void setRealMoney(BigDecimal realMoney) {
		this.realMoney = realMoney;
	}

	public Integer getTakeCopies() {
		return takeCopies;
	}

	public void setTakeCopies(Integer takeCopies) {
		this.takeCopies = takeCopies;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIecProjectId() {
        return iecProjectId;
    }

    public void setIecProjectId(Integer iecProjectId) {
        this.iecProjectId = iecProjectId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getEffectiveAmount() {
        return effectiveAmount;
    }

    public void setEffectiveAmount(BigDecimal effectiveAmount) {
        this.effectiveAmount = effectiveAmount;
    }

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

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}