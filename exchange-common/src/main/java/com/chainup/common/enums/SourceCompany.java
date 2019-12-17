package com.chainup.common.enums;

public enum SourceCompany {
	HUOBI("01","huobi"),
	OKEX("02","okex"),
	BITTREX("03","bittrex");

    public String value;
    public String description;

    SourceCompany(String value, String description) {
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
    
    public static SourceCompany fromValue(int value) {
        for (SourceCompany t : SourceCompany.values()) {
        	if (t.value.equals(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static SourceCompany fromName(String name) {
    	for (SourceCompany t : SourceCompany.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
    
    public static SourceCompany fromNameContains(String fullName) {
    	for (SourceCompany t : SourceCompany.values()) {
    		if (fullName.toLowerCase().contains(t.getDescription())) {
    			return t;
    		}
    	}
    	return null;
    }
}
