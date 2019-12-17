package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ExBasicConfig implements Serializable {
    private Long id;

    @Length(max=255)
    @NotEmpty
    private String key;

    @Length(max=255)
    @NotEmpty
    private String val;

    @Length(max=255)
    @NotEmpty
    private String title;

    @Length(max=255)
    @NotEmpty
    private String meta;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @Length(max=4)
    @NotEmpty
    private String status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta == null ? null : meta.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public static class Builder {
        private ExBasicConfig obj;

        public Builder() {
            this.obj = new ExBasicConfig();
        }

        public Builder id(Long id) {
            obj.id = id;
            return this;
        }

        public Builder key(String key) {
            obj.key = key;
            return this;
        }

        public Builder val(String val) {
            obj.val = val;
            return this;
        }

        public Builder title(String title) {
            obj.title = title;
            return this;
        }

        public Builder meta(String meta) {
            obj.meta = meta;
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

        public Builder status(String status) {
            obj.status = status;
            return this;
        }

        public ExBasicConfig build() {
            return this.obj;
        }
    }
}