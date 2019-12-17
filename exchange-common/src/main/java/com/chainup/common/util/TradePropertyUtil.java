package com.chainup.common.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 加载交易对限制参数
 * @author zhongjingyun 2017-09-26
 *
 */
public class TradePropertyUtil {
    private static final Logger logger = LoggerFactory.getLogger(TradePropertyUtil.class);
    private static Properties props;
    public static final String OPEN_MARKETS_LIMIT_MIN = "open_markets.limit_min.";
    public static final String OPEN_MARKETS_LIMIT_MIN_PRICE = "open_markets.limit_min_price.";
    public static final String OPEN_MARKETS_MARKET_BUY_MIN = "open_markets.market_buy_min.";
    public static final String OPEN_MARKETS_MARKET_SELL_MIN = "open_markets.market_sell_min.";
    public static final String OPEN_COINS_WITHDRAW_ONE_MIN = "open_coins.withdraw_one_min.";
    public static final String OPEN_COINS_WITHDRAW_ONE_MAX = "open_coins.withdraw_one_max.";
    public static final String OPEN_MARKETS_DEPTH_SELECT = "open_markets.depth.select.";
    public static final String OPEN_MARKETS_DEPTH_RENDER = "open_markets.depth.render.";
    public static final String OPEN_COINS_WITHDRAW_FEE_MIN = "open_coins.withdraw_fee_min.";
    public static final String OPEN_COINS_CONFIRM = "open_coins.confirm.";

    static{
        loadProps();
    }

    synchronized static private void loadProps(){
        logger.info("开始加载properties文件内容.......");
        props = new Properties();
        InputStream in = null;
        try {
            in = PropertyUtil.class.getClassLoader().getResourceAsStream("trade.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            logger.error("jdbc.properties文件未找到");
        } catch (IOException e) {
            logger.error("出现IOException");
        } finally {
            try {
                if(null != in) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error("jdbc.properties文件流关闭出现异常");
            }
        }
        logger.info("加载properties文件内容完成...........");
        logger.info("properties文件内容：" + props);
    }

    public static String getProperty(String key){
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        if(null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }
}
