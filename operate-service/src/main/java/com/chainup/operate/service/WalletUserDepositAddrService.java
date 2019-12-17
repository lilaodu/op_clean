package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.UserDepositAddr;
import com.chainup.common.exchange.entity.UserDepositAddrExample;





/**
 * 后台管理用户服务接口类
 * 
 * @author zhongjingyun
 *
 */
public interface WalletUserDepositAddrService {

    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<UserDepositAddr> findAll(UserDepositAddrExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    UserDepositAddr findById(Integer id);

    
    
    /**
     * 根据条件修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserDepositAddr record);
    
    
    
    
    
    
    
    
    /**
     * 添加
     * 
     * @param UserDepositAddr
     */
   // void add(UserDepositAddr userDepositAddr);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
  //  Integer count(UserDepositAddrExample example);
    
  //  void deleteById(Integer id);
}
