package com.chainup.common.exchange.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransactionDepositCrypto implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @Length(max=32)
    @NotEmpty
    private String symbol;

    @NotEmpty
    private BigDecimal amount;

    @NotEmpty
    private BigDecimal fee;

    @NotEmpty
    private Date createdAt;

    @NotEmpty
    private Date updatedAt;

    @Length(max=128)
    @NotEmpty
    private String addressTo;

    @Length(max=128)
    @NotEmpty
    private String txid;

    private Integer confirmations;

    private Byte isMining;

    @NotEmpty
    private Byte status;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
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

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo == null ? null : addressTo.trim();
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid == null ? null : txid.trim();
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public Byte getIsMining() {
        return isMining;
    }

    public void setIsMining(Byte isMining) {
        this.isMining = isMining;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public static class Builder {
        private TransactionDepositCrypto obj;

        public Builder() {
            this.obj = new TransactionDepositCrypto();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            obj.amount = amount;
            return this;
        }

        public Builder fee(BigDecimal fee) {
            obj.fee = fee;
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

        public Builder addressTo(String addressTo) {
            obj.addressTo = addressTo;
            return this;
        }

        public Builder txid(String txid) {
            obj.txid = txid;
            return this;
        }

        public Builder confirmations(Integer confirmations) {
            obj.confirmations = confirmations;
            return this;
        }

        public Builder isMining(Byte isMining) {
            obj.isMining = isMining;
            return this;
        }

        public Builder status(Byte status) {
            obj.status = status;
            return this;
        }

        public TransactionDepositCrypto build() {
            return this.obj;
        }
    }
}