package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExFee implements Serializable {
    @NotEmpty
    private Integer id;

    @Length(max=64)
    @NotEmpty
    private String symbol;

    @NotEmpty
    private Integer type;

    @NotEmpty
    private BigDecimal rate;

    @NotEmpty
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public static class Builder {
        private ExFee obj;

        public Builder() {
            this.obj = new ExFee();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder type(Integer type) {
            obj.type = type;
            return this;
        }

        public Builder rate(BigDecimal rate) {
            obj.rate = rate;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public ExFee build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "ExFee{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", type=" + type +
                ", rate=" + rate +
                ", mtime=" + mtime +
                '}';
    }
}