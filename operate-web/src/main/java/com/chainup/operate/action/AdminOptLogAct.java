package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.AdminOptLog;
import com.chainup.common.exchange.entity.AdminOptLogExample;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.util.OperatePropertyUtil;

@Controller
public class AdminOptLogAct extends BaseAct {
	//private static SimpleDateFormat sdhmsf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	//日志列表
	@RequestMapping(value = "/admin_opt_log.html")
	public String admin_opt_log(Integer pageSize,String type,String table,String startTime,String endTime,HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminOptLog)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			if (pageSize == null) {
				pageSize = CURRENT_PAGE_SIZE;
			}
			JPageConfig jpc = null;
			try {
				jpc = new JPageConfig();
			} catch (JPageException e) {
				e.printStackTrace();
				return "view";
			}
			jpc.setPageSize(pageSize);
			jpc.setRequest(request);
			
			String date_format = OperatePropertyUtil.getProperties("system_date_format");
			SimpleDateFormat sdhmsf=new SimpleDateFormat(date_format);
			
			AdminOptLogExample example = new AdminOptLogExample();
			AdminOptLogExample.Criteria criteria = example.createCriteria();
			if(type!=null && !type.isEmpty()) {
				criteria.andEventTypeEqualTo(Integer.parseInt(type));
			}
			if(table!=null && !table.isEmpty()) {
				criteria.andEventTableLike("%"+table+"%");
			}
			if(startTime!=null && !startTime.isEmpty()) {
				criteria.andCtimeGreaterThanOrEqualTo(sdhmsf.parse(startTime));
			}
			if(endTime!=null && !endTime.isEmpty()) {
				criteria.andCtimeLessThanOrEqualTo(sdhmsf.parse(endTime));
			}
			int count = adminOptLogService.count(example);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			
			example.setLimitStart(start);
			example.setLimitEnd(length);
			example.setOrderByClause("ctime desc");
			List<AdminOptLog> logList = adminOptLogService.findAll(example);
			
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/admin_opt_log.html");
			request.setAttribute("jpage", jpage);
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("request", request);
			model.addAttribute("count", count);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("type", type);
			model.addAttribute("table", table);
			model.addAttribute("startTime", startTime);
			model.addAttribute("endTime", endTime);
			model.addAttribute("logList", logList);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_opt_log");
		}catch(Exception ex){
			ex.printStackTrace();
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("error", "对不起，程序出现系统错误，请和网站管理员联系，谢谢！");		
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
		}
	}
	
	//删除日志
	@RequestMapping(value = "/admin_opt_log_del.html")
	public String admin_opt_log_del(String ids, String startDate, HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try{
			JSONObject jsonStr = new JSONObject();
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
			
			if(!this.validateAction(request, AdminActionConst.adminOptLogDel)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			Integer result = 0;
			String[] idList = ids.split(",");
			List<Integer> list = new ArrayList<Integer>();
			
			for (String id : idList) {
				list.add(Integer.parseInt(id));
			}
			
			if(list.size()>0){
				AdminOptLogExample example = new AdminOptLogExample();
				example.createCriteria().andIdIn(list);
				adminOptLogService.delete(example);
				result = 1;
				writeLog(request, "admin_opt_log", AdminOptLogService.ADMIN_LOG_TYPE_DEL, "删除日志:"+ids);
			}

			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}
