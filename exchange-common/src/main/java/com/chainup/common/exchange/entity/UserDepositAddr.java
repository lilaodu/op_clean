package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserDepositAddr implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @Length(max=32)
    @NotEmpty
    private String symbol;

    @Length(max=128)
    @NotEmpty
    private String address;

    @NotEmpty
    private Byte type;

    @NotEmpty
    private Byte status;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "UserDepositAddr{" +
                "id=" + id +
                ", uid=" + uid +
                ", symbol='" + symbol + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", ctime=" + ctime +
                '}';
    }

    public static class Builder {
        private UserDepositAddr obj;

        public Builder() {
            this.obj = new UserDepositAddr();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder symbol(String symbol) {
            obj.symbol = symbol;
            return this;
        }

        public Builder address(String address) {
            obj.address = address;
            return this;
        }

        public Builder type(Byte type) {
            obj.type = type;
            return this;
        }

        public Builder status(Byte status) {
            obj.status = status;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public UserDepositAddr build() {
            return this.obj;
        }
    }
}