package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExTradeExample;
import com.chainup.common.exchange.entity.TradeTick;
import com.chainup.common.exchange.entity.ExTrade;

public interface ExTradeMapper  extends SqlMapper {

	/**
	 * 根据表名获取该交易的大于ID的要处理的交易数据
	 * @param tableName
	 * @param id
	 * @return
	 */
    List<ExTrade> willRiskExTradeList(@Param("tableName")String tableName,@Param("id")int id);
    
    /**
     * 查询该对比最后一笔交易数据
     * @param tableName
     * @return
     */
    ExTrade getExTradeLastOne(@Param("tableName")String tableName);
    
    /**
     * 查询ID对应的交易数据
     * @param tableName
     * @return
     */
    ExTrade getExTradeById(@Param("tableName")String tableName,@Param("id")int id);
    
    /**
     * 获取半小时内最高价和最低价
     * @param tableName
     * @return
     */
    ExTrade getHighLowTrade(@Param("tableName")String tableName);
    
    /**
     * 获取交易表时间分钟内的交易量总和
     * @param tableName
     * @param volumeMins
     * @return
     */
    Double getVolumeCount(@Param("tableName")String tableName,@Param("volumeMins")int volumeMins);
    
    /**
     * 获取交易表时间分钟内的用户ID量集合
     * @param tableName
     * @param volumeMins
     * @return
     */
    List<Integer> getTradeUserList(@Param("tableName")String tableName,@Param("volumeMins")int volumeMins);
    
    /**
     * 获取交易表时间分钟内的用户ID交易量
     * @param tableName
     * @param volumeMins
     * @return
     */
    Double getTradeUserVolumeCount(@Param("tableName")String tableName,@Param("userId")int userId,@Param("volumeMins")int volumeMins);
    
    /**
     * 获取exchange库里面所有的订单表名
     * @return
     */
    List<String> getOrderTables();
    
    /**
     * 根据用户ID和币种ID获取当前币种的用户对应余额账户的余额
     * @param uid
     * @param symbolType
     * @return
     */
    Double getAccountBalance(@Param("uid")int uid,@Param("symbolType")int symbolType);
    
    /**
     * 根据用户ID和币种ID找对应币种的交易表，看有多少笔交易
     * @param tableName
     * @param uid
     * @return
     */
    int getUserDealCount(@Param("tableName")String tableName,@Param("uid")int uid);
    
    /**
     * 根据用户id和登录IP查询该IP登录次数
     * @param uid
     * @param lgIp
     * @return
     */
    int getUserIpLoginCount(@Param("uid")int uid,@Param("lgIp")String lgIp);
    
    /**
     * 根据用户id 查询登录次数
     * @param uid
     * @return
     */
    int getUserLoginCount(@Param("uid")int uid);
    
    /**
     * 根据用户id 查询最后一次登录的IP
     * @param uid
     * @return
     */
    String getUserLastLoginIP(@Param("uid")int uid);
    
    /**
     * 查询提现地址提现成功的次数
     * @param address
     * @return
     */
    int getAddressSuccessCount(@Param("address")String address);
    
    /**
     * 查询提现地址提现成功的账户ID个数
     * @param address
     * @return
     */
    int getAddressSuccessUserCount(@Param("address")String address);
    
    
    /**
     * 获取买单方向的userId对应的交易数量和交易额
     * @author han
     * @param conditions
     * @return
     */
    List<TradeTick> selectBidTradeList(Map<String, Object> conditions);
    
    /**
     * 获取卖单方向的userId对应的交易数量和交易额
     * @author han
     * @param conditions
     * @return
     */
    List<TradeTick> selectAskTradeList(Map<String, Object> conditions);
    
    
    /**
     * 获取时间区间内的交易笔数
     * @author han
     * @param conditions
     * @return
     */
    int selectTradeCount(Map<String, Object> conditions);
    
    /**
     * 获取买方用户id集合
     * @author han
     * @param conditions
     * @return
     */
    Set<Integer> getBidUserIds(Map<String, Object> conditions);
    
    /**
     * 获取卖方用户id集合
     * @author han
     * @param conditions
     * @return
     */
    Set<Integer> getAskUserIds(Map<String, Object> conditions);
    
    /**
     * 获取用户表用户ID量集合
     * @return
     */
    List<Integer> getUserIdList();
    
    int countByExample(ExTradeExample example);

    int deleteByExample(ExTradeExample example);

    int deleteByPrimaryKey(@Param("id")Long id,@Param("tableName")String tableName);

    int insert(ExTrade record);

    int insertSelective(ExTrade record);

    ExTrade selectOnlyOneByExample(ExTradeExample example);

    List<ExTrade> selectByExample(ExTradeExample example);

    ExTrade selectByPrimaryKey(@Param("id")Long id,@Param("tableName")String tableName);

    int updateByExampleSelective(@Param("record") ExTrade record, @Param("example") ExTradeExample example);

    int updateByExample(@Param("record") ExTrade record, @Param("example") ExTradeExample example);

    int updateByPrimaryKeySelective(ExTrade record);

    int updateByPrimaryKey(ExTrade record);
    
    int selectTradeSortCountByExample(ExTradeExample example);
    
    List<Map> selectTradeSortByExample(ExTradeExample example);
    
    ExTrade selectLastOne(@Param("tableName")String tableName);
    
    
}