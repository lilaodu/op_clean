package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.ArticleLanguage;
import com.chainup.common.exchange.entity.ArticleLanguageExample;
import com.chainup.common.exchange.entity.NoticeInfo;
import com.chainup.common.exchange.entity.NoticeInfoExample;
import com.chainup.common.exchange.entity.NoticeInfoExample.Criteria;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.ArticleLanguageService;
import com.chainup.operate.service.NoticeInfoService;
import com.chainup.operate.util.OperatePropertyUtil;
import com.chainup.common.util.StringTool;

@Controller
@Scope("prototype")
public class NoticeInfoAct extends BaseAct {
	@Autowired
	private NoticeInfoService noticeInfoService;
	@Autowired
	private ArticleLanguageService articleLanguageService;

	/**
	 * 公告列表
	 * 
	 * @param pageSize
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info.html")
	public String noticeInfoList(String title, String ctimeEnd, String ctimeStart, Integer pageSize, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoManager)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			title = (String) StringTool.parsentObjectNull(title);
			ctimeEnd = (String) StringTool.parsentObjectNull(ctimeEnd);
			ctimeStart = (String) StringTool.parsentObjectNull(ctimeStart);
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
			NoticeInfoExample example = new NoticeInfoExample();
			Criteria criteria = example.createCriteria();
			if (title != null) {
				criteria.andTitleLike("%" + title.trim() + "%");
			}
			String date_format = OperatePropertyUtil.getProperties("system_date_format");
			SimpleDateFormat sdhmsf = new SimpleDateFormat(date_format);
			if (ctimeStart != null) {
				criteria.andCtimeGreaterThanOrEqualTo(sdhmsf.parse(ctimeStart));
			}
			if (ctimeEnd != null) {
				criteria.andCtimeLessThanOrEqualTo(sdhmsf.parse(ctimeEnd));
			}
			jpc.setPageSize(pageSize);
			jpc.setRequest(request);
			int count = noticeInfoService.count(example);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			example.setLimitStart(start);
			example.setLimitEnd(length);
			example.setOrderByClause("stime desc,ctime desc"); // 默认按置顶时间,创建时间倒序
			List<NoticeInfo> noticeInfoList = noticeInfoService.findAll(example);
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/notice_info.html");
			request.setAttribute("jpage", jpage);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("noticeInfoList", noticeInfoList);
			model.addAttribute("count", count);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("title", title);
			model.addAttribute("ctimeStart", ctimeStart);
			model.addAttribute("ctimeEnd", ctimeEnd);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "notice_info");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_batch_del.html")
	public String notice_info_batch_del(String ids, HttpServletRequest request, HttpServletResponse response,
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
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoDel)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			List<Integer> list = StringTool.stringToList(ids, ",");
			NoticeInfoExample example = new NoticeInfoExample();
			if (!list.isEmpty()) {
				example.createCriteria().andIdIn(list);
				noticeInfoService.deleteByExample(example);
				result = SUCCESS_ONE;
				String desc = getLocalMsg("notice.info.delete.title", request) + "：ids=" + ids;
				writeLog(request, "notice_info", AdminOptLogService.ADMIN_LOG_TYPE_DEL, desc);
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
	 * 根据主键id, 删除
	 * 
	 * @param id
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_del.html")
	public String notice_info_del(Integer id, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoDel)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			if (id != null) {
				noticeInfoService.deleteById(id);
				result = SUCCESS_ONE;
				String desc = getLocalMsg("notice.info.delete.title", request) + "：id=" + id;
				writeLog(request, "notice_info", AdminOptLogService.ADMIN_LOG_TYPE_DEL, desc);
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
	 * 根据主键id, 置顶
	 * 
	 * @param id
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_stick.html")
	public String notice_info_stick(Integer id, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
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
			if (id != null) {
				NoticeInfo noticeInfo = new NoticeInfo();
				noticeInfo.setId(id);
				noticeInfo.setStime(new Date());
				noticeInfoService.update(noticeInfo);
				result = SUCCESS_ONE;
				String desc = getLocalMsg("notice.info.stick.title", request) + "：id=" + id;
				writeLog(request, "notice_info", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, desc);
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
	 * 添加公告, 打开添加页面
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_add.html")
	public String notice_info_add(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoAdd)){
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
			model.addAttribute("request", request);
			//model.addAttribute("languageList", languageList);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "notice_info_add");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 添加公告,提交请求
	 * 
	 * @param noticeInfo
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_add_submit.html")
	public String notice_info_add_submit(NoticeInfo noticeInfo, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			if (noticeInfo != null) {
				NoticeInfoExample example = new NoticeInfoExample();
				example.createCriteria().andTitleEqualTo(noticeInfo.getTitle());
				if (noticeInfoService.count(example) > 0) { // 该公告已经发布
					result = EXCEPTION_TWO;
				} else {
					// 获取正确的中文信息
					noticeInfo.setTitle(getSafeUtf8(noticeInfo.getTitle().trim(), request));
					noticeInfo.setContent(getSafeUtf8(noticeInfo.getContent().trim(), request));
					noticeInfo.setCtime(new Date());
					noticeInfo.setMtime(new Date());
					noticeInfo.setStime(new Date());
					noticeInfoService.add(noticeInfo);
					result = SUCCESS_ONE;
					String desc = getLocalMsg("notice.info.add.title", request) + "：title=" + noticeInfo.getTitle();
					writeLog(request, "notice_info", AdminOptLogService.ADMIN_LOG_TYPE_ADD, desc);
				}
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
	 * 加载编辑公告信息列表
	 * 
	 * @param id
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_edit.html")
	public String notice_info_edit(Integer id, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			NoticeInfo noticeInfo = noticeInfoService.findById(id);
			ArticleLanguageExample lanexample = new ArticleLanguageExample();
			lanexample.setOrderByClause(" id asc");
			//List<ArticleLanguage> languageList =  articleLanguageService.selectByExample(lanexample);
			model.addAttribute("request", request);
			//model.addAttribute("languageList", languageList);
			model.addAttribute("noticeInfo", noticeInfo);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "notice_info_edit");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 编辑公告信息 提交请求
	 * 
	 * @param noticeInfo
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/notice_info_edit_submit.html", method = RequestMethod.POST)
	public String notice_info_edit_submit(NoticeInfo noticeInfo, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", -1);
				writeJson(jsonStr.toString(), request, response);
				return null;
			} else if(!this.validateAction(request, AdminActionConst.noticeInfoEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			if (noticeInfo != null) {
				// 获取正确的中文信息
				noticeInfo.setTitle(getSafeUtf8(noticeInfo.getTitle().trim(), request));
				noticeInfo.setContent(getSafeUtf8(noticeInfo.getContent().trim(), request));
				NoticeInfoExample example = new NoticeInfoExample();
				example.createCriteria().andTitleEqualTo(noticeInfo.getTitle());
				List<NoticeInfo> noticeInfos = noticeInfoService.findAll(example);
				if (noticeInfos != null && noticeInfos.size() > 0) {
					if (noticeInfos.get(0).getId().equals(noticeInfo.getId())) {
						noticeInfo.setMtime(new Date());
						noticeInfoService.update(noticeInfo);
						result = SUCCESS_ONE;
						String desc = getLocalMsg("notice.info.edit.title", request) + "：title" + noticeInfo.getTitle();
						writeLog(request, "notice_info", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, desc);
					} else {
						result = EXCEPTION_TWO; // 该标题的公告已经发布
					}
				} else {
					noticeInfoService.update(noticeInfo);
					result = SUCCESS_ONE;
					String desc = getLocalMsg("notice.info.edit.title", request) + "：title" + noticeInfo.getTitle();
					writeLog(request, "notice_info", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, desc);
				}
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
	 * 根据id 获取公告信息
	 * 
	 * @param id
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/find_notice_info.html")
	public String find_notice_info(Integer id, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", -1);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			NoticeInfo noticeInfo = noticeInfoService.findById(id);
			jsonStr.put("noticeInfo", noticeInfo);
			jsonStr.put("result", SUCCESS_ONE);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
