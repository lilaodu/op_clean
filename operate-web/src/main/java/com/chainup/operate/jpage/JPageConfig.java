package com.chainup.operate.jpage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.chainup.common.util.PropertyUtil;

/**
 * 
 * @作用 过滤分页参数,并得到分页信息
 * 
 */
public class JPageConfig {

	/** 配置文件 */
	// private PropertiesConfiguration config;
	public Properties properties = null;
	/** 每页记录数 */
	private Integer pageSize;

	/** 用户请求的所在页数 */
	private Integer page;

	/** 总页数 */
	private Integer pageTotal;

	/** 用户发送过来的请求 */
	private HttpServletRequest request;

	/** 记录分页反馈信息的对象 */
	private JPage jpage;

	/** 查询数据库的开始记录数(数据库中的第一条记录记为第0条) */
	private Integer recordStart;

	/** 查询数据库的要取的记录数 */
	private Integer recordLength;

	/** 查询出数据库的总记录数 */
	private Integer recordTotal;

	/** 如果使用post请求,'保留现场'里url地址里的中文用何种编码进行转化 */
	private String urlEncoding;

	/**
	 * 需要查询的开始记录的索引位置
	 * 
	 * @return
	 */
	public Integer firstIndex() {
		return recordStart;
	}

	/**
	 * 需要查询的末尾记录的索引位置
	 * 
	 * @return
	 */
	public Integer lastIndex() {
		return recordStart + recordLength;
	}

	public JPageConfig() throws JPageException {
		try {
			// config = new PropertiesConfiguration("jpage.properties");
			properties = new Properties();
			properties.load(PropertyUtil.class.getClassLoader().getResourceAsStream("jpage.properties"));
		} catch (Exception e) {
			throw new JPageException(JPageErrors.propertiesNotFound);
		}
	}

	/**
	 * @return 每页记录数
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * @param 每页记录数
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return 用户请求的所在页数
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * @param 用户发送过来的请求
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return 记录分页反馈信息的对象
	 */
	public JPage getJpage() {
		jpage = new JPage();
		try {

			if (urlEncoding == null)
				urlEncoding = properties.getProperty("url.encoding");// config.getString("url.encoding", "utf-8");

			// 所有的请求方式都能句使用getPostURL()来拿到正确的输出链接参数
			// String url = config.getString("page.url", "GET".equals(request.getMethod()) ? getGetURL(request) :
			// getPostURL(request));
			String url = getPostURL(request);

			String firstPage = properties.getProperty("en.page.first");// config.getString("page.first", "first");
			String prePage = properties.getProperty("en.page.pre");// config.getString("page.pre", "pre");
			String nextPage = properties.getProperty("en.page.next");// config.getString("page.next", "next");
			String lastPage = properties.getProperty("en.page.last");// config.getString("page.last", "last");
			String jsEnable = properties.getProperty("javascript.enable");// config.getBoolean("javascript.enable",
																			// true);
			String recordCountStr = properties.getProperty("en.record.count.str");
			String totalCountTitle = properties.getProperty("en.total.count.title");
			String pageSizeTitle = properties.getProperty("en.page.size.title");
			
			
			LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
			Locale locale;
			if (localeResolver != null) {
				locale = localeResolver.resolveLocale(request);
			} else {
				locale = request.getLocale(); // 如果没有设置，使用系统默认
			}
			if(locale.getLanguage().equals("zh")){
				firstPage = properties.getProperty("page.first");// config.getString("page.first", "first");
				prePage = properties.getProperty("page.pre");// config.getString("page.pre", "pre");
				nextPage = properties.getProperty("page.next");// config.getString("page.next", "next");
				lastPage = properties.getProperty("page.last");// config.getString("page.last", "last");
				recordCountStr = properties.getProperty("record.count.str");
				totalCountTitle = properties.getProperty("total.count.title");
				pageSizeTitle = properties.getProperty("page.size.title");
			}
			int currentPage = page;
			jpage.setPageSize(pageSize);
			jpage.setFirstPageWord(firstPage);
			jpage.setPrePageWord(prePage);
			jpage.setCurrentPage(currentPage);
			jpage.setNextPageWord(nextPage);
			jpage.setLastPageWord(lastPage);
			jpage.setJsEnable(jsEnable.equals("true") ? true : false);
			jpage.setPageTotal(pageTotal);
			jpage.setTotalRecord(recordTotal);
			jpage.setUrl(url);
			jpage.setPageSizeTitle(pageSizeTitle);
			jpage.setRecordCountStr(recordCountStr);
			jpage.setTotalCountTitle(totalCountTitle);
		} catch (UnsupportedEncodingException e) {
			throw new JPageException("Address conversion error, encoding settings may be wrong.", e);// 地址转化出错,可能是编码设置有误
		}
		return jpage;
	}

	/**
	 * @return int 0表示正常,-1表示传入的总记录数不大于0
	 */
	public int commit() {

		if (recordTotal == null) {
			throw new JPageException("总记录数不能为空");
		}

		if (recordTotal < 0) {
			return -1;
		}
		if (pageSize == null) {
			pageSize = Integer.valueOf(properties.getProperty("page.size"));// config.getInteger("page.size", 10);
		}

		// 处理得到总页数
		pageTotal = recordTotal % pageSize == 0 ? recordTotal / pageSize : recordTotal / pageSize + 1;// 总页数

		// 过滤传入的当前页数
		try {
			page = Integer.parseInt(request.getParameter("page"));
		} catch (NumberFormatException e) {
			page = 1;
		}
		if (page <= 0) {
			page = 1;
		}
		if (page > pageTotal) {
			page = pageTotal;
		}

		/*
		 * 得到查询长度 当到了最后一页的时候,要注意所要查出来的记录数要小于等于每页记录数, 即recordLength <= pageSize
		 */
		if (page == pageTotal) {
			recordLength = recordTotal - (pageTotal - 1) * pageSize;
		} else {
			recordLength = pageSize;
		}

		// 得到查询开始记录位置
		recordStart = (page - 1) * pageSize < 0 ? 0 : (page - 1) * pageSize;
		return 0;
	}

	/**
	 * @param request
	 * @return 跳转页面按钮链接地址的前段,如:LoginServlet?action=login&type=user 当使用get请求时使用.
	 */
	private String getGetURL(HttpServletRequest request) {
		String uri = request.getRequestURI();
		String head = uri.substring(uri.lastIndexOf("/") + 1);
		String bottom = request.getQueryString().replaceAll("&page=\\d{1,}", "");
		// bottom = bottom.replaceAll("page=\\d{1,}", "");
		return head + "?" + bottom;
	}

	/**
	 * @param request
	 * @return 跳转页面按钮链接地址的前段,如:LoginServlet?action=login&type=user 当使用post请求时使用,并开启输出链接参数加密
	 * @throws UnsupportedEncodingException
	 */
	private String getPostURL(HttpServletRequest request) throws UnsupportedEncodingException {
		// 拿到servlet映射名
		String uri = request.getRequestURI();
		String head = uri.substring(uri.lastIndexOf("/") + 1);
		Enumeration<String> params = request.getParameterNames();
		String parameter = null;
		StringBuffer url = new StringBuffer("?");
		while (params.hasMoreElements()) {
			parameter = (String) params.nextElement();
			if (!"page".equals(parameter) && !"tag".equals(parameter) && !"parExit".equals(parameter)&& !"pageSize".equals(parameter)) {
			    if(url.toString().equals("?")){
			        url.append(parameter + "=" + this.encode(request.getParameter(parameter)));
			    }else{
			        url.append("&" + parameter + "=" + this.encode(request.getParameter(parameter)));
			    }
				
			}
		}
		return head + url.toString();
	}

	/**
	 * 对于中文转化为utf-8编码的操作的操作
	 * 
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private String encode(String str) throws UnsupportedEncodingException {
		return URLEncoder.encode(str, urlEncoding);
	}

	/**
	 * @return 查询数据库的开始记录数(数据库中的第一条记录记为第0条)
	 */
	public Integer getRecordStart() {
		return recordStart;
	}

	/**
	 * @return 查询数据库的要取的记录数
	 */
	public Integer getRecordLength() {
		return recordLength;
	}

	/**
	 * @return 查询出数据库的总记录数
	 */
	public Integer getRecordTotal() {
		return recordTotal;
	}

	/**
	 * @param 查询出数据库的总记录数
	 */
	public void setRecordTotal(Integer recordTotal) {
		this.recordTotal = recordTotal;
	}

	public void setUrlEncoding(String urlEncoding) {
		this.urlEncoding = urlEncoding;
	}

}
