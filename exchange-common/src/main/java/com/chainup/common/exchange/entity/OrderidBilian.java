package com.chainup.common.exchange.entity;

public class OrderidBilian {
    private Long id;

    private Long orderid;

    private Long bilianOrderid;

    private String symbol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getBilianOrderid() {
        return bilianOrderid;
    }

    public void setBilianOrderid(Long bilianOrderid) {
        this.bilianOrderid = bilianOrderid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }
}