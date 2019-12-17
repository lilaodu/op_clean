package com.chainup.common.enums;

/**
 * account表6位type，第一位A位置枚举，1公司，2个人
 * Created by zhongjingyun on 2017/10/07.
 */
public enum AccountType_A {
	COMPANY("1","公司账户"),
	PERSON("2","个人账户");

    public String value;
    public String description;

    AccountType_A(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static AccountType_A fromValue(int value) {
        for (AccountType_A t : AccountType_A.values()) {
        	if (t.value.equals(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static AccountType_A fromName(String name) {
    	for (AccountType_A t : AccountType_A.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
