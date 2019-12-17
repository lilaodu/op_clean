package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminAction implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer parentId;

    @Length(max=64)
    @NotEmpty
    private String atName;

    @Length(max=1024)
    @NotEmpty
    private String atDes;

    @Length(max=64)
    @NotEmpty
    private String atUrl;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    private Integer atType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAtName() {
        return atName;
    }

    public void setAtName(String atName) {
        this.atName = atName == null ? null : atName.trim();
    }

    public String getAtDes() {
        return atDes;
    }

    public void setAtDes(String atDes) {
        this.atDes = atDes == null ? null : atDes.trim();
    }

    public String getAtUrl() {
        return atUrl;
    }

    public void setAtUrl(String atUrl) {
        this.atUrl = atUrl == null ? null : atUrl.trim();
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

    public Integer getAtType() {
        return atType;
    }

    public void setAtType(Integer atType) {
        this.atType = atType;
    }

    public static class Builder {
        private AdminAction obj;

        public Builder() {
            this.obj = new AdminAction();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder parentId(Integer parentId) {
            obj.parentId = parentId;
            return this;
        }

        public Builder atName(String atName) {
            obj.atName = atName;
            return this;
        }

        public Builder atDes(String atDes) {
            obj.atDes = atDes;
            return this;
        }

        public Builder atUrl(String atUrl) {
            obj.atUrl = atUrl;
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

        public Builder atType(Integer atType) {
            obj.atType = atType;
            return this;
        }

        public AdminAction build() {
            return this.obj;
        }
    }
}