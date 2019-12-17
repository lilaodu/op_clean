package com.chainup.operate.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.chainup.operate.service.ValidLoginApiService;

@Service
public class ValidLoginApiServiceImpl implements ValidLoginApiService {
	private final static String REDIS_LOGIN_KEY = "api.user.validlogin."; // redis中key前缀
	private final static String REDIS_LOGIN_REFUSE_KEY = "api.user.refuselogin."; // redis中key前缀

	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	@Override
	public void addLoginFaildCount(final String account, final String code,
			final Long expireTime) {
		final String key = REDIS_LOGIN_KEY + account.trim();
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.set(key.getBytes(), code.getBytes());
				connection.expire(key.getBytes(), expireTime);
				return null;
			}
		});
	}

	@Override
	public String getLoginFaildCount(final String account) {
		final String key = REDIS_LOGIN_KEY + account.trim();
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] value = connection.get(key.getBytes());
				if (value != null) {
					return new String(value);
				}
				return null;
			}
		});
	}

	@Override
	public void removeLoginFaildCount(final String account) {
		final String key = REDIS_LOGIN_KEY + account.trim();
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				if (connection.exists(key.getBytes())) {
					connection.del(key.getBytes());
				}
				return null;
			}
		});
	}

	@Override
	public void lockAccount(final String account, Long expireTime) {
		final String key = REDIS_LOGIN_REFUSE_KEY + account.trim();
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.set(key.getBytes(), account.getBytes());
				connection.expire(key.getBytes(), expireTime);
				return null;
			}
		});
	}

	@Override
	public void unLockAccount(final String account) {
		final String key = REDIS_LOGIN_REFUSE_KEY + account.trim();
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				if (connection.exists(key.getBytes())) {
					connection.del(key.getBytes());
				}
				return null;
			}
		});

	}

	@Override
	public boolean isLockAccount(final String account) {
		final String key = REDIS_LOGIN_REFUSE_KEY + account.trim();
		return redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection)
					throws DataAccessException {
				if (connection.exists(key.getBytes())) {
					return true;
				}
				return false;
			}
		});

	}
}