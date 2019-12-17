package com.chainup.operate.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.common.exchange.entity.AuthCertificate;
import com.chainup.common.exchange.entity.AuthCertificateExample;
import com.chainup.common.exchange.entity.AuthCertificateWithBLOBs;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserMessage;
import com.chainup.common.util.ReflectionUtils;
import com.chainup.exchange.dao.AuthCertificateMapper;
import com.chainup.exchange.dao.UserMapper;
import com.chainup.operate.service.AuthCertificateService;
import com.chainup.operate.service.SystemConfigService;
import com.chainup.operate.service.UserMessageService;

@Service
public class AuthCertificateServiceImpl implements AuthCertificateService{
    @Autowired
    private AuthCertificateMapper authCertificateMapper;
    @Autowired
    private UserMessageService userMessageService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SystemConfigService systemConfigService;
    @Override
    public void add(AuthCertificateWithBLOBs record) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(record);
        authCertificateMapper.insert(record);
    }

    @Override
    public Integer count(AuthCertificateExample example) {
        // TODO Auto-generated method stub
        return authCertificateMapper.countByExample(example);
    }

    @Override
    public List<AuthCertificate> findAll(AuthCertificateExample example) {
        // TODO Auto-generated method stub
        List<AuthCertificate> list = authCertificateMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(list);
        return list;
    }

    @Override
    public AuthCertificate findById(Integer id) {
        // TODO Auto-generated method stub
        AuthCertificate authCertificate = authCertificateMapper.selectByPrimaryKey(id);
        ReflectionUtils.escapeHtml(authCertificate);
        return authCertificate;
    }

    @Override
    public Map<Integer, AuthCertificate> findId2AuthCertificateByUIDS(List<Integer> uids) {
        AuthCertificateExample example = new AuthCertificateExample();
        example.createCriteria().andUidIn(uids);
        Map<Integer,AuthCertificate> id2AuthRealname = new HashMap<Integer,AuthCertificate>();
        List<AuthCertificate> arList = authCertificateMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(arList);
        if(arList!=null){
            for(AuthCertificate u:arList){
                if(!id2AuthRealname.containsKey(u.getUid())){
                    id2AuthRealname.put(u.getUid(), u);
                }
            }
        }
        return id2AuthRealname;
    }

    @Override
    public int updateByPrimaryKey(AuthCertificateWithBLOBs record) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(record);
        return authCertificateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<AuthCertificateWithBLOBs> findAllWithBlob(AuthCertificateExample example) {
        // TODO Auto-generated method stub
        List<AuthCertificateWithBLOBs> list = authCertificateMapper.selectByExampleWithBLOBs(example);
        ReflectionUtils.escapeHtml(list);
        return list;
    }

    @Override
    public int updateByExampleSelective(AuthCertificateWithBLOBs record, AuthCertificateExample example) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(record);
        return authCertificateMapper.updateByExampleSelective(record, example);
    }

    @Override
    public AuthCertificateWithBLOBs findByUId(Integer uid) {
        // TODO Auto-generated method stub
        AuthCertificateWithBLOBs authCertificate = null;
        AuthCertificateExample example1 = new AuthCertificateExample();
        AuthCertificateExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andUidEqualTo(uid);
        List<AuthCertificateWithBLOBs> arList1 = authCertificateMapper.selectByExampleWithBLOBs(example1);
        if(arList1!=null && arList1.size()>0){
            authCertificate = arList1.get(0);
            if(authCertificate!=null){
                authCertificate.setFirstPh(new String(authCertificate.getFirstPhoto()));
                authCertificate.setSecondPh(new String(authCertificate.getSecondPhoto()));
                authCertificate.setFourthPh(new String(authCertificate.getFourthPhoto()));
            }
        }
        ReflectionUtils.escapeHtml(authCertificate);
        return authCertificate;
    }

    @Override
    public void updateStatus(AuthCertificateWithBLOBs authCertificate,String userMessageContent) {
        ReflectionUtils.escapeSql(authCertificate);
        authCertificateMapper.updateByPrimaryKeySelective(authCertificate);
        User user = userMapper.selectByPrimaryKey(authCertificate.getUid());
        Date realnameTime = new Date();
        if(authCertificate.getAuthStatus()==1){//C2认证通过
            user.setAuthType((byte)3);
            user.setAuthLevel((byte)2);
            user.setCertificateTime(realnameTime);
            userMapper.updateByPrimaryKeySelective(user);
        }
        if(authCertificate.getAuthStatus()==2){//未通过，打回
            user.setAuthLevel((byte)1);
            user.setCertificateTime(realnameTime);
            userMapper.updateByPrimaryKeySelective(user);
        }
        UserMessage userMessage = new UserMessage();
        userMessage.setReceiveUid(authCertificate.getUid());
        userMessage.setMessageType((byte)5);
        userMessage.setStatus((byte)1);
        userMessage.setMessageContent(userMessageContent);
        userMessage.setCtime(new Date());
        userMessageService.add(userMessage);
    }

    @Override
    public void updateStatusV2(AuthCertificateWithBLOBs authCertificate) {
        ReflectionUtils.escapeSql(authCertificate);
        authCertificateMapper.updateByPrimaryKeySelective(authCertificate);
        User user = userMapper.selectByPrimaryKey(authCertificate.getUid());
        Date realnameTime = new Date();
        if(authCertificate.getAuthStatus()==1){//C2认证通过
            user.setAuthType((byte)3);
            user.setAuthLevel((byte)2);
            user.setCertificateTime(realnameTime);
            userMapper.updateByPrimaryKeySelective(user);
        }
        if(authCertificate.getAuthStatus()==2){//未通过，打回
            user.setAuthLevel((byte)1);
            user.setCertificateTime(realnameTime);
            userMapper.updateByPrimaryKeySelective(user);
        }
    }

    /**
     *
     * 组装 authCertificate 对象
     *
     * @param authCertificate
     * @param authCertificateId
     * @param uid
     * @param authStatus
     * @param reason
     */
    @Override
    public void setAuthCertificate(AuthCertificateWithBLOBs authCertificate, Integer authCertificateId, Integer uid, Integer authStatus, String reason) {
        authCertificate.setId(authCertificateId);
        authCertificate.setUid(uid);
        authCertificate.setAuthStatus((byte)authStatus.intValue());
        authCertificate.setReason(reason);
    }
}