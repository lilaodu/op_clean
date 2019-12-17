package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class TransactionWithdraw implements Serializable {
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

    private BigDecimal payAmount;

    @NotEmpty
    private Date createdAt;

    @NotEmpty
    private Date updatedAt;

    @Length(max=64)
    @NotEmpty
    private String outTransId;

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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
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

    public String getOutTransId() {
        return outTransId;
    }

    public void setOutTransId(String outTransId) {
        this.outTransId = outTransId == null ? null : outTransId.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public static class Builder {
        private TransactionWithdraw obj;

        public Builder() {
            this.obj = new TransactionWithdraw();
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

        public Builder payAmount(BigDecimal payAmount) {
            obj.payAmount = payAmount;
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

        public Builder outTransId(String outTransId) {
            obj.outTransId = outTransId;
            return this;
        }

        public Builder status(Byte status) {
            obj.status = status;
            return this;
        }

        public TransactionWithdraw build() {
            return this.obj;
        }
    }
}