package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IecProject {
    private Integer id;

    private String code;

    private String name;

    private String description;

    private String coinCode;

    private String coinName;

    private BigDecimal targetAmount;

    private BigDecimal realAmount;

    private BigDecimal percent;

    private Date ctime;

    private Date mtime;

    private Date sime;

    private Date etime;

    private Byte status;

    private BigDecimal minUnit;
    
    private String visitPath;
    
    public String getVisitPath() {
		return visitPath;
	}

	public void setVisitPath(String visitPath) {
		this.visitPath = visitPath;
	}

	private long startTime;
    
    private long endTime;

    private long curTime;
    
    public long getCurTime() {
		return curTime;
	}

	public void setCurTime(long curTime) {
		this.curTime = curTime;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
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

    public Date getSime() {
        return sime;
    }

    public void setSime(Date sime) {
        this.sime = sime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(BigDecimal minUnit) {
        this.minUnit = minUnit;
    }
}