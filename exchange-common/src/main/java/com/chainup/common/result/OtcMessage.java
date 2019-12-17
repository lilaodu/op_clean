package com.chainup.common.result;

public enum OtcMessage {
	/** 成功 */
	SUCCESS(0, "otc.result.success", "成功"),
	/** 未登录 */
	ERROR_LOGIN(2, "otc.result.no.login", "未登录"),
	/** 系统异常 */
	ERROR_SYSTEM(3, "otc.result.system", "系统异常"),
	/** 没有权限访问 */
	ERROR_AUTHOR(4, "otc.result.author", "没有权限访问"),
	/** 参数错误 */
	ERROR(5, "otc.result.error", "参数错误"),
	/** 出售短信订单提醒 */
	SELL_MSM_TIP(100, "otc.order.sell.tip", "【AIFREX】尊敬的%s 用户，您于AIFREX发布的%s 出售广告已生成订单，等待对方付款。如需查看请您前往”订单管理“查看订单%s。"),
	/** 出售邮件提醒 */
	SELL_EMAIL_TIP(101, "otc.order.sell.email.tip",
			"尊敬AIFREX用户 ，您好：\n 您于AIFREX发布的%s 出售广告已生成订单，等待对方付款。如需查看请您前往”订单管理“查看订单%s。"),
	/** 购买提醒 */
	BUY_TIP(102, "otc.order.buy.tip", "【AIFREX】尊敬的%s 用户，您于AIFREX发布的%s 购买广告已生成订单，请您前往”订单管理“查看订单%s ，并在%s 分钟内付款。"),
	/** 订单生成提醒 */
	BUY_EMAIL_TITLE(103, "otc.order.buy.email.title", "【AIFREX】生成订单提醒"),
	/** 购买邮件提醒 */
	BUY_EMAIL_TIP(104, "otc.order.buy.email.tip",
			"尊敬【AIFREX】用户 ，您好：\n 您于AIFREX发布的%s 购买广告已生成订单，请您前往”订单管理“查看订单%s ，并在%s 分钟内付款。"),
	/** 短信确认提醒 */
	ORDER_MSM_CONFIRM(105, "otc.order.message.confirm", "【AIFREX】尊敬的%s 用户，您于AIFREX购买的%s ，对方已打币，请您前往”订单管理“查看订单%s 并评价对方。"),
	/** 邮件确认提醒 */
	ORDER_EMAIL_CONFIRM(106, "otc.order.email.confirm",
			"尊敬【AIFREX】用户 ，您好：\n 用户，您于AIFREX购买的%s ，对方已打币，请您前往”订单管理“查看订单%s 并评价对方。"),
	/** 邮件确认主题 */
	EMAIL_CONFIRM_TITLE(107, "otc.order.email.confirm.title", "【AIFREX】订单状态更新提醒"),
	/** 支付提醒 */
	ORDER_PAY_TIP(108, "otc.order.pay.tip", "【AIFREX】尊敬的%s 用户，您在AIFREX的订单对方已付款，请您前往”订单管理“查看订单%s  并尽快释放%s 。"),
	/** 支付邮件提醒 */
	ORDER_EMAIL_PAY_TIP(109, "otc.order.pay.email.tip", "尊敬AIFREX用户 ，您好：\n 您在AIFREX的订单对方已付款，请您前往”订单管理“查看订单%s  并尽快释放%s 。"),
	/** 提醒标题 */
	ORDER_EMAIL_PAY_TITLE(110, "otc.order.pay.email.title", "AIFREX订单状态更新"),
	
	//站内信
	/**确认打币 广告发布者卖家  出售广告*/
	ORDER_MSG_CONFRIM_AD_SELL(111, "otc.order.msg.confirm.ad.sell", "您发布的%s购买广告对方已打币，订单编号%s，<a style='text-decoration: underline;' href='${base}/buy_order.html?order=%s'>点击此处</a>查看订单"),
	/**确认打币 普通用户  购买广告*/
	ORDER_MSG_CONFRIM_AD_BUY(112, "otc.order.msg.confirm.ad.buyer", "您购买的%s,对方已打币，订单编号%s，<a style='text-decoration: underline;' href='${base}/buy_order.html?order=%s'>点击此处</a>查看订单"),
	/**生成订单 广告发布者卖家  出售广告*/
	ORDER_MSG_ORDER_SAVE_AD_SELL(113, "otc.order.msg.order.save.ad.sell", "您发布的%s出售广告已生成订单，订单编号%s，<a style='text-decoration: underline;' href='${base}/sell_order.html?order=%s'>点击此处</a>查看订单"),
	/**生成订单  购买广告*/
	ORDER_MSG_ORDER_SAVE_AD_BUY(114, "otc.order.msg.order.save.ad.buy", "您发布的%s购买广告已生成订单，订单编号%s，请您<a style='text-decoration: underline;' href='${base}/buy_order.html?order=%s'>点击此处</a>进入订单并于%s前付款"),
	/**确认付款 广告发布者卖家  出售广告*/
	ORDER_MSG_ORDER_PAY_AD_SELL(115, "otc.order.msg.order.pay.ad.sell", "您发布的%s出售广告对方已付款，订单编号%s，请<a style='text-decoration: underline;' href='${base}/buy_order.html?order=%s'>点击此处</a>进入订单并尽快释放%s"),
	/**确认付款  购买广告*/
	ORDER_MSG_ORDER_PAY_AD_BUY(116, "otc.order.msg.order.pay.ad.buy", "您出售的%s，对方已付款，订单编号%s，请<a style='text-decoration: underline;' href='${base}/buy_order.html?order=%s'>点击此处</a>进入订单并尽快释放%s"),

	
	/** 交易类型错误 */
	ERROR_SIDE(1001, "otc.result.side.error", "交易类型错误"),
	/** 支付方式错误 */
	ERROR_PAYCOIN(1002, "otc.result.paycoin.error", "支付方式错误"),

	/** 支付密码错误 */
	ERROR_CAPITAL_PWORD(2000, "otc.result.capital.pword.error", "支付密码错误"),

	/** 未设置支付密码 */
	ERROR_CAPITAL_PWORD_EMPTY(2001, "otc.result.capital.pword.empty.error", "未设置支付密码"),

	/** 广告开放日期错误 */
	ERROR_ADVERT_DATE(2003, "otc.result.advert.date.error", "广告开放日期错误"),

	/** 广告开放时间错误 */
	ERROR_ADVERT_TIME(2004, "otc.result.advert.time.error", "广告开放时间错误"),
	/** 交易价格设置错误 */
	ERROR_PRICE(2005, "otc.result.price.error", "交易价格设置错误"),

	/** 交易数量设置错误 */
	ERROR_VOLUME(2006, "otc.result.volume.error", "交易数量设置错误"),
	/** 广告信息不存在 */
	ERROR_ADVERT(2007, "otc.result.adver.error", "广告信息不存在"),
	/** 广告发布者信息不存在 */
	ERROR_ADVER_OWNER(2008, "otc.result.adver.owner.error", "广告发布者信息不存在"),
	/** 您不是广告的发布者无法关闭广告 */
	ERROR_ADVER_EQ_OWNER(2009, "otc.result.adver.eq.owner.error", "您不是广告的发布者无法关闭广告"),
	/** 只有发布中的广告才能关闭 */
	ERROR_ADVER_PUBLISHED(2010, "otc.result.adver.published.error", "只有发布中的广告才能关闭"),
	/** 账户余额不足 */
	ERROR_ACCOUNT_BALANCE(2011, "otc.result.account.balance.error", "账户余额不足"),
	/** 账户转账失败 */
	ERROR_ACCOUNT_TRANSFER(2012, "otc.advert.account.transfer.fail.error", "账户转账失败"),
	/** 低于最小交易价格 */
	ERROR_LOW_PRICE(2013, "otc.advert.trade.low.price.error", "低于最小交易价格 "),
	/** 低于最小交易数量 */
	ERROR_LOW_VOLUME(2014, "otc.advert.trade.low.volume.error", "低于最小交易数量 "),
	/** 购买数量大于实际可出售数量 */
	ERROR_CAN_BUY(2015, "otc.advert.trade.can.buy.error", "购买数量大于实际可出售数量"),
	/** 出售数量大于广告剩余数量 */
	ERROR_CAN_SELL(2016, "otc.advert.trade.can.sell.error", "出售数量大于广告剩余数量  "),
	/** 价格浮动，总价格错误 */
	ERROR_TOTAL_PRICE(2017, "otc.advert.trade.total.price.error", "价格浮动，总价格错误  "),
	/** 交易金额不在该广告的单次交易金额范围之内 */
	ERROR_SCOPE_PRICE(2018, "otc.advert.trade.scope.price.error", "交易金额不在该广告的单次交易金额范围之内 "),
	/** 此广告为出售类型广告，无法下出售单 */
	ERROR_ADVERT_SELL(2019, "otc.advert.trade.sell.error", "此广告为出售类型广告，无法下出售单"),
	/** 此广告为购买类型广告，无法下购买单 */
	ERROR_ADVERT_BUY(2020, "otc.advert.trade.buy.error", "此广告为购买类型广告，无法下购买单"),
	/** 您无法跟自己发布的广告交易 */
	ERROR_TRADE_MYSELF(2021, "otc.advert.trade.myself.error", "您无法跟自己发布的广告交易"),
	/** 该广告在交易中或已关闭，无法继续交易 */
	ERROR_ADVERT_INIT(2022, "otc.advert.advert.init.error", "该广告在交易中或已关闭，无法继续交易 "),
	/** 对方要求邮箱认证 */
	ERROR_AUTH_EMAIL(2023, "otc.advert.auth.email.error", "对方要求邮箱认证 "),
	/** 对方要求手机认证 */
	ERROR_AUTH_PHONE(2024, "otc.advert.auth.phone.error", "对方要求手机认证 "),
	/** 对方要进行实名认证C1，请前往个人中心认证 */
	ERROR_AUTH_C1(2025, "otc.advert.auth.c1.error", "对方要进行实名认证C1，请前往个人中心认证 "),
	/** 对方要进行实名认证C2/A2，请前往个人中心认证 */
	ERROR_AUTH_C2(2026, "otc.advert.auth.c2.error", "对方要进行实名认证C2/A2，请前往个人中心认证 "),
	/** 累计交易次数未达到对方要求 */
	ERROR_TRADE_ALL_VOLUME(2027, "otc.trade.all.volume.error", "累计交易次数未达到对方要求"),
	/** 购买者信息不存在 */
	ERROR_TRADE_USER_BUY(2028, "otc.trade.user.buy.error", "购买者信息不存在"),
	/** 订单信息不存在 */
	ERROR_ORDER(2029, "otc.order.error", "订单信息不存在"),
	/** 只有待支付的订单才能取消 */
	ERROR_ORDER_UN_UNPAID(2030, "otc.order.un.unpaid.error", "只有待支付的订单才能取消"),
	/** 没有符合条件的广告 */
	ERROR_ADVERT_NUM(2031, "otc.no.eligible.ads", "没有符合条件的广告"),

	/** 您不是该广告的购买者无法取消该订单 */
	ERROR_ADVERT_NOT_BUYER(2032, "otc.order.not.buyer", "您不是该广告的购买者无法取消该订单"),

	/** 只有已支付的订单才能执行该操作 */
	ERROR_ORDER_PAID(2033, "otc.order.not.paid", "只有已支付的订单才能执行该操作"),

	/** 操作失败 */
	ERROR_ORDER_CANCEL(2034, "otc.order.cancel", "操作失败"),
	/** 您不是该订单的卖家，不能打币 */
	ERROR_ORDER_SELLER(2035, "otc.order.not.seller", "您不是该订单的卖家，不能打币"),
	/** 交易手续费费率不存在 */
	ERROR_TRADE_FEE(2036, "otc.order.trade.fee.error", "交易手续费费率不存在"),
	/** 只能评论自己的订单 */
	ERROR_ORDER_COMMENT(2037, "otc.order.comment", "只能评论自己的订单"),
	/** 不能重复评论同一订单 */
	ERROR_ORDER_COMMENT_REPEAT(2038, "otc.order.comment.repeat", "不能重复评论同一订单"),
	/** 自己的广告不能交易 */
	ERROR_OWN_AD_TRADE(2039, "otc.own.ads.can't.traded", "自己的广告不能交易"),
	/** 广告发布者在黑名单中,不能交易 */
	ERROR_AD_BLACKLIST_TRADE(2040, "otc.own.ads.blacklist.can't.traded", "广告发布者在黑名单中,不能交易"),
	/** 关系类型不正确 */
	ERROR_OTC_RELATION_TYPE(2041, "otc.relation.type", "关系类型不正确"),
	/** 广告开放类型错误 */
	ERROR_OTC_ADVERT_OPEN_TYPE(2042, "otc.advert.open.type", "广告开放类型错误"), 
	/** 单笔最小交易额(金额) */
	ERROR_OTC_MIN_TRADE(2043, "otc.advert.min.trade", "单笔最小交易额设置错误"),
	/** 单笔最大交易额(金额) */
	ERROR_OTC_MAX_TRADE(2044, "otc.advert.max.trade", "单笔最大交易额错误"),
	/** 单笔易额范围设置错误 */
	ERROR_OTC_MAX_TRADE_RANGE(2045, "otc.advert.max.trade.range", "单笔易额范围设置错误"),
	/** 当前广告无法进行交易 */
	ERROR_AD_STATUS(2046, "otc.ad.status.on.init", "当前广告无法进行交易"),
	/** 交易次数限制设置错误 */
	ERROR_AD_DEAL_VOLUME(2047, "otc.ad.deal.volume", "交易次数限制设置错误"),
	/** 签名错误 */
	ERROR_SIGN(2048, "otc.error.sign", "签名错误"),
	/** 不能标记自己 */
	ERROR_RELATION_SIDE(2049 ,"otc.error.relation.side", "不能标记自己"),
	/** 请填写正确的价格 */
	ERROR_ADVERT_PRICE_PARAM(2050 ,"error.advert.price.param", "请填写正确的价格 "),
	/** 请填写支付方式 */
	ERROR_ADVERT_PAYMENT_PARAM(2051 ,"error.advert.payment.param", "请填写支付方式 "),
	/** 价格比率范围需在0到100之间*/
	ERROR_ADVERT_PAYRATE_PARAM(2052 ,"error.advert.payrate.param", "价格比率范围需在0到100之间"),
	/**存在未完成的订单，无法关闭广告*/
	ERROR_ADVERT_ORDERS(2053,"otc.error.advert.order.dealing","存在未完成的订单，无法关闭广告"),
	
	ERROR_FORBID_OPERATIONS_24H(2054, "otc.error.forbid.user.operation", "用户取消订单或订单超时次数超过三次，禁止下单24小时"),
	/**请先进行实名认证 和现货公用文案*/
	RT_PLEASE_DEALNAME_VERIFY(2055,"rtPleaseDealnameVerify","请先进行实名认证"),
	/**请先添加支付方式*/
	ERROR_AD_SELL_NOPAYMENT(2056,"otc.error.ad.sell.nopayment","此广告为出售广告，需要添加支付方式"),
	/** 支付方式已存在 **/
	ERROR_OTC_USER_PAYMENT_EXITS(2057,"otc.user.payment.exits", "支付方式已存在"),
	/** 支付方式已存在 **/
	ERROR_OTC_USER_PAYMENT_NUMBER(2058,"otc.user.payment.number", "最多开启三种支付方式"),
    /**该广告不支持当前选择支付方式**/
	ERROR_PAYMENT_DIFF_ADPAYMENTS(2060, "otc.error.curpayment.diff.adpayments", "买卖双方至少要有一个相同的方支付方式"),
	/**该广告不支持当前选择支付方式**/
	ERROR_PAYMENT_NOT_EXITS(2061, "otc.error.curpayment.not.exits", "提交的支付方式不存在，请添加支付方式"),
	/**价格出现变动，请重新下单**/
	ERROR_ORDER_PRICE(2062, "otc.result.order.error.price", "价格出现变动，请重新下单"),
	/**订单token失效**/
	ORDER_TOKEN_PRICE_ERROR(2063, "order.token.price.error", "订单失效，请重新下单"),
	/**交易被冻结 和现货共用文案*/
	TradeBeLock(2064, "rtTradeBeLock", "交易被冻结"),
	AdvertOwnerTradeBeLock(2065, "rtAdvertOwnerTradeBeLock", "广告所有者交易被冻结"),

	AdvertOverMaxNum(2066, "advertOverMaxNum", "广告超出最大创建数10个"),
	BuyAdvertOverMaxVolume(2067, "buyAdvertOverMaxVolume", "超过求购广告最大数量："),

	AdvertBuyAndSellLimit(2068, "advertBuyAndSellLimit", "广告价格错误，价格区间:"),
	ERROR_ALIVE_ORDER_EXCEED(2069, "otc.error.alive.order.num.exceed", "未完成订单数不能超过%s个！"),
	ERROR_ORDER_OR_ADVERT_NOT_FINISHED(2070, "otc.error.order.or.advert.not.finished", "存在未完成的订单或广告，请先完成交易！"),
	
	ERROR_NON_BLOCK_TRADE_LIMIT(2071, "otc.error.non.block.trade.limit", "普通交易订单限额最大值不能超过%s!"),
	ERROR_BLOCK_TRADE_LIMIT(2072, "otc.error.block.trade.limit", "大宗交易订单限额最小值不能低于%s!"),
	USER_NICKNAME_EXISTS(2073, "user.nick.name.exists", "用户昵称已存在."),
	/**请先设置昵称*/
	RT_PLEASE_NICKNAME_VERIFY(2074, "rtPleaseNicknameVerify", "请先设置昵称"),
    ;

	public int		code;
	public String	languageKey;
	public String	message;

	OtcMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}

	private OtcMessage(int code, String languageKey, String message) {
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

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static String getByCode(int code) {
		for (OtcMessage otcMessage : OtcMessage.values()) {
			if (otcMessage.code - code == 0) {
				return otcMessage.message;
			}
		}

		return "";
	}
}
