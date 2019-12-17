package com.chainup.exchange.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.FinanceStatsDaily;
import com.chainup.common.exchange.entity.FinanceStatsDailyExample;

public interface FinanceStatsDailyMapper extends SqlMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(FinanceStatsDaily record);

    int insertSelective(FinanceStatsDaily record);

    FinanceStatsDaily selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinanceStatsDaily record);

    int updateByPrimaryKey(FinanceStatsDaily record);
    
    int countByExample(FinanceStatsDailyExample example);

    int deleteByExample(FinanceStatsDailyExample example);

    FinanceStatsDaily selectOnlyOneByExample(FinanceStatsDailyExample example);

    List<FinanceStatsDaily> selectByExample(FinanceStatsDailyExample example);

    int updateByExampleSelective(@Param("record") FinanceStatsDaily record, @Param("example") FinanceStatsDailyExample example);

    int updateByExample(@Param("record") FinanceStatsDaily record, @Param("example") FinanceStatsDailyExample example);

    /**
     * 获取某个时间点的记录
     * @param param
     * {
     *     limitDate: Date
     * }
     * @return
     */
    List<FinanceStatsDaily> selectLatestByDate(Map<String, Object> param);

    /**
     *
     * 获取利润最新一条数据的时间
     *
     * @return Date
     */
    Date getProfitLastItemDate();

    /**
     *
     * 检查该日期的利润数据是否存在
     *
     * @return int
     */
    int profitCheckDate(Date itemDate);

    /**
     *
     * 获取充值提现最新一条数据的时间
     *
     * @return Date
     */
    Date getDepositWithdrawLastItemDate();

    /**
     *
     * 检查该日期的充值提现数据是否存在
     *
     * @return int
     */
    int depositWithdrawCheckDate(Date beginDate);

    /**
     *
     * 获取交易汇总最新一条数据的时间
     *
     * @return Date
     */
    Date getTradeLastItemDate();

    /**
     *
     * 检查该日期的交易汇总数据是否存在
     *
     * @return int
     */
    int TradeCheckDate(Date beginDate);

    /**
     *
     * 检查 finance_stats_daily 中 symbol+item_type+item_date 是否重复
     *
     * @return int
     */
    int getTradeCount(@Param("symbol") String symbol,@Param("itemType") String itemType,@Param("itemDate") Date itemDate);
}