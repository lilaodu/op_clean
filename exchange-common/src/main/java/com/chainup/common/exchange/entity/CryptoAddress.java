package com.chainup.common.exchange.entity;

import java.util.Date;

public class CryptoAddress {
    private Integer id;

    private String address;

    private Byte isUsed;

    private Date ctime;

    private String tableName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Byte isUsed) {
        this.isUsed = isUsed;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "CryptoAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", isUsed=" + isUsed +
                ", ctime=" + ctime +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}