package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.ArticleLanguage;
import com.chainup.common.exchange.entity.ArticleLanguageExample;
import com.chainup.common.exchange.entity.News;
import com.chainup.common.exchange.entity.NewsExample;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.ArticleLanguageService;
import com.chainup.operate.service.NewsService;
import com.chainup.operate.util.OperatePropertyUtil;
import com.chainup.common.util.StringTool;

@Controller
@Scope("prototype")
public class NewsAct extends BaseAct{
	
	@Autowired
	private NewsService newsService;
	@Autowired
	private ArticleLanguageService articleLanguageService;
	
	@RequestMapping(value = "/news.html")
	public String view(String keyword,String stime,String etime,Integer pageSize,HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} 
			if(!this.validateAction(request, AdminActionConst.news)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			/*String lang = this.getLocalLanguage(request);
			int langType = 0;
			if(lang.equals("zh")){
				langType = 1;
			}else{
				langType = 2;
			}*/
			keyword = (String) StringTool.parsentObjectNull(keyword);
			stime = (String) StringTool.parsentObjectNull(stime);
			etime = (String) StringTool.parsentObjectNull(etime);
			pageSize = (Integer) StringTool.parsentObjectNull(pageSize);
			if (pageSize == null)
				pageSize = CURRENT_PAGE_SIZE;
			JPageConfig jpc = null;
			try {
				jpc = new JPageConfig();
			} catch (JPageException e) {
				e.printStackTrace();
				return "view";
			}
			NewsExample example = new NewsExample();
			if(keyword!=null){
				example.createCriteria().andOrKeyWoredLike("%"+keyword+"%");
			} 
			String date_format = OperatePropertyUtil.getProperties("system_date_format");
			SimpleDateFormat d_format = new SimpleDateFormat(date_format);
			if(stime!=null){
				example.createCriteria().andCtimeGreaterThanOrEqualTo(d_format.parse(stime + " 00:00:00"));
			}
			if(etime!=null){
				example.createCriteria().andCtimeLessThanOrEqualTo(d_format.parse(etime + " 23:59:59"));
			}
			//example.createCriteria().andLangEqualTo(langType);
			jpc.setPageSize(pageSize);
			jpc.setRequest(request);
			int count = newsService.countByExample(example);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			example.setLimitStart(start);
			example.setLimitEnd(length);
			example.setOrderByClause("ctime desc"); // 默认按创建时间倒序
			List<News> newsList = newsService.selectByExample(example);
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/news.html");
			request.setAttribute("jpage", jpage);
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("request", request);
			model.addAttribute("count", count);
			model.addAttribute("newsList", newsList);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("keyword", keyword);
			model.addAttribute("stime", stime);
			model.addAttribute("etime", etime);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "news");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = "/news_add.html")
	public String add_view(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}
			if(!this.validateAction(request, AdminActionConst.newsAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			ArticleLanguageExample lanexample = new ArticleLanguageExample();
			lanexample.setOrderByClause(" id asc");
			//List<ArticleLanguage> languageList =  articleLanguageService.selectByExample(lanexample);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			String imgDomain = OperatePropertyUtil.getProperties("image_upload_base_url");
			model.addAttribute("request", request);
			//model.addAttribute("languageList", languageList);
			model.addAttribute("imgDomain", imgDomain);

			return FrontUtils.getTplPath(config.getSolutionPath(), "", "news_add");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = "/news_add_save.html")
	public String add_save(News news,HttpServletRequest request, HttpServletResponse response, ModelMap model){
		JSONObject jsonStr = new JSONObject();
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
			}
			if(!this.validateAction(request, AdminActionConst.newsAdd)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			Integer result = 0;
			NewsExample example = new NewsExample();
			example.createCriteria().andTitleEqualTo(news.getTitle());
			int count = newsService.countByExample(example);
			if(count>0){
				result = EXCEPTION_TWO;
			}else{
				/*String lang = this.getLocalLanguage(request);
				int langType = 0;
				if(lang.equals("zh")){
					langType = 1;
				}else{
					langType = 2;
				}
				news.setLang(langType);*/
				news.setTitle(getSafeUtf8(news.getTitle(),request));
				news.setCtime(new Date());
				news.setMtime(new Date());
				newsService.insert(news);
				result = SUCCESS_ONE;
				writeLog(request, "news", AdminOptLogService.ADMIN_LOG_TYPE_ADD, "新增资讯:"+news.getTitle());
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = "/news_edit.html")
	public String edit_view(Integer id,HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}
			if(!this.validateAction(request, AdminActionConst.newsEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			News news = newsService.selectByPrimaryKey(id);
			ArticleLanguageExample lanexample = new ArticleLanguageExample();
			lanexample.setOrderByClause(" id asc");
			//List<ArticleLanguage> languageList =  articleLanguageService.selectByExample(lanexample);
			MyEConfig config = CommonContainer.getSite();
			String imgDomain = OperatePropertyUtil.getProperties("image_upload_base_url");
			FrontUtils.frontData(request, model, config);
			model.addAttribute("request", request);
			//model.addAttribute("languageList", languageList);
			model.addAttribute("news", news);
			model.addAttribute("imgDomain", imgDomain);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "news_edit");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = "/news_edit_save.html")
	public String edit_save(News news,HttpServletRequest request, HttpServletResponse response, ModelMap model){
		JSONObject jsonStr = new JSONObject();
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
			}
			if(!this.validateAction(request, AdminActionConst.newsEdit)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			Integer result = 0;
			NewsExample example = new NewsExample();
			example.createCriteria().andTitleEqualTo(news.getTitle()).andIdNotEqualTo(news.getId());
			int count = newsService.countByExample(example);
			if(count>0){
				result = EXCEPTION_TWO;
			}else{
				/*String lang = this.getLocalLanguage(request);
				int langType = 0;
				if(lang.equals("zh")){
					langType = 1;
				}else{
					langType = 2;
				}
				news.setLang(langType);*/
				news.setTitle(getSafeUtf8(news.getTitle(),request));
				news.setMtime(new Date());
				newsService.updateByPrimaryKeyWithBLOBs(news);
				result = SUCCESS_ONE;
				writeLog(request, "news", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, "编辑资讯:"+news.getTitle());
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = "/news_delete.html")
	public String delete(String ids,HttpServletRequest request, HttpServletResponse response, ModelMap model){
		JSONObject jsonStr = new JSONObject();
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
			}
			if(!this.validateAction(request, AdminActionConst.newsDelete)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			Integer result = 0;
			String[] idList = ids.split(",");
			List<Integer> list = new ArrayList<Integer>();
			NewsExample example = new NewsExample();
			
			for (String id : idList) {
				list.add(Integer.parseInt(id));
			}
			
			if(list.size()>0){
				example.createCriteria().andIdIn(list);
				newsService.deleteByExample(example);
				result = SUCCESS_ONE;
				writeLog(request, "news", AdminOptLogService.ADMIN_LOG_TYPE_DEL, "删除资讯:"+ids);
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
