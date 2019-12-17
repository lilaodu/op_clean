package com.chainup.operate.service.impl;

import com.chainup.common.exchange.entity.FeeDiscount;
import com.chainup.common.exchange.entity.FeeDiscountExample;
import com.chainup.exchange.dao.FeeDiscountMapper;
import com.chainup.operate.service.DiscountService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: luobin@chainup.com
 * @Date: 2018/5/9 12:19
 */
@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private FeeDiscountMapper feeDiscountMapper;

    @Override
    public List<FeeDiscount> getFeeDiscountList(FeeDiscountExample example){
        return feeDiscountMapper.selectByExample(example);
    }

    @Override
    public Integer getFeeDiscountCount(FeeDiscountExample example){
        return feeDiscountMapper.countByExample(example);
    }

    @Override
    public Integer deleteFeeDiscount(Integer id){
        FeeDiscountExample example = new FeeDiscountExample();
        example.createCriteria().andIdEqualTo(id);
        FeeDiscount feeDiscount = new FeeDiscount();
        feeDiscount.setStatus((byte)0);
        return feeDiscountMapper.updateByExampleSelective(feeDiscount, example);
    }

    @Override
    public Integer saveFeeDiscount(FeeDiscount feeDiscount){
        FeeDiscountExample example = new FeeDiscountExample();
        example.createCriteria().andUidEqualTo(feeDiscount.getUid());
        List<FeeDiscount> list = feeDiscountMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(list)){
            FeeDiscount old = list.get(0);
            old.setRate(feeDiscount.getRate());
            old.setEndTime(feeDiscount.getEndTime());
            old.setBeginTime(feeDiscount.getBeginTime());
            old.setStatus(feeDiscount.getStatus());
            old.setRemark(feeDiscount.getRemark());
            return feeDiscountMapper.updateByExample(old, example);
        }
        return feeDiscountMapper.insertSelective(feeDiscount);
    }

    @Override
    public FeeDiscount getFeeDiscount(Integer id){
        FeeDiscountExample example = new FeeDiscountExample();
        example.createCriteria().andIdEqualTo(id);
        List<FeeDiscount> list = this.getFeeDiscountList(example);
        if(CollectionUtils.isNotEmpty(list)){
            return list.get(0);
        }
        return null;
    }
}
