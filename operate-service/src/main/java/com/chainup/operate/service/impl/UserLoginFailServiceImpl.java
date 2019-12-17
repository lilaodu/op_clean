package com.chainup.operate.service.impl;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserLoginFail;
import com.chainup.operate.service.UserLoginFailService;
import com.chainup.common.util.PropertyUtil;

@Service
public class UserLoginFailServiceImpl implements UserLoginFailService{
	private final static String REDIS_PRE_KEY = "user.username.";	//redis中key前缀
	private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired  
	private RedisTemplate<Serializable, Serializable> redisTemplate;
	
	@Override
	public UserLoginFail add(String username) {
		UserLoginFail userLoginFail = find(username);
		Long curTime = System.currentTimeMillis();
		String day = sdf.format(new Date());
		if(userLoginFail != null && day.equals(userLoginFail.getDay())) {
			userLoginFail.setCount(userLoginFail.getCount()+1);
			userLoginFail.setLastLoginTime(curTime);
		}
		else {
			userLoginFail = new UserLoginFail();
			userLoginFail.setUsername(username);
			userLoginFail.setLastLoginTime(curTime);
			userLoginFail.setCount(1);
			userLoginFail.setDay(day);
		}
		
		final UserLoginFail fail = userLoginFail;
		return redisTemplate.execute(new RedisCallback<UserLoginFail>() {
			@Override  
	        public UserLoginFail doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
				byte[] key = (REDIS_PRE_KEY + fail.getUsername()).getBytes();
	            connection.set(key,  
	                    JSON.toJSONString(fail).getBytes());  
	            return fail;  
	        }
		});
	}

	@Override
	public UserLoginFail find(final String username) {
		return redisTemplate.execute(new RedisCallback<UserLoginFail>() {
			@Override  
	        public UserLoginFail doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
			 	byte[] key = (REDIS_PRE_KEY + username).getBytes();
			 	if(connection.exists(key)) {
			 		byte[] value = connection.get(key);  
		            UserLoginFail userLoginFail = JSON.parseObject(value, UserLoginFail.class);
		            String day = sdf.format(new Date());
		            if(!day.equals(userLoginFail.getDay())) {//已经过了一天 清除缓存
		            	connection.del(key);
		    			return null;
		            }
		            
		            Long curTime = System.currentTimeMillis();
		            int maxLoginCount = Integer.parseInt(PropertyUtil.getProperties("system_max_login_fail_count"));
		            long lockTime = Long.parseLong(PropertyUtil.getProperties("system_login_fail_lock_time"));
		    		if(userLoginFail.getCount()>=maxLoginCount && (curTime-userLoginFail.getLastLoginTime())>=lockTime) {
		    			connection.del(key);//锁定超过2小时 ，自动解锁
		    			return null;
		    		}
		            return userLoginFail;  
			 	}
			 	else {
			 		return null;
			 	}
	        }
		});
	}
	
	@Override
	public void del(final String username) {
		redisTemplate.execute(new RedisCallback<UserLoginFail>() {
			@Override  
	        public UserLoginFail doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
				byte[] key = (REDIS_PRE_KEY + username).getBytes();
			 	if(connection.exists(key)) {
			 		connection.del(key);
			 	}
			 	return null;
	        }
		});
	}
	
	@Override
	public boolean hasLocked(User user) {
		if(user != null) {//登录失败次数校验
			int maxLoginCount = Integer.parseInt(PropertyUtil.getProperties("system_max_login_fail_count"));
			if(user.getMobileNumber()!=null && !user.getMobileNumber().isEmpty()) {
				UserLoginFail loginFail = find(user.getCountryCode()+user.getMobileNumber());
				if(loginFail!=null && loginFail.getCount() >= maxLoginCount) {//用户被锁定
					return true;
				}
			}
			
			if(user.getEmail()!=null && !user.getEmail().isEmpty()) {
				UserLoginFail loginFail = find(user.getEmail());
				if(loginFail!=null && loginFail.getCount() >= maxLoginCount) {//用户被锁定
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public void unlock(User user) {
		if(user!=null) {//清除登录失败信息
			if(user.getEmail() != null && !user.getEmail().isEmpty()) {
				del(user.getEmail());
			}
			if(user.getMobileNumber()!=null && !user.getMobileNumber().isEmpty()) {
				del(user.getCountryCode()+user.getMobileNumber());
			}
		}
	}
	
	@Override
	public void removeSession(final String sessionId) {
		redisTemplate.execute(new RedisCallback<UserLoginFail>() {
			@Override  
	        public UserLoginFail doInRedis(RedisConnection connection)  
	                throws DataAccessException {  
				String key = "*"+sessionId+"*";
				Set<byte[]> keys = connection.keys(key.getBytes());
				for(byte[] ke:keys) {
					connection.del(ke);
					System.out.println(new String(ke));
				}
			 	return null;
	        }
		});
	}
}