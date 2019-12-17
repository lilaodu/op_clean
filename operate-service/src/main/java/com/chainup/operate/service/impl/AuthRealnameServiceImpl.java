package com.chainup.operate.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.log.EventType;
import com.chainup.common.log.base.Log;
import com.chainup.common.log.base.LogFactory;
import com.chainup.common.log.base.LogType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AuthRealnameMapper;
import com.chainup.exchange.dao.UserMapper;
import com.chainup.common.exchange.entity.AuthCertificateA2Example;
import com.chainup.common.exchange.entity.AuthCertificateA2WithBLOBs;
import com.chainup.common.exchange.entity.AuthCertificateExample;
import com.chainup.common.exchange.entity.AuthCertificateWithBLOBs;
import com.chainup.common.exchange.entity.AuthRealname;
import com.chainup.common.exchange.entity.AuthRealnameExample;
import com.chainup.common.exchange.entity.Country;
import com.chainup.common.exchange.entity.SystemConfig;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserMessage;
import com.chainup.operate.service.AuthCertificateA2Service;
import com.chainup.operate.service.AuthCertificateService;
import com.chainup.operate.service.AuthRealnameService;
import com.chainup.operate.service.CountryService;
import com.chainup.operate.service.SystemConfigService;
import com.chainup.operate.service.UserMessageService;
import com.chainup.operate.service.UserService;
import com.chainup.common.util.ReflectionUtils;
import com.chainup.common.web.Constants;

@Service
public class AuthRealnameServiceImpl implements AuthRealnameService{
    @Autowired
    private AuthRealnameMapper authRealnameMapper;
    @Autowired
    private CountryService countryService;
    @Autowired
    private AuthCertificateService authCertificateService;
    @Autowired
    private AuthCertificateA2Service authCertificateA2Service;
    @Autowired
    private UserMessageService userMessageService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SystemConfigService systemConfigService;

    private Log log = LogFactory.getLog();
    @Override
    public void add(AuthRealname authRealname) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(authRealname);
        authRealnameMapper.insert(authRealname);
    }

    @Override
    public Integer count(AuthRealnameExample example) {
        // TODO Auto-generated method stub
        return authRealnameMapper.countByExample(example);
    }

    @Override
    public List<AuthRealname> findAll(AuthRealnameExample example) {
        // TODO Auto-generated method stub
        List<AuthRealname> list = authRealnameMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(list);
        return list;
    }

    @Override
    public AuthRealname findById(Integer id) {
        // TODO Auto-generated method stub
        AuthRealname authRealname = authRealnameMapper.selectByPrimaryKey(id);
        ReflectionUtils.escapeHtml(authRealname);
        return authRealname;
    }

    @Override
    public Map<Integer, AuthRealname> findId2AuthRealnameByUIDS(List<Integer> uids) {
        AuthRealnameExample example = new AuthRealnameExample();
        example.createCriteria().andUidIn(uids);
        Map<Integer,AuthRealname> id2AuthRealname = new HashMap<Integer,AuthRealname>();
        List<AuthRealname> arList = authRealnameMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(arList);
        if(arList!=null){
            for(AuthRealname u:arList){
                if(!id2AuthRealname.containsKey(u.getUid())){
                    id2AuthRealname.put(u.getUid(), u);
                }
            }
        }
        return id2AuthRealname;
    }

    @Override
    public int updateByPrimaryKey(AuthRealname authRealname) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(authRealname);
        return authRealnameMapper.updateByPrimaryKeySelective(authRealname);
    }

    @Override
    public AuthRealname findByUId(Integer uid) {
        // TODO Auto-generated method stub
        AuthRealnameExample example = new AuthRealnameExample();
        AuthRealnameExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        List<AuthRealname> arList = authRealnameMapper.selectByExample(example);
        if(arList!=null && arList.size()>0){
        	AuthRealname authRealname = arList.get(0);
            Country country = countryService.getByNumberCodeAndDialingCode(authRealname.getCountryCode());
            if(country!=null){
            	authRealname.setCnName(country.getCnName());
            }
            ReflectionUtils.escapeHtml(authRealname);
            return authRealname;
        }
        return null;
        
    }

    @Override
    public void updateStatus(AuthRealname authRealname,String userMessageContent) {
        ReflectionUtils.escapeSql(authRealname);
        authRealnameMapper.updateByPrimaryKeySelective(authRealname);
        authRealname = authRealnameMapper.selectByPrimaryKey(authRealname.getId());
        //User user = userMapper.selectByPrimaryKey(authRealname.getUid());
        User user = new User();
        user.setId(authRealname.getUid());
        Date realnameTime = new Date();
        if(authRealname.getAuthStatus()==1){//实名认证通过
            if(user.getNickname()==null || user.getNickname().equals("")){
                user.setNickname(authRealname.getFamilyName()+authRealname.getName());
            }
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)){//中国用户,则C级认证
                user.setAuthType((byte)3);
            }else{
                user.setAuthType((byte)1);
            }
            user.setAuthLevel((byte)1);
//          user.setRealnameTime(realnameTime);此为通过审核的更新时间，realname_time为实名认证提交时间
            userMapper.updateByPrimaryKeySelective(user);
        }

        if(authRealname.getAuthStatus()==2){//未通过，打回
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)){//中国用户,则C级认证
                user.setAuthType((byte)3);
            }else{
                user.setAuthType((byte)1);
            }
            user.setAuthLevel((byte)0);
            userMapper.updateByPrimaryKeySelective(user);
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)){//中国用户,则C级认证
                AuthCertificateExample example = new AuthCertificateExample();
                AuthCertificateExample.Criteria criteria = example.createCriteria();
                criteria.andUidEqualTo(authRealname.getUid());
                AuthCertificateWithBLOBs record = new AuthCertificateWithBLOBs();
                record.setAuthStatus((byte)2);
                record.setReason("");
                authCertificateService.updateByExampleSelective(record, example);
            }else{
                AuthCertificateA2Example example = new AuthCertificateA2Example();
                AuthCertificateA2Example.Criteria criteria = example.createCriteria();
                criteria.andUidEqualTo(authRealname.getUid());
                AuthCertificateA2WithBLOBs record = new AuthCertificateA2WithBLOBs();
                record.setAuthStatus((byte)2);
                record.setReason("");
                authCertificateA2Service.updateByExampleSelective(record, example);
            }
        }
        UserMessage userMessage = new UserMessage();
        userMessage.setReceiveUid(authRealname.getUid());
        userMessage.setMessageType((byte)5);
        userMessage.setStatus((byte)1);
        userMessage.setMessageContent(userMessageContent);
        userMessage.setCtime(new Date());
        userMessageService.add(userMessage);
    }

    @Override
    public void updateStatusV2(AuthRealname authRealname) {
        ReflectionUtils.escapeSql(authRealname);
        authRealnameMapper.updateByPrimaryKeySelective(authRealname);
        authRealname = authRealnameMapper.selectByPrimaryKey(authRealname.getId());
        //User user = userMapper.selectByPrimaryKey(authRealname.getUid());
        User user = new User();
        user.setId(authRealname.getUid());
        Date realnameTime = new Date();
        if(authRealname.getAuthStatus()==1){//实名认证通过
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)){//中国用户,则C级认证
                user.setAuthType((byte)3);
            }else{
                user.setAuthType((byte)1);
            }
            user.setAuthLevel((byte)2);
            user.setRealnameTime(realnameTime);
            userMapper.updateByPrimaryKeySelective(user);
        }
        
        if(authRealname.getAuthStatus()==2){//未通过，打回
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)){//中国用户,则C级认证
                user.setAuthType((byte)3);
            }else{
                user.setAuthType((byte)1);
            }
            user.setAuthLevel((byte)0);
            userMapper.updateByPrimaryKeySelective(user);
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)){//中国用户,则C级认证
                AuthCertificateExample example = new AuthCertificateExample();
                AuthCertificateExample.Criteria criteria = example.createCriteria();
                criteria.andUidEqualTo(authRealname.getUid());
                AuthCertificateWithBLOBs record = new AuthCertificateWithBLOBs();
                record.setAuthStatus((byte)2);
                record.setReason("");
                authCertificateService.updateByExampleSelective(record, example);
            }else{
                AuthCertificateA2Example example = new AuthCertificateA2Example();
                AuthCertificateA2Example.Criteria criteria = example.createCriteria();
                criteria.andUidEqualTo(authRealname.getUid());
                AuthCertificateA2WithBLOBs record = new AuthCertificateA2WithBLOBs();
                record.setAuthStatus((byte)2);
                record.setReason("");
                authCertificateA2Service.updateByExampleSelective(record, example);
            }
        }
        this.userLogEvent(authRealname, user);
    }

    /**
     * 用户认证信息打点
     * @param authRealname
     */
    private void userLogEvent(AuthRealname authRealname, User user) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = new JSONObject();
        json.put("user_id", authRealname.getUid());
        json.put("auth_level", user.getAuthLevel());
        json.put("auth_type", user.getAuthType());
        json.put("auth_status", authRealname.getAuthStatus());
        json.put("country_code", authRealname.getCountryCode());
        json.put("certificate_type", authRealname.getCertificateType());
        json.put("certificate_number", authRealname.getCertificateNumber());
        json.put("family_name", authRealname.getFamilyName());
        json.put("begin_date", authRealname.getBeginDate()==null? "" : format.format(authRealname.getBeginDate()));
        json.put("end_date", authRealname.getEndDate()==null? "":format.format(authRealname.getEndDate()));
        log.log(EventType.USER_AUTH_USER, json.toJSONString(), LogType.JSON);
    }
    
	@Override
	public void updateStatusVZeniex(AuthRealname authRealname,String userMessageContent) {
        ReflectionUtils.escapeSql(authRealname);
        authRealnameMapper.updateByPrimaryKeySelective(authRealname);
        authRealname = authRealnameMapper.selectByPrimaryKey(authRealname.getId());
        //User user = userMapper.selectByPrimaryKey(authRealname.getUid());
        User user = new User();
        user.setId(authRealname.getUid());
        Date realnameTime = new Date();
        if(authRealname.getAuthStatus()==1){//实名认证通过
            if(user.getNickname()==null || user.getNickname().equals("")){
                user.setNickname(authRealname.getFamilyName()+authRealname.getName());
            }
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE) || authRealname.getCountryCode().equals(Constants.KOREA_CODE)){//中国用户,则C级认证
                user.setAuthType((byte)3);
            }else{
                user.setAuthType((byte)1);
            }
            user.setAuthLevel((byte)1);
//          user.setRealnameTime(realnameTime);此为通过审核的更新时间，realname_time为实名认证提交时间
            userMapper.updateByPrimaryKeySelective(user);
        }

        if(authRealname.getAuthStatus()==2){//未通过，打回
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)|| authRealname.getCountryCode().equals(Constants.KOREA_CODE) ){//中国用户,则C级认证
                user.setAuthType((byte)3);
            }else{
                user.setAuthType((byte)1);
            }
            user.setAuthLevel((byte)0);
            userMapper.updateByPrimaryKeySelective(user);
            if(authRealname.getCountryCode().equals(Constants.CHINAL_CODE)|| authRealname.getCountryCode().equals(Constants.KOREA_CODE) ){//中国用户,则C级认证
                AuthCertificateExample example = new AuthCertificateExample();
                AuthCertificateExample.Criteria criteria = example.createCriteria();
                criteria.andUidEqualTo(authRealname.getUid());
                AuthCertificateWithBLOBs record = new AuthCertificateWithBLOBs();
                record.setAuthStatus((byte)2);
                record.setReason("");
                authCertificateService.updateByExampleSelective(record, example);
            }else{
                AuthCertificateA2Example example = new AuthCertificateA2Example();
                AuthCertificateA2Example.Criteria criteria = example.createCriteria();
                criteria.andUidEqualTo(authRealname.getUid());
                AuthCertificateA2WithBLOBs record = new AuthCertificateA2WithBLOBs();
                record.setAuthStatus((byte)2);
                record.setReason("");
                authCertificateA2Service.updateByExampleSelective(record, example);
            }
        }
        UserMessage userMessage = new UserMessage();
        userMessage.setReceiveUid(authRealname.getUid());
        userMessage.setMessageType((byte)5);
        userMessage.setStatus((byte)1);
        userMessage.setMessageContent(userMessageContent);
        userMessage.setCtime(new Date());
        userMessageService.add(userMessage);
    }

    /**
     *
     * 组装 authRealname 对象
     *
     * @param authRealname
     * @param authrealnameId
     * @param uid
     * @param authStatus
     * @param reason
     */
    @Override
    public void setAuthRealname(AuthRealname authRealname, Integer authrealnameId, Integer uid, Integer authStatus, String reason) {
        authRealname.setId(authrealnameId);
        authRealname.setUid(uid);
        authRealname.setAuthStatus((byte)authStatus.intValue());
        authRealname.setReason(reason);
    }

}