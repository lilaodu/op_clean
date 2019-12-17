package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CmsAppAdvert;
import com.chainup.common.exchange.entity.CmsAppAdvertExample;

public interface CmsAppAdvertMapper extends SqlMapper {
    int countByExample(CmsAppAdvertExample example);

    int deleteByExample(CmsAppAdvertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsAppAdvert record);

    int insertSelective(CmsAppAdvert record);

    CmsAppAdvert selectOnlyOneByExample(CmsAppAdvertExample example);

    List<CmsAppAdvert> selectByExample(CmsAppAdvertExample example);

    CmsAppAdvert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsAppAdvert record, @Param("example") CmsAppAdvertExample example);

    int updateByExample(@Param("record") CmsAppAdvert record, @Param("example") CmsAppAdvertExample example);

    int updateByPrimaryKeySelective(CmsAppAdvert record);

    int updateByPrimaryKey(CmsAppAdvert record);
}