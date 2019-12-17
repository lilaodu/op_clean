package com.chainup.exchange.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AdminRoleAction;
import com.chainup.common.exchange.entity.AdminRoleActionExample;

public interface AdminRoleActionMapper extends SqlMapper {
    int countByExample(AdminRoleActionExample example);

    int deleteByExample(AdminRoleActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoleAction record);

    int insertSelective(AdminRoleAction record);

    AdminRoleAction selectOnlyOneByExample(AdminRoleActionExample example);

    List<AdminRoleAction> selectByExample(AdminRoleActionExample example);

    AdminRoleAction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoleAction record, @Param("example") AdminRoleActionExample example);

    int updateByExample(@Param("record") AdminRoleAction record, @Param("example") AdminRoleActionExample example);

    int updateByPrimaryKeySelective(AdminRoleAction record);

    int updateByPrimaryKey(AdminRoleAction record);
}