package com.chainup.operate.service;

import com.chainup.common.exchange.entity.FeeDiscount;
import com.chainup.common.exchange.entity.FeeDiscountExample;

import java.util.List;

/**
 * @Author: luobin@chainup.com
 * @Date: 2018/5/9 12:18
 */
public interface DiscountService {
    /**
     * 获取手续费list
     * @param example
     * @return
     */
    List<FeeDiscount> getFeeDiscountList(FeeDiscountExample example);

    /**
     * 获取折扣信息
     * @param example
     * @return
     */
    Integer getFeeDiscountCount(FeeDiscountExample example);

    /**
     * 逻辑删除，将状态置为0
     * @param id
     * @return
     */
    Integer deleteFeeDiscount(Integer id);

    /**
     * 更新或新增手续费打折-此方法不具备通用性，请谨慎使用
     * @param feeDiscount
     * @return
     */
    Integer saveFeeDiscount(FeeDiscount feeDiscount);

    /**
     * 获取手续费打折信息
     * @param id
     * @return
     */
    FeeDiscount getFeeDiscount(Integer id);
}
