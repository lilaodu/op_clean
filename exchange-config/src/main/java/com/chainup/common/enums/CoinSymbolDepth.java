package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum CoinSymbolDepth {
	
	btcgdt	("btcgdt",2,1,0,0),
	ethgdt	("ethgdt",2,1,0,0),
	usdtgdt	("usdtgdt",8,6,4,0),
	eosgdt	("eosgdt",8,6,4,0),
	xrpgdt	("xrpgdt",8,6,4,0),
	adigdt	("adigdt",8,6,4,0),
	ltcgdt	("ltcgdt",8,6,4,0),
	gdtusdt ("gdtusdt",8,6,4,0),
	;
	private String name;
    private int depth0;
    private int depth1;
    private int depth2;
	private int fiat;


	CoinSymbolDepth(String name, int depth0, int depth1, int depth2, int fiat) {
    	this.name = name;
        this.depth0 = depth0;
        this.depth1 = depth1;
        this.depth2 = depth2;
        this.fiat = fiat;
    }

    public static CoinSymbolDepth getIns(String name) {
        try {
            return CoinSymbolDepth.valueOf(name);
        } catch (Exception ex) {
            return null;
        }
    }
    public static CoinSymbolDepth getInsByname(String name) {
        for (CoinSymbolDepth lma: CoinSymbolDepth.values()) {
            if (lma.getName().equals(name)) {
                return lma;
            }
        }
        return null;
    }
    /**
     * 获取所有的币对
     * @return
     * @author :韩中华
     * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
     * @date :2017年11月7日 下午5:35:14
    */
   public static List<String> getSymbolList(){
   	List<String> symbolList = new ArrayList<String>();
   	for (CoinSymbolDepth symbol : CoinSymbolDepth.values()) {
   		symbolList.add(symbol.name);
		}
   	return symbolList;
   }

	public int getDepth0() {
		return depth0;
	}

	public int getDepth1() {
		return depth1;
	}

	public int getDepth2() {
		return depth2;
	}

	public int getFiat() {
		return fiat;
	}

	public String getName() {
		return name;
	}
	
	public void setDepth0(int depth0) {
		this.depth0 = depth0;
	}
	
	public void setDepth1(int depth1) {
		this.depth1 = depth1;
	}
	
	public void setDepth2(int depth2) {
		this.depth2 = depth2;
	}

    public void setFiat(int fiat) {
		this.fiat = fiat;
	}
    
    public void setName(String name) {
		this.name = name;
	}

}
