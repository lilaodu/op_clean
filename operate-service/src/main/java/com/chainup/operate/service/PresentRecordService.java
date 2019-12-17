package com.chainup.operate.service;

import java.math.BigDecimal;
import java.util.List;


import com.chainup.common.exchange.entity.PresentRecord;
import com.chainup.common.exchange.entity.PresentRecordExample;

/**
 * 赠币service
 * 
 * @author zhongjingyun
 *
 */
public interface PresentRecordService {
    /**
     * 添加
     * 
     * @param presentRecord
     * @return
     */
    Integer add(PresentRecord presentRecord);

    /**
     * 根据条件查询列表
     * 
     * @param example
     * @return
     */
    List<PresentRecord> findAll(PresentRecordExample example);
    
    /**
     * 根据条件统计总数量
     * 
     * @param example
     * @return
     */
    Integer count(PresentRecordExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    PresentRecord findById(Long id);
    
    /**
     * 给全部用户赠送
     * @param amount
     * @param symbol
     * @param opId
     * @return
     */
    boolean presentToAll(BigDecimal amount,String symbol,Integer opId);
    
    /**
     * 根据ids赠送
     * @param amount
     * @param symbol
     * @param opId
     * @param ids
     * @return
     */
    String presentByIds(BigDecimal amount,String symbol,Integer opId,String ids) throws  Exception;
    
    Boolean presentById(Integer uid,BigDecimal amount, Integer opId,String symbol) throws Exception ;
    
    /**
     * 赠币
     * @param uid
     * @param amount
     * @param opId
     * @param symbol
     * @return
     * @throws Exception
     */

}
