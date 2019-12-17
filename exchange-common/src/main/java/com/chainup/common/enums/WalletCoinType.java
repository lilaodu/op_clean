package com.chainup.common.enums;

public enum WalletCoinType {

	One((byte)1,"获取充值地址币种web项目使用"),
	Two((byte)2,"归集统一"),
	Three((byte)3,"获取token"),
	Four((byte)4,"地址通用前缀"),
	Five((byte)5,"提币币种"),
	Six((byte)6,"充值币种"),
	Seven((byte)7,"归集币种"),
	Eight((byte)8,"充值统一地址")
	;
	
	public Byte value;
	public String description;
	
	
   

	private WalletCoinType(Byte value, String description) {
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

	public static WalletCoinType fromValue(int value) {
        for (WalletCoinType t : WalletCoinType.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static WalletCoinType fromName(String name) {
    	for (WalletCoinType t : WalletCoinType.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
	
	
}
