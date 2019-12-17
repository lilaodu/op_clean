package com.chainup.common.exchange.entity;

public class IecProjectUserWithBLOBs extends IecProjectUser {
    private String matchNumberList;

    private String winNumberList;

    public String getMatchNumberList() {
        return matchNumberList;
    }

    public void setMatchNumberList(String matchNumberList) {
        this.matchNumberList = matchNumberList == null ? null : matchNumberList.trim();
    }

    public String getWinNumberList() {
        return winNumberList;
    }

    public void setWinNumberList(String winNumberList) {
        this.winNumberList = winNumberList == null ? null : winNumberList.trim();
    }
}