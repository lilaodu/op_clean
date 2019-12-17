package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class PresentRecord implements Serializable {
    private Long id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private BigDecimal amount;

    @Length(max=32)
    @NotEmpty
    private String symbol;

    @NotEmpty
    private Byte type;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Integer opUid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getOpUid() {
        return opUid;
    }

    public void setOpUid(Integer opUid) {
        this.opUid = opUid;
    }

    public static class Builder {
        private PresentRecord obj;

        public Builder() {
            this.obj = new PresentRecord();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            obj.amount = amount;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder type(Byte type) {
            obj.type = type;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder opUid(Integer opUid) {
            obj.opUid = opUid;
            return this;
        }

        public PresentRecord build() {
            return this.obj;
        }
    }
}