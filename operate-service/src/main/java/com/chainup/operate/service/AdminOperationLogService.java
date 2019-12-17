package com.chainup.operate.service;

import java.util.List;
import com.chainup.common.exchange.entity.AdminOperationLog;
import com.chainup.common.exchange.entity.AdminOperationLogExample;

/**
 * 后台操作日志管理接口类
 * Created by zhangkezhu on 2017/10/23.
 */
public interface AdminOperationLogService {
    //操作日志类型
    public static Integer OPERATION_LOG_FREEZE_TRANSACTION = 1;		//冻结交易
    public static Integer OPERATION_LOG_UNFREEZE_TRANSACTION = 2;		//解冻交易
    public static Integer OPERATION_LOG_FREEZE_LOGIN = 3;		        //冻结登录
    public static Integer OPERATION_LOG_UNFREEZE_LOGIN = 4;		    //解冻登录
    public static Integer OPERATION_LOG_FREEZE_WITHDRAW = 5;		    //冻结提现
    public static Integer OPERATION_LOG_UNFREEZE_WITHDRAW = 6;		//解冻提现
    public static Integer OPERATION_LOG_MODIY_MOBILE = 7;		        //修改绑定手机号
    public static Integer OPERATION_LOG_MODIY_ASSETS = 8;		        //修改资产平账
    public static Integer OPERATION_LOG_MODIY_ACCOUNT = 9;		        //修改资金流水平账
    public static Integer OPERATION_LOG_MODIY_VIP = 10;		        //修改VIP等级

    /**
     * 添加日志
     *
     * @param user_id 用户ID
     * @param event_type 操作类型
     * @param manager_id 管理员id
     * @param front_desc 修改前设置
     * @param behind_desc 修改后设置
     */
    Integer add(Integer user_id,Integer event_type,Integer manager_id,String front_desc,String behind_desc);

    /**
     * 根据条件查询日志
     *
     * @param example
     * @return
     */
    Integer count(AdminOperationLogExample example);

    /**
     * 根据条件查询日志列表
     *
     * @param example
     * @return
     */
    List<AdminOperationLog> findAll(AdminOperationLogExample example);

    /**
     * 根据条件删除日志
     *
     * @param example
     * @return
     */
    void delete(AdminOperationLogExample example);

}
