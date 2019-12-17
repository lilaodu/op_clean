package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.web.wallet.entity.Wallet;
import com.chainup.common.web.wallet.entity.WalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalletMapper extends SqlMapper {
    long countByExample(WalletExample example);

    int deleteByExample(WalletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    List<Wallet> selectByExample(WalletExample example);

    Wallet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wallet record, @Param("example") WalletExample example);

    int updateByExample(@Param("record") Wallet record, @Param("example") WalletExample example);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);
    /**
     * 充值需要获取地址的币种（走新地址币种）
     * @param example
     * @return
     */
    List<String> findNeedAddressCoin(WalletExample example);
    
    
    
    
    
}