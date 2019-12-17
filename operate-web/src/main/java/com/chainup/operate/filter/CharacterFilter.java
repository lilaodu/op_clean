package com.chainup.operate.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 功能：特殊字符过滤器
 * 
 * @ClassName: CharacterFilter
 * @version V1.0
 */
public class CharacterFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		CharacterFilterRequest wrapRequest = new CharacterFilterRequest(request, request.getParameterMap());
		chain.doFilter(wrapRequest, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
}
