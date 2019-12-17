package com.chainup.common.enums;

/**
 * 订单exc_status交易冻结状态
 * Created by zhongjingyun on 2017/09/14.
 */
public enum UserExcStatus {
	LOCK(0,"冻结"),
	NORMAL(1,"正常");

    public int value;
    public String description;

    UserExcStatus(int value, String description) {
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
    
    public static UserExcStatus fromValue(int value) {
        for (UserExcStatus t : UserExcStatus.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static UserExcStatus fromName(String name) {
    	for (UserExcStatus t : UserExcStatus.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
