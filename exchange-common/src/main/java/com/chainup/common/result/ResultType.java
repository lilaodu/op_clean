package com.chainup.common.result;

/**
 * Created by zhongjingyuun on 20170927
 */
public enum ResultType {
    Success("0","result.success", "成功"),
    SystemError("1","result.system.error", "系统错误"),
    ParameterError("2","result.parameter.error", "参数错误"),
    NotLogin("3","result.not.login", "用户未登录"),
	BalanceInsufficient("4","result.balance.insufficient", "余额不足"),
	OrderFail("5","result.order.fail", "下单失败"),
	LessLimitMin("6","result.less.limit.min", "数量小于最小值"),
	GreaterLimitMax("7","result.greater.limit.max", "数量大于最大值"),
	OrderCancleFail("8","result.order.cancle.fail", "订单取消失败"),
	TradeBeLock("9","result.trade.be.lock", "交易被冻结"),
	MaxSelectEightSybol("10","result.max.select.eight", "最多选择8个"),
    SMSCODE_FAIL("11", "result.verify.smscode.error", "短信验证码错误或过期"),
    GOOGLECODE_FAIL("21", "user.google.authenticator.error", "谷歌验证码错误或过期"),
    SYMBOL_UNKNOWN("12", "result.verify.symbol.unknown", "未知的货币代号"),
	PleaseContactAdministrator("13","result.please.contact.administrator", "对不起，程序出现系统错误，请和网站管理员联系，谢谢！"),
	ErrorCode("14","result.error.code", "验证码错误"),
	PleaseDealnameVerify("15","result.please.dealname.verify", "请先进行实名认证"),
	MustHaveCapitalPword("16", "result.must.have.capital.pword", "请先设置资金密码"),
	PAY_PWD_ERROR("17", "result.verify.capital.error", "资金密码错误"),
    WITHDRAW_LOCKED("18", "result.verify.withdraw.locked", "提现被冻结"),
    BALANCE_NOT_ENOUGH("19", "result.verify.balance.notenough", "可用余额不足"),
    PleaseDealnameVerifyTwo("20","result.please.dealname.verify.two", "请先进行实名认证C2/A2"),
	CancleWithdrawError("21","result.cancle.withdraw.error", "取消提现失败"),
	ORDER_NO_EXIST("22","result.order_not_exist","订单不存在"),
	PARAMETER_VOLUME("23","result.volume.error","请输入交易数量"),
	PARAMETER_PRICE("24","result.price.error","请输入交易价格"),
	PRICE_VOLUME_PRESION_ERROR("25","price.volume.presion.error","价格或数量精度超过最大限制"),
	USRE_NOT_EXIST("26","result.user.not.exist","用户不存在"),
	CERTIFICATE_INVAILD("27","result.user.certificate.invalid","无效证件"),
	EMAIL_CODE_FAIL("28", "result.email.code.fail","邮箱验证码错误或过期"),
	OPERATE_FAIL("29", "result.operate.fail","操作失败"),
	TOKEN_INVALID("30","result.token.invalid","无效token"),
	PriceLessLimitMin("31","result.price.less.limit.min","价格小于最小值"),
	SameWithdrawAddrs("32","result.same.withdraw.addrs","存在相同的地址标签"),
	USERNAME_PASSWORD_ERROR("100100", "user.login.username_or_password_error", "用户名或密码错误"),
	LOGIN_LOCK_TWO_HOUR("100101", "user.login.account_locked_two_hours", "用户登陆锁定两小时"),
	USER_LOCK("100102", "user.login.account_locked", "用户被冻结"),
	USERNAME_PASSWORD_ERROR_FORMAT("100103", "user.login.username_or_password_error_format", "用户名或密码错误,您还有%s次机会"),
	NOT_BIND_MOBILE("100104", "user.not.bind.mobile", "用户未绑定手机"),
	OTC_TRANSFER_FAIL("100105", "result.otc.transfer.fail", "场外资金划转失败"),
	NOT_OPEN_GOOGLE_OR_MOBILE("100106", "result.not.open.google.mobile", "请开启Google认证或手机认证"),
	ALIYUN_VALID_CODE_FAIL("100107", "result.aliyun.valid.code.fail", "滑动验证失败"),
	WITHDRAW_MIN_AMOUNT("100112","result.withdraw.min.amount","提币数量小于最小提币限制"),
	NO_AUTH_REALNAME_WITHDRAW_ALERT("100108", "result.realname.withdraw.alert","用户每日最高提现数字货币数量超出限制"),
	SET_FEE_COIN_OPEN_ERROR("100109", "result.set.fee.coin.open.error","设置手续费开关失败"),
	REFUSE_OWNER_ADDRESS("100110","result.refuse.add.withdraw.addr","地址不能为本平台地址"),
	XRP_ADDREESS_ERROR("100111","result.xrp.address.error","瑞波币地址错误"),
	;
	
	public String code;
    public String languageKey;
    public String message;

    ResultType(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
    private ResultType(String code, String languageKey, String message) {
		this.code = code;
		this.languageKey = languageKey;
		this.message = message;
	}

	public String getLanguageKey() {
		return languageKey;
	}

	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
	}

	public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
