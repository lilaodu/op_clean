package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserExt implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Byte loginVerify;

    @NotEmpty
    private Byte settingVerify;

    @NotEmpty
    private Byte withdrawVerify;

    @NotEmpty
    private Byte exchangeVerify;

    @NotEmpty
    private Integer lasttimeExchangeVerify;

    @Length(max = 100)
    @NotEmpty
    private String symbols;

    @Length(max = 20)
    @NotEmpty
    private String inviteCode;

    @Length(max = 20)
    @NotEmpty
    private String invitedCode;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @NotEmpty
    private Byte useFeeCoinOpen;

    @NotEmpty
    private BigDecimal feeCoinRate;

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

    public Byte getLoginVerify() {
        return loginVerify;
    }

    public void setLoginVerify(Byte loginVerify) {
        this.loginVerify = loginVerify;
    }

    public Byte getSettingVerify() {
        return settingVerify;
    }

    public void setSettingVerify(Byte settingVerify) {
        this.settingVerify = settingVerify;
    }

    public Byte getWithdrawVerify() {
        return withdrawVerify;
    }

    public void setWithdrawVerify(Byte withdrawVerify) {
        this.withdrawVerify = withdrawVerify;
    }

    public Byte getExchangeVerify() {
        return exchangeVerify;
    }

    public void setExchangeVerify(Byte exchangeVerify) {
        this.exchangeVerify = exchangeVerify;
    }

    public Integer getLasttimeExchangeVerify() {
        return lasttimeExchangeVerify;
    }

    public void setLasttimeExchangeVerify(Integer lasttimeExchangeVerify) {
        this.lasttimeExchangeVerify = lasttimeExchangeVerify;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols == null ? null : symbols.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getInvitedCode() {
        return invitedCode;
    }

    public void setInvitedCode(String invitedCode) {
        this.invitedCode = invitedCode == null ? null : invitedCode.trim();
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

    public Byte getUseFeeCoinOpen() {
        return useFeeCoinOpen;
    }

    public void setUseFeeCoinOpen(Byte useFeeCoinOpen) {
        this.useFeeCoinOpen = useFeeCoinOpen;
    }

    public BigDecimal getFeeCoinRate() {
        return feeCoinRate;
    }

    public void setFeeCoinRate(BigDecimal feeCoinRate) {
        this.feeCoinRate = feeCoinRate;
    }

    public static class Builder {
        private UserExt obj;

        public Builder() {
            this.obj = new UserExt();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder loginVerify(Byte loginVerify) {
            obj.loginVerify = loginVerify;
            return this;
        }

        public Builder settingVerify(Byte settingVerify) {
            obj.settingVerify = settingVerify;
            return this;
        }

        public Builder withdrawVerify(Byte withdrawVerify) {
            obj.withdrawVerify = withdrawVerify;
            return this;
        }

        public Builder exchangeVerify(Byte exchangeVerify) {
            obj.exchangeVerify = exchangeVerify;
            return this;
        }

        public Builder lasttimeExchangeVerify(Integer lasttimeExchangeVerify) {
            obj.lasttimeExchangeVerify = lasttimeExchangeVerify;
            return this;
        }

        public Builder symbols(String symbols) {
            obj.symbols = symbols;
            return this;
        }

        public Builder inviteCode(String inviteCode) {
            obj.inviteCode = inviteCode;
            return this;
        }

        public Builder invitedCode(String invitedCode) {
            obj.invitedCode = invitedCode;
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

        public Builder useFeeCoinOpen(Byte useFeeCoinOpen) {
            obj.useFeeCoinOpen = useFeeCoinOpen;
            return this;
        }

        public Builder feeCoinRate(BigDecimal feeCoinRate) {
            obj.feeCoinRate = feeCoinRate;
            return this;
        }

        public UserExt build() {
            return this.obj;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserExt userExt = (UserExt) o;
        return Objects.equals(id, userExt.id) &&
                Objects.equals(uid, userExt.uid) &&
                Objects.equals(loginVerify, userExt.loginVerify) &&
                Objects.equals(settingVerify, userExt.settingVerify) &&
                Objects.equals(withdrawVerify, userExt.withdrawVerify) &&
                Objects.equals(exchangeVerify, userExt.exchangeVerify) &&
                Objects.equals(lasttimeExchangeVerify, userExt.lasttimeExchangeVerify) &&
                Objects.equals(symbols, userExt.symbols) &&
                Objects.equals(inviteCode, userExt.inviteCode) &&
                Objects.equals(invitedCode, userExt.invitedCode) &&
                Objects.equals(ctime, userExt.ctime) &&
                Objects.equals(mtime, userExt.mtime) &&
                Objects.equals(useFeeCoinOpen, userExt.useFeeCoinOpen) &&
                Objects.equals(feeCoinRate, userExt.feeCoinRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, loginVerify, settingVerify, withdrawVerify, exchangeVerify, lasttimeExchangeVerify,
                symbols, inviteCode, invitedCode, ctime, mtime, useFeeCoinOpen, feeCoinRate);
    }
}