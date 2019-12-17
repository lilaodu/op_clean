package com.chainup.common.stats.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

import com.chainup.common.enums.WarnInfo;

public class TransactionWarningCrypto implements Serializable {
    private Integer id;

    private Integer withdrawCryptoId;

    @NotEmpty
    private Integer uid;

    private Integer warnLevel;

    @NotEmpty
    private Date createdAt;

    @NotEmpty
    private Date updatedAt;

    private String warinInfo;
    
    private String manageInfo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWithdrawCryptoId() {
        return withdrawCryptoId;
    }

    public void setWithdrawCryptoId(Integer withdrawCryptoId) {
        this.withdrawCryptoId = withdrawCryptoId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getWarnLevel() {
        return warnLevel;
    }

    public void setWarnLevel(Integer warnLevel) {
        this.warnLevel = warnLevel;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getWarinInfo() {
        return warinInfo;
    }

    public void setWarinInfo(String warinInfo) {
        this.warinInfo = warinInfo == null ? null : warinInfo.trim();
    }

    public String getManageInfo() {
		return WarnInfo.fromValue(warnLevel).getDescription();
	}

	public void setManageInfo(String manageInfo) {
		this.manageInfo = manageInfo;
	}

	public static class Builder {
        private TransactionWarningCrypto obj;

        public Builder() {
            this.obj = new TransactionWarningCrypto();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder withdrawCryptoId(Integer withdrawCryptoId) {
            obj.withdrawCryptoId = withdrawCryptoId;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder warnLevel(Integer warnLevel) {
            obj.warnLevel = warnLevel;
            return this;
        }

        public Builder createdAt(Date createdAt) {
            obj.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(Date updatedAt) {
            obj.updatedAt = updatedAt;
            return this;
        }

        public Builder warinInfo(String warinInfo) {
            obj.warinInfo = warinInfo;
            return this;
        }

        public TransactionWarningCrypto build() {
            return this.obj;
        }
    }
}