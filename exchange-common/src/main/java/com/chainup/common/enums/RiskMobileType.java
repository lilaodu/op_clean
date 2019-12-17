package com.chainup.common.enums;

public enum RiskMobileType {
	AVG("avg","与平台平均价格偏离"),
	LAST("last","与上一笔交易价格偏离 "),
	FLUCT("fluct","半小时内价格波动"),
	OCCUPY("occupy","用户交易量占比");

    public String value;
    public String description;

    RiskMobileType(String value, String description) {
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
    
    public static RiskMobileType fromValue(int value) {
        for (RiskMobileType t : RiskMobileType.values()) {
        	if (t.value.equals(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static RiskMobileType fromName(String name) {
    	for (RiskMobileType t : RiskMobileType.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
    
    public static RiskMobileType fromNameContains(String fullName) {
    	for (RiskMobileType t : RiskMobileType.values()) {
    		if (fullName.toLowerCase().contains(t.getDescription())) {
    			return t;
    		}
    	}
    	return null;
    }
}
