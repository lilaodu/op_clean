package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatsDepositDay {
    private Integer id;

    private String symbol;

    private BigDecimal depAmount;

    private BigDecimal intoAmount;

    private Integer depCount;

    private Integer succCount;

    private Integer userCount;

    private Integer maxUid;

    private Date createdDate;

    private Date ctime;

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

    public BigDecimal getDepAmount() {
        return depAmount;
    }

    public void setDepAmount(BigDecimal depAmount) {
        this.depAmount = depAmount;
    }

    public BigDecimal getIntoAmount() {
        return intoAmount;
    }

    public void setIntoAmount(BigDecimal intoAmount) {
        this.intoAmount = intoAmount;
    }

    public Integer getDepCount() {
        return depCount;
    }

    public void setDepCount(Integer depCount) {
        this.depCount = depCount;
    }

    public Integer getSuccCount() {
        return succCount;
    }

    public void setSuccCount(Integer succCount) {
        this.succCount = succCount;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getMaxUid() {
        return maxUid;
    }

    public void setMaxUid(Integer maxUid) {
        this.maxUid = maxUid;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}