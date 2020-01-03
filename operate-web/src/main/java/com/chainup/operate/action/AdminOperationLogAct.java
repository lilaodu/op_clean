package com.chainup.operate.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainup.common.exchange.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainup.common.util.ZxingUtils;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOperationLogService;
import com.chainup.operate.service.AdminUserService;
import com.chainup.operate.service.AuthRealnameService;

import com.chainup.operate.service.UserService;

/**
 * 日志信息action
 *
 * @author zhongjingyun 20170915
 *
 */
@Controller
@Scope("prototype")
public class AdminOperationLogAct extends BaseAct {
	Logger                logger  = LoggerFactory.getLogger(AdminOperationLogAct.class);
	@Autowired
	private AdminOperationLogService adminOperationLogService;
	@Autowired
	private AuthRealnameService authRealnameService;

	@Autowired
	private UserService userService;
	@Autowired
	private AdminUserService adminUserService;
	@Value("${total_balance_coin_symbol}")
	String totalBalanceSymbol;



	// TODO

    /**
     * 用户详细信息页面：操作日志
     */
	@RequestMapping(value = "/adminLogInfo.html")
	public String adminLogInfo(Integer index, Integer pageSize, Integer id, Long orderId, HttpServletRequest request,
							   HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals("1")) {
				response.sendRedirect("login.html");
				return null;
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

			if (id == null) {
				return null;
			}

			// 获取用户基础信息
			User user = userService.findById(id);// 用户基本信息
			String language = this.getLocalLanguage(request);
			if (user != null && user.getAuthLevel() != 0) {// 已实名认证
				AuthRealname authRealname = authRealnameService.findByUId(user.getId());
				if (authRealname != null) {
					if (language.equals("zh")) {
						user.setRealName(authRealname.getFamilyName() + authRealname.getName());
					} else {
						user.setRealName(authRealname.getName() + authRealname.getFamilyName());
					}
					model.addAttribute("certificateType", authRealname.getCertificateType());
				}else{
					model.addAttribute("certificateType", "");
				}
			}


			// 获取该用户的操作日志
			AdminOperationLogExample example = new AdminOperationLogExample();
			AdminOperationLogExample.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(id);
			int count = adminOperationLogService.count(example);
			jpc.setPageSize(pageSize);
			jpc.setRequest(request);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			example.setLimitStart(start);
			example.setLimitEnd(length);
			example.setOrderByClause("ctime desc"); // 默认按登录时间倒序

			List<Map<String, Object>> adminOperationLogMapList = null;
			List<AdminOperationLog> adminOperationLogList = adminOperationLogService.findAll(example);

			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/adminLogInfo.html");
			request.setAttribute("jpage", jpage);

			model.addAttribute("adminOperationLogList", adminOperationLogMapList);
			model.addAttribute("user", user);
			model.addAttribute("index", index);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "user_detail_info");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	// 获取base64编码的二维码
	private String getQRCode(String address) {
		String QRStr = ZxingUtils.getQRCodeImge(address, 200);
		return "data:image/png;base64," + QRStr;
	}
}