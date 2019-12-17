package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;




public class AuthRealname implements Serializable {
    private Integer id;

    @NotEmpty
    private Integer uid;

    @NotEmpty
    private Byte authStatus;

    @Length(max=8)
    @NotEmpty
    private String countryCode;
    private String cnName;
    @NotEmpty
    private Byte certificateType;

    @Length(max=64)
    @NotEmpty
    private String certificateNumber;

    @Length(max=128)
    @NotEmpty
    private String familyName;

    @Length(max=128)
    @NotEmpty
    private String name;
    
    private String realName;

    private Date birthday;

    private Date beginDate;

    private Date endDate;

    @NotEmpty
    private Date ctime;

    private Date mtime;

    @Length(max=255)
    private String reason;

    private static final long serialVersionUID = 1L;

    
    public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	

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

    public Byte getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Byte authStatus) {
        this.authStatus = authStatus;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public Byte getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Byte certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    

    public static class Builder {
        private AuthRealname obj;

        public Builder() {
            this.obj = new AuthRealname();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder uid(Integer uid) {
            obj.uid = uid;
            return this;
        }

        public Builder authStatus(Byte authStatus) {
            obj.authStatus = authStatus;
            return this;
        }

        public Builder countryCode(String countryCode) {
            obj.countryCode = countryCode;
            return this;
        }

        public Builder certificateType(Byte certificateType) {
            obj.certificateType = certificateType;
            return this;
        }

        public Builder certificateNumber(String certificateNumber) {
            obj.certificateNumber = certificateNumber;
            return this;
        }

        public Builder familyName(String familyName) {
            obj.familyName = familyName;
            return this;
        }

        public Builder name(String name) {
            obj.name = name;
            return this;
        }

        public Builder birthday(Date birthday) {
            obj.birthday = birthday;
            return this;
        }

        public Builder beginDate(Date beginDate) {
            obj.beginDate = beginDate;
            return this;
        }

        public Builder endDate(Date endDate) {
            obj.endDate = endDate;
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

        public Builder reason(String reason) {
            obj.reason = reason;
            return this;
        }

        public AuthRealname build() {
            return this.obj;
        }
    }
}