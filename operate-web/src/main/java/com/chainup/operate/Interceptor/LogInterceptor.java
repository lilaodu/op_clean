package com.chainup.operate.Interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.util.IPv4Util;
import com.chainup.operate.service.AdminOptLogService;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 用户记录管理员操作日志
 * @author 鲫鱼哥
 *
 */
public class LogInterceptor implements HandlerInterceptor {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private AdminOptLogService	adminOptLogService;	
	
	

	public AdminOptLogService getAdminOptLogService() {
		return adminOptLogService;
	}

	public void setAdminOptLogService(AdminOptLogService adminOptLogService) {
		this.adminOptLogService = adminOptLogService;
	}

	/**方法将在请求处理之前进行调用，只有该方法返回true，才会继续执行后续的Interceptor和Controller*/
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			Map<String,String> parameterMap = request.getParameterMap();
			String paramStr = new ObjectMapper().writeValueAsString(parameterMap);
			String servletPath = request.getServletPath();
			AdminUser adminUser = (AdminUser) request.getSession().getAttribute("admin_user");
			if (adminUser!=null && StringUtils.isNotBlank(paramStr) && paramStr.length()<500) {
				adminOptLogService.add(adminUser.getId(), servletPath, 0, getIpAddr(request), paramStr);
			}
		} catch (Exception e) {
			logger.error("LogInterceptor error exception = {} ",e);
		}
		return true;
	}

	/**该方法将在请求处理之后，DispatcherServlet进行视图返回渲染之前进行调用*/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}
	
	/**方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行*/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
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
		if(!IPv4Util.checkIp(ip)){
			return "0.0.0.0";
		}
		return ip;
	}

}
