package com.chainup.operate.Interceptor;

import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
* @author 作者 guofacheng
* @version 创建时间：2018年1月2日 下午3:37:22
* 类说明
*/
public class RequestInterceptor implements HandlerInterceptor {
	
	/**方法将在请求处理之前进行调用，只有该方法返回true，才会继续执行后续的Interceptor和Controller*/
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取客户端请求地址
//		String servletPath = request.getServletPath();
//		//获取ajax的请求
//		String requestType = request.getHeader("X-Requested-With");
//		//判断是否时Ajax请求,并且排除登陆请求
//		if("XMLHttpRequest".equals(requestType) && !servletPath.contains("login")) {
//			String tokenHeader = request.getHeader("CSRFToken").replace("\"", "");
//			//取出session中的token
//			HttpSession session = request.getSession();
//			String tokenSession = (String)session.getAttribute("token");
//			//比较session中的token和tokenHeader中的token是否相等
//			if(!tokenSession.equals(tokenHeader)) {
//				return false;
//			}
//			
//		}
		return true;
	}

	/**该方法将在请求处理之后，DispatcherServlet进行视图返回渲染之前进行调用*/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//转义参数内容
		if(null != modelAndView) {
			Map<String, Object> modelMap = modelAndView.getModel();
			for(String key:modelMap.keySet()) {
				//转义字符串内容
				Object param = modelMap.get(key);
				if(null != modelMap.get(key) && (param instanceof String)) {
					modelMap.put(key, this.xssFilter(String.valueOf(param)));
				}
			}
		}
	}
	
	/**方法将在整个请求结束之后，也就是在DispatcherServlet 渲染了对应的视图之后执行*/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

	private String xssFilter(String value) {
		
	 if (value == null || "".equals(value)) {
            return value;
        }
	 
	 	value = StringEscapeUtils.escapeHtml(value);
        return value;

	}
}
