package com.chainup.operate.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleExample;
import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.exchange.entity.AdminUserExample;
import com.chainup.common.exchange.entity.Country;
import com.chainup.common.util.MyEAESUtil;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.CountryService;
import com.google.common.collect.Maps;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

@Controller
public class AdminUserAct extends BaseAct {
	

	
	// 用户管理列表
	@RequestMapping(value = "/admin_user.html")
	public String admin_user(Integer pageSize, String mobile, String username,
			HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}

			if (!this.validateAction(request, AdminActionConst.adminUser)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}

			mobile = getSafeUtf8(mobile, request);
			username = getSafeUtf8(username, request);
			if (username != null && username.length() > 0) {
				username = new String(
						Base64.decode(username.replace(" ", "+")), "UTF-8");
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

			AdminUserExample userExample = new AdminUserExample();
			AdminUserExample.Criteria criteria = userExample.createCriteria();
			if (mobile != null && !mobile.isEmpty()) {
				criteria.andMobileNumberLike("%" + mobile + "%");
			}
			if (username != null && !username.isEmpty()) {
				criteria.andNicknameLike("%" + username + "%");
			}
			int count = adminUserService.count(userExample);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();

			userExample.setLimitStart(start);
			userExample.setLimitEnd(length);
			userExample.setOrderByClause("ctime desc");
			List<AdminUser> users = adminUserService.findAll(userExample);

			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/admin_user.html");
			request.setAttribute("jpage", jpage);

			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("request", request);
			model.addAttribute("count", count);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("mobile", mobile);
			model.addAttribute("username", username);
			model.addAttribute("users", users);
			return FrontUtils.getTplPath(config.getSolutionPath(), "",
					"admin_user");
		} catch (Exception ex) {
			ex.printStackTrace();
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("error", "对不起，程序出现系统错误，请和网站管理员联系，谢谢！");
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
		}
	}

	// 打开添加用户页面
	@RequestMapping(value = "/admin_user_add.html")
	public String admin_user_add(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}

			if (!this.validateAction(request, AdminActionConst.adminUserAdd)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}
			
			//国家编码

			String countryCode = PropertyUtil.getProperties("system_default_country_code");

			model.addAttribute("countryCode", countryCode);

			List<AdminRole> roles = adminRoleService
					.findAll(new AdminRoleExample());
			model.addAttribute("roles", roles);

			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "",
					"admin_user_add");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 添加用户提交
	@RequestMapping(value = "/admin_user_add_submit.html")
	public String admin_user_add_submit(AdminUser adminUser, String rids,
			HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
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

			if (!this.validateAction(request, AdminActionConst.adminUserAdd)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}

			Integer result = 0;
			AdminUserExample userExample = new AdminUserExample();
			userExample.createCriteria().andMobileNumberEqualTo(
					adminUser.getMobileNumber());
			if (adminUserService.count(userExample) > 0) {
				result = EXCEPTION_TWO;// 该手机号已经存在
			} else {
				adminUser.setNickname(getSafeUtf8(adminUser.getNickname(),
						request));
				adminUser.setEmail(getSafeUtf8(adminUser.getEmail(), request));
				adminUser.setCtime(new Date());
				adminUser.setMtime(new Date());
				adminUser.setLastIp(getIpAddr(request));
				adminUser.setLastTime(new Date());
				String password = MyEAESUtil.jiami(adminUser.getLoginPword());
				adminUser.setLoginPword(password);
				adminUserService.add(adminUser);

				// 添加角色
				List<AdminUser> users = adminUserService.findAll(userExample);
				if (users.size() > 0) {
					AdminUser user = users.get(0);
					String roleList[] = rids.split(",");
					for (int i = 0; i < roleList.length; i++) {
						AdminRoleUser roleUser = new AdminRoleUser();
						roleUser.setAdId(user.getId());
						roleUser.setRlId(Integer.parseInt(roleList[i]));
						roleUser.setCtime(new Date());
						roleUser.setMtime(new Date());
						adminRoleUserService.add(roleUser);
					}
					result = 1;
					writeLog(request, "admin_user",
							AdminOptLogService.ADMIN_LOG_TYPE_ADD, "添加用户:"
									+ users.get(0).getNickname());
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

	// 打开编辑用户页面
	@RequestMapping(value = "/admin_user_edit.html")
	public String admin_user_edit(Integer id, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}
			

			if (!this.validateAction(request, AdminActionConst.adminUserEdit)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}

			AdminUser user = adminUserService.findById(id);
			if (user != null) {
				user.setLoginPword(new String(MyEAESUtil.jiemi(user
						.getLoginPword())));
			}
			
			//国家编码

			String countryCode = PropertyUtil.getProperties("system_default_country_code");
			if (StringUtils.isNotBlank(user.getCountryCode())) {
				countryCode = user.getCountryCode();
			}

			AdminRoleUserExample roleUserExample = new AdminRoleUserExample();
			roleUserExample.createCriteria().andAdIdEqualTo(id);
			List<AdminRoleUser> roleUsers = adminRoleUserService
					.findAll(roleUserExample);

			List<AdminRole> roles = adminRoleService
					.findAll(new AdminRoleExample());
			model.addAttribute("user", user);
			model.addAttribute("roles", roles);
			model.addAttribute("roleUsers", roleUsers);

			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "",
					"admin_user_edit");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 编辑用户提交
	@RequestMapping(value = "/admin_user_edit_submit.html")
	public String admin_user_edit_submit(AdminUser adminUser, String rids,
			HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
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

			if (!this.validateAction(request, AdminActionConst.adminUserEdit)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}

			Integer result = 0;
			AdminUserExample userExample = new AdminUserExample();
			userExample.createCriteria()
					.andMobileNumberEqualTo(adminUser.getMobileNumber())
					.andIdNotEqualTo(adminUser.getId());
			if (adminUserService.count(userExample) > 0) {
				result = EXCEPTION_TWO;// 该手机号已经存在
			} else {
				AdminUser user = adminUserService.findById(adminUser.getId());
				user.setMobileNumber(adminUser.getMobileNumber());
				user.setNickname(getSafeUtf8(adminUser.getNickname(), request));
				user.setEmail(getSafeUtf8(adminUser.getEmail(), request));
				user.setMtime(new Date());
				user.setCountryCode(adminUser.getCountryCode());;
				adminUserService.update(user);

				// 更新角色
				AdminRoleUserExample roleUserExample = new AdminRoleUserExample();
				roleUserExample.createCriteria().andAdIdEqualTo(user.getId());
				adminRoleUserService.delete(roleUserExample);

				String roleList[] = rids.split(",");
				for (int i = 0; i < roleList.length; i++) {
					AdminRoleUser roleUser = new AdminRoleUser();
					roleUser.setAdId(user.getId());
					roleUser.setRlId(Integer.parseInt(roleList[i]));
					roleUser.setCtime(new Date());
					roleUser.setMtime(new Date());
					adminRoleUserService.add(roleUser);
				}
				result = 1;
				writeLog(request, "admin_user",
						AdminOptLogService.ADMIN_LOG_TYPE_EDIT,
						"修改用户:" + user.getNickname());
			}

			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 打开修改密码页面
	@RequestMapping(value = "/admin_user_edit_password.html")
	public String admin_user_edit_password(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}

			// if(!this.validateAction(request,
			// AdminActionConst.adminUserEdit)){
			// MyEConfig config = CommonContainer.getSite();
			// FrontUtils.frontData(request, model, config);
			// model.addAttribute("error", getLocalMsg("noaction_error",
			// request));
			// return FrontUtils.getTplPath(config.getSolutionPath(), "",
			// "error");
			// }

			AdminUser user = adminUserService.findById(adminUser.getId());
			if (user != null) {
				user.setLoginPword(new String(MyEAESUtil.jiemi(user
						.getLoginPword())));
			}
			model.addAttribute("user", user);

			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "",
					"admin_user_edit_password");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 修改密码提交
	@RequestMapping(value = "/admin_user_edit_password_submit.html")
	public String admin_user_edit_password_submit(String oldPword,
			String newPword, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
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

			// if(!this.validateAction(request,
			// AdminActionConst.adminUserEdit)){
			// MyEConfig config = CommonContainer.getSite();
			// FrontUtils.frontData(request, model, config);
			// model.addAttribute("error", getLocalMsg("noaction_error",
			// request));
			// return FrontUtils.getTplPath(config.getSolutionPath(), "",
			// "error");
			// }

			Integer result = 0;
			AdminUser user = adminUserService.findById(adminUser.getId());
			String loginPass = new String(
					MyEAESUtil.jiemi(user.getLoginPword()));
			if (!oldPword.equals(loginPass)) {
				result = EXCEPTION_TWO;// 旧密码错误
			} else {
				String password = MyEAESUtil.jiami(newPword);
				user.setLoginPword(password);
				user.setMtime(new Date());
				adminUserService.update(user);
				result = 1;
				writeLog(request, "admin_user",
						AdminOptLogService.ADMIN_LOG_TYPE_EDIT, "修改用户密码:"
								+ user.getNickname());
			}

			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 删除用户
	@RequestMapping(value = "/admin_user_del.html")
	public String admin_user_del(String ids, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
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

			if (!this.validateAction(request, AdminActionConst.adminUserDel)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}

			String id[] = ids.split(",");
			for (String i : id) {
				AdminUser user = adminUserService.findById(Integer.parseInt(i));
				if (user != null) {
					AdminUserExample example = new AdminUserExample();
					example.createCriteria().andIdEqualTo(Integer.parseInt(i));
					adminUserService.delete(example);
					writeLog(request, "admin_user",
							AdminOptLogService.ADMIN_LOG_TYPE_DEL, "删除用户:"
									+ user.getNickname());
				}
			}

			jsonStr.put("result", 1);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 获取用户信息
	@RequestMapping(value = "/admin_user_info.html")
	public String findEntAdminInfo(int id, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
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

			if (!this.validateAction(request, AdminActionConst.adminUser)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error",
						getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "",
						"error");
			}

			Integer result = 0;

			AdminUser user = adminUserService.findById(id);
			if (user != null) {
				user.setLoginPword(new String(MyEAESUtil.jiemi(user
						.getLoginPword())));
			}

			jsonStr.put("user", user);
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 解除账号登录锁定
	@RequestMapping(value = "/unlock_account.html")
	public String unlockAccount(Integer id, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		JSONObject rst = new JSONObject();
		try {
			if(!this.validToken(request)) {
				rst.put("result", FAIL_VALID_TOKEN);
				writeJson(rst.toString(), request, response);
				return null;
			}
			
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				rst.put("code", EXCEPTION_ONE);
				rst.put("message", "please login first");
				writeJson(rst.toString(), request, response);
				return null;
			}

			if (!this.validateAction(request, AdminActionConst.adminUserEdit)) {
				rst.put("code", EXCEPTION_TWO);
				rst.put("message", getLocalMsg("noaction_error", request));
				writeJson(rst.toString(), request, response);
				return null;
			}

			AdminUser user = adminUserService.findById(id);
			if (user == null) {
				rst.put("code", EXCEPTION_THREE);
				rst.put("message", getLocalMsg("noaction_error", request));
				writeJson(rst.toString(), request, response);
				return null;
			}

			unlockAccount(user.getMobileNumber(), request);

			rst.put("code", SUCCESS_ONE);
			writeJson(rst.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			rst.put("code", EXCEPTION_THREE);
			rst.put("message", getLocalMsg("noaction_error", request));
			writeJson(rst.toString(), request, response);
			return null;
		}
	}
}
