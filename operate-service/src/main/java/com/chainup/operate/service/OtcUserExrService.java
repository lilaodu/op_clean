package com.chainup.operate.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.otc.entity.CommentsResult;
import com.chainup.otc.entity.OtcOrder;
import com.chainup.otc.entity.OtcUserExt;

public interface OtcUserExrService {

	public OtcUserExt queryByUserId(Long userId) throws Exception;
	
	public boolean saveComment(OtcOrder order, int score) throws Exception;
	
	int updateEntity(OtcUserExt userExt);
	
	public boolean add(OtcUserExt userExt)throws Exception;
	
	
	
	/**
	 * 申诉需要进行的更新操作
	 * @param uid
	 * @param complainNum  申诉总量变化(无变化传0)
	 * @param failComplainNum  败诉总量变化
	 * @param sucComplianNum  胜诉总量变化 
	 * @return
	 * @throws Exception
	 */
	boolean updateComplain(Long uid ,Integer complainNum ,Integer failComplainNum , Integer sucComplianNum)throws Exception;
	
	/**
	 * 评论分页查询
	 * @param param
	 * @return
	 */
	List<CommentsResult> selectComment(Map<String, Object> param);
	
	int countComment(Map<String, Object> param);
	
	int updateByPrimaryKey(OtcUserExt ext);
}
