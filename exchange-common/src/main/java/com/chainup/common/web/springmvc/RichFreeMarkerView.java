package com.chainup.common.web.springmvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import com.chainup.common.util.PropertyUtil;


/**
 * 扩展spring的FreemarkerView，加上base属性。
 * 
 * 支持jsp标签，Application、Session、Request、RequestParameters属性
 *
 */
public class RichFreeMarkerView extends FreeMarkerView {
	/**
	 * 部署路径属性名称
	 */
	public static final String CONTEXT_PATH = "base";
	public static final String SRC_PATH = "src_base";
	public static final String Ad_PATH = "ad_base";

	/**
	 * 在model中增加部署路径base，方便处理部署路径问题。
	 */
	@SuppressWarnings("unchecked")
	protected void exposeHelpers(Map model, HttpServletRequest request) throws Exception {
		super.exposeHelpers(model, request);
		String base_url = PropertyUtil.getProperties(CONTEXT_PATH);
		String src_base_url = PropertyUtil.getProperties(SRC_PATH);
		String ad_base_url = PropertyUtil.getProperties(Ad_PATH);
		if (base_url != null && !base_url.equals("")) {
			model.put(CONTEXT_PATH, base_url);
		} else {
			model.put(CONTEXT_PATH, request.getContextPath());
		}
		if (src_base_url != null && !src_base_url.equals("")) {
			model.put(SRC_PATH, src_base_url);
		} else {
			model.put(SRC_PATH, request.getContextPath());
		}
		if (ad_base_url != null && !ad_base_url.equals("")) {
			model.put(Ad_PATH, ad_base_url);
		} else {
			model.put(Ad_PATH, request.getContextPath());
		}
	}
}