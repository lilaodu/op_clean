package com.chainup.common.web.wallet;

import java.math.BigDecimal;
import java.util.Date;

public class DepositCrypto {
    private Integer id;

    private Integer uid;

    private String symbol;

    private BigDecimal amount;

    private BigDecimal fee;

    private Date createdAt;

    private Date updatedAt;

    private String addressTo;

    private String txid;

    private Integer confirmations;

    private Byte isMining;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo == null ? null : addressTo.trim();
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid == null ? null : txid.trim();
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public Byte getIsMining() {
        return isMining;
    }

    public void setIsMining(Byte isMining) {
        this.isMining = isMining;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DepositCrypto{" +
                "id=" + id +
                ", uid=" + uid +
                ", symbol=" + symbol +
                ", amount=" + amount +
                ", fee=" + fee +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", addressTo='" + addressTo + '\'' +
                ", txid='" + txid + '\'' +
                ", confirmations=" + confirmations +
                ", isMining=" + isMining +
                ", status=" + status +
                '}';
    }
}