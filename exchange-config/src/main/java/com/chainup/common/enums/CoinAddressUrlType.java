package com.chainup.common.enums;

/**
 * 
 */
public enum CoinAddressUrlType {
    BTC("BTC","https://blockchain.info/address/","https://blockchain.info/tx/"),
    ETH("ETH","https://etherchain.org/account/","https://etherchain.org/tx/"),
    USDT("USDT","http://omnichest.info/lookupadd.aspx?address=","http://omnichest.info/lookuptx.aspx?txid="),
	EOS("EOS","https://explorer.eosvibes.io/account/","https://explorer.eosvibes.io/tx/"),
	XRP("XRP","https://etherchain.org/account/","https://etherchain.org/tx/"),
	GDT("GDT","https://etherchain.org/account/","https://etherchain.org/tx/"),
	ADI("ADI","https://etherchain.org/account/","https://etherchain.org/tx/"),
	LTC("LTC","http://explorer.litecoin.net/address/","http://explorer.litecoin.net/tx/"),
	;

    public String value;
    public String address;
    public String tx;

    private CoinAddressUrlType(String value, String address, String tx) {
        this.value = value;
        this.address = address;
        this.tx = tx;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAddress(){ return address;}

    public void setAddress(String address){ this.address = address;}

    public String getTx(){ return tx;}

    public void setTx(String tx){ this.tx = tx;}

    public static CoinAddressUrlType fromValue(String value) {
        for (CoinAddressUrlType t : CoinAddressUrlType.values()) {
            if (t.value.equalsIgnoreCase(value)) {
                return t;
            }
        }
        return null;
    }
}
