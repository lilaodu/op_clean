package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExScaleKline implements Serializable {
    private Long id;

    @NotEmpty
    private Long idx;

    @Length(max=6)
    @NotEmpty
    private String type;

    @NotEmpty
    private BigDecimal amount;

    @NotEmpty
    private BigDecimal vol;

    @NotEmpty
    private BigDecimal open;

    @NotEmpty
    private BigDecimal close;

    @NotEmpty
    private BigDecimal high;

    @NotEmpty
    private BigDecimal low;

    @NotEmpty
    private Integer count;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getVol() {
        return vol;
    }

    public void setVol(BigDecimal vol) {
        this.vol = vol;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private ExScaleKline obj;

        public Builder() {
            this.obj = new ExScaleKline();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder idx(Long idx) {
            obj.idx = idx;
            return this;
        }

        public Builder type(String type) {
            obj.type = type;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            obj.amount = amount;
            return this;
        }

        public Builder vol(BigDecimal vol) {
            obj.vol = vol;
            return this;
        }

        public Builder open(BigDecimal open) {
            obj.open = open;
            return this;
        }

        public Builder close(BigDecimal close) {
            obj.close = close;
            return this;
        }

        public Builder high(BigDecimal high) {
            obj.high = high;
            return this;
        }

        public Builder low(BigDecimal low) {
            obj.low = low;
            return this;
        }

        public Builder count(Integer count) {
            obj.count = count;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public ExScaleKline build() {
            return this.obj;
        }
    }
}