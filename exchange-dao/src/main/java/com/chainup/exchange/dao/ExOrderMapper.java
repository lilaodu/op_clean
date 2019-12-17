package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExOrder;
import com.chainup.common.exchange.entity.ExOrderExample;

/**
 * 统一管理不同交易对的订单,通过tableName参数变换表名
 * @author zhongjingyun
 *
 */
public interface ExOrderMapper extends SqlMapper {
    int countByExample(ExOrderExample example);

    int deleteByExample(ExOrderExample example);

    int deleteByPrimaryKey(@Param("id")Long id,@Param("tableName")String tableName);

    int insert(ExOrder record);

    int insertSelective(ExOrder record);

    ExOrder selectOnlyOneByExample(ExOrderExample example);

    List<ExOrder> selectByExample(ExOrderExample example);

    ExOrder selectByPrimaryKey(@Param("id")Long id,@Param("tableName")String tableName);

    int updateByExampleSelective(@Param("record") ExOrder record, @Param("example") ExOrderExample example);

    int updateByExample(@Param("record") ExOrder record, @Param("example") ExOrderExample example);

    int updateByPrimaryKeySelective(ExOrder record);

    int updateByPrimaryKey(ExOrder record);
    
    ExOrder selectByIdAddLock(@Param("id")Long id,@Param("tableName")String tableName);
}