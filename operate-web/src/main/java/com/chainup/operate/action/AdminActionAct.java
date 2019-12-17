package com.chainup.operate.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.AdminActionExample;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

@Controller
@Scope("prototype")
public class AdminActionAct extends BaseAct  {
	public static final String COOKIE_ERROR_REMAINING = "_error_remaining";
	
	//用户权限列表
	@RequestMapping(value = "/admin_action.html")
	public String admin_action(Integer pageSize, String actionCode,String actionDes,String actionType,HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} 
			
			if(!this.validateAction(request, AdminActionConst.adminAction)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			if (pageSize == null)
				pageSize = CURRENT_PAGE_SIZE;
			JPageConfig jpc = null;
			try {
				jpc = new JPageConfig();
			} catch (JPageException e) {
				e.printStackTrace();
				return "view";
			}
			
			actionCode = getSafeUtf8(actionCode, request);
			actionDes = getSafeUtf8(actionDes, request);
			if(actionDes!=null && actionDes.length()>0){
				actionDes = new String(Base64.decode(actionDes.replace(" ", "+")),"UTF-8");
			}
			
			AdminActionExample example = new AdminActionExample();
			AdminActionExample.Criteria criteria = example.createCriteria();
			if(actionCode!=null && !actionCode.isEmpty()) {
				criteria.andAtNameLike("%"+actionCode+"%");
			}
			if(actionDes!=null && !actionDes.isEmpty()) {
				criteria.andAtDesLike("%"+actionDes+"%");
			}
			if(actionType != null && !actionType.isEmpty()) {
				criteria.andAtTypeEqualTo(Integer.parseInt(actionType));
			}
			
			jpc.setPageSize(pageSize);
			jpc.setRequest(request);
			int count = adminActionService.count(example);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			example.setLimitStart(start);
			example.setLimitEnd(length);
			example.setOrderByClause("ctime desc");
			List<AdminAction> eaList = adminActionService.findAll(example);
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/admin_action.html");
			request.setAttribute("jpage", jpage);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("actionList", eaList);
			model.addAttribute("count", count);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("actionCode", actionCode);
			model.addAttribute("actionDes", actionDes);
			model.addAttribute("actionType", actionType);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_action");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//删除权限
	@RequestMapping(value = "/admin_action_del.html")
	public String admin_action_del(String ids, HttpServletRequest request, HttpServletResponse response, ModelMap model){
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){	
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminActionDel)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}

			Integer result = 0;
			String[] idList = ids.split(",");
			List<Integer> list = new ArrayList<Integer>();
			AdminActionExample example = new AdminActionExample();
			
			for (String id : idList) {
				list.add(Integer.parseInt(id));
			}
			
			if(list.size()>0){
				example.createCriteria().andIdIn(list);
				adminActionService.delete(example);
				result = 1;
				isActionChang = true;
				writeLog(request, "admin_action", AdminOptLogService.ADMIN_LOG_TYPE_DEL, "删除权限:"+ids);
			}
			
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//加载添加权限
	@RequestMapping(value = "/admin_action_add.html")
	public String admin_action_add(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} 
			
			if(!this.validateAction(request, AdminActionConst.adminActionAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_action_add");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	//添加权限提交
	@RequestMapping(value = "/admin_action_add_submit.html")
	public String admin_action_add_submit(AdminAction action,Integer atType,Integer firstNav,Integer secondNav, Integer thirdNav,HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminActionAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			action.setAtName(getSafeUtf8(action.getAtName(), request));
			action.setAtDes(getSafeUtf8(action.getAtDes(), request));
			action.setAtUrl(getSafeUtf8(action.getAtUrl(), request));
			
			if(atType==1) {//一级导航
				action.setParentId(0);
				action.setAtUrl("");
			}
			else if(atType==2){//二级导航
				action.setParentId(firstNav);
			}
			else if(atType==3){//三级导航
				action.setParentId(secondNav);
			}
			else{//页面权限
				if(thirdNav != null) {
					action.setParentId(thirdNav);
				}
				else {
					action.setParentId(secondNav);
				}
				
				action.setAtUrl("");
			}
			
			Integer result = 0;
			String msg = "操作失败";
			if(action!=null){
				AdminActionExample example = new AdminActionExample();
				example.createCriteria().andAtNameEqualTo(action.getAtName());
				if (adminActionService.count(example) > 0) {//此权限标识存在
					result = EXCEPTION_TWO;
					msg="其他权限已使用该权限标识";
				}else{
					action.setCtime(new Date());
					action.setMtime(new Date());
					adminActionService.add(action);
					result = 1;
					msg="添加权限成功";
					isActionChang = true;
					writeLog(request, "admin_action", AdminOptLogService.ADMIN_LOG_TYPE_ADD, "添加权限："+action.getAtDes());
				}
			}
			jsonStr.put("result", result);
			jsonStr.put("msg", msg);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//获取单个权限
	@RequestMapping(value = "/admin_action_info.html")
	public String admin_action_info(String id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminAction)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			Integer result = 0;
			
			AdminAction action = adminActionService.findById(Integer.parseInt(id));
			List<AdminAction> parentList = adminActionService.findAll(new AdminActionExample());
			jsonStr.put("action", action);
			jsonStr.put("parentList", parentList);
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//加载编辑用户权限
	@RequestMapping(value = "/admin_action_edit.html")
	public String admin_action_edit(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} 
			
			if(!this.validateAction(request, AdminActionConst.adminActionEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			AdminAction action = adminActionService.findById(id);
			String firstNav = "";
			String secondNav = "";
			String thirdNav = "";
			if(action.getAtType()==1) {//一级导航
			}
			else if(action.getAtType()==2){//二级导航
				firstNav = action.getParentId().toString();
				secondNav = action.getId().toString();
			}
			else if(action.getAtType()==3){//三级导航
				AdminAction firstAction = adminActionService.findById(action.getParentId());
				firstNav = firstAction.getParentId().toString();
				secondNav = action.getParentId().toString();
				thirdNav = action.getId().toString();
			}
			else {
				AdminAction parentAction = adminActionService.findById(action.getParentId());
				AdminAction preParentAction = adminActionService.findById(parentAction.getParentId());
				if(preParentAction.getParentId() == 0) {//属于二级导航中的页面权限
					firstNav = parentAction.getParentId().toString();
					secondNav = parentAction.getId().toString();
				}
				else {//属于三级导航中的页面权限
					firstNav = preParentAction.getParentId().toString();
					secondNav = preParentAction.getId().toString();
					thirdNav = parentAction.getId().toString();
				}
			}
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("action", action);
			
			model.addAttribute("firstNav", firstNav);
			model.addAttribute("secondNav", secondNav);
			model.addAttribute("thirdNav", thirdNav);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_action_edit");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	//编辑权限提交
	@RequestMapping(value = "/admin_action_edit_submit.html", method = RequestMethod.POST)
	public String admin_action_edit_submit(AdminAction action,Integer atType,Integer firstNav,Integer secondNav, Integer thirdNav,HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminActionEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			Integer result = 0;
			String msg = "操作失败";
			if (action != null) {
				//获取正确的中文信息
				action.setAtName(getSafeUtf8(action.getAtName(), request));
				action.setAtDes(getSafeUtf8(action.getAtDes(), request));
				action.setAtUrl(getSafeUtf8(action.getAtUrl(), request));
				
				if(atType==1) {//一级导航
					action.setParentId(0);
					action.setAtUrl("");
				}
				else if(atType==2){//二级导航
					action.setParentId(firstNav);
				}
				else if(atType==3){//三级导航
					action.setParentId(secondNav);
				}
				else{//页面权限
					if(thirdNav != null) {
						action.setParentId(thirdNav);
					}
					else {
						action.setParentId(secondNav);
					}
					
					action.setAtUrl("");
				}
				
				AdminActionExample example = new AdminActionExample();
				example.createCriteria().andAtNameEqualTo(action.getAtName()).andIdNotEqualTo(action.getId());
				if (adminActionService.count(example) > 0) {//其他权限已经存在该权限标识
					result = EXCEPTION_TWO;
					msg="其他权限已使用该权限标识";
				} else {
					action.setMtime(new Date());
					adminActionService.update(action);
					//writeLog(adminUser.getUsername(), 2, "编辑权限：" + ea2.getAction_describe(), request);
					result = 1;
					msg="编辑权限成功";
					isActionChang = true;
					writeLog(request, "admin_action", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, "编辑权限："+action.getAtDes());
				}
			}
			jsonStr.put("result", result);
			jsonStr.put("msg", msg);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value = "/admin_action_getnav.html")
	public String admin_action_getnav(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			//获取导航菜单
			List<AdminAction> list = adminActionService.findAll(new AdminActionExample());
			List<Map<String, Object>> nav = getNavData(list,0,1);
			
			jsonStr.put("result", 1);
			jsonStr.put("nav", nav);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private List<Map<String, Object>> getNavData(List<AdminAction> actions,Integer parentId,Integer level){
		if(level >3) {
			return null;
		}
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for(AdminAction action:actions) {
			if(action.getParentId() == parentId) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("value", action.getId().toString());
				map.put("text", action.getAtDes());
				
				List<Map<String, Object>> children = getNavData(actions,action.getId(),level+1);
				if(children != null) {
					map.put("children", children);
				}
				list.add(map);
			}
		}
		return list;
	}
}
