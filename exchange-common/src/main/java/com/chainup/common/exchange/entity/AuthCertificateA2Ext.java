package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

public class AuthCertificateA2Ext implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Integer aid;

    @NotEmpty
    private Date ctime;

    private byte[] extPhoto;
    private String extPh;

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

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public byte[] getExtPhoto() {
        return extPhoto;
    }

    public void setExtPhoto(byte[] extPhoto) {
        this.extPhoto = extPhoto;
    }

    public String getExtPh() {
        return extPh;
    }

    public void setExtPh(String extPh) {
        this.extPh = extPh;
    }

    public static class Builder {
        private AuthCertificateA2Ext obj;

        public Builder() {
            this.obj = new AuthCertificateA2Ext();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder aid(Integer aid) {
            obj.aid = aid;
            return this;
        }

        public Builder ctime(Date ctime) {
            obj.ctime = ctime;
            return this;
        }

        public Builder extPhoto(byte[] extPhoto) {
            obj.extPhoto = extPhoto;
            return this;
        }

        public AuthCertificateA2Ext build() {
            return this.obj;
        }
    }
}