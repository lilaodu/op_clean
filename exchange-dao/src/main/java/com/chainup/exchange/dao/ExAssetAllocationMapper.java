package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExAssetAllocation;
import com.chainup.common.exchange.entity.ExAssetAllocationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ExAssetAllocationMapper  extends SqlMapper {
    int countByExample(ExAssetAllocationExample example);

    int deleteByExample(ExAssetAllocationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExAssetAllocation record);

    int insertSelective(ExAssetAllocation record);

    ExAssetAllocation selectOnlyOneByExample(ExAssetAllocationExample example);

    List<ExAssetAllocation> selectByExample(ExAssetAllocationExample example);

    ExAssetAllocation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExAssetAllocation record, @Param("example") ExAssetAllocationExample example);

    int updateByExample(@Param("record") ExAssetAllocation record, @Param("example") ExAssetAllocationExample example);

    int updateByPrimaryKeySelective(ExAssetAllocation record);

    int updateByPrimaryKey(ExAssetAllocation record);

    int insertSelectiveByList(@Param("record")List<ExAssetAllocation> record);
}