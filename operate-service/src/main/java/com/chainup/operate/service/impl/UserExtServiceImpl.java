package com.chainup.operate.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.UserExtMapper;
import com.chainup.common.exchange.entity.UserExt;
import com.chainup.common.exchange.entity.UserExtExample;
import com.chainup.operate.service.UserExtService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class UserExtServiceImpl implements UserExtService{
    @Autowired
    private UserExtMapper userExtMapper;

    @Override
    public void add(UserExt user) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(user);
        userExtMapper.insert(user);
    }

   

    @Override
    public List<UserExt> findAll(UserExtExample example) {
        List<UserExt> list = userExtMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(list);
        return list;
    }

    @Override
    public UserExt findById(Integer id) {
        // TODO Auto-generated method stub
        UserExt userExt = userExtMapper.selectByPrimaryKey(id);
        ReflectionUtils.escapeHtml(userExt);
        return userExt;
    }



    @Override
    public Map<Integer,UserExt> findId2UserExtByUIDS(List<Integer> uIDS) {
        // TODO Auto-generated method stub
        UserExtExample example = new UserExtExample();
        example.createCriteria().andUidIn(uIDS);
        Map<Integer,UserExt> id2UserExt = new HashMap<Integer,UserExt>();
        List<UserExt> ueList = userExtMapper.selectByExample(example);
        ReflectionUtils.escapeHtml(ueList);
        if(ueList!=null){
            for(UserExt u:ueList){
                if(!id2UserExt.containsKey(u.getUid())){
                    id2UserExt.put(u.getUid(), u);
                }
            }
        }
        return id2UserExt;
    }
    
    
}