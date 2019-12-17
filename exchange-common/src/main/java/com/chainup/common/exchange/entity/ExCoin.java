package com.chainup.common.exchange.entity;

public class ExCoin {
    private Integer id;

    private String coinName;

    private Byte withdraw;

    private Byte deposit;

    private Byte closed;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName == null ? null : coinName.trim();
    }

    public Byte getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Byte withdraw) {
        this.withdraw = withdraw;
    }

    public Byte getDeposit() {
        return deposit;
    }

    public void setDeposit(Byte deposit) {
        this.deposit = deposit;
    }

    public Byte getClosed() {
        return closed;
    }

    public void setClosed(Byte closed) {
        this.closed = closed;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}