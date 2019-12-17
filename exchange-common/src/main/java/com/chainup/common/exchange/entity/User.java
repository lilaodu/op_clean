package com.chainup.common.exchange.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.chainup.common.util.StringUtil;

public class User implements Serializable {
    private Integer id;

    @Length(max=8)
    @NotEmpty
    private String countryCode;

    @Length(max=16)
    @NotEmpty
    private String mobileNumber;

    @Length(max=128)
    @NotEmpty
    private String email;

    @Length(max=64)
    @NotEmpty
    private String loginPword;

    @Length(max=64)
    @NotEmpty
    private String capitalPword;

    @NotEmpty
    private Byte authType;

    @NotEmpty
    private Byte authLevel;

    @Length(max=256)
    @NotEmpty
    private String nickname;

    @NotEmpty
    private Byte loginStatus;

    @NotEmpty
    private Date loginexpireTime;

    @NotEmpty
    private Byte excStatus;

    @NotEmpty
    private Date excexpireTime;

    @NotEmpty
    private Byte withdrawStatus;

    @NotEmpty
    private Date withdrawexpireTime;

    @NotEmpty
    private Date lockexpireTime;

    @NotEmpty
    private Date ctime;

    @NotEmpty
    private Date mtime;

    @NotEmpty
    private Date realnameTime;

    @NotEmpty
    private Date certificateTime;

    @NotEmpty
    private Date lastLoginTime;
    
    @NotEmpty
    private Byte googleAuthenticatorStatus;
    
    @NotEmpty
    private Byte mobileAuthenticatorStatus;

    @Length(max=32)
    @NotEmpty
    private String googleAuthenticatorKey;
    
    
    private Integer companyId;
    
    //bilian端注册类型，如果为0(newly)则表示比链新建的用户，如果为1（bind）则表示此前交易所已存在，结算时无需给比链手续费
    private Integer companyRegisterType;

    //用于前端显示
    private String hideMobileNumber;
    private String showNickName;//前端显示的昵称
    
    private Byte loginVerify;

    private Byte settingVerify;

    private Byte withdrawVerify;

    private Byte exchangeVerify;

    private Integer lasttimeExchangeVerify;
    private Byte authStatus;//实名认证状态0、未审核，1、通过，2、未通过

    private Integer register;//注册人数
    private Integer bindTel;//绑定手机人数
    private Integer bindEmail;//绑定邮箱人数
    private Integer capital;//设置资金密码人数
    private Integer deposit;//完成充值人数
    private String realName;//真实姓名
    private String familyName;
    private String name;
    private Date authRealnamemtime;//实名认证更新时间
    private String otcNickName ;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
    	if(countryCode==null || countryCode.isEmpty()) {
    		return countryCode;
    	}
    	
    	if(!countryCode.startsWith("+")) {
    		return "+"+ countryCode.trim();
    	}
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginPword() {
        return loginPword;
    }

    public void setLoginPword(String loginPword) {
        this.loginPword = loginPword == null ? null : loginPword.trim();
    }

    public String getCapitalPword() {
        return capitalPword;
    }

    public void setCapitalPword(String capitalPword) {
        this.capitalPword = capitalPword == null ? null : capitalPword.trim();
    }

    public Byte getAuthType() {
        return authType;
    }

    public void setAuthType(Byte authType) {
        this.authType = authType;
    }

    public Byte getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(Byte authLevel) {
        this.authLevel = authLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getLoginexpireTime() {
        return loginexpireTime;
    }

    public void setLoginexpireTime(Date loginexpireTime) {
        this.loginexpireTime = loginexpireTime;
    }

    public Byte getExcStatus() {
        return excStatus;
    }

    public void setExcStatus(Byte excStatus) {
        this.excStatus = excStatus;
    }

    public Date getExcexpireTime() {
        return excexpireTime;
    }

    public void setExcexpireTime(Date excexpireTime) {
        this.excexpireTime = excexpireTime;
    }

    public Byte getWithdrawStatus() {
        return withdrawStatus;
    }

    public void setWithdrawStatus(Byte withdrawStatus) {
        this.withdrawStatus = withdrawStatus;
    }

    public Date getWithdrawexpireTime() {
        return withdrawexpireTime;
    }

    public void setWithdrawexpireTime(Date withdrawexpireTime) {
        this.withdrawexpireTime = withdrawexpireTime;
    }

    public Date getLockexpireTime() {
        return lockexpireTime;
    }

    public void setLockexpireTime(Date lockexpireTime) {
        this.lockexpireTime = lockexpireTime;
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

    public Date getRealnameTime() {
        return realnameTime;
    }

    public void setRealnameTime(Date realnameTime) {
        this.realnameTime = realnameTime;
    }

    public Date getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Date certificateTime) {
        this.certificateTime = certificateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getHideMobileNumber() {
        return hideMobileNumber;
    }

    public void setHideMobileNumber(String hideMobileNumber) {
        this.hideMobileNumber = hideMobileNumber;
    }
    
    public Byte getMobileAuthenticatorStatus() {
        return mobileAuthenticatorStatus;
    }

    public void setMobileAuthenticatorStatus(Byte mobileAuthenticatorStatus) {
        this.mobileAuthenticatorStatus = mobileAuthenticatorStatus;
    }
    
    public Byte getGoogleAuthenticatorStatus() {
        return googleAuthenticatorStatus;
    }

    public void setGoogleAuthenticatorStatus(Byte googleAuthenticatorStatus) {
        this.googleAuthenticatorStatus = googleAuthenticatorStatus;
    }

    public String getGoogleAuthenticatorKey() {
        return googleAuthenticatorKey;
    }

    public void setGoogleAuthenticatorKey(String googleAuthenticatorKey) {
        this.googleAuthenticatorKey = googleAuthenticatorKey == null ? null : googleAuthenticatorKey.trim();
    }

    public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getCompanyRegisterType() {
		return companyRegisterType;
	}

	public void setCompanyRegisterType(Integer companyRegisterType) {
		this.companyRegisterType = companyRegisterType;
	}

	public String getShowNickName() {
    	if(this.nickname == null || this.nickname.isEmpty()) {//昵称不存在
    		if(this.mobileNumber==null || this.mobileNumber.isEmpty()) {//手机不存在取邮箱
    			if(StringUtils.isNotBlank(this.email)){
    				String mail[] = this.email.split("@");
        			if(mail[0].length() > 12) {
        				this.showNickName = StringUtil.hideMobileNumber(mail[0]);
        			}
        			else {
        				this.showNickName = mail[0];
        			}
    			}
    			
    		}
    		else {//手机存在取手机号
    			this.showNickName = StringUtil.hideMobileNumber(this.mobileNumber);
    		}
    	}
    	else {
    		String buf="";
    		int len = 0;
    		for(int i=0;i<this.nickname.length();i++) {
    			String iString = this.nickname.substring(i, i+1);
    			if(iString.getBytes().length >= 2) {
    				len=len+2;
    			}
    			else {
    				len++;
    			}
    			
    			if(len > 24) {
    				break;
    			}
    			buf = buf+iString;
    		}
    		this.showNickName = buf;
    	}
		return this.showNickName;
	}

	public void setShowNickName(String showNickName) {
		this.showNickName = showNickName;
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

	public Byte getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(Byte authStatus) {
		this.authStatus = authStatus;
	}

	public Integer getRegister() {
		return register;
	}

	public void setRegister(Integer register) {
		this.register = register;
	}

	public Integer getBindTel() {
		return bindTel;
	}

	public void setBindTel(Integer bindTel) {
		this.bindTel = bindTel;
	}

	public Integer getBindEmail() {
		return bindEmail;
	}

	public void setBindEmail(Integer bindEmail) {
		this.bindEmail = bindEmail;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAuthRealnamemtime() {
		return authRealnamemtime;
	}

	public void setAuthRealnamemtime(Date authRealnamemtime) {
		this.authRealnamemtime = authRealnamemtime;
	}

	public String getOtcNickName() {
		return otcNickName;
	}

	public void setOtcNickName(String otcNickName) {
		this.otcNickName = otcNickName;
	}

	public static class Builder {
        private User obj;

        public Builder() {
            this.obj = new User();
        }

        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        public Builder countryCode(String countryCode) {
            obj.countryCode = countryCode;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            obj.mobileNumber = mobileNumber;
            return this;
        }

        public Builder email(String email) {
            obj.email = email;
            return this;
        }

        public Builder loginPword(String loginPword) {
            obj.loginPword = loginPword;
            return this;
        }

        public Builder capitalPword(String capitalPword) {
            obj.capitalPword = capitalPword;
            return this;
        }

        public Builder authType(Byte authType) {
            obj.authType = authType;
            return this;
        }

        public Builder authLevel(Byte authLevel) {
            obj.authLevel = authLevel;
            return this;
        }

        public Builder nickname(String nickname) {
            obj.nickname = nickname;
            return this;
        }

        public Builder loginStatus(Byte loginStatus) {
            obj.loginStatus = loginStatus;
            return this;
        }

        public Builder loginexpireTime(Date loginexpireTime) {
            obj.loginexpireTime = loginexpireTime;
            return this;
        }

        public Builder excStatus(Byte excStatus) {
            obj.excStatus = excStatus;
            return this;
        }

        public Builder excexpireTime(Date excexpireTime) {
            obj.excexpireTime = excexpireTime;
            return this;
        }

        public Builder withdrawStatus(Byte withdrawStatus) {
            obj.withdrawStatus = withdrawStatus;
            return this;
        }

        public Builder withdrawexpireTime(Date withdrawexpireTime) {
            obj.withdrawexpireTime = withdrawexpireTime;
            return this;
        }

        public Builder lockexpireTime(Date lockexpireTime) {
            obj.lockexpireTime = lockexpireTime;
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

        public Builder realnameTime(Date realnameTime) {
            obj.realnameTime = realnameTime;
            return this;
        }

        public Builder certificateTime(Date certificateTime) {
            obj.certificateTime = certificateTime;
            return this;
        }

        public Builder lastLoginTime(Date lastLoginTime) {
            obj.lastLoginTime = lastLoginTime;
            return this;
        }
        
	   	public Builder googleAuthenticatorStatus(Byte googleAuthenticatorStatus) {
	        obj.googleAuthenticatorStatus = googleAuthenticatorStatus;
	        return this;
	    }
	   	
	   	public Builder mobileAuthenticatorStatus(Byte mobileAuthenticatorStatus) {
	        obj.mobileAuthenticatorStatus = mobileAuthenticatorStatus;
	        return this;
	    }
	
	    public Builder googleAuthenticatorKey(String googleAuthenticatorKey) {
	        obj.googleAuthenticatorKey = googleAuthenticatorKey;
	        return this;
	    }

        public User build() {
            return this.obj;
        }
    }
}