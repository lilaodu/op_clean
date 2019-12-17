package com.chainup.common.exchange.entity;

import java.util.Date;

import org.springframework.data.annotation.Transient;

public class CoinBankLevelOrder {
    private Integer id;

    private Integer coinBankId;

    private Byte preLevel;

    private Byte nextLevel;

    private Integer projectAmount;

    private Byte status;

    private Date ctime;

    private Date mtime;
    @Transient
   private String  coinBankName;

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

    public Byte getPreLevel() {
        return preLevel;
    }

    public void setPreLevel(Byte preLevel) {
        this.preLevel = preLevel;
    }

    public Byte getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(Byte nextLevel) {
        this.nextLevel = nextLevel;
    }

    public Integer getProjectAmount() {
        return projectAmount;
    }

    public void setProjectAmount(Integer projectAmount) {
        this.projectAmount = projectAmount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

	public String getCoinBankName() {
		return coinBankName;
	}

	public void setCoinBankName(String coinBankName) {
		this.coinBankName = coinBankName;
	}
    
}