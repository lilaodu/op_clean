package com.chainup.operate.service;

import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.otc.entity.OtcAdvert;
import com.chainup.otc.entity.OtcAdvertExample;
import com.chainup.otc.entity.OtcAdvertFlow;

import java.util.List;

public interface OtcAdService {


    int countByExample(OtcAdvertExample example);

    List<OtcAdvert> selectByExample(OtcAdvertExample example);

    int updateByPrimaryKeySelective(OtcAdvert record, AdminUser adminUser) throws Exception;

    /**
     * 添加广告操作记录
     * @param otcAdvertFlow
     */
    void add(OtcAdvertFlow otcAdvertFlow) throws Exception;

    OtcAdvert selectByPrimaryKey(Long id);

}
