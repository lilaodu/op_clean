package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class OpenApiToken implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @Length(max=64)
    @NotEmpty
    private String token;

    @Length(max=64)
    @NotEmpty
    private String secretKey;

    @NotEmpty
    private Byte isSuperUser;

    @Length(max=255)
    @NotEmpty
    private String believeIps;

    @Length(max=255)
    @NotEmpty
    private String authority;

    @Length(max=255)
    @NotEmpty
    private String label;

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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public Byte getIsSuperUser() {
        return isSuperUser;
    }

    public void setIsSuperUser(Byte isSuperUser) {
        this.isSuperUser = isSuperUser;
    }

    public String getBelieveIps() {
        return believeIps;
    }

    public void setBelieveIps(String believeIps) {
        this.believeIps = believeIps == null ? null : believeIps.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
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
        private OpenApiToken obj;

        public Builder() {
            this.obj = new OpenApiToken();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder token(String token) {
            obj.token = token;
            return this;
        }

        public Builder secretKey(String secretKey) {
            obj.secretKey = secretKey;
            return this;
        }

        public Builder isSuperUser(Byte isSuperUser) {
            obj.isSuperUser = isSuperUser;
            return this;
        }

        public Builder believeIps(String believeIps) {
            obj.believeIps = believeIps;
            return this;
        }

        public Builder authority(String authority) {
            obj.authority = authority;
            return this;
        }

        public Builder label(String label) {
            obj.label = label;
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

        public OpenApiToken build() {
            return this.obj;
        }
    }
}