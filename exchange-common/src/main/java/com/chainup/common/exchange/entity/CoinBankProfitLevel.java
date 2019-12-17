package com.chainup.common.exchange.entity;

import java.math.BigDecimal;

public class CoinBankProfitLevel {
    private Integer id;

    private Byte level;

    private BigDecimal profitPercent;

    private BigDecimal computeAmount;

    private Integer projectAmount;

    private Integer registerAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(BigDecimal profitPercent) {
        this.profitPercent = profitPercent;
    }

    public BigDecimal getComputeAmount() {
        return computeAmount;
    }

    public void setComputeAmount(BigDecimal computeAmount) {
        this.computeAmount = computeAmount;
    }

    public Integer getProjectAmount() {
        return projectAmount;
    }

    public void setProjectAmount(Integer projectAmount) {
        this.projectAmount = projectAmount;
    }

    public Integer getRegisterAmount() {
        return registerAmount;
    }

    public void setRegisterAmount(Integer registerAmount) {
        this.registerAmount = registerAmount;
    }
}