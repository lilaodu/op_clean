package com.chainup.operate.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.AdminActionExample;
import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleAction;
import com.chainup.common.exchange.entity.AdminRoleActionExample;
import com.chainup.common.exchange.entity.AdminRoleExample;
import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;

@Controller
@Scope("prototype")
public class AdminRoleAct extends BaseAct  {
	private static final Logger logger = LoggerFactory.getLogger(AdminRoleAct.class);
	public static final String COOKIE_ERROR_REMAINING = "_error_remaining";
	
	@RequestMapping(value = "/admin_role.html")
	public String admin_role(Integer pageSize, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){
				response.sendRedirect("login.html");
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminRole)){
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
			
			AdminRoleExample roleExample = new AdminRoleExample();
			int count = adminRoleService.count(roleExample);
			
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			
			roleExample.setLimitStart(start);
			roleExample.setLimitEnd(length);
			roleExample.setOrderByClause("ctime desc");
			List<AdminRole> roleList = adminRoleService.findAll(roleExample);
			
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/admin_role.html");
			request.setAttribute("jpage", jpage);
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("roleList", roleList);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("count", count);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_role");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 删除角色
	 */
	@RequestMapping(value = "/admin_role_del.html")
	public String admin_role_del(String ids, HttpServletRequest request, HttpServletResponse response, ModelMap model){
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

			if(!this.validateAction(request, AdminActionConst.adminRoleDel)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			Integer result = 0;
			String [] idList = ids.split(",");
			for(String id: idList){
				AdminRole role = adminRoleService.findById(Integer.parseInt(id));
				AdminRoleUserExample userExample = new AdminRoleUserExample();
				userExample.createCriteria().andRlIdEqualTo(role.getId());
				List<AdminRoleUser> roleUsers = adminRoleUserService.findAll(userExample);
				if(roleUsers!=null && roleUsers.size()>0){
					jsonStr.put("result", -3);
					jsonStr.put("roleName", role.getRlName());
					writeJson(jsonStr.toString(), request, response);
					return null;
				}
				
				AdminRoleExample roleExample = new AdminRoleExample();
				roleExample.createCriteria().andIdEqualTo(Integer.parseInt(id));
				adminRoleService.delete(roleExample);
				writeLog(request, "admin_role", AdminOptLogService.ADMIN_LOG_TYPE_DEL, "删除角色:"+role.getRlName());
				result = 1;
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 打开该角色设置权限页面
	 */
	@RequestMapping(value = "/admin_role_actions.html")
	public String admin_role_actions(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			if(!this.execute(request, response, model).equals(AUTH_STATUS)){
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			
			if(!this.validateAction(request, AdminActionConst.adminRoleActionSet)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			//取到当前角色
			AdminRole role = adminRoleService.findById(id);
			
			//获取当前角色权限
			AdminRoleActionExample roleActionExample = new AdminRoleActionExample();
			roleActionExample.createCriteria().andRlIdEqualTo(id);
			List<AdminRoleAction> actionList = adminRoleActionService.findAll(roleActionExample);
			
			//获取所有权限
			AdminActionExample actionExample = new AdminActionExample();
			List<AdminAction> allActionList = adminActionService.findAll(actionExample);
			
			model.addAttribute("role", role);
			model.addAttribute("actionList", actionList);
			model.addAttribute("allActionList", allActionList);

			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_role_actions");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	/*
	 * 分派权限
	 */
	@RequestMapping(value = "/admin_role_actions_submit.html")
	public String admin_role_actions_submit(String ids, Integer rid, HttpServletRequest request, HttpServletResponse response, ModelMap model){
		JSONObject jsonStr = new JSONObject();
		try {
			logger.info("admin_role_actions_submit ids = {}",ids);
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
			
			if(!this.validateAction(request, AdminActionConst.adminRoleActionSet)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			String actions[] = ids.split(",");
			
			//先删除旧角色
			AdminRoleActionExample roleActionExample = new AdminRoleActionExample();
			roleActionExample.createCriteria().andRlIdEqualTo(rid);
			adminRoleActionService.delete(roleActionExample);
			
			Integer result = 0;
			List<AdminRoleAction> roleActions = new ArrayList<AdminRoleAction>();
			for(int i=0;i<actions.length;i++) {
				if(actions[i]==null || actions[i].isEmpty()) {
					break;
				}
				AdminRoleAction roleAction = new AdminRoleAction();
				roleAction.setRlId(rid);
				roleAction.setAtId(Integer.parseInt(actions[i]));
				roleAction.setCtime(new Date());
				roleAction.setMtime(new Date());
				roleActions.add(roleAction);
				adminRoleActionService.add(roleAction);
			}
			writeLog(request, "admin_role_action", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, "给角色:"+rid+" 分派权限");
			isActionChang = true;
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 打开添加角色页面
	 */
	@RequestMapping(value = "/admin_role_add.html")
	public String admin_role_add(AdminRole role, HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} 
			
			if(!this.validateAction(request, AdminActionConst.adminRoleAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_role_add");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 添加角色提交
	 */
	@RequestMapping(value = "/admin_role_add_submit.html")
	public String admin_role_add_submit(AdminRole role, HttpServletRequest request, HttpServletResponse response, ModelMap model){
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

			if(!this.validateAction(request, AdminActionConst.adminRoleAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			role.setRlDes(getSafeUtf8(role.getRlDes(), request));
			role.setRlName(getSafeUtf8(role.getRlName(), request));
			
			Integer result = 0;
			AdminRoleExample roleExample = new AdminRoleExample();
			roleExample.createCriteria().andRlNameEqualTo(role.getRlName());
			if(adminRoleService.count(roleExample) > 0) {
				result = EXCEPTION_TWO;// 角色名已经存在
			}
			else {
				adminRoleService.add(role);
				result = 1;
				isActionChang = true;
				writeLog(request, "admin_role", AdminOptLogService.ADMIN_LOG_TYPE_ADD,"添加角色:"+role.getRlName());
			}

			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 打开编辑角色页面
	 */
	@RequestMapping(value = "/admin_role_edit.html")
	public String admin_role_edit(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model){
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} 
			
			if(!this.validateAction(request, AdminActionConst.adminRoleEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			AdminRole role = adminRoleService.findById(id);
			model.addAttribute("role", role);
			
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "admin_role_edit");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 编辑角色提交
	 */
	@RequestMapping(value = "/admin_role_edit_submit.html")
	public String admin_role_edit_submit(AdminRole role, HttpServletRequest request, HttpServletResponse response, ModelMap model){
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
			
			if(!this.validateAction(request, AdminActionConst.adminRoleEdit)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			
			role.setRlDes(getSafeUtf8(role.getRlDes(), request));
			role.setRlName(getSafeUtf8(role.getRlName(), request));
			
			Integer result = 0;
			AdminRole tmp = adminRoleService.findById(role.getId());
			
			if (tmp != null) {
				AdminRoleExample roleExample = new AdminRoleExample();
				roleExample.createCriteria().andRlNameEqualTo(role.getRlName()).andIdNotEqualTo(role.getId());
				if(adminRoleService.count(roleExample) > 0) {
					result = EXCEPTION_TWO;// 角色名已经存在
				}
				else {
					if(!tmp.getRlType() && role.getRlType()) {
						//从普通管理员切换成超级管理员，删除权限
						AdminRoleActionExample roleActionExample = new AdminRoleActionExample();
						roleActionExample.createCriteria().andRlIdEqualTo(role.getId());
						adminRoleActionService.delete(roleActionExample);
					}
					
					role.setCtime(tmp.getCtime());
					role.setMtime(new Date());
					adminRoleService.update(role);
					result = 1;
					writeLog(request, "admin_role", AdminOptLogService.ADMIN_LOG_TYPE_EDIT,"编辑角色:"+role.getRlName());
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
}
