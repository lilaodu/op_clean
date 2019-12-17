package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class HistoryLogin implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Byte lgType;

    @NotEmpty
    private Byte lgPlatform;

    @Length(max=16)
    @NotEmpty
    private String lgSystem;

    @Length(max=16)
    @NotEmpty
    private String lgIp;

    @NotEmpty
    private Byte lgStatus;

    @Length(max=128)
    @NotEmpty
    private String lgDes;

    @Length(max=128)
    @NotEmpty
    private String networkOperator;

    @Length(max=128)
    @NotEmpty
    private String networkWhere;

    @NotEmpty
    private Byte display;

    @NotEmpty
    private Date lgInTime;

    private Date lgOutTime;
    
    private Double lgTimeLength;//登录时长（小时）
    
    private Integer login;//登录人数
    private Integer order;//交易人数
    private Integer deposit;//完成充值人数
    private Integer withdraw;//提现人数
    
    /**
     * 格式化登陆时间
     */
    private String formatLgInTime;
    
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

    public Byte getLgType() {
        return lgType;
    }

    public void setLgType(Byte lgType) {
        this.lgType = lgType;
    }

    public Byte getLgPlatform() {
        return lgPlatform;
    }

    public void setLgPlatform(Byte lgPlatform) {
        this.lgPlatform = lgPlatform;
    }

    public String getLgSystem() {
        return lgSystem;
    }

    public void setLgSystem(String lgSystem) {
        this.lgSystem = lgSystem == null ? null : lgSystem.trim();
    }

    public String getLgIp() {
        return lgIp;
    }

    public void setLgIp(String lgIp) {
        this.lgIp = lgIp == null ? null : lgIp.trim();
    }

    public Byte getLgStatus() {
        return lgStatus;
    }

    public void setLgStatus(Byte lgStatus) {
        this.lgStatus = lgStatus;
    }

    public String getLgDes() {
        return lgDes;
    }

    public void setLgDes(String lgDes) {
        this.lgDes = lgDes == null ? null : lgDes.trim();
    }

    public String getNetworkOperator() {
        return networkOperator;
    }

    public void setNetworkOperator(String networkOperator) {
        this.networkOperator = networkOperator == null ? null : networkOperator.trim();
    }

    public String getNetworkWhere() {
        return networkWhere;
    }

    public void setNetworkWhere(String networkWhere) {
        this.networkWhere = networkWhere == null ? null : networkWhere.trim();
    }

    public Byte getDisplay() {
        return display;
    }

    public void setDisplay(Byte display) {
        this.display = display;
    }

    public Date getLgInTime() {
        return lgInTime;
    }

    public void setLgInTime(Date lgInTime) {
        this.lgInTime = lgInTime;
    }

    public Date getLgOutTime() {
        return lgOutTime;
    }

    public void setLgOutTime(Date lgOutTime) {
        this.lgOutTime = lgOutTime;
    }

    public Double getLgTimeLength() {
        return lgTimeLength;
    }

    public void setLgTimeLength(Double lgTimeLength) {
        this.lgTimeLength = lgTimeLength;
    }

    public Integer getLogin() {
        return login;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Integer withdraw) {
        this.withdraw = withdraw;
    }
    
    public void setFormatLgInTime(String formatLgInTime) {
    	this.formatLgInTime = formatLgInTime;
    }

    public String getFormatLgInTime() {
		return formatLgInTime;
	}

	public static class Builder {
        private HistoryLogin obj;

        public Builder() {
            this.obj = new HistoryLogin();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder lgType(Byte lgType) {
            obj.lgType = lgType;
            return this;
        }

        public Builder lgPlatform(Byte lgPlatform) {
            obj.lgPlatform = lgPlatform;
            return this;
        }

        public Builder lgSystem(String lgSystem) {
            obj.lgSystem = lgSystem;
            return this;
        }

        public Builder lgIp(String lgIp) {
            obj.lgIp = lgIp;
            return this;
        }

        public Builder lgStatus(Byte lgStatus) {
            obj.lgStatus = lgStatus;
            return this;
        }

        public Builder lgDes(String lgDes) {
            obj.lgDes = lgDes;
            return this;
        }

        public Builder networkOperator(String networkOperator) {
            obj.networkOperator = networkOperator;
            return this;
        }

        public Builder networkWhere(String networkWhere) {
            obj.networkWhere = networkWhere;
            return this;
        }

        public Builder display(Byte display) {
            obj.display = display;
            return this;
        }

        public Builder lgInTime(Date lgInTime) {
            obj.lgInTime = lgInTime;
            return this;
        }

        public Builder lgOutTime(Date lgOutTime) {
            obj.lgOutTime = lgOutTime;
            return this;
        }

        public HistoryLogin build() {
            return this.obj;
        }
    }
}