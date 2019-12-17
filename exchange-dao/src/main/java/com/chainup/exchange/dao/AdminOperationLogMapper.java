package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AdminOperationLog;
import com.chainup.common.exchange.entity.AdminOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminOperationLogMapper extends SqlMapper {
    int countByExample(AdminOperationLogExample example);

    int deleteByExample(AdminOperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminOperationLog record);

    int insertSelective(AdminOperationLog record);

    AdminOperationLog selectOnlyOneByExample(AdminOperationLogExample example);

    List<AdminOperationLog> selectByExample(AdminOperationLogExample example);

    AdminOperationLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminOperationLog record, @Param("example") AdminOperationLogExample example);

    int updateByExample(@Param("record") AdminOperationLog record, @Param("example") AdminOperationLogExample example);

    int updateByPrimaryKeySelective(AdminOperationLog record);

    int updateByPrimaryKey(AdminOperationLog record);
}