package com.chainup.operate.service.impl;

import com.chainup.exchange.dao.ColdCryptoAddressMapper;
import com.chainup.common.exchange.entity.*;
import com.chainup.operate.service.ColdCryptoAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nob.
 */
@Service
public class ColdCryptoAddressServiceImpl implements ColdCryptoAddressService{

    @Autowired
    ColdCryptoAddressMapper coldCryptoAddressMapper;


    @Override
    public List<ColdCryptoAddress> findAll(ColdCryptoAddressExample example) {
        return coldCryptoAddressMapper.selectByExample(example);
    }


}
