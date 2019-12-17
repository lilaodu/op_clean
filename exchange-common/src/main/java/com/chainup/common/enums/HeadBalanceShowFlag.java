package com.chainup.common.enums;

/**
 * 页面头部展示总资产标记
 * Created by zhongjingyun 
 */
public enum HeadBalanceShowFlag {
	SHOW("show","限价委托"),
	HIDE("hide","市价委托");

    public String value;
    public String description;

    HeadBalanceShowFlag(String value, String description) {
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
    
    public static HeadBalanceShowFlag fromValue(String value) {
        for (HeadBalanceShowFlag t : HeadBalanceShowFlag.values()) {
        	if (t.value.equalsIgnoreCase(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static HeadBalanceShowFlag fromName(String name) {
    	for (HeadBalanceShowFlag t : HeadBalanceShowFlag.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
