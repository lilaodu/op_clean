package com.chainup.operate.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.common.web.Constants;
import com.chainup.exchange.dao.ExTradeMapper;
import com.chainup.common.exchange.entity.ExOrderExample;
import com.chainup.common.exchange.entity.ExTrade;
import com.chainup.common.exchange.entity.ExTradeExample;
import com.chainup.operate.service.ExTradeService;

@Service
public class ExTradeServiceImpl implements ExTradeService{
	private static final Logger logger = LoggerFactory.getLogger(ExTradeServiceImpl.class);
	
    @Autowired
    private ExTradeMapper exTradeMapper;

    @Override
    public void add(ExTrade exTrade,String tradeSymbol) {
    	if (tradeSymbol==null) {
    		logger.error("add tradeSymbol is null");
    		return;
		}
    	exTrade.setTableName(Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
    	exTradeMapper.insert(exTrade);
    }

    @Override
    public Integer count(ExTradeExample example,String tradeSymbol) {
    	if (tradeSymbol==null) {
    		logger.error("count tradeSymbol is null");
    		return null;
		}
    	example.setTableName(Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
        return exTradeMapper.countByExample(example);
    }

    @Override
    public List<ExTrade> findAll(ExTradeExample example,String tradeSymbol) {
    	if (tradeSymbol==null) {
    		logger.error("findAll tradeSymbol is null");
    		return null;
		}
    	example.setTableName(Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
        return exTradeMapper.selectByExample(example);
    }

    @Override
    public ExTrade findById(Long id,String tradeSymbol) {
    	if (tradeSymbol==null) {
    		logger.error("findById tradeSymbol is null");
    		return null;
		}
        return exTradeMapper.selectByPrimaryKey(id,Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
    }
    
    /**
     * 分页查询用户交易排行
     */
	@Override
	public List<Map> selectTradeSortByExample(ExTradeExample example,String tradeSymbol) {
    	if (tradeSymbol==null) {
    		logger.error("findTradeSortByExample selectTradeSortByExample is null");
    		return null;
		}
		example.setTableName(Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
		return exTradeMapper.selectTradeSortByExample(example);
	}

	@Override
	public Integer selectTradeSortCountByExample(ExTradeExample example, String tradeSymbol) {
		if (tradeSymbol==null) {
    		logger.error("selectTradeSortCountByExample tradeSymbol is null");
    		return null;
		}
		example.setTableName(Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
		return exTradeMapper.selectTradeSortCountByExample(example);
	}

	@Override
	public ExTrade selectLastOne(String tradeSymbol) {
		if (tradeSymbol==null) {
    		logger.error("selectTradeSortCountByExample tradeSymbol is null");
    		return null;
		}
		return exTradeMapper.selectLastOne(Constants.EX_TRADE_PREFIX+tradeSymbol.toLowerCase());
	}
}