package com.chainup.operate.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AuthCertificateA2ExtMapper;
import com.chainup.exchange.dao.AuthCertificateA2Mapper;
import com.chainup.exchange.dao.UserMapper;
import com.chainup.common.exchange.entity.AuthCertificateA2;
import com.chainup.common.exchange.entity.AuthCertificateA2Example;
import com.chainup.common.exchange.entity.AuthCertificateA2WithBLOBs;
import com.chainup.common.exchange.entity.Country;
import com.chainup.common.exchange.entity.SystemConfig;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserMessage;
import com.chainup.operate.service.AuthCertificateA2Service;
import com.chainup.operate.service.AuthRealnameService;
import com.chainup.operate.service.CountryService;
import com.chainup.operate.service.SystemConfigService;
import com.chainup.operate.service.UserMessageService;
import com.chainup.operate.service.UserService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AuthCertificateA2ServiceImpl implements AuthCertificateA2Service{

    @Autowired
    private AuthCertificateA2Mapper authCertificateA2Mapper;
    @Autowired
    private AuthCertificateA2ExtMapper authCertificateA2ExtMapper;
    @Autowired
    private AuthRealnameService authRealnameService;
    @Autowired
    private UserService userService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private UserMessageService userMessageService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SystemConfigService systemConfigService;
    @Override
    public void add(AuthCertificateA2WithBLOBs record) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(record);
        authCertificateA2Mapper.insert(record);
    }
    @Override
    public Integer count(AuthCertificateA2Example example) {
        // TODO Auto-generated method stub
        return authCertificateA2Mapper.countByExample(example);
    }
    @Override
    public List<AuthCertificateA2WithBLOBs> findAllWithBlob(AuthCertificateA2Example example) {
        // TODO Auto-generated method stub
        return authCertificateA2Mapper.selectByExampleWithBLOBs(example);
    }
    @Override
    public List<AuthCertificateA2> findAll(AuthCertificateA2Example example) {
        // TODO Auto-generated method stub
        return authCertificateA2Mapper.selectByExample(example);
    }
    @Override
    public AuthCertificateA2 findById(Integer id) {
        // TODO Auto-generated method stub
        return authCertificateA2Mapper.selectByPrimaryKey(id);
    }
    @Override
    public int updateByExampleSelective(@Param("record") AuthCertificateA2WithBLOBs record, @Param("example") AuthCertificateA2Example example) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(record);
        return authCertificateA2Mapper.updateByExampleSelective(record, example);
    }
    @Override
    public Map<Integer, AuthCertificateA2> findId2AuthCertificateA2ByUIDS(List<Integer> uids) {
        AuthCertificateA2Example example = new AuthCertificateA2Example();
        example.createCriteria().andUidIn(uids);
        Map<Integer,AuthCertificateA2> id2AuthRealname = new HashMap<Integer,AuthCertificateA2>();
        List<AuthCertificateA2> arList = authCertificateA2Mapper.selectByExample(example);
        ReflectionUtils.escapeHtml(arList);
        if(arList!=null){
            for(AuthCertificateA2 u:arList){
                if(!id2AuthRealname.containsKey(u.getUid())){
                    id2AuthRealname.put(u.getUid(), u);
                }
            }
        }
        return id2AuthRealname;
    }
    @Override
    public AuthCertificateA2WithBLOBs findByUId(Integer uid) {
        AuthCertificateA2WithBLOBs authCertificate = null;
        AuthCertificateA2Example example1 = new AuthCertificateA2Example();
        AuthCertificateA2Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andUidEqualTo(uid);
        List<AuthCertificateA2WithBLOBs> arList1 = authCertificateA2Mapper.selectByExampleWithBLOBs(example1);
        if(arList1!=null && arList1.size()>0){
            authCertificate = arList1.get(0);
            if(authCertificate!=null){
                authCertificate.setFirstPh(new String(authCertificate.getFirstPhoto()));
                authCertificate.setSecondPh(new String(authCertificate.getSecondPhoto()));
                authCertificate.setFourthPh(new String(authCertificate.getFourthPhoto()));
                authCertificate.setLivePh(new String(authCertificate.getLivePhoto()));
                if(authCertificate.getLiveContury()!=null && !"".equals(authCertificate.getLiveContury())){
                    Country country = countryService.getByNumberCodeAndDialingCode(authCertificate.getLiveContury());
                    authCertificate.setLiveCountryName(country.getCnName());
                }
            }
        }
        ReflectionUtils.escapeHtml(authCertificate);
        return authCertificate;
    }
	@Override
	public int updateByPrimaryKeySelective(AuthCertificateA2WithBLOBs record,String userMessageContent) {
	    SystemConfig systemConfig = systemConfigService.findSystemConfig();
		// TODO Auto-generated method stub
	    ReflectionUtils.escapeSql(record);
	    User user = userMapper.selectByPrimaryKey(record.getUid());
        Date realnameTime = new Date();
	    if(record.getAuthStatus()==1){//A2认证通过
            user.setAuthLevel((byte)2);
            user.setCertificateTime(realnameTime);
            userService.updateByPrimaryKey(user);
        }
        if(record.getAuthStatus()==2){//未通过，打回
            user.setAuthLevel((byte)1);
            user.setCertificateTime(realnameTime);
            userService.updateByPrimaryKey(user);
        }
        UserMessage userMessage = new UserMessage();
        userMessage.setReceiveUid(record.getUid());
        userMessage.setMessageType((byte)5);
        userMessage.setStatus((byte)1);
        userMessage.setMessageContent(userMessageContent);
        userMessage.setCtime(new Date());
        userMessageService.add(userMessage);
		return authCertificateA2Mapper.updateByPrimaryKeySelective(record);
	}
}