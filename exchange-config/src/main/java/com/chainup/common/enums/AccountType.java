package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * account表，type,账户类型
 */
public enum AccountType {
	/*=============利润：公司手续费二级账户======================================*/
	/*GDT 计价区*/
	FEE_BTCGDT_BTC		(101101,"1","01", "btc", "btcgdt", "公司：BTC-GDT交易对中BTC余额"),
	FEE_BTCGDT_GDT		(101102,"1","01", "gdt", "btcgdt", "公司：BTC-GDT交易对中GDT余额"),
	FEE_BTCGDT_ADI		(101103,"1","01", "adi", "btcgdt", "公司：BTC-GDT交易对中ADI作为手续费"),
	
	FEE_ETHGDT_ETH		(101104,"1","01", "eth", "ethgdt", "公司：ETH-GDT交易对中ETH余额"),
	FEE_ETHGDT_GDT		(101105,"1","01", "gdt", "ethgdt", "公司：ETH-GDT交易对中GDT余额"),
	FEE_ETHGDT_ADI		(101106,"1","01", "adi", "ethgdt", "公司：ETH-GDT交易对中ADI作为手续费"),
	
	FEE_USDTGDT_USDT	(101107,"1","01", "usdt", "usdtgdt", "公司：USDT-GDT交易对中USDT余额"),
	FEE_USDTGDT_GDT		(101108,"1","01", "gdt",  "usdtgdt", "公司：USDT-GDT交易对中GDT余额"),
	FEE_USDTGDT_ADI		(101109,"1","01", "adi",  "usdtgdt", "公司：USDT-GDT交易对中ADI作为手续费"),
	
	FEE_EOSGDT_EOS		(101110,"1","01", "eos", "eosgdt", "公司：EOS-GDT交易对中EOS余额"),
	FEE_EOSGDT_GDT		(101111,"1","01", "gdt", "eosgdt", "公司：EOS-GDT交易对中GDT余额"),
	FEE_EOSGDT_ADI		(101112,"1","01", "adi", "eosgdt", "公司：EOS-GDT交易对中ADI作为手续费"),
	
	FEE_XRPGDT_XRP		(101113,"1","01", "xrp", "xrpgdt", "公司：XRP-GDT交易对中XRP余额"),
	FEE_XRPGDT_GDT		(101114,"1","01", "gdt", "xrpgdt", "公司：XRP-GDT交易对中GDT余额"),
	FEE_XRPGDT_ADI		(101115,"1","01", "adi", "xrpgdt", "公司：XRP-GDT交易对中ADI作为手续费"),
	
	FEE_ADIGDT_ADI		(101116,"1","01", "adi", "adigdt", "公司：ADI-GDT交易对中ADI余额"),
	FEE_ADIGDT_GDT		(101117,"1","01", "gdt", "adigdt", "公司：ADI-GDT交易对中GDT余额"),
	
	FEE_LTCGDT_LTC		(101118,"1","01", "ltc", "ltcgdt", "公司：LTC-GDT交易对中LTC余额"),
	FEE_LTCGDT_GDT		(101119,"1","01", "gdt", "ltcgdt", "公司：LTC-GDT交易对中GDT余额"),
	FEE_LTCGDT_ADI		(101120,"1","01", "adi", "ltcgdt", "公司：LTC-GDT交易对中ADI作为手续费"),
	
	FEE_GDTUSDT_GDT		(101121, "1","01", "gdt", "gdtusdt", "公司：GDT-USDT交易对中GDT余额"),
	FEE_GDTUSDT_USDT	(101122, "1","01", "usdt", "gdtusdt", "公司：GDT-USDT交易对中USDT余额"),
	FEE_GDTUSDT_ADI		(101123, "1","01", "adi", "gdtusdt", "公司：GDT-USDT交易对中ADI作为手续费"),
	
	
	/*=========================公司充值账户===================================*/
    DEPOSTI_BTC	(102201,"1","02","BTC","公司：充值BTC"),
    DEPOSTI_ETH	(102202,"1","02","ETH","公司：充值ETH"),
    DEPOSTI_USDT(102203,"1","02","USDT","公司：充值USDT"),
    DEPOSTI_EOS	(102204,"1","02","EOS","公司：充值EOS"),
    DEPOSTI_XRP	(102205,"1","02","XRP","公司：充值XRP"),
    DEPOSTI_GDT	(102206,"1","02","GDT","公司：充值GDT"),
    DEPOSTI_ADI	(102207,"1","02","ADI","公司：充值ADI"),
    DEPOSTI_LTC	(102208,"1","02","LTC","公司：充值LTC"),
    
	/*=========================公司提现账户===================================*/
    WITHDRAW_BTC	(103201,"1","03","BTC","公司：提现BTC"),
    WITHDRAW_ETH	(103202,"1","03","ETH","公司：提现ETH"),
    WITHDRAW_USDT	(103203,"1","03","USDT","公司：提现USDT"),
	WITHDRAW_EOS	(103204,"1","03","EOS","公司：提现EOS"),
	WITHDRAW_XRP	(103205,"1","03","XRP","公司：提现XRP"),
	WITHDRAW_GDT	(103206,"1","03","GDT","公司：提现GDT"),
	WITHDRAW_ADI	(103207,"1","03","ADI","公司：提现ADI"),
	WITHDRAW_LTC	(103208,"1","03","LTC","公司：提现LTC"),
	
	/*=========================公司币种正常，运营调账需要==========================*/
    OPERATE_BTC		(104201,"1","04","BTC","公司：运营BTC"),
    OPERATE_ETH		(104202,"1","04","ETH","公司：运营ETH"),
    OPERATE_USDT	(104203,"1","04","USDT","公司：运营USDT"),
	OPERATE_EOS		(104204,"1","04","EOS","公司：运营EOS"),
	OPERATE_XRP		(104205,"1","04","XRP","公司：运营XRP"),
	OPERATE_GDT		(104206,"1","04","GDT","公司：运营GDT"),
	OPERATE_ADI		(104207,"1","04","ADI","公司：运营ADI"),
	OPERATE_LTC		(104208,"1","04","LTC","公司：运营LTC"),
	
	/*=========================公司，收取用户的提现手续费==========================*/
	WITHDRAW_FEE_BTC	(105201, "1","05", "BTC", "公司：提现手续费BTC"),
	WITHDRAW_FEE_ETH	(105202, "1","05", "ETH", "公司：提现手续费ETH"),
	WITHDRAW_FEE_USDT	(105203, "1","05", "USDT","公司：提现手续费USDT"),
	WITHDRAW_FEE_EOS	(105204, "1","05", "EOS", "公司：提现手续费EOS"),
	WITHDRAW_FEE_XRP	(105205, "1","05", "XRP", "公司：提现手续费XRP"),
	WITHDRAW_FEE_GDT	(105206, "1","05", "GDT", "公司：提现手续费GDT"),
	WITHDRAW_FEE_ADI	(105207, "1","05", "ADI", "公司：提现手续费ADI"),
	WITHDRAW_FEE_LTC	(105208, "1","05", "LTC", "公司：提现手续费LTC"),
	
	/*=========================公司，区块链转账消耗提现手续费==========================*/
	EXPEND_WITHDRAW_FEE_BTC	(106201, "1","06", "BTC", "公司：消耗提现手续费BTC"),
	EXPEND_WITHDRAW_FEE_ETH	(106202, "1","06", "ETH", "公司：消耗提现手续费ETH"),
	EXPEND_WITHDRAW_FEE_USDT(106203, "1","06", "USDT","公司：消耗提现手续费USDT"),
	EXPEND_WITHDRAW_FEE_EOS	(106204, "1","06", "EOS","公司：消耗提现手续费EOS"),
	EXPEND_WITHDRAW_FEE_XRP	(106205, "1","06", "XRP","公司：消耗提现手续费XRP"),
	EXPEND_WITHDRAW_FEE_GDT	(106206, "1","06", "GDT","公司：消耗提现手续费GDT"),
	EXPEND_WITHDRAW_FEE_ADI	(106207, "1","06", "ADI","公司：消耗提现手续费ADI"),
	EXPEND_WITHDRAW_FEE_LTC	(106208, "1","06", "LTC","公司：消耗提现手续费LTC"),
	
	
	/*=========================公司，赠币账户==========================*/
	PRESENT_COIN_BTC	(112201, "1","12", "BTC","公司：赠币账户BTC"),
	PRESENT_COIN_ETH	(112202, "1","12", "ETH","公司：赠币账户ETH"),
	PRESENT_COIN_USDT	(112203, "1","12", "USDT","公司：赠币账户USDT"),
    PRESENT_COIN_EOS	(112204, "1","12", "EOS","公司：赠币账户EOS"),
    PRESENT_COIN_XRP	(112205, "1","12", "XRP","公司：赠币账户XRP"),
    PRESENT_COIN_GDT	(112206, "1","12", "GDT","公司：赠币账户GDT"),
    PRESENT_COIN_ADI	(112207, "1","12", "ADI","公司：赠币账户ADI"),
    PRESENT_COIN_LTC	(112208, "1","12", "LTC","公司：赠币账户LTC"),
    
	/*========================用户二级账户================================*/		
	BTC_NORMAL			(201101,"2","01","btc","用户：BTC：余额账户"),
	BTC_LOCK			(202101,"2","02","btc","用户：BTC：冻结账户"),
	BTC_WITHDRAW		(203101,"2","03","btc","用户：BTC：提现中"),
	BTC_PRESENT_COIN	(206101,"2","06","btc","用户：BTC：赠币账户"),

	ETH_NORMAL			(201102,"2","01","eth","用户：ETH：余额账户"),
	ETH_LOCK			(202102,"2","02","eth","用户：ETH：冻结账户"),
	ETH_WITHDRAW		(203102,"2","03","eth","用户：ETH：提现中"),
	ETH_PRESENT_COIN	(206102,"2","06","eth","用户：ETH：赠币账户"),

	USDT_NORMAL			(201103,"2","01","usdt","用户：USDT：余额账户"),
	USDT_LOCK			(202103,"2","02","usdt","用户：USDT：冻结账户"),
	USDT_WITHDRAW		(203103,"2","03","usdt","用户：USDT：提现中"),
	USDT_PRESENT_COIN	(206103,"2","06","usdt","用户：USDT：赠币账户"),
	
	EOS_NORMAL			(201104,"2","01","eos","用户：EOS：余额账户"),
	EOS_LOCK			(202104,"2","02","eos","用户：EOS：冻结账户"),
	EOS_WITHDRAW		(203104,"2","03","eos","用户：EOS：提现中"),
	EOS_PRESENT_COIN	(206104,"2","06","eos","用户：EOS：赠币账户"),
	
	XRP_NORMAL			(201105,"2","01","xrp","用户：XRP：余额账户"),
	XRP_LOCK			(202105,"2","02","xrp","用户：XRP：冻结账户"),
	XRP_WITHDRAW		(203105,"2","03","xrp","用户：XRP：提现中"),
	XRP_PRESENT_COIN	(206105,"2","06","xrp","用户：XRP：赠币账户"),
	
	GDT_NORMAL			(201106,"2","01","gdt","用户：GDT：余额账户"),
	GDT_LOCK			(202106,"2","02","gdt","用户：GDT：冻结账户"),
	GDT_WITHDRAW		(203106,"2","03","gdt","用户：GDT：提现中"),
	GDT_PRESENT_COIN	(206106,"2","06","gdt","用户：GDT：赠币账户"),
	
	ADI_NORMAL			(201107,"2","01","adi","用户：ADI：余额账户"),
	ADI_LOCK			(202107,"2","02","adi","用户：ADI：冻结账户"),
	ADI_WITHDRAW		(203107,"2","03","adi","用户：ADI：提现中"),
	ADI_PRESENT_COIN	(206107,"2","06","adi","用户：ADI：赠币账户"),
	
	LTC_NORMAL			(201108,"2","01","ltc","用户：LTC：余额账户"),
	LTC_LOCK			(202108,"2","02","ltc","用户：LTC：冻结账户"),
	LTC_WITHDRAW		(203108,"2","03","ltc","用户：LTC：提现中"),
	LTC_PRESENT_COIN	(206108,"2","06","ltc","用户：LTC：赠币账户"),
	
	/*=========================公司，收取场外交易手续费==========================*/
	FEE_OTC_BTC(107201,"1","07","BTC","公司:场外交易手续费BTC"),
	FEE_OTC_ETH(107202,"1","07","ETH","公司:场外交易手续费ETH"),
	FEE_OTC_USDT(107203,"1","07","USDT","公司:场外交易手续费USDT"),
	FEE_OTC_EOS(107204,"1","07","EOS","公司:场外交易手续费EOS"),
	FEE_OTC_GDT(107205,"1","07","GDT","公司:场外交易手续费GDT"),
	
	/*========================场外用户二级账户================================*/
	OTC_BTC_NORMAL(217101,"2","17","btc","用户：BTC:余额账户"),
    OTC_BTC_LOCK(218101,"2","18","btc","用户：BTC：冻结账户"),
    
    OTC_ETH_NORMAL(217102,"2","17","eth","用户：ETH:余额账户"),
    OTC_ETH_LOCK(218102,"2","18","eth","用户：ETH：冻结账户"), 
    
    OTC_USDT_NORMAL(217103,"2","17","usdt","用户：USDT：余额账户"),
    OTC_USDT_LOCK(218103,"2","18","usdt","用户：USDT：冻结账户"),
    
    OTC_EOS_NORMAL(217104,"2","17","eos","用户：EOS:余额账户"),
    OTC_EOS_LOCK(218104,"2","18","eos","用户：EOS：冻结账户"), 
    
    OTC_GDT_NORMAL(217105,"2","17","gdt","用户：GDT:余额账户"),
    OTC_GDT_LOCK(218105,"2","18","gdt","用户：GDT：冻结账户"),   
    
    
	;

	public Integer value; //账户type值
	public String accountA;//type的第1位
	public String accountBC;//type的23位
	public String coinSymbol;//货币符号
	public String symbol;//交易对   公司账户才有这个字段
	public String description;//账户类型描述

	private AccountType(Integer value, String accountA, String accountBC, String coinSymbol, String description) {
		this.value = value;
		this.accountA = accountA;
		this.accountBC = accountBC;
		this.coinSymbol = coinSymbol;
		this.description = description;
	}

	private AccountType(Integer value, String accountA, String accountBC, String coinSymbol, String symbol,String description) {
		this.value = value;
		this.accountA = accountA;
		this.accountBC = accountBC;
		this.coinSymbol = coinSymbol;
		this.symbol = symbol;
		this.description = description;
	}

	public String getAccountA() {
		return accountA;
	}

	public void setAccountA(String accountA) {
		this.accountA = accountA;
	}

	public String getAccountBC() {
		return accountBC;
	}

	public void setAccountBC(String accountBC) {
		this.accountBC = accountBC;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoinSymbol() {
		return coinSymbol;
	}
	public void setCoinSymbol(String coinSymbol) {
		this.coinSymbol = coinSymbol;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public static AccountType fromValue(int value) {
		for (AccountType t : AccountType.values()) {
			if (t.value.equals(value)) {
				return t;
			}
		}
		return null;
	}

	/**
	 * 获取个人用户type
	 * @param accountType type的BC位置
	 * @param coinSymbol 货币英文代号
	 * @return
	 */
	public static AccountType getPersionType(String accountType,String coinSymbol) {
		//用户type 2开头
		if (accountType==null || coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("2") && t.accountBC.equals(accountType) && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
				return t;
			}
		}
		return null;
	}

	/**
	 * 获取个人用户type集合
	 * @param accountType type的BC位置
	 * @param coinList 货币英文代号
	 * @return
	 */
	public static List<Integer> getPersionTypeList(String accountType,List<String> coinList) {
		//用户type 2开头
		ArrayList<Integer> typeList = new ArrayList<Integer>();
		if (accountType==null || coinList==null || coinList.size()==0) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			for (String coin : coinList) {
				if (t.accountA.equals("2") && t.accountBC.equals(accountType) && t.coinSymbol.equalsIgnoreCase(coin)) {
					typeList.add(t.value);
				}
			}
		}
		return typeList;
	}

	/**
	 * 获取公司type
	 * @return
	 */
	public static AccountType getCompanyType(String accountType,String coinSymbol,String symbol) {
		//公司type 1开头
		if (accountType==null || coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals(accountType) && t.coinSymbol.equalsIgnoreCase(coinSymbol) && t.symbol.equalsIgnoreCase(symbol)) {
				return t;
			}
		}
		return null;
	}

	public static AccountType getUserType(AccountType_BC typeBc, String coinSymbol) {
		coinSymbol = StringUtils.trim(coinSymbol).toUpperCase();

		//用户type 2开头
		if (typeBc==null || coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals(AccountType_A.PERSON.value) && t.accountBC.equals(typeBc.value)
					&& t.coinSymbol.equalsIgnoreCase(coinSymbol.trim())) {
				return t;
			}
		}
		return null;
	}

	public static AccountType getComDepositType(String coinSymbol) {
		//公司type 1开头
		if (coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals("02") && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
				return t;
			}
		}
		return null;
	}
	
	/**
	 * 获取场外交易手续费账户
	 * @param coinSymbol
	 * @return
	 */
	public static AccountType getComOtcFeeType(String coinSymbol) {
		//公司type 1开头
		if (coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals("07") && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
				return t;
			}
		}
		return null;
	}

	/**
	 * 获取某个币种公司手续费账户，所有的交易对都需要
	 * @param coinSymbol
	 * @return
	 */
	public static List<Integer> getComFeeTypes(String coinSymbol) {
		ArrayList<Integer> typeList = new ArrayList<Integer>();

		//公司type 1开头
		if (coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals("01") && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
				typeList.add(t.value);
			}
		}
		return typeList;
	}

	/**
	 * 获取公司运营账户
	 * @param coinSymbol
	 * @return
	 */
	public static AccountType getComOperateTypes(String coinSymbol) {
		//公司type 1开头
		if (coinSymbol==null) {
			return null;
		}
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals("04") && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
				return t;
			}
		}
		return null;
	}
	
	/**
	 * 获取公司赠币账户
	 * @param coinSymbol
	 * @return
	 */
	public static List<AccountType> getComZBTypes() {
		ArrayList<AccountType> typeList = new ArrayList<AccountType>();
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals("12")) {
				typeList.add(t);
			}
		}
		return typeList;
	}
	
	/**
	 * 获取公司某个币种的赠币账户
	 * @param coinSymbol
	 * @return
	 */
	public static AccountType getComZBBySymbol(String symbol) {
		AccountType result = null;
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("1") && t.accountBC.equals("12") && t.coinSymbol.equalsIgnoreCase(symbol)) {
				result = t;
				break;
			}
		}
		return result;
	}
	
	/**
	 * 获取用户余额账户
	 * @param coinSymbol
	 * @return
	 */
	public static List<AccountType> getUserYETypes() {
		ArrayList<AccountType> typeList = new ArrayList<AccountType>();
		for (AccountType t : AccountType.values()) {
			if (t.accountA.equals("2") && t.accountBC.equals("01")) {
				typeList.add(t);
			}
		}
		return typeList;
	}
	 /**
     * 
     * 获取所有余额账户和冻结账户的type
     * @author han
     */
    public static List<Integer> getNormalAndLockTypeList(){
    	List<Integer> resultList = new ArrayList<Integer>();
    	for(AccountType t : AccountType.values()){
    		if(t.accountA.equals("2") && !t.accountBC.equals("03")){
    			resultList.add(t.value);
    		}
    	}
    	return resultList;
    }


    /**
     * 获取场外用户冻结账户
     * @param coinSymbol
     * @return
     */
    public static AccountType getOtcAccountLock(String coinSymbol) {
        if (coinSymbol==null) {
            return null;
        }
        for (AccountType t : AccountType.values()) {
            if (t.accountA.equals(AccountType_A.PERSON.value) && t.accountBC.equals(AccountType_BC.OTC_LOCK.getValue()) && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
                return t;
            }
        }
        return null;
    }

    /**
     * 获取场外用户余额账户
     * @param coinSymbol
     * @return
     */
    public static AccountType getOtcAccountNormal(String coinSymbol) {
        if (coinSymbol==null) {
            return null;
        }
        for (AccountType t : AccountType.values()) {
            if (t.accountA.equals(AccountType_A.PERSON.value) && t.accountBC.equals(AccountType_BC.OTC_NORMAL.getValue()) && t.coinSymbol.equalsIgnoreCase(coinSymbol)) {
                return t;
            }
        }
        return null;
    }

    /**
     * 获取全部场外交易账户
     * @return
     */
    public static List<AccountType> getAllOtcAccount(){
        List<AccountType> list = new ArrayList();
        for(AccountType t : AccountType.values()){
            if(t.accountA.equals(AccountType_A.PERSON.value) && (t.accountBC.equals(AccountType_BC.OTC_NORMAL.getValue()) || t.accountBC.equals(AccountType_BC.OTC_LOCK.getValue()))){
                list.add(t);
            }
        }
        return list;
    }

    /**
     * 是否为场外账户
     * @param value
     * @return
     */
    public static Boolean isOtcAccount(Integer value){
        AccountType t = AccountType.fromValue(value);
        if(t.accountA.equals(AccountType_A.PERSON.value) && (t.accountBC.equals(AccountType_BC.OTC_NORMAL.getValue()) || t.accountBC.equals(AccountType_BC.OTC_LOCK.getValue()))){
            return true;
        }
        return false;
    }

    /**
     * 获取对应币种的用户余额账户
     * @param coinSymbol
     * @return
     */
    public static AccountType getAccountNormal(String coinSymbol){
        for(AccountType t : AccountType.values()){
            if(t.accountA.equals(AccountType_A.PERSON.value) && t.accountBC.equals(AccountType_BC.NORMAL.getValue()) && t.getCoinSymbol().equalsIgnoreCase(coinSymbol)){
                return t;
            }
        }
        return null;
    }

    /*
    //测试查重
	public static Map<Integer, List<AccountType>> checkTypeUnique() {
		Map<Integer, List<AccountType>> maps = new HashMap<>();
		for (AccountType t : AccountType.values()) {
			if (maps.containsKey(t.value)) {
				List<AccountType> AccountTypeList = maps.get(t.value);
				AccountTypeList.add(t);
				maps.put(t.value, AccountTypeList);
			} else {
				List<AccountType> AccountTypeList = new ArrayList<>();
				AccountTypeList.add(t);
				maps.put(t.value, AccountTypeList);
			}
		}

		for (Integer key : maps.keySet()) {
			List<AccountType> list = maps.get(key);
			if (list.size() > 1) {
				System.out.println(key + "=" + maps.get(key));
			}
		}
		return maps;
	}

	public static void main(String[] args) {
		AccountType.checkTypeUnique();
	}
*/
}
