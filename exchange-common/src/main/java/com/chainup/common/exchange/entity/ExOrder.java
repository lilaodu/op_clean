package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExOrder implements Serializable {
    private Long id;

    @NotEmpty
    private Integer userId;

    @Length(max=4)
    @NotEmpty
    private String side;
    
    private String side_msg;

    @NotEmpty
    private BigDecimal price;

    @NotEmpty
    private BigDecimal volume;
    
    private BigDecimal remainVolume;

    @NotEmpty
    private Double feeRateMaker;

    @NotEmpty
    private Double feeRateTaker;

    @NotEmpty
    private BigDecimal fee;

    @NotEmpty
    private Double feeCoinRate;

    @NotEmpty
    private BigDecimal dealVolume;

    private BigDecimal dealMoney;

    @NotEmpty
    private BigDecimal avgPrice;

    @NotEmpty
    private Byte status;
    
    private String status_msg;

    @NotEmpty
    private Byte type;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @NotEmpty
    private Byte source;
    
    private String tableName;
    
    private List<ExTrade> tradeList;

    private static final long serialVersionUID = 1L;

    @Override
	public String toString() {
		return "ExOrder [id=" + id + ", userId=" + userId + ", side=" + side + ", side_msg=" + side_msg + ", price="
				+ price + ", volume=" + volume + ", remainVolume=" + remainVolume + ", feeRateMaker=" + feeRateMaker
				+ ", feeRateTaker=" + feeRateTaker + ", fee=" + fee + ", feeCoinRate=" + feeCoinRate + ", dealVolume="
				+ dealVolume + ", dealMoney=" + dealMoney + ", avgPrice=" + avgPrice + ", status=" + status
				+ ", status_msg=" + status_msg + ", type=" + type + ", ctime=" + ctime + ", mtime=" + mtime
				+ ", source=" + source + "]";
	}
    
    public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setTradeList(List<ExTrade> tradeList) {
		this.tradeList = tradeList;
	}

	public List<ExTrade> getTradeList() {
		return tradeList;
	}
    
	public String getSide_msg() {
		return side_msg;
	}

	public void setSide_msg(String side_msg) {
		this.side_msg = side_msg;
	}

	public BigDecimal getRemainVolume() {
		return remainVolume;
	}

	public void setRemainVolume(BigDecimal remainVolume) {
		this.remainVolume = remainVolume;
	}

	public String getStatus_msg() {
		return status_msg;
	}

	public void setStatus_msg(String status_msg) {
		this.status_msg = status_msg;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Double getFeeRateMaker() {
        return feeRateMaker;
    }

    public void setFeeRateMaker(Double feeRateMaker) {
        this.feeRateMaker = feeRateMaker;
    }

    public Double getFeeRateTaker() {
        return feeRateTaker;
    }

    public void setFeeRateTaker(Double feeRateTaker) {
        this.feeRateTaker = feeRateTaker;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Double getFeeCoinRate() {
        return feeCoinRate;
    }

    public void setFeeCoinRate(Double feeCoinRate) {
        this.feeCoinRate = feeCoinRate;
    }

    public BigDecimal getDealVolume() {
        return dealVolume;
    }

    public void setDealVolume(BigDecimal dealVolume) {
        this.dealVolume = dealVolume;
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }

    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public static class Builder {
        private ExOrder obj;

        public Builder() {
            this.obj = new ExOrder();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder userId(Integer userId) {
            obj.userId = userId;
            return this;
        }

        public Builder side(String side) {
            obj.side = side;
            return this;
        }

        public Builder price(BigDecimal price) {
            obj.price = price;
            return this;
        }

        public Builder volume(BigDecimal volume) {
            obj.volume = volume;
            return this;
        }

        public Builder feeRateMaker(Double feeRateMaker) {
            obj.feeRateMaker = feeRateMaker;
            return this;
        }

        public Builder feeRateTaker(Double feeRateTaker) {
            obj.feeRateTaker = feeRateTaker;
            return this;
        }

        public Builder fee(BigDecimal fee) {
            obj.fee = fee;
            return this;
        }

        public Builder feeCoinRate(Double feeCoinRate) {
            obj.feeCoinRate = feeCoinRate;
            return this;
        }

        public Builder dealVolume(BigDecimal dealVolume) {
            obj.dealVolume = dealVolume;
            return this;
        }

        public Builder dealMoney(BigDecimal dealMoney) {
            obj.dealMoney = dealMoney;
            return this;
        }

        public Builder avgPrice(BigDecimal avgPrice) {
            obj.avgPrice = avgPrice;
            return this;
        }

        public Builder status(Byte status) {
            obj.status = status;
            return this;
        }

        public Builder type(Byte type) {
            obj.type = type;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder mtime(Date mtime) {
            obj.mtime = mtime;
            return this;
        }

        public Builder source(Byte source) {
            obj.source = source;
            return this;
        }

        public ExOrder build() {
            return this.obj;
        }
    }
}