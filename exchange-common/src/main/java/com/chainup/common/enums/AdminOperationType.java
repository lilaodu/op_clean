package com.chainup.common.enums;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zhangkezhu on 2017/10/23.
 */
public enum AdminOperationType {
    OPERATION_LOG_FREEZE_TRANSACTION(1,"admin.log.freeze.transaction"),
    OPERATION_LOG_UNFREEZE_TRANSACTION(2,"admin.log.unfreeze.transaction"),
    OPERATION_LOG_FREEZE_LOGIN(3,"admin.log.freeze.login"),
    OPERATION_LOG_UNFREEZE_LOGIN(4,"admin.log.unfreeze.login"),
    OPERATION_LOG_FREEZE_WITHDRAW(5,"admin.log.freeze.withdraw"),
    OPERATION_LOG_UNFREEZE_WITHDRAW(6,"admin.log.unfreeze.withdraw"),
    OPERATION_LOG_MODIY_MOBILE(7,"admin.log.modiy.mobile"),
    OPERATION_LOG_MODIY_ASSETS(8,"admin.log.modiy.assets"),
    OPERATION_LOG_MODIY_ACCOUNT(9,"admin.log.modiy.account"),
    OPERATION_LOG_MODIY_VIP(10,"admin.log.modiy.vip");

    public Integer value; //操作类型
    public String nickType;//字段名字

    AdminOperationType(Integer value, String nickType) {
        this.value = value;
        this.nickType = nickType;
    };

    public Integer getValue() {
        return value;
    }




    public void setValue(Integer value) {
        this.value = value;
    }




    public String getNickType() {
        return nickType;
    }




    public void setNickType(String nickType) {
        this.nickType = nickType;
    }


    public static AdminOperationType fromValue(int value) {
        for (AdminOperationType t : AdminOperationType.values()) {
            if (t.value.equals(value)) {
                return t;
            }
        }
        return null;
    }

}
