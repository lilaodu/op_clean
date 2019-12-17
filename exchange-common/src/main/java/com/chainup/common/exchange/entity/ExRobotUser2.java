package com.chainup.common.exchange.entity;

public class ExRobotUser2 {
    private Integer id;

    private String symbol;

    private Integer buid;

    private Integer zuid;

    private Byte status;

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

    public Integer getBuid() {
        return buid;
    }

    public void setBuid(Integer buid) {
        this.buid = buid;
    }

    public Integer getZuid() {
        return zuid;
    }

    public void setZuid(Integer zuid) {
        this.zuid = zuid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}