package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserExample;

/**
 * 后台管理用户服务接口类
 * 
 * @author cxb
 *
 */
public interface UserService {
    /**
     * 添加
     * 
     * @param User
     */
    void add(User User);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(UserExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<User> findAll(UserExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    User findById(Integer id);
    
    int updateByPrimaryKey(User record);
    
    int countByCtime(String ctimeStart,String ctimeEnd);
    
    List<User> listByPage(Integer start,Integer pageSize,String ctimeStart,String ctimeEnd);
    
    /**
     * 根据条件查询用户实名信息（useless）
     * 
     * @param
     * @return
     */
    List<User> findAuthInfoByPage(Integer authStatus, Integer authLevel,String timestart,String timeend, String language,Integer start,Integer pageSize,Integer uid,String keyword);

    /**
     * 根据条件查询用户实名信息
     *
     * @param
     * @return
     */
    List<User> findAuthInfoByPageV2(Integer authStatus, String timestart,String timeend, String language,Integer start,Integer pageSize,Integer uid,String keyword);
    
    /**
     * 获取所有的用户列表
     * 
     * @return
     */
    List<User> findAllUserList();

    /**
     * 通过uid批量获取用户, Map<uid, User>格式
     * @param uids
     * @return
     */
    public Map<Integer, User> findId2UserByUids(List<Integer> uids);
    
    /**
     * 更改用户状态，冻结交易时取消订单
     * @param record
     * @return
     * @throws Exception
     */
    int updateUserStatus(User record) throws Exception ;
    
    int selectAuthRealNameByCount(Integer authStatus,String realnameTimeStart,String realnameTimeEnd, Integer uid,String keyword);
    List<User> selectAuthRealNameBypage(Integer authStatus,String realnameTimeStart,String realnameTimeEnd, Integer uid,String keyword,Integer start,Integer pageSize);
    
    int selectAuthCertificateByCount(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword);
    List<User> selectAuthCertificateBypage(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword,Integer start,Integer pageSize);
    
    int selectAuthCertificateA2ByCount(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword);
    List<User> selectAuthCertificateA2Bypage(Integer authStatus,String certificateTimeStart,String certificateTimeEnd,Integer uid,String keyword,Integer start,Integer pageSize);
}
