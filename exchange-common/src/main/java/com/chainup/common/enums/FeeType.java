package com.chainup.common.enums;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

/**
 * ex_fee表，费用类型 Created by nob
 */
public enum FeeType {
    TRADE_MAKER_VIP0(100, "挂单（maker）手续费", 0),
    TRADE_MAKER_VIP1(101, "VIP1", 0),
    TRADE_MAKER_VIP2(102, "VIP2", 0),
    TRADE_MAKER_VIP3(103, "VIP3", 0),
    TRADE_MAKER_VIP4(104, "VIP4", 0),
    TRADE_MAKER_VIP5(105, "VIP5", 0),
    TRADE_MAKER_VIP6(106, "VIP6", 0),
    TRADE_MAKER_VIP7(107, "VIP7", 0),
    TRADE_MAKER_VIP8(108, "VIP8", 0),
    TRADE_MAKER_VIP9(109, "VIP9", 0),

    TRADE_TAKER_VIP0(200, "吃单（taker）手续费", 0),
    TRADE_TAKER_VIP1(201, "VIP1", 0),
    TRADE_TAKER_VIP2(202, "VIP2", 0),
    TRADE_TAKER_VIP3(203, "VIP3", 0),
    TRADE_TAKER_VIP4(204, "VIP4", 0),
    TRADE_TAKER_VIP5(205, "VIP5", 0),
    TRADE_TAKER_VIP6(206, "VIP6", 0),
    TRADE_TAKER_VIP7(207, "VIP7", 0),
    TRADE_TAKER_VIP8(208, "VIP8", 0),
    TRADE_TAKER_VIP9(209, "VIP9", 0),


    // 法币充值：平台收取用户手续费
    DEPOSIT_USER_RATE(300, "充值：平台收取用户手续费率", 0), //每笔超过min额度收取费率
    DEPOSIT_USER_RATE_AMOUNT(301, "充值：平台按照比率收取手续费起始额度", 0), //按费率收取额度
    DEPOSIT_USER_MIN_AMOUNT(302, "充值：平台最低收费金额", 0), //最低收费额度

    // 法币充值：支付给充值通道的手续费
    DEPOSIT_CHANNEL_RATE(400, "充值：通道手续费率", 0),
    DEPOSIT_CHANNEL_RATE_AMOUNT(401, "充值：通道手续费起始额度", 0),
    DEPOSIT_CHANNEL_MIN_AMOUNT(402, "充值：通道最低收费金额", 0),

    // 法币提现：平台收取用户手续费
    WITHDRAW_USER_RATE(500, "提现：平台收取用户手续费率", 0),
    WITHDRAW_USER_RATE_AMOUNT(501, "提现：平台按照比率收取手续费起始额度", 0),
    WITHDRAW_USER_MIN_AMOUNT(502, "提现：平台最低收费金额", 0),

    // 法币提现：支付给充值通道的手续费
    WITHDRAW_CHANNEL_RATE(600, "提现：通道手续费率", 0),
    WITHDRAW_CHANNEL_RATE_AMOUNT(601, "提现：通道手续费起始额度", 0),
    WITHDRAW_CHANNEL_MIN_AMOUNT(602, "提现：通道最低收费金额", 0),

    // 数字货币提现
    DIGICCY_MIN_AMOUNT(900,"提现：最小提币手续费",0),
    DIGICCY_MAX_AMOUNT(901,"提现：最大提币手续费",0),
    DIGICCY_DEFAULT_AMOUNT(902,"提现：默认提币手续费",0),
     /**场外交易手最高续费*/
    OTC_TRADE_FEE_MAX(700, "提现：场外交易手最高续费",0),
    ;

    public Integer value;
    public String description;//账户类型描述
    public Integer isRate;//0：费率； 1：最小收取金额

    private FeeType(Integer value, String description, Integer isRate) {
        this.value = value;
        this.description = description;
        this.isRate = isRate;
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

    public static FeeType fromValue(Integer value) {
        for (FeeType t : FeeType.values()) {
            if (t.value.equals(value)) {
                return t;
            }
        }
        return null;
    }

    public static FeeType fromName(String name) {
        if (name == null) {
            return null;
        }
        for (FeeType t : FeeType.values()) {
            if (t.name().equalsIgnoreCase(name.trim())) {
                return t;
            }
        }
        return null;
    }
    /**
     * 场外手续费枚举类型
     *
     * @return
     */
    public static List<Integer> getOtcFeeTypes() {
        List<Integer> feeTypes = Lists.newArrayList();
        feeTypes.add(OTC_TRADE_FEE_MAX.value);
        return feeTypes;
    }
}
