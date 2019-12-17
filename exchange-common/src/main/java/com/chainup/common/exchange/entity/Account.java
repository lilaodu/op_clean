package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Account implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Integer type;

    @NotEmpty
    private BigDecimal balance;

    @Length(max=32)
    @NotEmpty
    private String tag;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;
    
    @NotEmpty
    private Integer assetId ;
    

    public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}


	private static final long serialVersionUID = 1L;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
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

    
    @Override
	public String toString() {
		return "Account [id=" + id + ", uid=" + uid + ", type=" + type + ", balance=" + balance + ", tag=" + tag
				+ ", ctime=" + ctime + ", mtime=" + mtime + "]";
	}


	public static class Builder {
        private Account obj;

        public Builder() {
            this.obj = new Account();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }
        
        public Builder assetId(Integer assetId) {
            obj.assetId = assetId;
            return this;
        }

        public Builder type(Integer type) {
            obj.type = type;
            return this;
        }

        public Builder balance(BigDecimal balance) {
            obj.balance = balance;
            return this;
        }

        public Builder tag(String tag) {
            obj.tag = tag;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Account build() {
            return this.obj;
        }
    }
}