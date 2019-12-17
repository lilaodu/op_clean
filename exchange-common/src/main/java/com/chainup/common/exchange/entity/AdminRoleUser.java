package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminRoleUser implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer rlId;

    @NotEmpty
    private Integer adId;

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

    public Integer getRlId() {
        return rlId;
    }

    public void setRlId(Integer rlId) {
        this.rlId = rlId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
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
        private AdminRoleUser obj;

        public Builder() {
            this.obj = new AdminRoleUser();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder rlId(Integer rlId) {
            obj.rlId = rlId;
            return this;
        }

        public Builder adId(Integer adId) {
            obj.adId = adId;
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

        public AdminRoleUser build() {
            return this.obj;
        }
    }
}