package com.chainup.operate.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminAction;

@Controller
public class IndexAct extends BaseAct {
	//后台首页
	@RequestMapping(value = "/index.html")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}
			MyEConfig mconfig = CommonContainer.getSite();
			FrontUtils.frontData(request, model, mconfig);
			request.getSession().setAttribute("nid", "1");
			return FrontUtils.getTplPath(mconfig.getSolutionPath(), "", "index");
		} catch (Exception ex) {
			ex.printStackTrace();
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("error", "对不起，程序出现系统错误，请和网站管理员联系，谢谢！");
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
		}
	}
	
	//首页一级导航页
	@RequestMapping(value = "/indexManager.html")
	public String indexManager(String menu,String nid,HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			}
			MyEConfig mconfig = CommonContainer.getSite();
			FrontUtils.frontData(request, model, mconfig);
			
			List<AdminAction> actionList = getActionList(request);
			List<List<AdminAction>> menuList = getMenuList(actionList,menu,request);
			request.getSession().setAttribute("menuList", menuList);
			request.getSession().setAttribute("nid", nid);
			return FrontUtils.getTplPath(mconfig.getSolutionPath(), "", "indexManager");
		} catch (Exception ex) {
			ex.printStackTrace();
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("error", "对不起，程序出现系统错误，请和网站管理员联系，谢谢！");
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
		}
	}
	
	//获取菜单列表
	public List<List<AdminAction>> getMenuList(List<AdminAction> actionList,String parentCode,HttpServletRequest request) {
		//菜单列表
		Map<Integer, List<AdminAction>> menuMap = new HashMap<Integer, List<AdminAction>>();
		
		//找到根结点
		AdminAction root = null;
		for(AdminAction action:actionList) {
			if(action.getParentId() == 0 && action.getAtName().equals(parentCode)) {
				root = action;
				break;
			}
		}
		
		//找二级菜单
		for(AdminAction action:actionList) {
			if(action.getParentId().toString().equals(root.getId().toString()) && action.getAtType()!=0) {
				String actionDes = getLocalMsg(action.getAtName(), request);
				if(actionDes != null) {
					action.setAtDes(actionDes);
				}
				List<AdminAction> list = new ArrayList<AdminAction>();
				list.add(action);
				menuMap.put(action.getId(), list);
			}
		}
		
		//找三级菜单
		for(AdminAction action:actionList) {
			if(menuMap.containsKey(action.getParentId()) && action.getAtType()!=0) {
				String actionDes = getLocalMsg(action.getAtName(), request);
				if(actionDes != null) {
					action.setAtDes(actionDes);
				}
				List<AdminAction> list = menuMap.get(action.getParentId());
				list.add(action);
			}
		}
		
		//取菜单结果
		List<List<AdminAction>> menuList = new ArrayList<List<AdminAction>>();
		for (Entry<Integer, List<AdminAction>> entry:menuMap.entrySet()){
			menuList.add(entry.getValue());
		}
		return menuList;
	}
}
