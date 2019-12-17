package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.List;

public enum CoinSymbolOtc {
	GDT("gdt",1,"GDT","GDT","/res/img/coin/gdt.png","gdt"),
    USDT("usdt",1,"美元代币","TetherUS","/res/img/coin/usdt.png","usdt"),
    BTC("btc",1,"BITCOIN","Bitcoin","/res/img/coin/btc.png","btc"),
    ETH("eth",1,"以太坊","Ethereum","/res/img/coin/eth.png","eth"),
    EOS("eos",1,"EOS","EOS","/res/img/coin/eos.png","eos"),
    ;

    public String value;
    public int status;//1启用 0停用
    public String description;//描述
    public String showName;//前台展示名称
    public String img;//logo
    public String assetCoin;//币种资产币种，那种类型资产用那种资产充值

    CoinSymbolOtc(String value, int status, String description, String showName, String img, String assetCoin) {
        this.value = value;
        this.status = status;
        this.description = description;
        this.showName = showName;
        this.img = img;
        this.assetCoin = assetCoin;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public String getAssetCoin() {
        return assetCoin;
    }

    public void setAssetCoin(String assetCoin) {
        this.assetCoin = assetCoin;
    }

    public static List<CoinSymbolOtc> getStartCoinSymbolOtc(){
        ArrayList<CoinSymbolOtc> coinList = new ArrayList<>();
        for (CoinSymbolOtc coinSymbolOtc : CoinSymbolOtc.values()) {
            if (coinSymbolOtc.status==1) {
                coinList.add(coinSymbolOtc);
            }
        }
        return coinList;
    }


}

