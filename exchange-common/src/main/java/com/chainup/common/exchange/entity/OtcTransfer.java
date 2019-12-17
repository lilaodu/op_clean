package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class OtcTransfer implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Byte transferType;

    @Length(max=6)
    @NotEmpty
    private String coinSymbol;

    @NotEmpty
    private Date createTime;

    @NotEmpty
    private Date updateTime;

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

    public Byte getTransferType() {
        return transferType;
    }

    public void setTransferType(Byte transferType) {
        this.transferType = transferType;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol == null ? null : coinSymbol.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OtcTransfer{" +
                "id=" + id +
                ", uid=" + uid +
                ", transferType=" + transferType +
                ", coinSymbol='" + coinSymbol + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public static class Builder {
        private OtcTransfer obj;

        public Builder() {
            this.obj = new OtcTransfer();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder transferType(Byte transferType) {
            obj.transferType = transferType;
            return this;
        }

        public Builder coinSymbol(String coinSymbol) {
            obj.coinSymbol = coinSymbol;
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.createTime = createTime;
            return this;
        }

        public Builder updateTime(Date updateTime) {
            obj.updateTime = updateTime;
            return this;
        }

        public OtcTransfer build() {
            return this.obj;
        }
    }
}