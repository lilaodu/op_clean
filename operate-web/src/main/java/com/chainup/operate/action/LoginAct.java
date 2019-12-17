package com.chainup.operate.action;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.LocaleEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.entity.AliyunValidateCode;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.exchange.entity.Country;
import com.chainup.common.exchange.entity.SystemConfig;
import com.chainup.common.util.Base64;
import com.chainup.common.util.MyEAESUtil;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.StringUtil;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.CountryService;
import com.chainup.operate.service.UserLoginFailService;
import com.chainup.operate.util.OperatePropertyUtil;

@Controller
public class LoginAct extends BaseAct {
	
	@Autowired
	private CountryService countryService;
	@Autowired
	private UserLoginFailService userLoginFailService;

	@RequestMapping(value = "/login.html")
	public String login(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			// 修改语言环境请求
			LocaleResolver localeResolver = RequestContextUtils
					.getLocaleResolver(request);
			if (localeResolver != null) {
				String langType = "zh_CN"; // 默认中文
				LocaleEditor localeEditor = new LocaleEditor();
				localeEditor.setAsText(langType);
				localeResolver.setLocale(request, response,
						(Locale) localeEditor.getValue());
				isActionChang = true;
			}
			//国家编码
			List<Country> countryList = countryService.getAllCountryList(getLocalLanguage(request));
			String countryCode = PropertyUtil.getProperties("system_default_country_code");
			model.addAttribute("countryList", countryList);
			model.addAttribute("countryCode", countryCode);

			String lang = this.getLocalLanguage(request);
			model.addAttribute("lang", lang);
			String nc_appkey = OperatePropertyUtil
					.getProperties("aliyun_nc_appkey");
			model.addAttribute("nc_appkey", nc_appkey);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "login");
		} catch (Exception ex) {
			ex.printStackTrace();
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("error", "对不起，程序出现系统错误，请和网站管理员联系，谢谢！");
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
		}
	}

	@RequestMapping(value = "/login_in.html", method = RequestMethod.POST)
	public String login_in(AdminUser adminUser, String captcha,
			String smsAuthCode, AliyunValidateCode aliyunValidateCode,
			HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		try {
			JSONObject jsonStr = new JSONObject();
			Integer result = 0;
			// 校验码验证
			// if (!this.checkAuthCode(aliyunValidateCode)) {
			// // 校验码不正确 -4
			// jsonStr.put("result", EXCEPTION_FOUR);
			// writeJson(jsonStr.toString(), request, response);
			// return null;
			// }
			//
			if (StringUtils.isBlank(adminUser.getMobileNumber())) {
				// 用户名错误 -2
				jsonStr.put("result", EXCEPTION_TWO);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			//验证登录失败次数
			if (super.isReuseLogin(adminUser.getMobileNumber(), request)) {
				// 登录账号受限 -5
				jsonStr.put("result", EXCEPTION_FIVE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			/*String noSendFlag = OperatePropertyUtil.getProperties("no_send_sms");
			//如果为空或者不为true 认为是生产环境
			if(StringUtils.isNotBlank(noSendFlag) && "true".equals(noSendFlag)) {
				//测试环境，跳过
			}else {
				// 短信验证码
				if (!this.checkSMSValidateCode(adminUser.getMobileNumber(),
						smsAuthCode, request)) {
					jsonStr.put("result", EXCEPTION_ONE);
					writeJson(jsonStr.toString(), request, response);
					//添加登录错误次数累计
					super.changeLoginFaild(adminUser.getMobileNumber(), request);
					return null;
				}
			}*/

			AdminUser adminUserTemp = adminUserService
					.findByMobileNumber(adminUser.getMobileNumber());
			if (adminUserTemp != null) {
				if (adminUser.getLoginPword().equals(
						new String(MyEAESUtil.jiemi(adminUserTemp
								.getLoginPword())))) {
					HttpSession session = request.getSession();
					// 登录成功
					session.setAttribute(ADMIN_USER, adminUserTemp);
					//设置token (UUID随机生成token)
					String token = Base64.EncoderBASE64(UUID.randomUUID().toString()+System.currentTimeMillis());
					//1.保存在session中的token
					session.setAttribute("token", token);
					//2.保存token到cookie中
					Cookie token_cookie = new Cookie("admin_token", token);
					token_cookie.setPath("/");
					String domain = PropertyUtil.getProperties("base_cookie");
					token_cookie.setDomain(domain);
					//设置cookie的过期时间和session的过期时间一直
//					Integer timeOut = Integer.valueOf(PropertyUtil.getProperties("redis_SSSION_TIMEOUT"));
//					token_cookie.setMaxAge(timeOut);
					
					response.addCookie(token_cookie);
					
					// 更新最后一次登陆信息
					adminUserTemp.setLastIp(getIpAddr(request));
					adminUserTemp.setLastTime(new Date());
					adminUserService.update(adminUserTemp);
					result = SUCCESS_ONE;
					String desc = getLocalMsg("admin.log.login", request)
							+ "：username=" + adminUser.getMobileNumber();
					writeLog(request, "admin_user",
							AdminOptLogService.ADMIN_LOG_TYPE_LOGIN, desc);
					//清除登录错误次数
					super.clearLoginFaild(adminUser.getMobileNumber(), request);
				} else {
					// 密码错误 -3
					result = EXCEPTION_THREE;
					//添加登录错误次数累计
					super.changeLoginFaild(adminUser.getMobileNumber(), request);
				}
			} else {
				// 用户名错误 -2
				result = EXCEPTION_TWO;
				//添加登录错误次数累计
				super.changeLoginFaild(adminUser.getMobileNumber(), request);
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/login_out.html")
	public String logout(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		HttpSession session = request.getSession(false);
		try {
			if (session != null) {
				session.removeAttribute(ADMIN_USER);
				// session.invalidate();
				userLoginFailService.removeSession(session.getId());
			}
			response.sendRedirect("login.html");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 修改语言环境请求
	 * 
	 * @param langType
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/changelanguage.html")
	public String changeLanguage(String langType, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		String msg = "";
		try {
			// 修改语言环境请求
			LocaleResolver localeResolver = RequestContextUtils
					.getLocaleResolver(request);
			if (localeResolver != null) {
				if (StringUtil.isNullOrEmpty(langType)) {
					langType = "zh_CN"; // 默认中文
				}
				LocaleEditor localeEditor = new LocaleEditor();
				localeEditor.setAsText(langType);
				localeResolver.setLocale(request, response,
						(Locale) localeEditor.getValue());
				msg = "Change Language Success!";
			}
			jsonStr.put("msg", msg);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
