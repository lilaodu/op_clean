package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserBankCard implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @Length(max=32)
    @NotEmpty
    private String cardNo;

    @NotEmpty
    private Integer bankNo;
    
    private String bankName;

    @Length(max=128)
    private String bankSub;

    @Length(max=32)
    @NotEmpty
    private String name;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Integer getBankNo() {
        return bankNo;
    }

    public void setBankNo(Integer bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankSub() {
        return bankSub;
    }

    public void setBankSub(String bankSub) {
        this.bankSub = bankSub == null ? null : bankSub.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private UserBankCard obj;

        public Builder() {
            this.obj = new UserBankCard();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder cardNo(String cardNo) {
            obj.cardNo = cardNo;
            return this;
        }

        public Builder bankNo(Integer bankNo) {
            obj.bankNo = bankNo;
            return this;
        }

        public Builder bankSub(String bankSub) {
            obj.bankSub = bankSub;
            return this;
        }

        public Builder name(String name) {
            obj.name = name;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public UserBankCard build() {
            return this.obj;
        }
    }
}