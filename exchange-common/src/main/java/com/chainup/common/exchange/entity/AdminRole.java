package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminRole implements Serializable {
    private Integer id;

    @Length(max=64)
    @NotEmpty
    private String rlName;

    @Length(max=1024)
    @NotEmpty
    private String rlDes;

    @NotEmpty
    private Boolean rlType;

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

    public String getRlName() {
        return rlName;
    }

    public void setRlName(String rlName) {
        this.rlName = rlName == null ? null : rlName.trim();
    }

    public String getRlDes() {
        return rlDes;
    }

    public void setRlDes(String rlDes) {
        this.rlDes = rlDes == null ? null : rlDes.trim();
    }

    public Boolean getRlType() {
        return rlType;
    }

    public void setRlType(Boolean rlType) {
        this.rlType = rlType;
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
        private AdminRole obj;

        public Builder() {
            this.obj = new AdminRole();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder rlName(String rlName) {
            obj.rlName = rlName;
            return this;
        }

        public Builder rlDes(String rlDes) {
            obj.rlDes = rlDes;
            return this;
        }

        public Builder rlType(Boolean rlType) {
            obj.rlType = rlType;
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

        public AdminRole build() {
            return this.obj;
        }
    }
}