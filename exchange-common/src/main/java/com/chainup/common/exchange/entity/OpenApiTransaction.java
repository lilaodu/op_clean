package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class OpenApiTransaction implements Serializable {
    private Integer id;

    @Length(max=64)
    @NotEmpty
    private String outTransId;

    @NotEmpty
    private Byte transType;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutTransId() {
        return outTransId;
    }

    public void setOutTransId(String outTransId) {
        this.outTransId = outTransId == null ? null : outTransId.trim();
    }

    public Byte getTransType() {
        return transType;
    }

    public void setTransType(Byte transType) {
        this.transType = transType;
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

    public static class Builder {
        private OpenApiTransaction obj;

        public Builder() {
            this.obj = new OpenApiTransaction();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder outTransId(String outTransId) {
            obj.outTransId = outTransId;
            return this;
        }

        public Builder transType(Byte transType) {
            obj.transType = transType;
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

        public OpenApiTransaction build() {
            return this.obj;
        }
    }
}