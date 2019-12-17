package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserWithdrawAddr implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @Length(max=32)
    @NotEmpty
    private String symbol;

    @Length(max=128)
    @NotEmpty
    private String address;

    @Length(max=255)
    @NotEmpty
    private String label;
    
    @Length(max=255)
    private String flag;

    @NotEmpty
    private Byte status;

    @NotEmpty
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
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

    public static class Builder {
        private UserWithdrawAddr obj;

        public Builder() {
            this.obj = new UserWithdrawAddr();
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

        public Builder flag(String flag) {
            obj.flag = flag;
            return this;
        }
        public Builder label(String label) {
        	obj.label = label;
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

        public UserWithdrawAddr build() {
            return this.obj;
        }
    }

    @Override
    public String toString() {
        return "UserWithdrawAddr{" +
                "id=" + id +
                ", uid=" + uid +
                ", symbol='" + symbol + '\'' +
                ", address='" + address + '\'' +
                ", label='" + label + '\'' +
                ", flag='" + flag + '\'' +
                ", status=" + status +
                ", ctime=" + ctime +
                '}';
    }
}