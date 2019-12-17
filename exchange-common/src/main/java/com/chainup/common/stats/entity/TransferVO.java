package com.chainup.common.stats.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by mfXing.
 *
 * 转账工具
 *
 */
public class TransferVO {

    // 转出
    @NotNull(message = "uidOut can not be empty")
    @DecimalMin(value = "0")
    private int uidOut; // uid

    @NotNull(message = "typeOut can not be empty")
    @DecimalMin(value = "0")
    private int typeOut; // 账户类型

    @NotBlank(message = "symbolOut can not be empty")
    private String symbolOut; // 币种


    // 转入
    @NotNull(message = "uidIn can not be empty")
    @DecimalMin(value = "0")
    private int uidIn;

    @NotNull(message = "typeIn can not be empty")
    @DecimalMin(value = "0")
    private int typeIn;

    @NotBlank(message = "symbolIn can not be empty")
    private String symbolIn;


    // 转账金额
    @NotNull(message = "money can not be empty")
    @DecimalMin(value = "0")
    private BigDecimal money;


    // 备注
    private String remarks;

    // 转账类型
    private String scene;

    // 操作人
    private int opUid;

    public int getUidOut() {
        return uidOut;
    }

    public void setUidOut(int uidOut) {
        this.uidOut = uidOut;
    }

    public int getTypeOut() {
        return typeOut;
    }

    public void setTypeOut(int typeOut) {
        this.typeOut = typeOut;
    }

    public String getSymbolOut() {
        return symbolOut;
    }

    public void setSymbolOut(String symbolOut) {
        this.symbolOut = symbolOut;
    }

    public int getUidIn() {
        return uidIn;
    }

    public void setUidIn(int uidIn) {
        this.uidIn = uidIn;
    }

    public int getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(int typeIn) {
        this.typeIn = typeIn;
    }

    public String getSymbolIn() {
        return symbolIn;
    }

    public void setSymbolIn(String symbolIn) {
        this.symbolIn = symbolIn;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public int getOpUid() {
        return opUid;
    }

    public void setOpUid(int opUid) {
        this.opUid = opUid;
    }
}
