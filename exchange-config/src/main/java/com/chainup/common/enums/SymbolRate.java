package com.chainup.common.enums;

public enum SymbolRate {
	USDCNY("usdcny","USD","CNY");
	
    public String value;
    public String baseSymbol;//基础币种
    public String quoteSymbol;//折算币种
	private SymbolRate(String value, String baseSymbol, String quoteSymbol) {
		this.value = value;
		this.baseSymbol = baseSymbol;
		this.quoteSymbol = quoteSymbol;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getBaseSymbol() {
		return baseSymbol;
	}
	public void setBaseSymbol(String baseSymbol) {
		this.baseSymbol = baseSymbol;
	}
	public String getQuoteSymbol() {
		return quoteSymbol;
	}
	public void setQuoteSymbol(String quoteSymbol) {
		this.quoteSymbol = quoteSymbol;
	}
	public static SymbolRate fromValue(String value) {
        for (SymbolRate t : SymbolRate.values()) {
        	if (t.value.equalsIgnoreCase(value)) {
        		return t;
        	}
        }
        return null;
    }
    
}
