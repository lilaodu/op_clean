package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminActionMapper extends SqlMapper {
    int countByExample(AdminActionExample example);

    int deleteByExample(AdminActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminAction record);

    int insertSelective(AdminAction record);

    AdminAction selectOnlyOneByExample(AdminActionExample example);

    List<AdminAction> selectByExample(AdminActionExample example);

    AdminAction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminAction record, @Param("example") AdminActionExample example);

    int updateByExample(@Param("record") AdminAction record, @Param("example") AdminActionExample example);

    int updateByPrimaryKeySelective(AdminAction record);

    int updateByPrimaryKey(AdminAction record);
}