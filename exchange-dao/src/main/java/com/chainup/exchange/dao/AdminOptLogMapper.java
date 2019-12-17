package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AdminOptLog;
import com.chainup.common.exchange.entity.AdminOptLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminOptLogMapper extends SqlMapper {
    int countByExample(AdminOptLogExample example);

    int deleteByExample(AdminOptLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminOptLog record);

    int insertSelective(AdminOptLog record);

    AdminOptLog selectOnlyOneByExample(AdminOptLogExample example);

    List<AdminOptLog> selectByExample(AdminOptLogExample example);

    AdminOptLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminOptLog record, @Param("example") AdminOptLogExample example);

    int updateByExample(@Param("record") AdminOptLog record, @Param("example") AdminOptLogExample example);

    int updateByPrimaryKeySelective(AdminOptLog record);

    int updateByPrimaryKey(AdminOptLog record);
}