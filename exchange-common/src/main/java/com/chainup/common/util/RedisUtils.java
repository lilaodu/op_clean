package com.chainup.common.util;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis工具类
 * @author zhongjingyun 
 *
 */
public class RedisUtils {
	
	public static void setValue(String key,String value,long expireTime,RedisTemplate<Serializable, Serializable> redisTemplate) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override  
	        public Object doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
	            connection.set(key.getBytes(),value.getBytes()); 
	            connection.expire(key.getBytes(), expireTime);
	            return null;
	        }
		});
	}
	
	public static String  getValue(String key,RedisTemplate<Serializable, Serializable> redisTemplate) {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override  
	        public String doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
				byte[] value = connection.get(key.getBytes());  
				if(value != null) {
					return new String(value);
				}
				return null;
	        }
		});
	}
	
	public static void deleteValue(String key,RedisTemplate<Serializable, Serializable> redisTemplate) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override  
	        public Object doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
				if(connection.exists(key.getBytes())) {
					connection.del(key.getBytes());
				}
	            return null;
	        }
		});
	}

}
