package com.chainup.common.stats.entity;

import java.util.Date;

public class StatsUserDay {
    private Integer id;

    private Integer registCount;

    private Integer bindPcount;

    private Integer bindMcount;

    private Integer capitalCount;

    private Integer loginCount;

    private Integer withdrawalCount;

    private Integer registDepcount;

    private Integer loginDepcount;

    private Integer tradeUcount;

    private Date createdDate;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegistCount() {
        return registCount;
    }

    public void setRegistCount(Integer registCount) {
        this.registCount = registCount;
    }

    public Integer getBindPcount() {
        return bindPcount;
    }

    public void setBindPcount(Integer bindPcount) {
        this.bindPcount = bindPcount;
    }

    public Integer getBindMcount() {
        return bindMcount;
    }

    public void setBindMcount(Integer bindMcount) {
        this.bindMcount = bindMcount;
    }

    public Integer getCapitalCount() {
        return capitalCount;
    }

    public void setCapitalCount(Integer capitalCount) {
        this.capitalCount = capitalCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getWithdrawalCount() {
        return withdrawalCount;
    }

    public void setWithdrawalCount(Integer withdrawalCount) {
        this.withdrawalCount = withdrawalCount;
    }

    public Integer getRegistDepcount() {
        return registDepcount;
    }

    public void setRegistDepcount(Integer registDepcount) {
        this.registDepcount = registDepcount;
    }

    public Integer getLoginDepcount() {
        return loginDepcount;
    }

    public void setLoginDepcount(Integer loginDepcount) {
        this.loginDepcount = loginDepcount;
    }

    public Integer getTradeUcount() {
        return tradeUcount;
    }

    public void setTradeUcount(Integer tradeUcount) {
        this.tradeUcount = tradeUcount;
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