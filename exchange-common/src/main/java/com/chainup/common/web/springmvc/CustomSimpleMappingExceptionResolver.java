package com.chainup.common.web.springmvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class CustomSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		// Expose ModelAndView for chosen error view.
		String viewName = determineViewName(ex, request);

		logger.info("-------------- mye no catch error!");
		logger.info(ex.getMessage());
		ex.printStackTrace();

		String strError = "";
		if (ex.getClass().equals(BadSqlGrammarException.class)) {
			strError = "SQL语法错误";
		} else if (ex.getClass().equals(DataIntegrityViolationException.class)) {
			strError = "数据完整性冲突异常";
		} else if (ex.getClass().equals(NullPointerException.class)) {
			strError = "空指针异常";
		} else if (ex.getClass().equals(MissingServletRequestParameterException.class)) {
			strError = "缺少servlet请求参数异常";
		} else if (ex.getClass().equals(TypeMismatchException.class)) {
			strError = "类型不匹配异常";
		} else if (ex.getClass().equals(ServletRequestBindingException.class)) {
			strError = "servlet请求绑定异常";
		} else if (ex.getClass().equals(HttpRequestMethodNotSupportedException.class)) {
			strError = "请求方法不支持“" + ((HttpRequestMethodNotSupportedException) ex).getMethod() + "”方式";
		} else if (ex.getClass().equals(ClassCastException.class)) {
			strError = "强制类型转换错误异常";
		} else if (ex.getClass().equals(NumberFormatException.class)) {
			strError = "类型转换错误";
		} else {
			strError = "系统错误,请联系管理员";
		}
		logger.info("具体错误 信息---"+strError);
		// JSP格式返回
		if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1))) {
			// 如果不是异步请求
			// Apply HTTP status code for error views, if specified.
			// Only apply it if we're processing a top-level request.
			// 已知的异常
			// if (viewName == null) {
			viewName = "/error/error.html";
			// }
			Integer statusCode = determineStatusCode(request, viewName);
			if (statusCode != null) {
				applyStatusCodeIfPossible(request, response, statusCode);
			}
			request.setAttribute("strError", strError);
			return getModelAndView(viewName, ex, request);
		} else {// JSON格式返回
			try {
				response.setCharacterEncoding("UTF-8");
				PrintWriter writer = response.getWriter();
				writer.write("\r\n ### Ajax错误:" + strError + " ###\r");
				writer.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;

		}
	}
}