package com.chainup.operate.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.common.exchange.entity.ExAssetAllocation;
import com.chainup.common.exchange.entity.ExAssetAllocationExample;
import com.chainup.exchange.dao.ExAssetAllocationMapper;
import com.chainup.operate.service.AssetAllocationService;

@Service
public class AssetAllocationServiceImpl implements AssetAllocationService {

	@Autowired
	private ExAssetAllocationMapper assetMapper;
	
	@Override
	public ExAssetAllocation findAccount(String account_A, String account_BC, String coinSymbol) {
		ExAssetAllocationExample example = new ExAssetAllocationExample();
		example.createCriteria().andAssetAEqualTo(account_A).andAssetBcEqualTo(account_BC).andCoinSymbolEqualTo(coinSymbol);
		List<ExAssetAllocation> list = assetMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public ExAssetAllocation findFeeAccount(String account_A, String account_BC, String coinSymbol, String symbol) {
		ExAssetAllocationExample example = new ExAssetAllocationExample();
		example.createCriteria().andAssetAEqualTo(account_A).andAssetBcEqualTo(account_BC)
			.andCoinSymbolEqualTo(coinSymbol).andSymbolEqualTo(symbol);
		List<ExAssetAllocation> list = assetMapper.selectByExample(example);
		if(CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}
		return null;
	}

}
