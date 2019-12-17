package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.List;


public enum MessageQueue {
	market_btcgdt_depth_step0("market_btcgdt_depth_step0",0),
	market_btcgdt_depth_step1("market_btcgdt_depth_step1",0),
	market_btcgdt_depth_step2("market_btcgdt_depth_step2",0),
	market_btcgdt_kline_1min("market_btcgdt_kline_1min", 1),
	market_btcgdt_kline_5min("market_btcgdt_kline_5min", 5),
	market_btcgdt_kline_15min("market_btcgdt_kline_15min", 15),
	market_btcgdt_kline_30min("market_btcgdt_kline_30min", 30),
	market_btcgdt_kline_60min("market_btcgdt_kline_60min", 60),
	market_btcgdt_kline_1day("market_btcgdt_kline_1day", 24*60),
	market_btcgdt_kline_1week("market_btcgdt_kline_1week",7*24*60),
	market_btcgdt_kline_1month("market_btcgdt_kline_1month",30*24*60),
	market_btcgdt_ticker("market_btcgdt_ticker",0),
	market_btcgdt_trade_ticker("market_btcgdt_trade_ticker",0),
	
	market_ethgdt_depth_step0("market_ethgdt_depth_step0",0),
	market_ethgdt_depth_step1("market_ethgdt_depth_step1",0),
	market_ethgdt_depth_step2("market_ethgdt_depth_step2",0),
	market_ethgdt_kline_1min("market_ethgdt_kline_1min", 1),
	market_ethgdt_kline_5min("market_ethgdt_kline_5min", 5),
	market_ethgdt_kline_15min("market_ethgdt_kline_15min", 15),
	market_ethgdt_kline_30min("market_ethgdt_kline_30min", 30),
	market_ethgdt_kline_60min("market_ethgdt_kline_60min", 60),
	market_ethgdt_kline_1day("market_ethgdt_kline_1day", 24*60),
	market_ethgdt_kline_1week("market_ethgdt_kline_1week",7*24*60),
	market_ethgdt_kline_1month("market_ethgdt_kline_1month",30*24*60),
	market_ethgdt_ticker("market_ethgdt_ticker",0),
	market_ethgdt_trade_ticker("market_ethgdt_trade_ticker",0),
	
	market_usdtgdt_depth_step0("market_usdtgdt_depth_step0",0),
	market_usdtgdt_depth_step1("market_usdtgdt_depth_step1",0),
	market_usdtgdt_depth_step2("market_usdtgdt_depth_step2",0),
	market_usdtgdt_kline_1min("market_usdtgdt_kline_1min", 1),
	market_usdtgdt_kline_5min("market_usdtgdt_kline_5min", 5),
	market_usdtgdt_kline_15min("market_usdtgdt_kline_15min", 15),
	market_usdtgdt_kline_30min("market_usdtgdt_kline_30min", 30),
	market_usdtgdt_kline_60min("market_usdtgdt_kline_60min", 60),
	market_usdtgdt_kline_1day("market_usdtgdt_kline_1day", 24*60),
	market_usdtgdt_kline_1week("market_usdtgdt_kline_1week",7*24*60),
	market_usdtgdt_kline_1month("market_usdtgdt_kline_1month",30*24*60),
	market_usdtgdt_ticker("market_usdtgdt_ticker",0),
	market_usdtgdt_trade_ticker("market_usdtgdt_trade_ticker",0),
	
	market_eosgdt_depth_step0("market_eosgdt_depth_step0",0),
	market_eosgdt_depth_step1("market_eosgdt_depth_step1",0),
	market_eosgdt_depth_step2("market_eosgdt_depth_step2",0),
	market_eosgdt_kline_1min("market_eosgdt_kline_1min", 1),
	market_eosgdt_kline_5min("market_eosgdt_kline_5min", 5),
	market_eosgdt_kline_15min("market_eosgdt_kline_15min", 15),
	market_eosgdt_kline_30min("market_eosgdt_kline_30min", 30),
	market_eosgdt_kline_60min("market_eosgdt_kline_60min", 60),
	market_eosgdt_kline_1day("market_eosgdt_kline_1day", 24*60),
	market_eosgdt_kline_1week("market_eosgdt_kline_1week",7*24*60),
	market_eosgdt_kline_1month("market_eosgdt_kline_1month",30*24*60),
	market_eosgdt_ticker("market_eosgdt_ticker",0),
	market_eosgdt_trade_ticker("market_eosgdt_trade_ticker",0),
	
	market_xrpgdt_depth_step0("market_xrpgdt_depth_step0",0),
	market_xrpgdt_depth_step1("market_xrpgdt_depth_step1",0),
	market_xrpgdt_depth_step2("market_xrpgdt_depth_step2",0),
	market_xrpgdt_kline_1min("market_xrpgdt_kline_1min", 1),
	market_xrpgdt_kline_5min("market_xrpgdt_kline_5min", 5),
	market_xrpgdt_kline_15min("market_xrpgdt_kline_15min", 15),
	market_xrpgdt_kline_30min("market_xrpgdt_kline_30min", 30),
	market_xrpgdt_kline_60min("market_xrpgdt_kline_60min", 60),
	market_xrpgdt_kline_1day("market_xrpgdt_kline_1day", 24*60),
	market_xrpgdt_kline_1week("market_xrpgdt_kline_1week",7*24*60),
	market_xrpgdt_kline_1month("market_xrpgdt_kline_1month",30*24*60),
	market_xrpgdt_ticker("market_xrpgdt_ticker",0),
	market_xrpgdt_trade_ticker("market_xrpgdt_trade_ticker",0),
	
	market_adigdt_depth_step0("market_adigdt_depth_step0",0),
	market_adigdt_depth_step1("market_adigdt_depth_step1",0),
	market_adigdt_depth_step2("market_adigdt_depth_step2",0),
	market_adigdt_kline_1min("market_adigdt_kline_1min", 1),
	market_adigdt_kline_5min("market_adigdt_kline_5min", 5),
	market_adigdt_kline_15min("market_adigdt_kline_15min", 15),
	market_adigdt_kline_30min("market_adigdt_kline_30min", 30),
	market_adigdt_kline_60min("market_adigdt_kline_60min", 60),
	market_adigdt_kline_1day("market_adigdt_kline_1day", 24*60),
	market_adigdt_kline_1week("market_adigdt_kline_1week",7*24*60),
	market_adigdt_kline_1month("market_adigdt_kline_1month",30*24*60),
	market_adigdt_ticker("market_adigdt_ticker",0),
	market_adigdt_trade_ticker("market_adigdt_trade_ticker",0),
	
	market_ltcgdt_depth_step0("market_ltcgdt_depth_step0",0),
	market_ltcgdt_depth_step1("market_ltcgdt_depth_step1",0),
	market_ltcgdt_depth_step2("market_ltcgdt_depth_step2",0),
	market_ltcgdt_kline_1min("market_ltcgdt_kline_1min", 1),
	market_ltcgdt_kline_5min("market_ltcgdt_kline_5min", 5),
	market_ltcgdt_kline_15min("market_ltcgdt_kline_15min", 15),
	market_ltcgdt_kline_30min("market_ltcgdt_kline_30min", 30),
	market_ltcgdt_kline_60min("market_ltcgdt_kline_60min", 60),
	market_ltcgdt_kline_1day("market_ltcgdt_kline_1day", 24*60),
	market_ltcgdt_kline_1week("market_ltcgdt_kline_1week",7*24*60),
	market_ltcgdt_kline_1month("market_ltcgdt_kline_1month",30*24*60),
	market_ltcgdt_ticker("market_ltcgdt_ticker",0),
	market_ltcgdt_trade_ticker("market_ltcgdt_trade_ticker",0),
	
	market_gdtusdt_depth_step0("market_gdtusdt_depth_step0",0),
	market_gdtusdt_depth_step1("market_gdtusdt_depth_step1",0),
	market_gdtusdt_depth_step2("market_gdtusdt_depth_step2",0),
	market_gdtusdt_kline_1min("market_gdtusdt_kline_1min", 1),
	market_gdtusdt_kline_5min("market_gdtusdt_kline_5min", 5),
	market_gdtusdt_kline_15min("market_gdtusdt_kline_15min", 15),
	market_gdtusdt_kline_30min("market_gdtusdt_kline_30min", 30),
	market_gdtusdt_kline_60min("market_gdtusdt_kline_60min", 60),
	market_gdtusdt_kline_1day("market_gdtusdt_kline_1day", 24*60),
	market_gdtusdt_kline_1week("market_gdtusdt_kline_1week",7*24*60),
	market_gdtusdt_kline_1month("market_gdtusdt_kline_1month",30*24*60),
	market_gdtusdt_ticker("market_gdtusdt_ticker",0),
	market_gdtusdt_trade_ticker("market_gdtusdt_trade_ticker",0),
	
	
    ;
    
    private final String name;
    private final int time;
    
    private MessageQueue(String name, int time) {
        this.name = name;
        this.time = time;
    }
    
    public String getName() {
        return name;
    }
    

	public static MessageQueue getInsByname(String name) {
        for (MessageQueue lma: MessageQueue.values()) {
            if (lma.getName().equals(name)) {
                return lma;
            }
        }
        return null;
    }

    public static MessageQueue getIns(String name) {
        try {
            return MessageQueue.valueOf(name);
        } catch (Exception ex) {
            return null;
        }
    }

	public int getTime() {
		return time;
	}
	
	public static List<String> getExchangeList(){
	   	List<String> exchangeList = new ArrayList<String>();
	   	for (MessageQueue queue : MessageQueue.values()) {
	   		exchangeList.add(queue.name);
		}
	   	return exchangeList;
	}
    

}
