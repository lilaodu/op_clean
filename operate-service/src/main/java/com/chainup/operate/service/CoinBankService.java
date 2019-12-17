package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CoinBank;
import com.chainup.common.exchange.entity.CoinBankExample;

/** 
 * @Author: dongya
 * @Description:  币行管理
 * @Date:2018-10-18 17:27
 */
public interface CoinBankService {
	/**
	 * 查询币行条数
	 */
	long countByExample(CoinBankExample example);
	/**
	 * 币行列表
	 */
	List<CoinBank> selectByExample(CoinBankExample example);
	/**
	 * 根据主键查询币行
	 */
	CoinBank selectByPrimaryKey(Integer id);
	/**
	 * 根据主键修改币行
	 */
	int updateByPrimaryKeySelective(CoinBank record);
	/**
	 * 根据主键删除币行
	 */
	int deleteByPrimaryKey(Integer id);
	/**
	 * 组装 CoinBank对象
	 */
	void setCoinBank(CoinBank coinBank,Integer coinBankId,Byte status,String reason);
	
	int updateStatusByCoinBank(CoinBank coinBank);
}
