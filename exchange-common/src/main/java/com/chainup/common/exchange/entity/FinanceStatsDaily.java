package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class FinanceStatsDaily implements Serializable {
    private Integer id;

    @Length(max=32)
    @NotEmpty
    private String symbol;

    @Length(max=32)
    @NotEmpty
    private String itemType;

    @NotEmpty
    private Date itemDate;

    @NotEmpty
    private BigDecimal amount;

    @NotEmpty
    private Date ctime;

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

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public Date getItemDate() {
        return itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public static class Builder {
        private FinanceStatsDaily obj;

        public Builder() {
            this.obj = new FinanceStatsDaily();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder itemType(String itemType) {
            obj.itemType = itemType;
            return this;
        }

        public Builder itemDate(Date itemDate) {
            obj.itemDate = itemDate;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            obj.amount = amount;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public FinanceStatsDaily build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "FinanceStatsDaily{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemDate=" + itemDate +
                ", amount=" + amount +
                ", ctime=" + ctime +
                '}';
    }
}