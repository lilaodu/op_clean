package com.chainup.operate.service;

/**
 * 用户登录错误统计接口类
 * 
 * @author liuzhengui
 *
 */
public interface ValidLoginApiService {

	/**
	 * 添加登录失败次数到redis
	 * 
	 * @param
	 */
	void addLoginFaildCount(String account, String count, Long expireTime);

	/**
	 * 从redis获取登录失败次数
	 * 
	 * @param example
	 * @return
	 */
	String getLoginFaildCount(String account);

	/**
	 * 从redis删除登录失败次数
	 * 
	 * @param example
	 * @return
	 */
	void removeLoginFaildCount(String account);

	/**
	 * 锁定登录账号
	 * 
	 * @param example
	 * @return
	 */
	void lockAccount(String account, Long expireTime);

	/**
	 * 解除登录账号锁定
	 * 
	 * @param example
	 * @return
	 */
	void unLockAccount(String account);

	/**
	 * 登录账号是否被锁定
	 * 
	 * @param example
	 * @return
	 */
	public boolean isLockAccount(String account);
}
