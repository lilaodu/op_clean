package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CmsAdvert;
import com.chainup.common.exchange.entity.CmsAdvertExample;

public interface CmsAdvertMapper extends SqlMapper{
    int countByExample(CmsAdvertExample example);

    int deleteByExample(CmsAdvertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsAdvert record);

    int insertSelective(CmsAdvert record);

    CmsAdvert selectOnlyOneByExample(CmsAdvertExample example);

    List<CmsAdvert> selectByExample(CmsAdvertExample example);

    CmsAdvert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsAdvert record, @Param("example") CmsAdvertExample example);

    int updateByExample(@Param("record") CmsAdvert record, @Param("example") CmsAdvertExample example);

    int updateByPrimaryKeySelective(CmsAdvert record);

    int updateByPrimaryKey(CmsAdvert record);
}