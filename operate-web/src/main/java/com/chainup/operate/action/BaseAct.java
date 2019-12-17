package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainup.common.enums.Language;
import com.chainup.common.util.IPv4Util;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.chainup.common.entity.AliyunValidateCode;

import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionExample;
import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleAction;
import com.chainup.common.exchange.entity.AdminRoleActionExample;
import com.chainup.common.exchange.entity.AdminRoleExample;
import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.StringTool;
import com.chainup.common.util.ValidateCodeUtil;
import com.chainup.operate.service.AdminActionService;
import com.chainup.operate.service.AdminOperationLogService;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.AdminRoleActionService;
import com.chainup.operate.service.AdminRoleService;
import com.chainup.operate.service.AdminRoleUserService;
import com.chainup.operate.service.AdminUserService;
import com.chainup.operate.service.SystemConfigService;
import com.chainup.operate.service.ValidLoginApiService;
import com.chainup.operate.util.OperatePropertyUtil;

@Controller
public class BaseAct {
	protected static final Logger logger = LoggerFactory.getLogger(BaseAct.class);
	public static final String				ADMIN_USER					= "admin_user";

	public static final Integer				LOGIN_FAILD_COUNT			= 5;

	public static final String				AUTH_STATUS					= "1";

	public static final Integer				SUCCESS_ONE					= 1;

	public static final Integer				EXCEPTION_ONE				= -1;

	public static final Integer				EXCEPTION_TWO				= -2;

	public static final Integer				EXCEPTION_THREE				= -3;

	public static final Integer				EXCEPTION_FOUR				= -4;

	public static final Integer				EXCEPTION_FIVE				= -5;

	public static final Integer				EXCEPTION_999				= 999;

	public static final Integer				CURRENT_PAGE_SIZE			= 20;

	public static final Integer				CURRENT_PAGE_SIZE_TEN		= 10;

	public static final Integer				FAIL_VALID_TOKEN			= 403;

	public final static SimpleDateFormat	yyyy_format					= new SimpleDateFormat("yyyy");

	public final static SimpleDateFormat	ym_format					= new SimpleDateFormat("yyyy-MM");

	public final static SimpleDateFormat	ym_format_x					= new SimpleDateFormat("yyyy/MM");

	public final static SimpleDateFormat	ymd_format					= new SimpleDateFormat("yyyy-MM-dd");

	public final static SimpleDateFormat	ymdhms_format				= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static final String				TIME_START_STR				= " 00:00:00";

	public static final String				TIME_END_STR				= " 23:59:59";

	public final static String				SMS_VALID_CODE				= "smsValidCode";

	public final static String				MOBILE_AND_SMS_VALID_CODE	= "smsValidCodeMobile";

	public final static String				SEND_SMS_MOBILE_TIME		= "sendSmsMobileAndTime";

	public final static String				SEND_EMAIL_TIME				= "sendEmailAndTime";

	public final static String				EMAIL_VALID_CODE			= "emainValidCode";

	protected AdminUser						adminUser;																	// 登录用户

	@Autowired
	protected AdminActionService			adminActionService;

	@Autowired
	protected AdminRoleService				adminRoleService;

	@Autowired
	protected AdminUserService				adminUserService;

	@Autowired
	protected AdminRoleUserService			adminRoleUserService;

	@Autowired
	protected AdminRoleActionService		adminRoleActionService;

	@Autowired
	protected AdminOptLogService			adminOptLogService;															// 操作日志接口

	@Autowired
	protected AdminOperationLogService		adminOperationLogService;													// 管理员操作日志接口

	@Autowired
	protected MessageSource					messageSource;

	@Autowired
	protected SystemConfigService			systemConfigService;

	@Autowired
	private ValidLoginApiService			validLoginApiService;

	protected static boolean				isActionChang				= false;										// 权限是否有发生变化，当修改权限，角色的时候需要置为true

	public String execute(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		String result = "";
		adminUser = (AdminUser) request.getSession().getAttribute(ADMIN_USER);
		if (adminUser != null) {
			String date_format = OperatePropertyUtil.getProperties("system_date_format");
			model.addAttribute("date_format", date_format);

			model.addAttribute("adminUser", adminUser);
			result = "1";

			// 获取权限列表
			String actionY = (String) request.getSession().getAttribute("actionY");
			if (isActionChang) {
				actionY = null;
			}
			if (actionY == null || actionY.isEmpty()) {
				// 权限列表
				List<AdminAction> actionList = getActionList(request);
				actionY = "";
				for (AdminAction action : actionList) {
					actionY += action.getAtName() + ",";
				}
				// 顶部一级导航列表
				List<AdminAction> navList = getNavList(actionList, request);
				for (AdminAction adminAction : navList) {
					String actionDes = getLocalMsg(adminAction.getAtName(), request);
					if (actionDes != null) {
						adminAction.setAtDes(actionDes);
					}
				}
				request.getSession().setAttribute("actionY", actionY);
				request.getSession().setAttribute("navList", navList);
			}
			model.addAttribute("actionY", actionY);
		}
		String lang = this.getLocalLanguage(request);
		model.addAttribute("lang", lang);
		model.addAttribute("langList", Language.getStartLanguage());
		String nc_appkey = OperatePropertyUtil.getProperties("aliyun_nc_appkey");
		model.addAttribute("nc_appkey", nc_appkey);
		return result;
	}

	// 权限校验
	public boolean validateAction(HttpServletRequest request, String action) throws Exception {
		List<AdminAction> actionList = getActionList(request);
		for (AdminAction adminAction : actionList) {
			if (adminAction.getAtName().equals(action)) {
				return true;
			}
		}
		return false;
	}

	// 获取当前用户权限
	public List<AdminAction> getActionList(HttpServletRequest request) {
		if (adminUser == null) {
			return new ArrayList<AdminAction>();
		}

		List<AdminAction> actionList = null;
		if (adminUser.getId().equals(1)) {// 超级管理拥有所有权限
			actionList = adminActionService.findAll(new AdminActionExample());
			return actionList;
		}

		// 获取用户与角色关系
		AdminRoleUserExample roleUserExample = new AdminRoleUserExample();
		roleUserExample.createCriteria().andAdIdEqualTo(adminUser.getId());
		List<AdminRoleUser> adminRoleUsers = adminRoleUserService.findAll(roleUserExample);

		List<Integer> roles = new ArrayList<Integer>();
		for (AdminRoleUser user : adminRoleUsers) {
			roles.add(user.getRlId());
		}

		// 查看该用户是否具有超级管理员角色
		AdminRoleExample roleExample = new AdminRoleExample();
		roleExample.createCriteria().andIdIn(roles);
		List<AdminRole> roleList = adminRoleService.findAll(roleExample);
		for (AdminRole role : roleList) {
			if (role.getRlType()) {// 超级管理员拥有所有权限
				actionList = adminActionService.findAll(new AdminActionExample());
				return actionList;
			}
		}

		// 获取角色与权限关系
		AdminRoleActionExample roleActionExample = new AdminRoleActionExample();
		roleActionExample.createCriteria().andRlIdIn(roles);
		List<AdminRoleAction> adminRoleActions = adminRoleActionService.findAll(roleActionExample);

		// 获取权限
		List<Integer> actions = new ArrayList<Integer>();
		for (AdminRoleAction action : adminRoleActions) {
			actions.add(action.getAtId());
		}
		AdminActionExample actionExample = new AdminActionExample();
		actionExample.createCriteria().andIdIn(actions);
		actionList = adminActionService.findAll(actionExample);
		return actionList;
	}

	// 获取一组长导航菜单列表
	public List<AdminAction> getNavList(List<AdminAction> actionList, HttpServletRequest request) {
		// 菜单列表
		List<AdminAction> navList = new ArrayList<>();

		// 找一级菜单
		for (AdminAction action : actionList) {
			if (action.getParentId() == 0) {
				String actionDes = getLocalMsg(action.getAtName(), request);
				if (actionDes != null) {
					action.setAtDes(actionDes);
				}
				navList.add(action);
			}
		}
		return navList;
	}

	public String getRemoteAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null) {
			ip = request.getRemoteAddr();
		} else {
			StringTokenizer tokenizer = new StringTokenizer(ip, ",");
			for (int i = 0; i < tokenizer.countTokens() - 1; i++) {
				tokenizer.nextElement();
			}
			ip = tokenizer.nextToken().trim();
			if (ip.equals("")) {
				ip = null;
			}
		}
		if (ip == null) {
			ip = "0.0.0.0";
		}
		return ip;
	}

	/**
	 * 以JSON字符串格式输出
	 * 
	 * @param jsonStr
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void writeJson(String jsonStr, HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Expires", "0");
			response.setHeader("Pragma", "No-cache");
			response.getWriter().write(jsonStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 根据国际化资源文件key,获取相应的值
	 * 
	 * @param key
	 * @return
	 */
	public String getLocalMsg(String key, HttpServletRequest request) {
		try {
			LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
			Locale locale;
			if (localeResolver != null) {
				locale = localeResolver.resolveLocale(request);
			} else {
				locale = request.getLocale(); // 如果没有设置，使用系统默认
			}
			return messageSource.getMessage(key, null, locale); // 通过key获取国际化文件中的value
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 获取语言种类
	 * 
	 * @param request
	 * @return
	 */
	public String getLocalLanguage(HttpServletRequest request) {
		try {
			LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
			Locale locale;
			if (localeResolver != null) {
				locale = localeResolver.resolveLocale(request);
			} else {
				locale = request.getLocale(); // 如果没有设置，使用系统默认
			}
			return locale.getLanguage();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 提交中文时使用此方法获取正确的中文值
	 * 
	 * @param str
	 * @param request
	 * @return
	 */
	public String getSafeUtf8(String str, HttpServletRequest request) {
		try {
			if (str == null || str == "") {
				return str;
			}
			String encode = request.getCharacterEncoding();
			if (encode == null || (!encode.contains("UTF-8") && !encode.contains("utf-8"))) {
				byte source[] = str.getBytes("iso8859-1");
				return new String(source, "UTF-8");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	// 获取IP地址
	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		logger.info("getIpAddr , ip={}", ip);
		if(!IPv4Util.checkIp(ip)){
			return "0.0.0.0";
		}
		return ip;
	}

	/**
	 * 添加日志
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param table
	 *            操作表名
	 * @param type
	 *            操作类型，详见AdminOptLogService定义
	 * @param des
	 *            操作说明
	 */
	public void writeLog(HttpServletRequest request, String table, Integer type, String des) {
		if (adminUser == null) {
			adminUser = (AdminUser) request.getSession().getAttribute(ADMIN_USER);
		}
		adminOptLogService.add(adminUser.getId(), table, type, getIpAddr(request), des);
	}

	/**
	 * 添加管理员操作用户日志
	 *
	 * @param request
	 *            HttpServletRequest
	 * @param user_id
	 *            用户id
	 * @param event_type
	 *            操作类型，详见AdminOperationLogService定义
	 * @param front_desc
	 *            修改前设置
	 * @param behind_desc
	 *            修改后设置
	 */
	public void writeManagerLog(HttpServletRequest request, Integer user_id, Integer event_type, String front_desc,
			String behind_desc) {
		if (adminUser == null) {
			adminUser = (AdminUser) request.getSession().getAttribute(ADMIN_USER);
		}
		adminOperationLogService.add(user_id, event_type, adminUser.getId(), front_desc, behind_desc);
	}

	/**
	 * 根据国际化文件中配置的key的值组装前端需要的list
	 * 
	 * @param keyValue
	 * @return
	 */
	public List<Map<String, String>> getListByKeyValue(String keyValue) {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		List<String> strList = StringTool.stringToList(keyValue, ",");
		if (strList == null || strList.size() == 0) {
			return null;
		} else {
			int i = 1;
			for (String str : strList) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("value", String.valueOf(i++));
				map.put("name", str);
				list.add(map);
			}
		}
		return list;
	}

	/**
	 * 根据索引值获取对应内容
	 * 
	 * @param key_value_index
	 * @return
	 */
	public String getKeyValueByIndex(String keyValue, Byte key_value_index) {
		try {
			List<String> strList = StringTool.stringToList(keyValue, ",");
			return strList.get(key_value_index - 1);
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 校验阿里验证码
	 * 
	 * @param aliyunValidateCode
	 * @return
	 */
	public boolean checkAuthCode(AliyunValidateCode aliyunValidateCode) {
//		return ValidateCodeUtil.checkAliyunValidate(aliyunValidateCode);
		return true;
	}

	/**
	 * 带手机号的短信验证码校验
	 * 
	 * @param mobileNumber
	 * @param smsValidateCode
	 * @param request
	 * @return
	 */
	public boolean checkSMSValidateCode(String mobileNumber, String smsValidateCode, HttpServletRequest request) {
		if (request.getSession().getAttribute(SMS_VALID_CODE + mobileNumber) != null) {
			String smsCode = request.getSession().getAttribute(SMS_VALID_CODE + mobileNumber).toString();
			if (!smsValidateCode.equals(smsCode)) {
				// 短信验证码不正确
				return false;
			} else {
				request.getSession().removeAttribute(SMS_VALID_CODE + mobileNumber);
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * 检验登入账号是否已经受限
	 * 
	 * @param account
	 * @param request
	 * @return
	 */
	public boolean isReuseLogin(String account, HttpServletRequest request) {
		return validLoginApiService.isLockAccount(account);
	}

	/**
	 * 设置登录错误次数
	 * 
	 * @param account
	 * @param request
	 * @return
	 */
	public void changeLoginFaild(String account, HttpServletRequest request) {
		String refuse = validLoginApiService.getLoginFaildCount(account);
		Integer count = 1;
		// 在5分钟内登录失败得次数
		Long expireTime = 5 * 60L;
		if (StringUtils.isNumeric(refuse)) {
			count = Integer.valueOf(refuse) + count;
			if (LOGIN_FAILD_COUNT.equals(count)) {
				// 一天限制
				expireTime = 24 * 60 * 60L;
				// redis中添加账号锁定状态
				validLoginApiService.lockAccount(account, expireTime);
				// 清除redis里面得登录失败次数
				validLoginApiService.removeLoginFaildCount(account);
				return;
			}
		}
		validLoginApiService.addLoginFaildCount(account, String.valueOf(count), expireTime);
	}

	/**
	 * 清除录错误次数
	 * 
	 * @param account
	 * @param request
	 * @return
	 */
	public void clearLoginFaild(String account, HttpServletRequest request) {
		validLoginApiService.removeLoginFaildCount(account);
	}

	/**
	 * 清除登限制
	 * 
	 * @param account
	 * @param request
	 * @return
	 */
	public void unlockAccount(String account, HttpServletRequest request) {
		validLoginApiService.unLockAccount(account);
	}

	protected boolean validToken(HttpServletRequest request) {
		String tokenHeader = request.getHeader("CSRFToken");
		if (StringUtils.isNotBlank(tokenHeader)) {
			tokenHeader = tokenHeader.replace("\"", "");
			// 取出session中的token
			HttpSession session = request.getSession();
			String tokenSession = (String) session.getAttribute("token");
			// 比较session中的token和tokenHeader中的token是否相等
			if (!tokenSession.equals(tokenHeader)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 根据配置获取公司名称
	 * 
	 * @param request
	 * @return
	 */
	public String getCompanyName(HttpServletRequest request) {
		String value = "";
		try {
			//获取当前语言
			LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
			Locale locale;
			if (localeResolver != null) {
				locale = localeResolver.resolveLocale(request);
			} else {
				locale = request.getLocale(); // 如果没有设置，使用系统默认
			}
			String language = locale.getLanguage();
			
			value = PropertyUtil.getProperties("company_name"+ "_"+ language);
		} catch (Exception e) {

		}
		if (StringUtils.isEmpty(value)) {
			value = "Finance";
		}
		return value;
	}

	/**
	 * 检查参数
	 * @param params
	 * @return
	 */
	protected Boolean checkParams(Map<String, String> params) {
		for(Map.Entry<String, String> param : params.entrySet()) {
			if(org.apache.commons.lang.StringUtils.isBlank(param.getValue())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 检查参数
	 * @param params
	 * @return
	 */
	protected Boolean checkParams(Map<String, String> params, List<String> notCheckParams) {
		for(Map.Entry<String, String> param : params.entrySet()) {
			if(notCheckParams.indexOf(param.getKey())>=0) {
				continue;
			}
			if(org.apache.commons.lang.StringUtils.isBlank(param.getValue())) {
				logger.info(param.getValue());
				return false;
			}
		}
		return true;
	}
	protected String outputError(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		MyEConfig config = CommonContainer.getSite();
		FrontUtils.frontData(request, model, config);
		model.addAttribute("error", getLocalMsg("noaction_error", request));
		return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
	}
}
