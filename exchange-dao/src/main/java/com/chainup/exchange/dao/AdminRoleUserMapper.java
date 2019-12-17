package com.chainup.exchange.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;

public interface AdminRoleUserMapper extends SqlMapper {
    int countByExample(AdminRoleUserExample example);

    int deleteByExample(AdminRoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoleUser record);

    int insertSelective(AdminRoleUser record);

    AdminRoleUser selectOnlyOneByExample(AdminRoleUserExample example);

    List<AdminRoleUser> selectByExample(AdminRoleUserExample example);

    AdminRoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoleUser record, @Param("example") AdminRoleUserExample example);

    int updateByExample(@Param("record") AdminRoleUser record, @Param("example") AdminRoleUserExample example);

    int updateByPrimaryKeySelective(AdminRoleUser record);

    int updateByPrimaryKey(AdminRoleUser record);
}