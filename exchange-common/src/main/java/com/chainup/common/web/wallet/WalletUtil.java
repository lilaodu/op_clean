package com.chainup.common.web.wallet;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.fastjson.JSON;
import com.chainup.common.exchange.entity.UserLoginFail;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.StringUtil;

public class WalletUtil {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired  
	protected static RedisTemplate<Serializable, Serializable> redisTemplate;
	
	/**
	 * 获取与钱包token
	 * @return token
	 */
	public static String getToken(String symbol) {
//		String token  = get("wallet_token_key_"+symbol);
//		if(token==null || "".equals(token)) {
			//获取token的url
			String walletTokenUrl = PropertyUtil.getProperties("wallet_token_"+symbol.toLowerCase()); 
			String doGetWithJsonResult = WalletClient.getInstance().doGetWithJsonResult(walletTokenUrl);
			WalletToken walletToken = JSON.parseObject(doGetWithJsonResult, WalletToken.class);
			String	token = walletToken.getData().getToken();
//			set("wallet_token_key_"+symbol, token,864000l);  //reids中存储10天
//		}
		return token;
	}
	
	public static String getWalletUrl(String symbol) {
		return  PropertyUtil.getProperties("wallet_url_"+symbol.toLowerCase());
		
	}
	
	/**
	 * 获取地址
	 * @return
	 */
	public static String getDepositAddress(String symbol,String uid){
		String token = getToken(symbol);
		String walletUrl = getWalletUrl(symbol); 
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("username",uid);
		String doPostWithJsonResult = 
				WalletClient.getInstance().doPostWithJsonResult(walletUrl+"/"+symbol.toLowerCase()+"/account?token="+token,requestMap);
		WalletNewAddress walletNewAddress = JSON.parseObject(doPostWithJsonResult, WalletNewAddress.class);
		return walletNewAddress.getData().getAddress();
	}
	
	/**
	 * 转账(打币)
	 * @param fromAddr  出账地址
	 * @param toAddr    到账地址
	 * @param money     金额
	 * @param symbol	币种
	 * @return
	 */
	public static WalletTransfer send(String fromAddr, String toAddr, String money, String symbol) {
		String token = getToken(symbol);
		String walletUrl = getWalletUrl(symbol);
		Map<String, String> requestMap = new HashMap<String, String>();
		if(!"NRC".equalsIgnoreCase(symbol)) {
			requestMap.put("from", fromAddr);
		}
		requestMap.put("to", toAddr);
		requestMap.put("value", money);
		String doPostWithJsonResult = WalletClient.getInstance().doPostWithJsonResult(walletUrl+"/"+symbol.toLowerCase()+ "/send?token="+token,
				requestMap);
		WalletTransfer javaObject4 = JSON.parseObject(doPostWithJsonResult, WalletTransfer.class);
		return javaObject4;
	}
	
	/**
     * 通过txid查询确认数
     * @param txid		要查询的txid（充值记录中的txid）
     * @param symbol	币种
     * @return
     */
 	public static WalletTxidQuery getConfirm(String txid, String symbol) {
 		String token = getToken(symbol);
 		String walletUrl = getWalletUrl(symbol);
 		Map<String, String> requestMap = new HashMap<String, String>();
 		requestMap.put("token", token);
 		String url = buildUrln(requestMap);
 		String doGetWithJsonResult = WalletClient.getInstance()
 				.doGetWithJsonResult(walletUrl+"/"+symbol.toLowerCase()+ "/tx/" + txid + "?" + url);
 		return JSON.parseObject(doGetWithJsonResult, WalletTxidQuery.class);		 
 	}
    

    
    /**
     * 获取用户钱包中所有的充值记录
     * @param addr 		要查询的地址
     * @param symbol	币种
     * @return
     */
    public static WalletDealQuery getWalletTrade(String addr, String symbol) {
    	String token = getToken(symbol);
    	String walletUrl = getWalletUrl(symbol);
    	Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("token", token);
		String url = buildUrln(requestMap);
		String doGetWithJsonResult = WalletClient.getInstance()
				.doGetWithJsonResult(walletUrl+"/"+symbol.toLowerCase()+ "/address/" + addr + "?" + url);
		return JSON.parseObject(doGetWithJsonResult, WalletDealQuery.class);
    }
    
    
	/**
	 * 获取钱包地址余额
	 * @param addr   要查询的地址
	 * @param symbol 币种
	 * @return
	 */
	public static WalletBalance getWalletAddressBalance(String addr, String symbol) {
		String token = getToken(symbol);
		String walletUrl = getWalletUrl(symbol);
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("token", token);
		String url = buildUrln(requestMap);
		String doGetWithJsonResult = WalletClient.getInstance()
				.doGetWithJsonResult(walletUrl+"/"+symbol.toLowerCase()+ "/balance/" + addr + "?" + url);
		return JSON.parseObject(doGetWithJsonResult, WalletBalance.class);
	}
	
	/**
	 * 调用finance提币
	 * @param trans_id
	 * @param symbol
	 * @param address_to
	 * @param txid
	 * @param amount
	 * @param confirm
	 */
	public static WalletDepositBean getFinanceWithdrawNotify(String trans_id,String symbol,String address_to,String txid,String amount,String confirm) {
		String financeDepositUrl = PropertyUtil.getProperties("finance_withdraw_notify_url");
		Map<String, String> paramsMap = new HashMap<String, String>();
        String appid = PropertyUtil.getProperties("wallet.appid");
        String appSecret = PropertyUtil.getProperties("wallet.appsecret");
        paramsMap.put("trans_id", trans_id);
        paramsMap.put("symbol", symbol);
        paramsMap.put("address_to", address_to);
        paramsMap.put("txid", txid);
        paramsMap.put("amount", amount);
        paramsMap.put("confirm", confirm);
        paramsMap.put("app_id", appid);
        String sign = SignUtil.sign(paramsMap, appSecret);
		paramsMap.put("sign", sign);
		String jsonString = JSON.toJSONString(paramsMap);
		String doPostWithJsonResult = WalletClient.getInstance().doPostWithJsonResult(financeDepositUrl, jsonString);
		return JSON.parseObject(doPostWithJsonResult, WalletDepositBean.class);
	}
	
	
	
    /**
     * 调用finance充值通知接口
     * @param symbol  	 币种
     * @param address   充值地址
     * @param timestamp 充值时间
     * @param txid 		充值txid
     * @param amount  	充值数量
     * @param confirm  	充值确认数
     */
    public static WalletDepositBean getFinanceDepositNotify(String symbol,String address,String timestamp,String txid,String depositMoney,String confirm) {
    	String financeDepositUrl = PropertyUtil.getProperties("finance_deposit_notify_url");
		Map<String, String> paramsMap = new HashMap<String, String>();
        String appid = PropertyUtil.getProperties("wallet.appid");
        String appSecret = PropertyUtil.getProperties("wallet.appsecret");
		paramsMap.put("app_id", appid);
		paramsMap.put("timestamp", timestamp);
		paramsMap.put("symbol", symbol);
		paramsMap.put("address_to", address);
		paramsMap.put("txid", txid);
		paramsMap.put("amount", depositMoney);
		paramsMap.put("confirm", confirm);
		paramsMap.put("is_mining", "0");
		String sign = SignUtil.sign(paramsMap, appSecret);
		paramsMap.put("sign", sign);
		String jsonString = JSON.toJSONString(paramsMap);
		String doPostWithJsonResult = WalletClient.getInstance().doPostWithJsonResult(financeDepositUrl, jsonString);
		return JSON.parseObject(doPostWithJsonResult, WalletDepositBean.class);
    }
	
	/**
	 * get请求组拼querystring
	 * 参数按字典排序，并按"key=value&"格式拼接在一起
	 * @param requestMap
	 * @return
	 */
	private static String buildUrln(Map<String, String> requestMap) {
		// 先将参数以其参数名的字典序升序进行排序
		Map<String, String> sortedParams = new TreeMap<String, String>(requestMap);
		Set<Entry<String, String>> entrys = sortedParams.entrySet();
		// 遍历排序后的字典，将所有参数按"key=value&"格式拼接在一起
		StringBuilder basestring = new StringBuilder();
		for (Entry<String, String> param : entrys) {
			if (!StringUtil.isNullOrEmpty(param.getValue())) {
				basestring.append(param.getKey());
				basestring.append("=");
				basestring.append(param.getValue().toString());
				basestring.append("&");
			}
		}
		if (basestring.length() > 0) {
			return basestring.substring(0, basestring.length() - 1);
		}
		return null;
	}
	
	/**
	 * 从redis中取值
	 * @param redisKey
	 * @return
	 */
//	protected static String get(String redisKey) {		
//		return redisTemplate.execute(new RedisCallback<String>() {
//			@Override  
//	        public String doInRedis(RedisConnection connection)  
//	                throws DataAccessException {  
//				byte[] key = redisKey.getBytes();
//	            byte[] value = connection.get(key);  
//	            if (value==null) {
//					return null;
//				}
//	            return new String(value);
//	        }
//		});
//	}
	
	/**
	 * 向redis中写值
	 * @param redisKey
	 * @return
	 */
//	protected static void set(String redisKey, String value, Long expireTime) {		
//		redisTemplate.execute(new RedisCallback<String>() {
//			@Override  
//			public String doInRedis(RedisConnection connection)  
//					throws DataAccessException {  
//				connection.set(redisKey.getBytes(),value.getBytes());
//				connection.expire(redisKey.getBytes(), expireTime);
//				return null;  
//			}
//		});
//	}

	/**
	 * 向redis中写值
	 * 将 key 的值设为 value ，当且仅当 key 不存在
	 * @param redisKey
	 * @return
	 */
//	protected Boolean setNX(String redisKey, String value) {
//		return redisTemplate.execute(new RedisCallback<Boolean>() {
//			@Override
//			public Boolean doInRedis(RedisConnection connection)
//					throws DataAccessException {
//				return connection.setNX(redisKey.getBytes(),value.getBytes());
//			}
//		});
//
//	}


	/**
	 * delete redis中对应的key
	 * @param redisKey
	 */
//	protected void del(final String redisKey) {
//		redisTemplate.execute(new RedisCallback<UserLoginFail>() {
//			@Override  
//	        public UserLoginFail doInRedis(RedisConnection connection)  
//	                throws DataAccessException {  
//				byte[] key = redisKey.getBytes();
//			 	if(connection.exists(key)) {
//			 		connection.del(key);
//			 	}
//			 	return null;
//	        }
//		});
//	}
	
}
