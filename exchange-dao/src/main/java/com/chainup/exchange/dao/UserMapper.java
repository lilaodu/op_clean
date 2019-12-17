package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserExample;

public interface UserMapper extends SqlMapper{
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     * 获取登录人数
     * @author han
     * @param conditions
     * @return
     */
    int getLoginCount(Map<String, Object> conditions);
    
    /**
     * 获取提现人数
     * @author han
     * @param conditions
     * @return
     */
    int getWithDrawalCount(Map<String, Object> conditions);
    
    /**
     * 获取充值人数
     * @author han
     * @param conditions
     * @return
     */
    int getDepositCount(Map<String, Object> conditions);
    
    int countByCtime(Map map);
    
    List<User> listByPage(Map map);
    
    int selectAuthRealNameByCount(Map map);
    List<User> selectAuthRealNameBypage(Map map);
    
    int selectAuthCertificateByCount(Map map);
    List<User> selectAuthCertificateBypage(Map map);
    
    int selectAuthCertificateA2ByCount(Map map);
    List<User> selectAuthCertificateA2Bypage(Map map);

}