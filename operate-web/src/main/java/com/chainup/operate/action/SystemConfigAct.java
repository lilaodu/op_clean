package com.chainup.operate.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainup.common.enums.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.LocaleEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.SystemConfig;
import com.chainup.operate.datasource.CustomerContextHolder;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.SystemConfigService;

@Controller
@Scope("prototype")
public class SystemConfigAct extends BaseAct {
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 打开系统参数
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/system_config.html")
	public String system_config(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} else if(!this.validateAction(request, AdminActionConst.systemConfig)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			SystemConfig systemConfig = systemConfigService.findSystemConfig();
			model.addAttribute("systemConfig", systemConfig);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "system_config");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 系统参数设置
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/system_config_setting.html")
	public String system_config_setting(SystemConfig systemConfig, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
			//验证token
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			} else if(!this.validateAction(request, AdminActionConst.systemConfigSetting)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			String customerType = CustomerContextHolder.getCustomerType();
			System.out.println("===================="+customerType);
			result = systemConfigService.systemConfigSetting(systemConfig);
			// 修改语言环境请求
			LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
			if (localeResolver != null) {
				// 默认中文
				String langType = "zh_CN";
				if (systemConfig != null && this.isValidLanguage(systemConfig.getLanguage())) {
					langType = systemConfig.getLanguage();
				}
				LocaleEditor localeEditor = new LocaleEditor();
				localeEditor.setAsText(langType);
				localeResolver.setLocale(request, response, (Locale) localeEditor.getValue());
				isActionChang = true;
				String desc = getLocalMsg("exchange.opterate.system.config.language", request)  + "language=" + langType;
				writeLog(request, "system_config", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, desc);
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 判断是否为合法的语言
	 * @param langType
	 * @return
	 */
	private boolean isValidLanguage(String langType){
		for(Language language : Language.values()){
			if(language.getLangType().equals(langType)){
				return true;
			}
		}
		return false;
	}
}
