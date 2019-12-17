package com.chainup.operate.service;

import com.chainup.common.exchange.entity.ColdCryptoAddress;
import com.chainup.common.exchange.entity.ColdCryptoAddressExample;

import java.util.List;

/**
 * 财务对账接口类
 * @author zhongjingyun 20170912
 */
public interface ColdCryptoAddressService {

    List<ColdCryptoAddress> findAll(ColdCryptoAddressExample example);

}
