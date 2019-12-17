package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinFee;
import com.chainup.common.exchange.entity.CoinFeeExample;
import java.util.List;

public interface CoinFeeMapper extends SqlMapper {

    List<CoinFee> selectByExample(CoinFeeExample example);

}