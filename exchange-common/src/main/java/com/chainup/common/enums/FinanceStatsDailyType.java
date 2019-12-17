package com.chainup.common.enums;

/**
 * Created by nob.
 */
public enum FinanceStatsDailyType {
    /*==================利润===================================*/
    //收入
	TRADE_FEE, //交易手续费
	TRADE_FEE_OTC, //场外交易手续费
    
    WITHDRAW_FEE,//提现手续费收入
    PRESENT_COIN,//赠币工具赠送
    

    //成本
    EXPEND_WITHDRAW_FEE, //消耗手续费支出(也属于流出资产)

    /*==================现金流量=============================*/
    //流入资产
    DEPOSIT, //充值汇总

    //流出资产
    WITHDRAW,//提现汇总

    //资产内部流转
    USER_TRADE, //用户交易量，=买入，=卖出
    USER_BUY, //用户买入
    USER_SELL, //用户卖出
    USER_BUY_OTC, //场外用户买入
    USER_SELL_OTC, //场外用户卖出
    COM_BUY, //平台买入
    COM_SELL, //平台卖出

    //usdt内部流转

    /*=================资产负债============================*/
    BALANCE_COLD, //冷钱包余额快照
    BALANCE_HOT, //热钱包余额快照，这个直接读取finance_history_hot表

    BALANCE_USER_NORMAL,    //用户可用
    BALANCE_USER_LOCK,      //用户冻结
    BALANCE_USER_WITHDRAW,  //提现在途
    
    BALANCE_USER_NORMAL_OTC,    //用户场外可用
    BALANCE_USER_LOCK_OTC,      //用户场外冻结
    ;
}
