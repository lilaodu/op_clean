package com.chainup.common.enums;

/**
 * UserExt的exchange_verify字段
 * Created by zhongjingyun on 2017/09/14.
 */
public enum UserExtExchangeVerify {
	NoNeed(1,"不验证"),
	TwoHourVerify(2,"两小时验证"),
	Need(3,"每次验证");

    public int value;
    public String description;



	private UserExtExchangeVerify(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static UserExtExchangeVerify fromValue(int value) {
        for (UserExtExchangeVerify t : UserExtExchangeVerify.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static UserExtExchangeVerify fromName(String name) {
    	for (UserExtExchangeVerify t : UserExtExchangeVerify.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
