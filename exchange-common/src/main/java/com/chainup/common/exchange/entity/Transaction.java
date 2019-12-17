package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Transaction implements Serializable {
    private Long id;

    @NotEmpty
    private Integer fromUid;

    @NotEmpty
    private Integer fromType;

    @NotEmpty
    private BigDecimal fromBalance;

    @NotEmpty
    private Integer toUid;

    @NotEmpty
    private Integer toType;

    @NotEmpty
    private BigDecimal toBalance;

    @NotEmpty
    private BigDecimal amount;

    @Length(max=255)
    @NotEmpty
    private String meta;

    @Length(max=64)
    @NotEmpty
    private String scene;

    @Length(max=64)
    @NotEmpty
    private String refType;

    @NotEmpty
    private Long refId;

    @NotEmpty
    private Integer opUid;

    @Length(max=16)
    @NotEmpty
    private String opIp;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    private String symbol;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Integer getFromType() {
        return fromType;
    }

    public void setFromType(Integer fromType) {
        this.fromType = fromType;
    }

    public BigDecimal getFromBalance() {
        return fromBalance;
    }

    public void setFromBalance(BigDecimal fromBalance) {
        this.fromBalance = fromBalance;
    }

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public Integer getToType() {
        return toType;
    }

    public void setToType(Integer toType) {
        this.toType = toType;
    }

    public BigDecimal getToBalance() {
        return toBalance;
    }

    public void setToBalance(BigDecimal toBalance) {
        this.toBalance = toBalance;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta == null ? null : meta.trim();
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType == null ? null : refType.trim();
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public Integer getOpUid() {
        return opUid;
    }

    public void setOpUid(Integer opUid) {
        this.opUid = opUid;
    }

    public String getOpIp() {
        return opIp;
    }

    public void setOpIp(String opIp) {
        this.opIp = opIp == null ? null : opIp.trim();
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static class Builder {
        private Transaction obj;

        public Builder() {
            this.obj = new Transaction();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder fromUid(Integer fromUid) {
            obj.fromUid = fromUid;
            return this;
        }

        public Builder fromType(Integer fromType) {
            obj.fromType = fromType;
            return this;
        }

        public Builder fromBalance(BigDecimal fromBalance) {
            obj.fromBalance = fromBalance;
            return this;
        }

        public Builder toUid(Integer toUid) {
            obj.toUid = toUid;
            return this;
        }

        public Builder toType(Integer toType) {
            obj.toType = toType;
            return this;
        }

        public Builder toBalance(BigDecimal toBalance) {
            obj.toBalance = toBalance;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            obj.amount = amount;
            return this;
        }

        public Builder meta(String meta) {
            obj.meta = meta;
            return this;
        }

        public Builder scene(String scene) {
            obj.scene = scene;
            return this;
        }

        public Builder refType(String refType) {
            obj.refType = refType;
            return this;
        }

        public Builder refId(Long refId) {
            obj.refId = refId;
            return this;
        }

        public Builder opUid(Integer opUid) {
            obj.opUid = opUid;
            return this;
        }

        public Builder opIp(String opIp) {
            obj.opIp = opIp;
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

        public Transaction build() {
            return this.obj;
        }
    }

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", fromUid=" + fromUid + ", fromType=" + fromType + ", fromBalance="
				+ fromBalance + ", toUid=" + toUid + ", toType=" + toType + ", toBalance=" + toBalance + ", amount="
				+ amount + ", meta=" + meta + ", scene=" + scene + ", refType=" + refType + ", refId=" + refId
				+ ", opUid=" + opUid + ", opIp=" + opIp + ", ctime=" + ctime + ", mtime=" + mtime + "]";
	}
    
    
}