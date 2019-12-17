package com.chainup.common.enums;

public enum AssetType_A_BC {

	// 公司账户类型
	/** 公司：交易手续费 */
	C_TRADE_FEE("101", "1", "01", "公司：交易手续费"),
	/** 公司：充值 */
	C_DEPOSIT("102", "1", "02", "公司：充值"),
	/** 公司提现账户 */
	C_WITHDRAW("103", "1", "03", "公司：已提现"),
	/** 公司：运营平账 */
	C_OPERATE("104", "1", "04", "公司：运营平账"),
	/** 收用户的提现手续费 */
	C_WITHDRAW_FEE("105", "1", "05", "公司：提现手续费"),
	/** 实际消耗的手续费 区块链转账消耗提现手续费 */
	C_EXPEND_WITHDRAW_FEE("106", "1", "06", "公司：消耗提现手续费"),
	/** 公司:场外交易手续费 */
	C_OTC_FEE("107", "1", "07", "公司:场外交易手续费"),
	/** 公司:赠币账户 */
	C_PRESENT_COIN("112", "1", "12", "公司:赠币账户"),
    /**公司：场外资产账户*/
    C_OTC_ASSET("113", "1", "13", "公司:场外资产账户"),

	// 用户账户类型
	/** 用户现货正常余额 */
	U_NORMAL("201", "2", "01", "正常余额"),
	/** 用户现货冻结余额 */
	U_LOCK("202", "2", "02", "冻结"),
	/** 用户提现中余额 */
	U_WITHDRAW("203", "2", "03", "提现中"),
	/** 用户赠币账户余额 */
	U_PRESENT_COIN("206", "2", "06", "赠币账户"),
	/** 用户场外正常余额 */
	U_OTC_NORMAL("217", "2", "17", "场外正常余额"),
	/** 用户场外冻结余额 */
	U_OTC_LOCK("218", "2", "18", "场外冻结");

	public String	value;
	public String	account_A;
	public String	account_BC;
	public String	desc;

	AssetType_A_BC(String value, String account_A, String account_BC, String desc) {
		this.value = value;
		this.account_A = account_A;
		this.account_BC = account_BC;
		this.desc = desc;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAccount_A() {
		return account_A;
	}

	public void setAccount_A(String account_A) {
		this.account_A = account_A;
	}

	public String getAccount_BC() {
		return account_BC;
	}

	public void setAccount_BC(String account_BC) {
		this.account_BC = account_BC;
	}

}
