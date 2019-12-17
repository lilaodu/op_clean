package com.chainup.common.exchange.entity;

import java.io.Serializable;

/*********
 * 用户登陆错误次数统计
 * @author lzg
 *
 */
public class UserLoginFail implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private Integer count;			//失败次数
    private Long	lastLoginTime;	//最后登录时间
    private String 	username;		//登录用户名
    private String  day;			//当前日期
    
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Long getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Long lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
}