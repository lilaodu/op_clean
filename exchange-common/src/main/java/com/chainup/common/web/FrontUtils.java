package com.chainup.common.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.chainup.common.freemarker.DirectiveUtils;
import com.chainup.common.web.URLHelper.PageInfo;
import com.chainup.common.web.springmvc.WebErrors;

import freemarker.core.Environment;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import freemarker.template.TemplateNumberModel;

/**
 * 前台工具类
 * 
 */
public class FrontUtils {
	/**
	 * 页面没有找到
	 */
	public static final String PAGE_NOT_FOUND = "page_not_found";
	/**
	 * 操作成功页面
	 */
	public static final String SUCCESS_PAGE = "success_page";
	/**
	 * 操作失败页面
	 */
	public static final String ERROR_PAGE = "error_page";
	/**
	 * 信息提示页面
	 */
	public static final String MESSAGE_PAGE = "message_page";
	/**
	 * 系统资源路径
	 */
	public static final String RES_SYS = "resSys";
	/**
	 * 模板资源路径
	 */
	public static final String RES_TPL = "res";
	/**
	 * 模板资源表达式
	 */
	public static final String RES_EXP = "${res}";
	/**
	 * 部署路径
	 */
	public static final String BASE = "base";
	/**
	 * 站点
	 */
	public static final String SITE = "site";
	/**
	 * 用户
	 */
	public static final String USER = "user";
	/**
	 * 页码
	 */
	public static final String PAGE_NO = "pageNo";
	/**
	 * 总条数
	 */
	public static final String COUNT = "count";
	/**
	 * 起始条数
	 */
	public static final String FIRST = "first";

	/**
	 * 页面完整地址
	 */
	public static final String LOCATION = "location";
	/**
	 * 页面翻页地址
	 */
	public static final String HREF = "href";
	/**
	 * href前半部（相对于分页）
	 */
	public static final String HREF_FORMER = "hrefFormer";
	/**
	 * href后半部（相对于分页）
	 */
	public static final String HREF_LATTER = "hrefLatter";

	/**
	 * 传入参数，列表样式。
	 */
	public static final String PARAM_STYLE_LIST = "styleList";
	/**
	 * 传入参数，系统预定义翻页。
	 */
	public static final String PARAM_SYS_PAGE = "sysPage";
	/**
	 * 传入参数，用户自定义翻页。
	 */
	public static final String PARAM_USER_PAGE = "userPage";

	/**
	 * 返回页面
	 */
	public static final String RETURN_URL = "returnUrl";
	/**
	 * 提示信息
	 */
	public static final String MESSAGE = "message";
	/**
	 * 提示信息参数
	 */
	public static final String ARGS = "args";
	
	/**
	 * 获得模板路径。不对模板文件进行本地化处理。
	 * 
	 * @param solution
	 *            方案路径
	 * @param dir
	 *            模板目录。不本地化处理。
	 * @param name
	 *            模板名称。不本地化处理。
	 * @return
	 */
	public static String getTplPath(String solution, String dir, String name) {
		if(dir.equals("")){
			return solution + "/" + name + Constants.TPL_SUFFIX;
		}else{
			return solution + "/" + dir + "/" + name + Constants.TPL_SUFFIX;
		}
	}

	/**
	 * 页面没有找到
	 * 
	 * @param request
	 * @param response
	 * @return 返回“页面没有找到”的模板
	 */
	public static String pageNotFound(HttpServletRequest request,HttpServletResponse response, Map<String, Object> model) {
		MyEConfig config = CommonContainer.getSite();
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		frontData(request, model, config);
		return getTplPath(config.getSolutionPath(), Constants.TPLDIR_COMMON,PAGE_NOT_FOUND);
	}

	/**
	 * 成功提示页面
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	public static String showSuccess(HttpServletRequest request,
			Map<String, Object> model, String nextUrl) {
		MyEConfig config = CommonContainer.getSite();
		frontData(request, model, config);
		if (!StringUtils.isBlank(nextUrl)) {
			model.put("nextUrl", nextUrl);
		}
		return getTplPath(config.getSolutionPath(), Constants.TPLDIR_COMMON,SUCCESS_PAGE);
	}

	/**
	 * 错误提示页面
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	public static String showError(HttpServletRequest request,
			HttpServletResponse response, Map<String, Object> model,
			WebErrors errors) {
		MyEConfig config = CommonContainer.getSite();
		frontData(request, model, config);
		errors.toModel(model);
		return getTplPath(config.getSolutionPath(), Constants.TPLDIR_COMMON,ERROR_PAGE);
	}

	/**
	 * 信息提示页面
	 * 
	 * @param request
	 * @param model
	 * @param message
	 *            进行国际化处理
	 * @return
	 */
	public static String showMessage(HttpServletRequest request,Map<String, Object> model, String message, String... args) {
		MyEConfig config = CommonContainer.getSite();
		frontData(request, model, config);
		model.put(MESSAGE, message);
		if (args != null) {
			model.put(ARGS, args);
		}
		return getTplPath(config.getSolutionPath(), Constants.TPLDIR_COMMON,MESSAGE_PAGE);
	}

	/**
	 * 显示登录页面
	 * 
	 * @param request
	 * @param model
	 * @param site
	 * @param message
	 * @return
	 */
	public static String showLogin(HttpServletRequest request,Map<String, Object> model,String message) {
		MyEConfig config = CommonContainer.getSite();
		if (!StringUtils.isBlank(message)) {
			model.put(MESSAGE, message);
		}
		StringBuilder buff = new StringBuilder("redirect:");
		buff.append(config.getLoginUrl()).append("?");
		buff.append(RETURN_URL).append("=");
		buff.append(RequestUtils.getLocation(request));
		if (!StringUtils.isBlank(config.getProcessUrl())) {
			buff.append("&").append(Constants.PROCESS_URL).append(config.getProcessUrl());
		}
		return buff.toString();
	}

	/**
	 * 显示登录页面
	 * 
	 * @param request
	 * @param model
	 * @param site
	 * @return
	 */
	public static String showLogin(HttpServletRequest request,Map<String, Object> model) {
		return showLogin(request, model, "true");
	}

	/**
	 * 为前台模板设置公用数据
	 * 
	 * @param request
	 * @param model
	 */
	public static void frontData(HttpServletRequest request,Map<String, Object> map,MyEConfig config) {
		String location = RequestUtils.getLocation(request);
		Long startTime = (Long) request.getAttribute(ProcessTimeFilter.START_TIME);
		frontData(map,location, startTime,config);
	}

	public static void frontData(Map<String, Object> map,String location, Long startTime,MyEConfig config) {
		if (startTime != null) {
			map.put(ProcessTimeFilter.START_TIME, startTime);
		}
		//TODO 如果当前用户已登录取出登录后用户信息存入变理已供
/*		if (user != null) {
			map.put(USER, user);
		}*/
		//TODO 站点配置信息
		//map.put(SITE, site);
		//String ctx = site.getContextPath() == null ? "" : site.getContextPath();
		//map.put(BASE, ctx);
		map.put(LOCATION, location);
	}

	public static void putLocation(Map<String, Object> map, String location) {
		map.put(LOCATION, location);
	}

	/**
	 * 为前台模板设置分页相关数据
	 * 
	 * @param request
	 * @param map
	 */
	public static void frontPageData(HttpServletRequest request,
			Map<String, Object> map) {
		int pageNo = URLHelper.getPageNo(request);
		PageInfo info = URLHelper.getPageInfo(request);
		String href = info.getHref();
		String hrefFormer = info.getHrefFormer();
		String hrefLatter = info.getHrefLatter();
		frontPageData(pageNo, href, hrefFormer, hrefLatter, map);
	}

	/**
	 * 为前台模板设置分页相关数据
	 * 
	 * @param pageNo
	 * @param href
	 * @param urlFormer
	 * @param urlLatter
	 * @param map
	 */
	public static void frontPageData(int pageNo, String href,String hrefFormer, String hrefLatter, Map<String, Object> map) {
		map.put(PAGE_NO, pageNo);
		map.put(HREF, href);
		map.put(HREF_FORMER, hrefFormer);
		map.put(HREF_LATTER, hrefLatter);
	}


	/**
	 * 标签中获得页码
	 * 
	 * @param env
	 * @return
	 * @throws TemplateException
	 */
	public static int getPageNo(Environment env) throws TemplateException {
		TemplateModel pageNo = env.getGlobalVariable(PAGE_NO);
		if (pageNo instanceof TemplateNumberModel) {
			return ((TemplateNumberModel) pageNo).getAsNumber().intValue();
		} else {
			throw new TemplateModelException("'" + PAGE_NO	+ "' not found in DataModel.");
		}
	}

	public static int getFirst(Map<String, TemplateModel> params)
			throws TemplateException {
		Integer first = DirectiveUtils.getInt(FIRST, params);
		if (first == null || first <= 0) {
			return 0;
		} else {
			return first - 1;
		}
	}

	/**
	 * 标签参数中获得条数。
	 * 
	 * @param params
	 * @return 如果不存在，或者小于等于0，或者大于5000则返回5000；否则返回条数。
	 * @throws TemplateException
	 */
	public static int getCount(Map<String, TemplateModel> params)
			throws TemplateException {
		Integer count = DirectiveUtils.getInt(COUNT, params);
		if (count == null || count <= 0 || count >= 5000) {
			return 5000;
		} else {
			return count;
		}
	}

	public static void includePagination(Map<String, TemplateModel> params, Environment env)throws TemplateException, IOException {
		String sysPage = DirectiveUtils.getString(PARAM_SYS_PAGE, params);
		String userPage = DirectiveUtils.getString(PARAM_USER_PAGE, params);
		MyEConfig config = CommonContainer.getSite();
		if (!StringUtils.isBlank(sysPage)) {
			String tpl = Constants.TPL_STYLE_PAGE_CHANNEL + sysPage + Constants.TPL_SUFFIX;
			env.include(tpl, Constants.UTF8, true);
		} else if (!StringUtils.isBlank(userPage)) {
			String tpl = getTplPath(config.getSolutionPath(), Constants.TPLDIR_STYLE_LIST,userPage);
			env.include(tpl, Constants.UTF8, true);
		} else {
			// 没有包含分页
		}
	}

	/**
	 * 标签中包含页面
	 * 
	 * @param tplName
	 * @param site
	 * @param params
	 * @param env
	 * @throws IOException
	 * @throws TemplateException
	 */
	public static void includeTpl(String tplName,Map<String, TemplateModel> params, Environment env)	throws IOException, TemplateException {
		MyEConfig config = CommonContainer.getSite();
		String subTpl = DirectiveUtils.getString(DirectiveUtils.PARAM_TPL_SUB, params);
		String tpl;
		if (StringUtils.isBlank(subTpl)) {
			tpl = getTplPath(config.getSolutionPath(), Constants.TPLDIR_TAG, tplName);
		} else {
			tpl = getTplPath(config.getSolutionPath(), Constants.TPLDIR_TAG, tplName + "_"	+ subTpl);
		}
		env.include(tpl, Constants.UTF8, true);
	}

	/**
	 * 标签中包含用户预定义列表样式模板
	 * 
	 * @param listStyle
	 * @param site
	 * @param env
	 * @throws IOException
	 * @throws TemplateException
	 */
	public static void includeTpl(String listStyle,Environment env) throws IOException, TemplateException {
		MyEConfig config = CommonContainer.getSite();
		String tpl = getTplPath(config.getSolutionPath(),Constants.TPLDIR_STYLE_LIST,listStyle);
		env.include(tpl, Constants.UTF8, true);
	}
}
