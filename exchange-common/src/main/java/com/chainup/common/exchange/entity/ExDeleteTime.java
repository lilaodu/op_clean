package com.chainup.common.exchange.entity;

import java.util.Date;

public class ExDeleteTime {
    private Integer id;

    private String tag;

    private Date stime;

    private Date etime;

    private Integer intervalTime;

    private Integer retentionTime;

    private Integer everyTime;

    private Byte clearType;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    public Integer getEveryTime() {
        return everyTime;
    }

    public void setEveryTime(Integer everyTime) {
        this.everyTime = everyTime;
    }

    public Byte getClearType() {
        return clearType;
    }

    public void setClearType(Byte clearType) {
        this.clearType = clearType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}