package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangkezhu on 2017/12/13.
 */
public enum UserMessageType {
    //1-系统消息 2-充值提现 3-安全消息 4-认证消息 5-爆仓消息 6-减仓消息',
    SYSTEM_MESSAGE(1, "系统消息"),
    DEPOSIT_WIThDRAW_MESSAGE(2, "充值提现"),
    SECURED_MESSAGE(3, "安全消息"),
    AUTH_MESSAGE(4, "认证消息"),
    OVERBOOK(5, "爆仓消息"),
    LIGHTEN(6, "减仓消息"),
    OTC_MESSAGE(7, "场外消息"),
    
    ;

    public int value;
    public String description;

    UserMessageType(int value, String description) {
        this.value = value;
        this.description = description;
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

    //所有的消息类型
    public static List<Map> getAllTypes() {
        List typesList = new ArrayList<>();
        for (UserMessageType t : UserMessageType.values()) {
            Map Types = new HashMap();
            Types.put("id",t.value);
            Types.put("desc",t.description);
            typesList.add(Types);
        }
        return typesList;
    }
}
