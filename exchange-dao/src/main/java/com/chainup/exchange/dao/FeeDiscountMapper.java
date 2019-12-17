package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.FeeDiscount;
import com.chainup.common.exchange.entity.FeeDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
* @author Solar
*/
public interface FeeDiscountMapper extends SqlMapper {
    int countByExample(FeeDiscountExample example);

    int deleteByExample(FeeDiscountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeeDiscount record);

    int insertSelective(FeeDiscount record);

    FeeDiscount selectOnlyOneByExample(FeeDiscountExample example);

    List<FeeDiscount> selectByExample(FeeDiscountExample example);

    FeeDiscount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeeDiscount record, @Param("example") FeeDiscountExample example);

    int updateByExample(@Param("record") FeeDiscount record, @Param("example") FeeDiscountExample example);

    int updateByPrimaryKeySelective(FeeDiscount record);

    int updateByPrimaryKey(FeeDiscount record);
}