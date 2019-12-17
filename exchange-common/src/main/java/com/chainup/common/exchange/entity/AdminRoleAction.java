package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminRoleAction implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer rlId;

    @NotEmpty
    private Integer atId;

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

    public Integer getAtId() {
        return atId;
    }

    public void setAtId(Integer atId) {
        this.atId = atId;
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
        private AdminRoleAction obj;

        public Builder() {
            this.obj = new AdminRoleAction();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder rlId(Integer rlId) {
            obj.rlId = rlId;
            return this;
        }

        public Builder atId(Integer atId) {
            obj.atId = atId;
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

        public AdminRoleAction build() {
            return this.obj;
        }
    }
}