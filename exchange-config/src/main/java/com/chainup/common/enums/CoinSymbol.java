package com.chainup.common.enums;

import java.util.ArrayList;  
import java.util.List;

/**
 * transaction_deposits_crypto、transaction_withdraw_crypto、transaction_withdraw、transaction_deposits表
 * symbol币种符号（包括人虚拟币和法币）
 */
public enum CoinSymbol {
	CNY("cny",	1,1,0,"人民币","","",0,"cny"),
	USD("usd",	1,0,0,"美元","","",0,"usd"),
	EUR("eur",	1,0,0,"欧元","","",0,"eur"),
	KRW("krw",	1,0,0,"韩元","KRW","/res/img/coin/krw.png",0,"krw"),
	GDT("gdt",	0,1,1,"金宝通","GDT","/res/img/coin/gdt.png",0,"eth"),
	BTC("btc",	0,0,1,"比特币","BTC","/res/img/coin/btc.png",0,"btc"),
	USDT("usdt",0,0,1,"美元代币","USDT","/res/img/coin/usdt.png",0,"usdt"),
	ETH("eth",	0,0,1,"以太坊","ETH","/res/img/coin/eth.png",0,"eth"),
	EOS("eos",	0,0,1,"EOS","EOS","/res/img/coin/eos.png",0,"eos"),
	XRP("xrp",	0,0,1,"瑞波币","XRP","/res/img/coin/xrp.png",0,"xrp"),
	ADI("adi",	0,0,1,"亚迪尔","ADI","/res/img/coin/adi.png",1,"eth"),
	LTC("ltc",	0,0,1,"莱特币","LTC","/res/img/coin/ltc.png",0,"ltc"),
	;


    public String value;
    public int isCurency;//是否为法币  1是法币   0虚拟币
    public int isCount;//是否为计价货币，1是计价货币   0不是计价货币，计价货币出现在交易对的后三位
    public int status;//1启用 0停用
    public String description;//描述
    public String showName;//前台展示名称
    public String img;//logo
    public int isAllRate;//是否需要计算与其他所有币种的汇率
    public String assetCoin;//币种资产币种，那种类型资产用那种资产充值


    
	
	private CoinSymbol(String value, int isCurency, int isCount, int status, String description, String showName,
			String img, int isAllRate, String assetCoin) {
		this.value = value;
		this.isCurency = isCurency;
		this.isCount = isCount;
		this.status = status;
		this.description = description;
		this.showName = showName;
		this.img = img;
		this.isAllRate = isAllRate;
		this.assetCoin = assetCoin;
	}

	public String getAssetCoin() {
		return assetCoin;
	}

	public void setAssetCoin(String assetCoin) {
		this.assetCoin = assetCoin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getIsCurency() {
		return isCurency;
	}
	public void setIsCurency(int isCurency) {
		this.isCurency = isCurency;
	}
	public int getIsCount() {
		return isCount;
	}
	public void setIsCount(int isCount) {
		this.isCount = isCount;
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
    
    public int getIsAllRate() {
		return isAllRate;
	}

	public void setIsAllRate(int isAllRate) {
		this.isAllRate = isAllRate;
	}

	public static CoinSymbol fromValue(String value) {
        for (CoinSymbol t : CoinSymbol.values()) {
        	if (t.value.equalsIgnoreCase(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static CoinSymbol fromName(String name) {
		if (name == null) {
			return null;
		}
    	for (CoinSymbol t : CoinSymbol.values()) {
    		if (t.name().equalsIgnoreCase(name)) {
    			return t;
    		}
    	}
    	return null;
    }
    
    public static List<String> getStartCoinString(){
    	ArrayList<String> coinList = new ArrayList<String>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
			if (coinSymbol.status==1) {
				coinList.add(coinSymbol.value.toUpperCase());
			}
		}
    	return coinList;
    }
    
    public static List<CoinSymbol> getStartCoinSymbol(){
    	ArrayList<CoinSymbol> coinList = new ArrayList<CoinSymbol>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.status==1) {
    			coinList.add(coinSymbol);
    		}
    	}
    	return coinList;
    }
    /**
     * 获取已启用计价货币
     * @return
     */
    public static List<CoinSymbol> getCountCoinSymbol(){
    	ArrayList<CoinSymbol> coinList = new ArrayList<CoinSymbol>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.isCount==1 && coinSymbol.status==1) {
    			coinList.add(coinSymbol);
    		}
    	}
    	return coinList;
    }
    /**
     * 获取已启用的虚拟货币
     */
    public static List<CoinSymbol> getCryptoCoinSymbol(){
    	ArrayList<CoinSymbol> coinList = new ArrayList<CoinSymbol>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.isCurency==0 && coinSymbol.status==1) {
    			coinList.add(coinSymbol);
    		}
    	}
    	return coinList;
    }
    /**
     * 获取已启用的法币
     */
    public static List<CoinSymbol> getCurrencyCoinSymbol(){
    	ArrayList<CoinSymbol> coinList = new ArrayList<CoinSymbol>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.isCurency==1 && coinSymbol.status==1) {
    			coinList.add(coinSymbol);
    		}
    	}
    	return coinList;
    }
    
    /**
     * 获取法币字符串形式
     * t.substring(0, t.length()-1).toString();
     */
    public static String getCurrencyCoinStr(){
    	StringBuffer t = new StringBuffer("");
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.isCurency==1 && coinSymbol.status==1) {
    			t.append(coinSymbol.value).append(",");
    		}
    	}
    	if (t.length()>0) {
    		return t.substring(0, t.length()-1).toString();
		}else {
			return "";
		}
    }
    
    /**
     * 获取数字货币字符串形式
     */
    public static String getCryptoCoinStr(){
    	StringBuffer t = new StringBuffer("");
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.isCurency==0 && coinSymbol.status==1) {
    			t.append(coinSymbol.value).append(",");
    		}
    	}
    	if (t.length()>0) {
    		return t.substring(0, t.length()-1).toString();
		}else {
			return "";
		}
    }
    

	/**
	 * 获取法币
	 */
	public static List<String> getCurrencyCoinSymbolString(){
		ArrayList<String> coinList = new ArrayList<String>();
		for (CoinSymbol coinSymbol : CoinSymbol.values()) {
			if (coinSymbol.isCurency==1) {
				coinList.add(coinSymbol.name());
			}
		}
		return coinList;
	}
	
	
     /**
      *  获取需要计算与其他所有币种汇率的币种	
       * @return
       * @author :韩中华
       * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
       * @date :2017年11月14日 上午11:07:14
      */
	 public static List<CoinSymbol> getIsAllRateSymbol(){
    	ArrayList<CoinSymbol> coinList = new ArrayList<CoinSymbol>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (coinSymbol.isAllRate == 1 && coinSymbol.status == 1) {
    			coinList.add(coinSymbol);
    		}
    	}
    	return coinList;
	 }
	 
	 /**
	   * 获取除value外的所有币种
	   * @param value
	   * @return
	   * @author :韩中华
	   * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	   * @date :2017年11月14日 上午11:07:52
	  */
	 public static List<CoinSymbol> getSymbolExpectValue(String value){
    	ArrayList<CoinSymbol> coinList = new ArrayList<CoinSymbol>();
    	for (CoinSymbol coinSymbol : CoinSymbol.values()) {
    		if (!value.equals(coinSymbol.value) && coinSymbol.isCurency == 0 && coinSymbol.status == 1) {
    			coinList.add(coinSymbol);
    		}
    	}
    	return coinList;
     }
	/**
	 * 获取已启用的虚拟货币
	 * @return String
	 */
	public static List<String> getCryptoCoinSymbolString(){
		ArrayList<String> coinList = new ArrayList<String>();
		for (CoinSymbol coinSymbol : CoinSymbol.values()) {
			if (coinSymbol.isCurency==0 && coinSymbol.status==1) {
				coinList.add(coinSymbol.name());
			}
		}
		return coinList;
	}
	
}
