package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AdminUser implements Serializable {
    private Integer id;

    @Length(max=16)
    @NotEmpty
    private String mobileNumber;

    @Length(max=64)
    @NotEmpty
    private String loginPword;

    @Length(max=128)
    @NotEmpty
    private String email;

    @Length(max=16)
    @NotEmpty
    private String nickname;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @NotEmpty
    private Date lastTime;

    @Length(max=16)
    @NotEmpty
    private String lastIp;

    @Length(max=8)
    @NotEmpty
    private String countryCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getLoginPword() {
        return loginPword;
    }

    public void setLoginPword(String loginPword) {
        this.loginPword = loginPword == null ? null : loginPword.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
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

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public static class Builder {
        private AdminUser obj;

        public Builder() {
            this.obj = new AdminUser();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            obj.mobileNumber = mobileNumber;
            return this;
        }

        public Builder loginPword(String loginPword) {
            obj.loginPword = loginPword;
            return this;
        }

        public Builder email(String email) {
            obj.email = email;
            return this;
        }

        public Builder nickname(String nickname) {
            obj.nickname = nickname;
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

        public Builder lastTime(Date lastTime) {
            obj.lastTime = lastTime;
            return this;
        }

        public Builder lastIp(String lastIp) {
            obj.lastIp = lastIp;
            return this;
        }

        public Builder countryCode(String countryCode) {
            obj.countryCode = countryCode;
            return this;
        }

        public AdminUser build() {
            return this.obj;
        }
    }
}