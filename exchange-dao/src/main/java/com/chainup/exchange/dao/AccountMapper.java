package com.chainup.exchange.dao;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.Account;
import com.chainup.common.exchange.entity.AccountExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface AccountMapper extends SqlMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectOnlyOneByExample(AccountExample example);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
    
    Account selectByUidAndTypeAddLock(Account record);

    Map<String, BigDecimal> selectUserBalanceSumByCoin(Map<String, Object> param);

    Map<String, BigDecimal> selectOtcUserBalanceSumByCoin(Map<String, Object> param);
    /***
     *
     * 检查该用户uid是否存在
     *
     * @param uid
     * @return
     */
    int checkByUid(int uid);

    int insertSelectiveByList(@Param("accounts")List<Account> accounts);

}