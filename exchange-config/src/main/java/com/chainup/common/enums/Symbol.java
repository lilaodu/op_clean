package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 交易对  ex_order_xxxxxx，ex_trade_xxxxxx 订单表
 */
public enum Symbol {

	/*GDT虚币交易区 */
	BTCGDT("btcgdt","btc","gdt",1,"btcgdt","15443.03797468",0),   
	ETHGDT("ethgdt","eth","gdt",1,"ethgdt","517.08860759",0),
	USDTGDT("usdtgdt","usdt","gdt",1,"usdtgdt","4.30379746",1),
	EOSGDT("eosgdt","eos","gdt",1,"eosgdt","10.46835443",0),
	XRPGDT("xrpgdt","xrp","gdt",1,"xrpgdt","1.37974683",0),  
	LTCGDT("ltcgdt","ltc","gdt",1,"ltcgdt","132.44303797",0),
	/*GDT实币交易区 */
	ADIGDT("adigdt","adi","gdt",1,"adigdt","0.0333",1),   // gdt 1.58cny   adi 0.05cny
	;

    public String value;
    public String baseCoin;//基准货币
    public String countCoin;//计价货币
    public int status;//1启用 2停用
    public String description;
    public String defaultRate;//默认汇率
	public int flag; //GDT实币用 1
    private Symbol(String value, String baseCoin, String countCoin, 
    		int status, String description, String defaultRate,int flag) {
		this.value = value;
		this.baseCoin = baseCoin;
		this.countCoin = countCoin;
		this.status = status;
		this.description = description;
		this.defaultRate = defaultRate;
		this.flag = flag;
	}


	public int getFlag() {
		return flag;
	}


	public void setFlag(int flag) {
		this.flag = flag;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getBaseCoin() {
		return baseCoin;
	}


	public void setBaseCoin(String baseCoin) {
		this.baseCoin = baseCoin;
	}


	public String getCountCoin() {
		return countCoin;
	}


	public void setCountCoin(String countCoin) {
		this.countCoin = countCoin;
	}


	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getDefaultRate() {
		return defaultRate;
	}


	public void setDefaultRate(String defaultRate) {
		this.defaultRate = defaultRate;
	}


	public static Symbol fromValue(String value) {
        for (Symbol t : Symbol.values()) {
        	if (t.value.equalsIgnoreCase(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static Symbol fromName(String name) {
    	for (Symbol t : Symbol.values()) {
    		if (t.name().equalsIgnoreCase(name)) {
    			return t;
    		}
    	}
    	return null;
    }
    
    public static List<String> getStartSymbol(){
    	ArrayList<String> symbolList = new ArrayList<String>();
    	for (Symbol symbol : Symbol.values()) {
    		if (symbol.status==1) {
    			symbolList.add(symbol.value.toUpperCase());
			}
		}
    	return symbolList;
    }
    
    public static List<Symbol> getStartSymbolEnum(){
    	ArrayList<Symbol> symbolList = new ArrayList<Symbol>();
    	for (Symbol symbol : Symbol.values()) {
    		if (symbol.status==1) {
    			symbolList.add(symbol);
    		}
    	}
    	return symbolList;
    }
    
    public static Symbol fromNameContains(String fullName) {
    	for (Symbol t : Symbol.values()) {
    		if (fullName.toLowerCase().contains(t.getValue())) {
    			return t;
    		}
    	}
    	return null;
    }
    
    public static Symbol getInsByname(String value) {
        for (Symbol lma: Symbol.values()) {
            if (lma.getValue().equals(value)) {
                return lma;
            }
        }
        return null;
    }
    
}
