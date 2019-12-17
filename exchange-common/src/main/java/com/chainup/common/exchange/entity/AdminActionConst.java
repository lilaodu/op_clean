package com.chainup.common.exchange.entity;

/**
 * 权限标识定义，不冲突的情况下一般为
 */
public class AdminActionConst{
	// 系统参数设置
	public static String systemConfig = "systemConfig"; // 系统参数列表
	public static String systemConfigSetting = "systemConfigSetting"; // 系统参数设置
	
	//管理员相关权限 
    public static String adminUser = "adminUser";				//管理员列表
    public static String adminUserAdd = "adminUserAdd";			//添加管理员
    public static String adminUserEdit = "adminUserEdit";		//编辑管理员
    public static String adminUserDel = "adminUserDel";			//删除管理员
    
    //权限管理相关权限
    public static String adminAction = "adminAction";			//权限列表
    public static String adminActionAdd = "adminActionAdd";		//添加权限
    public static String adminActionEdit = "adminActionEdit";	//编辑权限
    public static String adminActionDel = "adminActionDel";		//删除权限
    
    //管理员角色相关权限
    public static String adminRole = "adminRole";				//角色列表
    public static String adminRoleAdd = "adminRoleAdd";			//添加角色
    public static String adminRoleEdit = "adminRoleEdit";		//编辑角色
    public static String adminRoleDel = "adminRoleDel";			//删除角色
    public static String adminRoleActionSet = "adminRoleActionSet";	//分派权限
    
    //日志相关权限
    public static String adminOptLog = "adminOptLog";			//日志列表
    public static String adminOptLogDel = "adminOptLogDel";		//删除日志
    

    // 站内服务权限
    public static String noticeInfoManager = "noticeInfoManager";	//公告管理
    public static String noticeInfoAdd = "noticeInfoAdd";			//新增公告
    public static String noticeInfoEdit = "noticeInfoEdit";			//编辑公告
    public static String noticeInfoDel = "noticeInfoDel";			//删除公告
    
    public static String rqInfoManager = "rqInfoManager";			//工单管理
    public static String rqInfoReply = "rqInfoReply";				//回复工单
    public static String rqInfoDel = "rqInfoDel";					//删除工单
    public static String rqInfoClose = "rqInfoClose";			//关闭工单
    
    public static String stationMessageManager = "stationMessageManager";	//站内信管理
    public static String stationMessageAdd = "stationMessageAdd";	//新增站内信
    
    //CMS系统
    public static String cmsArticleType = "cmsArticleType";	//文章分类管理
    public static String cmsArticle = "cmsArticle";			//文章管理
    public static String cmsArticleTypeAdd = "cmsArticleTypeAdd";	//新增文章分类
    public static String cmsArticleTypeEdit = "cmsArticleTypeEdit";	//编辑文章分类
    public static String cmsArticleTypeDelete = "cmsArticleTypeDelete";	//删除文章分类
    public static String cmsArticleAdd = "cmsArticleAdd";	//新增文章
    public static String cmsArticleEdit = "cmsArticleEdit";	//编辑文章
    public static String cmsArticleDelete = "cmsArticleDelete";	//删除文章
    
    public static String cmsAdvert = "cmsAdvert";			//首页轮播广告
    public static String cmsAdvertAdd = "cmsAdvertAdd";		//新增广告
    public static String cmsAdvertEdit = "cmsAdvertEdit";	//编辑广告
    public static String cmsAdvertDel = "cmsAdvertDel";		//删除广告
    
    //会员相关权限
    public static String user = "user";	//会员列表
    public static String updateStatus = "updateStatus";			//更改会员状态
    public static String deleteGoogleAuth = "deleteGoogleAuth";			//更改会员状态
    
    //统计相关权限
    public static String registerStatistics = "registerStatistics";	//注册统计
    public static String loginStatistics = "loginStatistics";			//登录统计
    
    //实名认证相关权限
    public static String authRealname = "authRealname";	//实名认证列表
    public static String authRealnameDetail = "authRealnameDetail"; //实名认证详细信息
    public static String updateAuthRealnameStatus = "updateAuthRealnameStatus"; //更改实名认证状态
    public static String authCertificateDetail = "authCertificateDetail"; //C2认证详细信息
    public static String updateCertificateRealnameStatus = "updateCertificateRealnameStatus"; //更改C2认证状态
    public static String authCertificateA2Detail = "authCertificateA2Detail"; //A2认证详细信息
    public static String updateCertificateA2RealnameStatus = "updateCertificateA2RealnameStatus"; //更改A2认证状态
    
    //资讯管理
    public static String news ="news";		//资讯管理
    public static String newsAdd ="newsAdd";	//新增资讯
    public static String newsEdit ="newsEdit";	//编辑资讯
    public static String newsDelete ="newsDelete";	//删除资讯


    //财务管理
    //财务报表
    public static String balanceSheet = "balanceSheet"; //资产负债
    public static String cashFlow = "cashFlow"; //现金流量
    public static String profit = "profit"; //利润
    //充值提现
    public static String deposit = "deposit"; //法币充值
    public static String depositCrypto = "depositCrypto"; //虚拟币充值
    public static String withdraw = "withdraw"; //法币提现
    public static String withdrawCrypto = "withdrawCrypto"; //虚拟币提现
    public static String withdrawCryptoAudit = "withdrawCryptoAudit"; //ajax json：虚拟币提现审核
    public static String coldAddress = "coldAddress"; //冷钱包地址查看
    //手续费管理
    public static String feeSetting = "feeSetting"; //手续费设置
    public static String changeFeeSetting = "changeFeeSetting"; //ajax，json：手续费设置
    //转账管理
    public static String transfer = "transfer";//转账工具
    public static String transferRecord = "record";//转账记录

    public static String  userDetailBillingCheck = "userDetailBillingCheck"; //用户详情页：对账信息
    public static String  userDetailDeposit = "userDetailDeposit"; //用户详情页：对账信息
    public static String  userDetailWithdraw = "userDetailWithdraw"; //用户详情页：对账信息
    public static String  billingTransfer = "billingTransfer"; //用户调账工具
    
    public static String presentCoin = "presentCoin";	//赠币
    public static String presentCoinPage = "presentCoinPage";	//赠币
    public static String presentCoinList = "presentCoinList";	//赠币

    public static String feeDiscount = "feeDiscount";		//添加用户手续费
    
//    public static String tradeTransactions = "tradeTransactions";  //交易记录页面
    public static String checkTradeTransactions = "checkTradeTransactions";  //查看交易记录列表
    public static String checkOrderRecord = "checkOrderRecord";  //查看挂单记录列表
    
    
    //票行相关权限
    public static String coinBank = "coinBank";  //票行权限
    public static String coinBankIndex = "coinBankIndex";  //票行权限（查看票行列表）
    public static String coinBankCheck = "coinBankCheck";  //票行权限（票行审核列表）
    public static String coinBankCheckDetail = "coinBankCheckDetail";  //票行权限（票行审核信息）
    public static String coinBankLookDetail = "coinBankLookDetail";  //票行权限（查看票行详情）
    public static String coinBankUpdateStatus = "coinBankUpdateStatus";  //票行权限（修改票行审核状态权限）
    public static String coinBankFeeCheck = "coinBankFeeCheck";  //票行权限（手续费审核列表）
    public static String coinBankFeeDetail = "coinBankFeeDetail";  //票行权限（手续费审核详情列表）
    public static String coinBankLevelCheck = "coinBankLevelCheck";  //票行权限（手续费审核详情列表）

    //资产相关权限
    public static String assets = "assets";  //资产管理
    public static String advertManage = "advertManage"; //广告管理
    public static String advertCheck = "advertCheck"; //审核功能
    public static String advertCheckDetail = "advertCheckDetail"; //广告详细信息


}