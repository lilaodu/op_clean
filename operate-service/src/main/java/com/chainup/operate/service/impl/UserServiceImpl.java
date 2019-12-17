package com.chainup.operate.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chainup.common.web.Constants;
import com.chainup.exchange.dao.UserMapper;
import com.chainup.common.exchange.entity.AuthCertificate;
import com.chainup.common.exchange.entity.AuthCertificateA2;
import com.chainup.common.exchange.entity.AuthRealname;
import com.chainup.common.exchange.entity.TransactionDeposit;
import com.chainup.common.exchange.entity.TransactionDepositCrypto;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserExample;
import com.chainup.common.exchange.entity.UserExample.Criteria;
import com.chainup.common.exchange.entity.UserExt;
import com.chainup.operate.service.AuthCertificateA2Service;
import com.chainup.operate.service.AuthCertificateService;
import com.chainup.operate.service.AuthRealnameService;
import com.chainup.operate.service.ExOrderService;
import com.chainup.operate.service.HistoryLoginService;
import com.chainup.operate.service.TransactionDepositCryptoService;
import com.chainup.operate.service.TransactionDepositService;
import com.chainup.operate.service.TransactionWithdrawCryptoService;
import com.chainup.operate.service.TransactionWithdrawService;
import com.chainup.operate.service.UserExtService;
import com.chainup.operate.service.UserLoginFailService;
import com.chainup.operate.service.UserService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HistoryLoginService historyLoginService;

    @Autowired
    private UserExtService userExtService;
    @Autowired
    private AuthRealnameService authRealnameService;
    @Autowired
    private AuthCertificateService authCertificateService;
    @Autowired
    private AuthCertificateA2Service authCertificateA2Service;
    @Autowired
    private UserLoginFailService userLoginFailService;


    @Override
    public void add(User user) {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(user);
        userMapper.insert(user);
    }

    @Override
    public Integer count(UserExample example) {
        // TODO Auto-generated method stub
        return userMapper.countByExample(example);
    }

    @Override
    public List<User> findAll(UserExample example) {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<User>();
        userList = userMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            List<Integer> uids = new ArrayList<Integer>();
            for (User u : userList) {
                uids.add(u.getId());
            }
            Map<Integer, UserExt> id2UserExt = userExtService.findId2UserExtByUIDS(uids);
            for (User u : userList) {
                boolean hasLock = userLoginFailService.hasLocked(u);
                if (hasLock) {
                    u.setLoginStatus((byte) 0);
                }
                if (id2UserExt.containsKey(u.getId())) {
                    UserExt ue = id2UserExt.get(u.getId());
                    u.setLoginVerify(ue.getLoginVerify());
                    u.setSettingVerify(ue.getSettingVerify());
                    u.setWithdrawVerify(ue.getWithdrawVerify());
                    u.setExchangeVerify(ue.getExchangeVerify());
                    u.setLasttimeExchangeVerify(ue.getLasttimeExchangeVerify());
                } else {
                    UserExt ue = new UserExt();
                    ue.setUid(u.getId());
                    ue.setLoginVerify((byte) 1);
                    ue.setSettingVerify((byte) 1);
                    ue.setWithdrawVerify((byte) 1);
                    ue.setExchangeVerify((byte) 1);
                    ue.setInviteCode("");
                    ue.setInvitedCode("");
                    ue.setSymbols("");
                    ue.setCtime(u.getCtime());
                    ue.setMtime(u.getMtime());
                    ue.setLasttimeExchangeVerify(0);
                    userExtService.add(ue);
                }
            }
        }
        ReflectionUtils.escapeHtml(userList);
        return userList;
    }

    @Override
    public User findById(Integer id) {
        // TODO Auto-generated method stub
        User user = userMapper.selectByPrimaryKey(id);
        boolean hasLock = userLoginFailService.hasLocked(user);
        if (hasLock) {
            user.setLoginStatus((byte) 0);
        }
        ReflectionUtils.escapeHtml(user);
        return user;
    }

    @Override
    public int updateByPrimaryKey(User record){
    	// TODO Auto-generated method stub
    	ReflectionUtils.escapeSql(record);
    	if (record.getLoginStatus() != null && record.getLoginStatus() == 1) {
    		userLoginFailService.unlock(userMapper.selectByPrimaryKey(record.getId()));
    	}
    	return userMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    @Transactional(timeout=600)
    public int updateUserStatus(User record) throws Exception {
        // TODO Auto-generated method stub
        ReflectionUtils.escapeSql(record);
        if (record.getLoginStatus() != null && record.getLoginStatus() == 1) {
            userLoginFailService.unlock(userMapper.selectByPrimaryKey(record.getId()));
        }
        

        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int countByCtime(String ctimeStart,String ctimeEnd) {
        // TODO Auto-generated method stub
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ctimeStart", ctimeStart);
        map.put("ctimeEnd", ctimeEnd);
        return userMapper.countByCtime(map);
    }

    /**
     * 按日期分页
     */
    @Override
    public List<User> listByPage(Integer start, Integer pageSize,String ctimeStart,String ctimeEnd) {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<User>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        map.put("ctimeStart", ctimeStart);
        map.put("ctimeEnd", ctimeEnd);
        userList = userMapper.listByPage(map);
        try {
            if (userList != null && userList.size() > 0) {
                for (User u : userList) {
                    Date temp = u.getCtime();
                    UserExample example = new UserExample();
                    Criteria criteria = example.createCriteria();
                    criteria.andCtimeGreaterThanOrEqualTo(Constants.ymdhms_format.parse(Constants.ymd_format.format(temp) + Constants.TIME_START_STR));
                    criteria.andCtimeLessThanOrEqualTo(Constants.ymdhms_format.parse(Constants.ymd_format.format(temp) + Constants.TIME_END_STR));
                    List<User> uTempList = userMapper.selectByExample(example);

                    if (uTempList != null && uTempList.size() > 0) {
                        u.setRegister(uTempList.size());
                        List<Integer> uids = new ArrayList<Integer>();
                        int bindTel = 0;//绑定手机人数
                        int bindEmail = 0;//绑定邮箱人数
                        int capital = 0;//设置资金密码人数
                        int deposit = 0;//完成充值人数
                        for (User ut : uTempList) {
                            uids.add(ut.getId());
                            if (ut.getMobileNumber() != null && !ut.getMobileNumber().equals("")) {
                                bindTel++;
                            }
                            if (ut.getEmail() != null && !ut.getEmail().equals("")) {
                                bindEmail++;
                            }
                            if (ut.getCapitalPword() != null && !ut.getCapitalPword().equals("")) {
                                capital++;
                            }
                        }
                        u.setBindTel(bindTel);
                        u.setBindEmail(bindEmail);
                        u.setCapital(capital);

                        u.setDeposit(deposit);
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        ReflectionUtils.escapeHtml(userList);
        return userList;
    }

    @Override
    public List<User> findAuthInfoByPage(Integer authStatus, Integer authLevel,String timestart,String timeend, String language,Integer start,Integer pageSize,Integer uid,String keyword) {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<User>();
        if (authLevel == 1) {//实名认证C1
            userList = selectAuthRealNameBypage(authStatus, timestart, timeend, uid, keyword, start, pageSize);
            List<Integer> uids = new ArrayList<Integer>();
            if(userList!=null && userList.size()>0){
                for (User u : userList) {
                    uids.add(u.getId());
                }
                Map<Integer, AuthRealname> id2AuthRealname = authRealnameService.findId2AuthRealnameByUIDS(uids);
                for (User u : userList) {
                    if (id2AuthRealname.containsKey(u.getId())) {
                        AuthRealname ar = id2AuthRealname.get(u.getId());
                        u.setAuthLevel((byte) 1);
                        u.setAuthStatus(ar.getAuthStatus());
                        u.setMtime(ar.getCtime());
                        //u.setRealnameTime(ar.getCtime());
                        if (language.equals("zh")) {
                            u.setRealName(ar.getFamilyName() + ar.getName());
                        } else {
                            u.setRealName(ar.getName() + ar.getFamilyName());
                        }
                    } else {
                        u.setAuthLevel((byte) 0);
                    }
                }
            }
        } else if (authLevel == 2) {//C2认证
            userList = selectAuthCertificateBypage(authStatus, timestart, timeend, uid, keyword, start, pageSize);
            List<Integer> uids = new ArrayList<Integer>();
            if(userList!=null && userList.size()>0){
                for (User u : userList) {
                    uids.add(u.getId());
                }
                Map<Integer, AuthCertificate> id2AuthCertificate = authCertificateService.findId2AuthCertificateByUIDS(uids);
                Map<Integer, AuthRealname> id2AuthRealname = authRealnameService.findId2AuthRealnameByUIDS(uids);
                for (User u : userList) {
                    if (id2AuthCertificate.containsKey(u.getId())) {
                        AuthCertificate ar = id2AuthCertificate.get(u.getId());
                        u.setAuthLevel((byte) 2);
                        u.setAuthStatus(ar.getAuthStatus());
                        u.setMtime(ar.getCtime());
                        //u.setCertificateTime(ar.getCtime());
                    } else {
                        u.setAuthLevel((byte) 0);
                        u.setMtime(null);
                    }
                    if (id2AuthRealname.containsKey(u.getId())) {
                        AuthRealname ar = id2AuthRealname.get(u.getId());
                        if (language.equals("zh")) {
                            u.setRealName(ar.getFamilyName() + ar.getName());
                        } else {
                            u.setRealName(ar.getName() + ar.getFamilyName());
                        }
                    }
                }
            }
        } else if (authLevel == 3) {//A2认证
            userList = selectAuthCertificateA2Bypage(authStatus, timestart, timeend, uid, keyword, start, pageSize);
            List<Integer> uids = new ArrayList<Integer>();
            if(userList!=null && userList.size()>0){
                for (User u : userList) {
                    uids.add(u.getId());
                }
                Map<Integer, AuthCertificateA2> id2AuthCertificate = authCertificateA2Service.findId2AuthCertificateA2ByUIDS(uids);
                Map<Integer, AuthRealname> id2AuthRealname = authRealnameService.findId2AuthRealnameByUIDS(uids);
                for (User u : userList) {
                    if (id2AuthCertificate.containsKey(u.getId())) {
                        AuthCertificateA2 ar = id2AuthCertificate.get(u.getId());
                        u.setAuthLevel((byte) 2);
                        u.setAuthStatus(ar.getAuthStatus());
                        u.setMtime(ar.getCtime());
                        //u.setCertificateTime(ar.getCtime());
                    } else {
                        u.setAuthLevel((byte) 0);
                        u.setMtime(null);
                    }
                    if (id2AuthRealname.containsKey(u.getId())) {
                        AuthRealname ar = id2AuthRealname.get(u.getId());
                        if (language.equals("zh")) {
                            u.setRealName(ar.getFamilyName() + ar.getName());
                        } else {
                            u.setRealName(ar.getName() + ar.getFamilyName());
                        }
                    }
                }
            }
        }
        ReflectionUtils.escapeHtml(userList);
        return userList;
    }

    @Override
    public List<User> findAuthInfoByPageV2(Integer authStatus, String timestart,String timeend, String language,Integer start,Integer pageSize,Integer uid,String keyword) {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<User>();
        userList = selectAuthRealNameBypage(authStatus, timestart, timeend, uid, keyword, start, pageSize);
        List<Integer> uids = new ArrayList<Integer>();
        if(userList!=null && userList.size()>0){
            for (User u : userList) {
                uids.add(u.getId());
            }
            Map<Integer, AuthRealname> id2AuthRealname = authRealnameService.findId2AuthRealnameByUIDS(uids);
                for (User u : userList) {
                    if (id2AuthRealname.containsKey(u.getId())) {
                        AuthRealname ar = id2AuthRealname.get(u.getId());
                        u.setAuthStatus(ar.getAuthStatus());
                        u.setMtime(ar.getCtime());
                        if (language.equals("zh")) {
                            u.setRealName(ar.getFamilyName() + ar.getName());
                        } else {
                            u.setRealName(ar.getName() + ar.getFamilyName());
                        }
                    } else {
                    }
                } 
            }
        ReflectionUtils.escapeHtml(userList);
        return userList;
    }

    @Override
    public List<User> findAllUserList() {
        List<User> userList = userMapper.selectByExample(null);
        ReflectionUtils.escapeHtml(userList);
        return userList;
    }


    @Override
    public Map<Integer, User> findId2UserByUids(List<Integer> uids) {
        if (uids == null || uids.size()<=0) {
            return new HashMap<>();
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIn(uids);
        Map<Integer, User> id2User = new HashMap<Integer, User>();
        List<User> userList = userMapper.selectByExample(userExample);
        ReflectionUtils.escapeHtml(userList);
        if (userList != null) {
            for (User u : userList) {
                if (!id2User.containsKey(u.getId())) {
                    id2User.put(u.getId(), u);
                }
            }
        }
        return id2User;
    }

    @Override
    public int selectAuthRealNameByCount(Integer authStatus,String realnameTimeStart,String realnameTimeEnd, Integer uid,String keyword) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("authStatus", authStatus);
        map.put("uid", uid);
        map.put("keyword", keyword);
        map.put("realnameTimeStart", realnameTimeStart);
        map.put("realnameTimeEnd", realnameTimeEnd);
        return userMapper.selectAuthRealNameByCount(map);
    }

    @Override
    public List<User> selectAuthRealNameBypage(Integer authStatus,String realnameTimeStart,String realnameTimeEnd, Integer uid,String keyword,Integer start,Integer pageSize) {
        List<User> userList = new ArrayList<User>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        map.put("authStatus", authStatus);
        map.put("realnameTimeStart", realnameTimeStart);
        map.put("realnameTimeEnd", realnameTimeEnd);
        map.put("uid", uid);
        map.put("keyword", keyword);
        userList = userMapper.selectAuthRealNameBypage(map);
        return userList;
    }

    @Override
    public int selectAuthCertificateByCount(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("authStatus", authStatus);
        map.put("uid", uid);
        map.put("keyword", keyword);
        map.put("certificateTimeStart", certificateTimeStart);
        map.put("certificateTimeEnd", certificateTimeEnd);
        return userMapper.selectAuthCertificateByCount(map);
    }

    @Override
    public List<User> selectAuthCertificateBypage(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword,Integer start,Integer pageSize) {
        List<User> userList = new ArrayList<User>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        map.put("authStatus", authStatus);
        map.put("uid", uid);
        map.put("keyword", keyword);
        map.put("certificateTimeStart", certificateTimeStart);
        map.put("certificateTimeEnd", certificateTimeEnd);
        userList = userMapper.selectAuthCertificateBypage(map);
        return userList;
    }

    @Override
    public int selectAuthCertificateA2ByCount(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("authStatus", authStatus);
        map.put("uid", uid);
        map.put("keyword", keyword);
        map.put("certificateTimeStart", certificateTimeStart);
        map.put("certificateTimeEnd", certificateTimeEnd);
        return userMapper.selectAuthCertificateA2ByCount(map);
    }

    @Override
    public List<User> selectAuthCertificateA2Bypage(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword,Integer start,Integer pageSize) {
        List<User> userList = new ArrayList<User>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        map.put("authStatus", authStatus);
        map.put("uid", uid);
        map.put("keyword", keyword);
        map.put("certificateTimeStart", certificateTimeStart);
        map.put("certificateTimeEnd", certificateTimeEnd);
        userList = userMapper.selectAuthCertificateA2Bypage(map);
        return userList;
    }
}