package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

public class HistoryAccount implements Serializable {
    private Long id;

    @NotEmpty
    private Long transId;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Integer accountType;

    @NotEmpty
    private Integer transType;

    @NotEmpty
    private BigDecimal amount;

    @NotEmpty
    private BigDecimal balance;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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

    public static class Builder {
        private HistoryAccount obj;

        public Builder() {
            this.obj = new HistoryAccount();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder transId(Long transId) {
            obj.transId = transId;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder accountType(Integer accountType) {
            obj.accountType = accountType;
            return this;
        }

        public Builder transType(Integer transType) {
            obj.transType = transType;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            obj.amount = amount;
            return this;
        }

        public Builder balance(BigDecimal balance) {
            obj.balance = balance;
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

        public HistoryAccount build() {
            return this.obj;
        }
    }

	@Override
	public String toString() {
		return "HistoryAccount [id=" + id + ", transId=" + transId + ", uid=" + uid + ", accountType=" + accountType
				+ ", transType=" + transType + ", amount=" + amount + ", balance=" + balance + ", ctime=" + ctime
				+ ", mtime=" + mtime + "]";
	}
    
}