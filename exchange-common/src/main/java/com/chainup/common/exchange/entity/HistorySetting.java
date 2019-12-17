package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class HistorySetting implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @Length(max=16)
    @NotEmpty
    private String optIp;

    @Length(max=128)
    @NotEmpty
    private String networkOperator;

    @Length(max=128)
    @NotEmpty
    private String networkWhere;

    @NotEmpty
    private Byte optType;

    @NotEmpty
    private Byte display;

    @NotEmpty
    private Date ctime;
    
    private String formatCtime;

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

    public String getOptIp() {
        return optIp;
    }

    public void setOptIp(String optIp) {
        this.optIp = optIp == null ? null : optIp.trim();
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

    public Byte getOptType() {
        return optType;
    }

    public void setOptType(Byte optType) {
        this.optType = optType;
    }

    public Byte getDisplay() {
        return display;
    }

    public void setDisplay(Byte display) {
        this.display = display;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getFormatCtime() {
		return formatCtime;
	}

	public void setFormatCtime(String formatCtime) {
		this.formatCtime = formatCtime;
	}

	public static class Builder {
        private HistorySetting obj;

        public Builder() {
            this.obj = new HistorySetting();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder optIp(String optIp) {
            obj.optIp = optIp;
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

        public Builder optType(Byte optType) {
            obj.optType = optType;
            return this;
        }

        public Builder display(Byte display) {
            obj.display = display;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public HistorySetting build() {
            return this.obj;
        }
    }
}