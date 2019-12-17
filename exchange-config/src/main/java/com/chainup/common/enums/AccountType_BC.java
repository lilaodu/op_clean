package com.chainup.common.enums;

/**
 * account表6位type，BC位置枚举，代表账户类型，01余额账户、02冻结账户
 * Created by zhongjingyun on 2017/09/25.
 */
public enum AccountType_BC {
	NORMAL("01","余额账户"),
	LOCK("02","冻结账户"),
	WITHDRAW("03","提现中"),
	MARGIN("04","保证金账户"),
	REALIZED_PL("05","已实现盈亏账户"),
	PRESENT_COIN("06", "赠币账户"),
    OTC_NORMAL("17", "场外余额账户"),
    OTC_LOCK("18", "场外冻结账户");
	

    public String value;
    public String description;

    AccountType_BC(String value, String description) {
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
    
    public static AccountType_BC fromValue(int value) {
        for (AccountType_BC t : AccountType_BC.values()) {
        	if (t.value.equals(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static AccountType_BC fromName(String name) {
    	for (AccountType_BC t : AccountType_BC.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
