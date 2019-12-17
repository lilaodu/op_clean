package com.chainup.common.enums;

public enum WalletCoinStatus {

	Close((byte)0,"关闭"),
	Open((byte)1,"开启");

    public Byte value;
    public String description;

    WalletCoinStatus(Byte value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static WalletCoinStatus fromValue(int value) {
        for (WalletCoinStatus t : WalletCoinStatus.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static WalletCoinStatus fromName(String name) {
    	for (WalletCoinStatus t : WalletCoinStatus.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
	
}
