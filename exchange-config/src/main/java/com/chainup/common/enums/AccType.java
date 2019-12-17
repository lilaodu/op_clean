package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * account表，type,账户类型，新的
 */
public enum AccType {
    /*=============利润：公司手续费二级账户======================================*/
	/*GDT 计价区*/
	FEE_BTCGDT_BTC		(101101, 101, "btc", "btcgdt", "公司：BTC-GDT交易对中BTC余额"),
	FEE_BTCGDT_GDT		(101102, 101, "gdt", "btcgdt", "公司：BTC-GDT交易对中GDT余额"),
	FEE_BTCGDT_ADI		(101103, 101, "adi", "btcgdt", "公司：BTC-GDT交易对中ADI作为手续费"),
	
	FEE_ETHGDT_ETH		(101104, 101, "eth", "ethgdt", "公司：ETH-GDT交易对中ETH余额"),
	FEE_ETHGDT_GDT		(101105, 101, "gdt", "ethgdt", "公司：ETH-GDT交易对中GDT余额"),
	FEE_ETHGDT_ADI		(101106, 101, "adi", "ethgdt", "公司：ETH-GDT交易对中ADI作为手续费"),
	
	FEE_USDTGDT_USDT	(101107, 101, "usdt", "usdtgdt", "公司：USDT-GDT交易对中USDT余额"),
	FEE_USDTGDT_GDT		(101108, 101, "gdt",  "usdtgdt", "公司：USDT-GDT交易对中GDT余额"),
	FEE_USDTGDT_ADI		(101109, 101, "adi",  "usdtgdt", "公司：USDT-GDT交易对中ADI作为手续费"),
	
	FEE_EOSGDT_EOS		(101110, 101, "eos", "eosgdt", "公司：EOS-GDT交易对中EOS余额"),
	FEE_EOSGDT_GDT		(101111, 101, "gdt", "eosgdt", "公司：EOS-GDT交易对中GDT余额"),
	FEE_EOSGDT_ADI		(101112, 101, "adi", "eosgdt", "公司：EOS-GDT交易对中ADI作为手续费"),
	
	FEE_XRPGDT_XRP		(101113, 101, "xrp", "xrpgdt", "公司：XRP-GDT交易对中XRP余额"),
	FEE_XRPGDT_GDT		(101114, 101, "gdt", "xrpgdt", "公司：XRP-GDT交易对中GDT余额"),
	FEE_XRPGDT_ADI		(101115, 101, "adi", "xrpgdt", "公司：XRP-GDT交易对中ADI作为手续费"),
	
	FEE_ADIGDT_ADI		(101116, 101, "adi", "adigdt", "公司：ADI-GDT交易对中ADI余额"),
	FEE_ADIGDT_GDT		(101117, 101, "gdt", "adigdt", "公司：ADI-GDT交易对中GDT余额"),
	
	FEE_LTCGDT_LTC		(101118, 101, "ltc", "ltcgdt", "公司：LTC-GDT交易对中LTC余额"),
	FEE_LTCGDT_GDT		(101119, 101, "gdt", "ltcgdt", "公司：LTC-GDT交易对中GDT余额"),
	FEE_LTCGDT_ADI		(101120, 101, "adi", "ltcgdt", "公司：LTC-GDT交易对中ADI作为手续费"),
	
	FEE_GDTUSDT_GDT		(101121, 101, "gdt", "gdtusdt", "公司：GDT-USDT交易对中GDT余额"),
	FEE_GDTUSDT_USDT	(101122, 101, "usdt", "gdtusdt", "公司：GDT-USDT交易对中USDT余额"),
	FEE_GDTUSDT_ADI		(101123, 101, "adi", "gdtusdt", "公司：GDT-USDT交易对中ADI作为手续费"),
	
    /*=========================公司充值账户===================================*/
    DEPOSTI_BTC	(102201,102,"BTC","公司：充值BTC"),
    DEPOSTI_ETH	(102202,102,"ETH","公司：充值ETH"),
    DEPOSTI_USDT(102203,102,"USDT","公司：充值USDT"),
    DEPOSTI_EOS	(102204,102,"EOS","公司：充值EOS"),
    DEPOSTI_XRP	(102205,102,"XRP","公司：充值XRP"),
    DEPOSTI_GDT	(102206,102,"GDT","公司：充值GDT"),
    DEPOSTI_ADI	(102207,102,"ADI","公司：充值ADI"),
    DEPOSTI_LTC	(102208,102,"LTC","公司：充值LTC"),
    
    /*=========================公司提现账户===================================*/
    WITHDRAW_BTC	(103201,103,"BTC","公司：提现BTC"),
    WITHDRAW_ETH	(103202,103,"ETH","公司：提现ETH"),
    WITHDRAW_USDT	(103203,103,"USDT","公司：提现USDT"),
	WITHDRAW_EOS	(103204,103,"EOS","公司：提现EOS"),
	WITHDRAW_XRP	(103205,103,"XRP","公司：提现XRP"),
	WITHDRAW_GDT	(103206,103,"GDT","公司：提现GDT"),
	WITHDRAW_ADI	(103207,103,"ADI","公司：提现ADI"),
	WITHDRAW_LTC	(103208,103,"LTC","公司：提现LTC"),
	
    /*=========================公司币种正常，运营调账需要==========================*/
    OPERATE_BTC		(104201,104,"BTC","公司：运营BTC"),
    OPERATE_ETH		(104202,104,"ETH","公司：运营ETH"),
    OPERATE_USDT	(104203,104,"USDT","公司：运营USDT"),
	OPERATE_EOS		(104204,104,"EOS","公司：运营EOS"),
	OPERATE_XRP		(104205,104,"XRP","公司：运营XRP"),
	OPERATE_GDT		(104206,104,"GDT","公司：运营GDT"),
	OPERATE_ADI		(104207,104,"ADI","公司：运营ADI"),
	OPERATE_LTC		(104208,104,"LTC","公司：运营LTC"),
	
	
    /*=========================公司，收取用户的提现手续费==========================*/
	WITHDRAW_FEE_BTC	(105201, 105, "BTC", "公司：提现手续费BTC"),
	WITHDRAW_FEE_ETH	(105202, 105, "ETH", "公司：提现手续费ETH"),
	WITHDRAW_FEE_USDT	(105203, 105, "USDT","公司：提现手续费USDT"),
	WITHDRAW_FEE_EOS	(105204, 105, "EOS", "公司：提现手续费EOS"),
	WITHDRAW_FEE_XRP	(105205, 105, "XRP", "公司：提现手续费XRP"),
	WITHDRAW_FEE_GDT	(105206, 105, "GDT", "公司：提现手续费GDT"),
	WITHDRAW_FEE_ADI	(105207, 105, "ADI", "公司：提现手续费ADI"),
	WITHDRAW_FEE_LTC	(105208, 105, "LTC", "公司：提现手续费LTC"),
	
    /*=========================公司，区块链转账消耗提现手续费==========================*/
	EXPEND_WITHDRAW_FEE_BTC	(106201, 106, "BTC", "公司：消耗提现手续费BTC"),
	EXPEND_WITHDRAW_FEE_ETH	(106202, 106, "ETH", "公司：消耗提现手续费ETH"),
	EXPEND_WITHDRAW_FEE_USDT(106203, 106, "USDT","公司：消耗提现手续费USDT"),
	EXPEND_WITHDRAW_FEE_EOS	(106204, 106, "EOS","公司：消耗提现手续费EOS"),
	EXPEND_WITHDRAW_FEE_XRP	(106205, 106, "XRP","公司：消耗提现手续费XRP"),
	EXPEND_WITHDRAW_FEE_GDT	(106206, 106, "GDT","公司：消耗提现手续费GDT"),
	EXPEND_WITHDRAW_FEE_ADI	(106207, 106, "ADI","公司：消耗提现手续费ADI"),
	EXPEND_WITHDRAW_FEE_LTC	(106208, 106, "LTC","公司：消耗提现手续费LTC"),
	
	/*=========================公司，赠币账户==========================*/
	PRESENT_COIN_BTC	(112201, 112, "BTC","公司：赠币账户BTC"),
	PRESENT_COIN_ETH	(112202, 112, "ETH","公司：赠币账户ETH"),
	PRESENT_COIN_USDT	(112203, 112, "USDT","公司：赠币账户USDT"),
    PRESENT_COIN_EOS	(112204, 112, "EOS","公司：赠币账户EOS"),
    PRESENT_COIN_XRP	(112205, 112, "XRP","公司：赠币账户XRP"),
    PRESENT_COIN_GDT	(112206, 112, "GDT","公司：赠币账户GDT"),
    PRESENT_COIN_ADI	(112207, 112, "ADI","公司：赠币账户ADI"),
    PRESENT_COIN_LTC	(112208, 112, "LTC","公司：赠币账户LTC"),
    
    /*========================用户二级账户================================*/
    BTC_NORMAL			(201101,201,"btc","用户：BTC：余额账户"),
	BTC_LOCK			(202101,202,"btc","用户：BTC：冻结账户"),
	BTC_WITHDRAW		(203101,203,"btc","用户：BTC：提现中"),
	BTC_PRESENT_COIN	(206101,206,"btc","用户：BTC：赠币账户"),

	ETH_NORMAL			(201102,201,"eth","用户：eth：余额账户"),
	ETH_LOCK			(202102,202,"eth","用户：eth：冻结账户"),
	ETH_WITHDRAW		(203102,203,"eth","用户：eth：提现中"),
	ETH_PRESENT_COIN	(206102,206,"eth","用户：eth：赠币账户"),

	USDT_NORMAL			(201103,201,"usdt","用户：usdt：余额账户"),
	USDT_LOCK			(202103,202,"usdt","用户：usdt：冻结账户"),
	USDT_WITHDRAW		(203103,203,"usdt","用户：usdt：提现中"),
	USDT_PRESENT_COIN	(206103,206,"usdt","用户：usdt：赠币账户"),
	
	EOS_NORMAL			(201104,201,"eos","用户：eos：余额账户"),
	EOS_LOCK			(202104,202,"eos","用户：eos：冻结账户"),
	EOS_WITHDRAW		(203104,203,"eos","用户：eos：提现中"),
	EOS_PRESENT_COIN	(206104,206,"eos","用户：eos：赠币账户"),
	
	XRP_NORMAL			(201105,201,"xrp","用户：xrp：余额账户"),
	XRP_LOCK			(202105,202,"xrp","用户：xrp：冻结账户"),
	XRP_WITHDRAW		(203105,203,"xrp","用户：xrp：提现中"),
	XRP_PRESENT_COIN	(206105,206,"xrp","用户：xrp：赠币账户"),
	
	GDT_NORMAL			(201106,201,"gdt","用户：gdt：余额账户"),
	GDT_LOCK			(202106,202,"gdt","用户：gdt：冻结账户"),
	GDT_WITHDRAW		(203106,203,"gdt","用户：gdt：提现中"),
	GDT_PRESENT_COIN	(206106,206,"gdt","用户：gdt：赠币账户"),
	
	ADI_NORMAL			(201107,201,"adi","用户：adi：余额账户"),
	ADI_LOCK			(202107,202,"adi","用户：adi：冻结账户"),
	ADI_WITHDRAW		(203107,203,"adi","用户：adi：提现中"),
	ADI_PRESENT_COIN	(206107,206,"adi","用户：adi：赠币账户"),
	
	LTC_NORMAL			(201108,201,"ltc","用户：ltc：余额账户"),
	LTC_LOCK			(202108,202,"ltc","用户：ltc：冻结账户"),
	LTC_WITHDRAW		(203108,203,"ltc","用户：ltc：提现中"),
	LTC_PRESENT_COIN	(206108,206,"ltc","用户：ltc：赠币账户"),
	
	
    /*=========================公司，收取场外交易手续费==========================*/
    FEE_OTC_BTC	(107201, 107, "BTC", "公司:场外交易手续费BTC"),
    FEE_OTC_ETH	(107202, 107, "ETH", "公司:场外交易手续费ETH"),
	FEE_OTC_USDT(107203, 107, "USDT","公司:场外交易手续费USDT"),
	FEE_OTC_EOS	(107204, 107, "EOS", "公司:场外交易手续费EOS"),
	FEE_OTC_GDT(107205,  107,  "GDT","公司:场外交易手续费GDT"),
	
	
    /*========================场外用户二级账户================================*/
	OTC_BTC_NORMAL	(217101,217,"btc","用户：BTC:余额账户"),
	OTC_BTC_LOCK	(218101,218,"btc","用户：BTC：冻结账户"),
	
	OTC_ETH_NORMAL	(217102,217,"eth","用户：ETH:余额账户"),
	OTC_ETH_LOCK	(218102,218,"eth","用户：ETH：冻结账户"),
	
	OTC_USDT_NORMAL	(217103,217,"usdt","用户：USDT：余额账户"),
	OTC_USDT_LOCK	(218103,218,"usdt","用户：USDT：冻结账户"),
	
	OTC_EOS_NORMAL	(217104,217,"eos","用户：EOS:余额账户"),
    OTC_EOS_LOCK	(218104,218,"eos","用户：EOS：冻结账户"),
    
    OTC_GDT_NORMAL	(217105,217,"gdt","用户：GDT:余额账户"),
    OTC_GDT_LOCK	(218105,218,"gdt","用户：GDT：冻结账户"), 
	;


    public Integer value; //账户type值
    public Integer typeSub;//type的第123位
    public String coinSymbol;//货币符号
    public String pairSymbol;//交易对符号，公司手续费账户才有这个字段
    public String description;//账户类型描述

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTypeSub() {
        return typeSub;
    }

    public void setTypeSub(Integer typeSub) {
        this.typeSub = typeSub;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    public String getPairSymbol() {
        return pairSymbol;
    }

    public void setPairSymbol(String pairSymbol) {
        this.pairSymbol = pairSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private AccType(Integer value, Integer typeSub, String coinSymbol, String description) {
        this.value = value;
        this.typeSub = typeSub;
        this.coinSymbol = coinSymbol;
        this.description = description;
    }

    private AccType(Integer value, Integer typeSub, String coinSymbol, String pairSymbol, String description) {
        this.value = value;
        this.typeSub = typeSub;
        this.coinSymbol = coinSymbol;
        this.pairSymbol = pairSymbol;
        this.description = description;
    }

    public static AccType fromValue(int value) {
        for (AccType t : AccType.values()) {
            if (t.value.equals(value)) {
                return t;
            }
        }
        return null;
    }

    /**
     * 获取特定币种的账户
     * @param typeSub
     * @param coinSymbol
     * @return
     */
    public static AccType getAccType(TypeSub typeSub, String coinSymbol) {
        if (typeSub == null || coinSymbol == null) {
            return null;
        }
        for (AccType t : AccType.values()) {
            if (t.typeSub.equals(typeSub.value) && t.coinSymbol.equalsIgnoreCase(coinSymbol.trim())) {
                return t;
            }
        }
        return null;
    }

    /**
     * 获取特定币种的账户
     * @param typeSub
     * @param coinSymbol
     * @return
     */
    public static Integer getAccTypeInt(TypeSub typeSub, String coinSymbol) {
        if (typeSub == null || coinSymbol == null) {
            return null;
        }
        for (AccType t : AccType.values()) {
            if (t.typeSub.equals(typeSub.value) && t.coinSymbol.equalsIgnoreCase(coinSymbol.trim())) {
                return t.getValue();
            }
        }
        return null;
    }
    /**
     * 获取特定币种的账户
     *
     * @param typeSubValue
     * @param coinSymbol
     * @return
     */
    public static Integer getAccTypeInt(int typeSubValue, String coinSymbol) {
        if (coinSymbol == null) {
            return null;
        }
        for (AccType t : AccType.values()) {
            if (t.typeSub.equals(typeSubValue) && t.coinSymbol.equalsIgnoreCase(coinSymbol.trim())) {
                return t.getValue();
            }
        }
        return null;
    }

    /**
     * 获取公司交易对手续费账户
     * @param coinSymbol
     * @param pairSymbol
     * @return
     */
    public static AccType getTradeFeeType(String coinSymbol, String pairSymbol) {
        if (pairSymbol == null || coinSymbol == null) {
            return null;
        }
        for (AccType t : AccType.values()) {
            if (t.typeSub.equals(TypeSub.C_TRADE_FEE.value)
                    && t.coinSymbol.equalsIgnoreCase(coinSymbol.trim())
                    && t.pairSymbol.equalsIgnoreCase(pairSymbol.trim())) {
                return t;
            }
        }
        return null;
    }

    /**
     * 获取某个币种的手续费账户，包含所有交易对
     * @param coinSymbol
     * @return
     */
    public static List<Integer> getTradeFeeTypes(String coinSymbol) {
        List<Integer> typeList = new ArrayList<>();
        if (coinSymbol == null) {
            return typeList;
        }

        for (AccType t : AccType.values()) {
            if (t.typeSub.equals(TypeSub.C_TRADE_FEE.value)
                    && t.coinSymbol.equalsIgnoreCase(coinSymbol.trim())) {
                typeList.add(t.value);
            }
        }
        return typeList;
    }

    public enum TypeSub {
        // 公司账户类型
        C_TRADE_FEE(101, "公司：交易手续费"),
        C_DEPOSIT(102, "公司：充值"),
        C_WITHDRAW(103, "公司：已提现"),
        C_OPERATE(104, "公司：运营平账"),

        C_WITHDRAW_FEE(105, "公司：提现手续费"), //收用户的提现手续费
        C_EXPEND_WITHDRAW_FEE(106, "公司：消耗提现手续费"), //实际消耗的手续费
        C_OTC_FEE(107, "公司:场外交易手续费"),
        C_PRESENT_COIN(112, "公司:赠币账户"),

        //用户账户类型
        U_NORMAL(201, "正常余额"),
        U_LOCK(202, "冻结"),
        U_WITHDRAW(203, "提现中"),
    	U_PRESENT_COIN(206, "赠币账户");

        public Integer value;
        public String desc;

        TypeSub(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }
    }

    /*
    * 转账场景
    *
    * BTCCNY交易：
    * 用户A，CNY冻结->用户B，CNY正常
    * 用户B，BTC冻结->用户A，BTC正常
    * 用户A，BTC正常->公司，BTCCNY-BTC手续费
    * 用户B，CNY正常->公司，BTCCNY-CNY手续费
    *
    * 用户充值：
    * 公司，BTC充值->用户，BTC正常
    *
    * 用户提现已发币：
    * 用户，BTC提现中->公司，BTC已提现
    * 用户，BTC提现中->公司，BTC提现手续费
    * 公司，BTC提现手续费->公司，BTC消耗提现手续费
    *
    *
    *

    //测试查重
    public static Map<Integer, List<AccType>> checkTypeUnique() {
        Map<Integer, List<AccType>> maps = new HashMap<>();
        for (AccType t : AccType.values()) {
            if (maps.containsKey(t.value)) {
                List<AccType> accTypeList = maps.get(t.value);
                accTypeList.add(t);
                maps.put(t.value, accTypeList);
            } else {
                List<AccType> accTypeList = new ArrayList<>();
                accTypeList.add(t);
                maps.put(t.value, accTypeList);
            }
        }

        for (Integer key : maps.keySet()) {
            List<AccType> list = maps.get(key);
            if (list.size() > 1) {
                System.out.println(key + "=" + maps.get(key));
            }
        }
        return maps;
    }

    public static void main(String[] args) {
        AccType.checkTypeUnique();
    }
    */
}

