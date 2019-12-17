package com.chainup.operate.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chainup.common.enums.OtcOrderStatus;
import com.chainup.common.enums.VictoryStatus;
import com.chainup.common.exception.OtcException;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.AuthRealname;
import com.chainup.common.exchange.entity.Country;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserExample;
import com.chainup.common.exchange.entity.UserExample.Criteria;
import com.chainup.common.result.OtcMessage;
import com.chainup.common.util.DateUtils;
import com.chainup.common.util.OssClient;
import com.chainup.common.util.StringTool;
import com.chainup.common.util.StringUtil;
import com.chainup.common.util.ValidateCodeUtil;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOperationLogService;
import com.chainup.operate.service.AuthRealnameService;
import com.chainup.operate.service.CountryService;
import com.chainup.operate.service.OtcOrderService;
import com.chainup.operate.service.OtcUserExrService;

import com.chainup.operate.service.UserService;
import com.chainup.operate.util.OperatePropertyUtil;
import com.chainup.otc.entity.OtcChat;
import com.chainup.otc.entity.OtcOrder;
import com.chainup.otc.entity.OtcUserComplaint;

import com.chainup.operate.service.ExOrderService;

@Controller
@Scope("prototype")
public class UserAct extends BaseAct  {
	private static final Logger logger = LoggerFactory.getLogger(UserAct.class);
	@Autowired
	private UserService userService;
	@Autowired
    private CountryService countryService;
	@Autowired
    private AuthRealnameService authRealnameService;
	@Autowired
	private OtcOrderService		otcOrderService;
	@Resource
	private OtcUserExrService	otcUserExrService;
	@Autowired
	private ExOrderService    exOrderService;

	// 会员列表
	@RequestMapping(value = "/user.html")
	public String admin_action(Integer pageSize,String keyword,String ctimeEnd,String ctimeStart, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals("1")) {
				response.sendRedirect("login.html");
				return null;
			}
			if(!this.validateAction(request, AdminActionConst.user)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
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
            UserExample example = new UserExample();
            Criteria criteria = example.createCriteria();
            if (keyword != null && !keyword.equals("")) {
            	criteria.andOrKey(keyword);
            }
            String date_format = OperatePropertyUtil.getProperties("system_date_format");
			SimpleDateFormat sdhmsf=new SimpleDateFormat(date_format);
			try {
			    if(ctimeStart!=null && !ctimeStart.equals("")){
			        sdhmsf.parse(ctimeStart);
			    }
            } catch (Exception e) {
                ctimeStart = ctimeStart+" 00:00:00";
                ctimeEnd = ctimeEnd+" 23:59:59";
            }
			
            if (ctimeStart != null && !ctimeStart.equals("")) {
                criteria.andCtimeGreaterThanOrEqualTo(sdhmsf.parse(ctimeStart));
            }
            if (ctimeEnd != null && !ctimeEnd.equals("")) {
                criteria.andCtimeLessThanOrEqualTo(sdhmsf.parse(ctimeEnd));
            }
            jpc.setPageSize(pageSize);
            jpc.setRequest(request);
            int count = userService.count(example);
            jpc.setRecordTotal(count);
            jpc.commit();
            int start = jpc.getRecordStart();
            int length = jpc.getRecordLength();
            example.setLimitStart(start);
            example.setLimitEnd(length);
			example.setOrderByClause("ctime desc"); // 默认按创建时间倒序
			List<User> userList = userService.findAll(example);
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/user.html");
			request.setAttribute("jpage", jpage);

			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("userList", userList);
			model.addAttribute("keyword", keyword);
			model.addAttribute("ctimeEnd", ctimeEnd);
			model.addAttribute("ctimeStart", ctimeStart);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "user");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

    /**
     * 更改会员状态
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/update_status.html")
    public String update_user_status(User user, HttpServletRequest request, HttpServletResponse response,
            ModelMap model) {
        JSONObject jsonStr = new JSONObject();
        try {
        	//验证token
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
            if (!this.execute(request, response, model).equals("1")) {
                jsonStr.put("result", -1);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            if(!this.validateAction(request, AdminActionConst.updateStatus)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			User temp = userService.findById(user.getId());
			String content = "";
			String mobile = "";
			String opt = "";
			Integer event_type = 0;
			String current_type = "";
			String next_type = "";
			if (temp.getMobileNumber() != null) {
				mobile = StringUtil.formatMobileNO(temp.getMobileNumber());
			}
			if (user.getLoginStatus() != null && user.getLoginStatus() == 0) {// 冻结登录，冻结100年
				user.setLoginexpireTime(DateUtils.addMonth(new Date(), 1200));
				opt = getLocalMsg("user.page.nologin", request);
				event_type = AdminOperationLogService.OPERATION_LOG_FREEZE_LOGIN;
				current_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_LOGIN + "";
				next_type = AdminOperationLogService.OPERATION_LOG_FREEZE_LOGIN + "";
			} else if (user.getLoginStatus() != null && user.getLoginStatus() == 1) {
				user.setLoginexpireTime(DateUtils.addMonth(new Date(), 1200));
				event_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_LOGIN;
				current_type = AdminOperationLogService.OPERATION_LOG_FREEZE_LOGIN + "";
				next_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_LOGIN + "";
			}
			if (user.getWithdrawStatus() != null && user.getWithdrawStatus() == 0) {// 冻结提现，冻结100年
				user.setWithdrawexpireTime(DateUtils.addMonth(new Date(), 1200));
				opt = getLocalMsg("user.page.notixina", request);
				event_type = AdminOperationLogService.OPERATION_LOG_FREEZE_WITHDRAW;
				current_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_WITHDRAW + "";
				next_type = AdminOperationLogService.OPERATION_LOG_FREEZE_WITHDRAW + "";
			} else if (user.getWithdrawStatus() != null && user.getWithdrawStatus() == 1) {
				user.setWithdrawexpireTime(DateUtils.addMonth(new Date(), 1200));
				event_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_WITHDRAW;
				current_type = AdminOperationLogService.OPERATION_LOG_FREEZE_WITHDRAW + "";
				next_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_WITHDRAW + "";
			}
			if (user.getExcStatus() != null && user.getExcStatus() == 0) {// 冻结交易100年
				user.setExcexpireTime(DateUtils.addMonth(new Date(), 1200));
				opt = getLocalMsg("user.page.noexchange", request);
				event_type = AdminOperationLogService.OPERATION_LOG_FREEZE_TRANSACTION;
				current_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_TRANSACTION + "";
				next_type = AdminOperationLogService.OPERATION_LOG_FREEZE_TRANSACTION + "";
			} else if (user.getExcStatus() != null && user.getExcStatus() == 1) {
				user.setExcexpireTime(DateUtils.addMonth(new Date(), 1200));
				event_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_TRANSACTION;
				current_type = AdminOperationLogService.OPERATION_LOG_FREEZE_TRANSACTION + "";
				next_type = AdminOperationLogService.OPERATION_LOG_UNFREEZE_TRANSACTION + "";
			}
			
            if(userService.updateUserStatus(user) > 0) {
                writeManagerLog(request, user.getId(), event_type, current_type, next_type);
            }
            //短信提醒
//            if(!mobile.equals("") && !opt.equals("")){
//            	content = String.format(getLocalMsg("user.page.nobile.tip", request), this.getCompanyName(request))
//            			+mobile+getLocalMsg("user.page.nobile.tip1", request)+opt+getLocalMsg("user.page.nobile.tip2", request);
//            	ValidateCodeUtil.sendSmsValidataCode(temp.getCountryCode(), temp.getMobileNumber(), content);
//            }
            //userService.updateUserStatus(user);
            jsonStr.put("result", SUCCESS_ONE);
            writeJson(jsonStr.toString(), request, response);
            return null;
        } catch (Exception e) {
        	logger.error("update_user_status error user = {}",user);
            return null;
        }
    }

	@RequestMapping(value = "/update_user_mobile.html")
	public String update_user_mobile(Integer uid, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals("1")) {
				response.sendRedirect("login.html");
				return null;
			}
			if (!this.validateAction(request, AdminActionConst.user)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			String language = this.getLocalLanguage(request);
			User user = userService.findById(uid);
			if (user != null && user.getAuthLevel() != 0) {// 已实名认证
				AuthRealname authRealname = authRealnameService.findByUId(user.getId());
				if (authRealname != null) {
					if (language.equals("zh")) {
						user.setRealName(authRealname.getFamilyName() + authRealname.getName());
					} else {
						user.setRealName(authRealname.getName() + authRealname.getFamilyName());
					}
				}
			}
			AuthRealname authRealname = authRealnameService.findByUId(uid);
			if (authRealname == null) {
				authRealname = new AuthRealname();
			}
			List<Country> countryList = countryService.getAllCountryList(getLocalLanguage(request));
			String country_code = OperatePropertyUtil.getProperties("system_default_country_code");
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("countryList", countryList);
			model.addAttribute("country_code", country_code);
			model.addAttribute("user", user);
			model.addAttribute("authRealname", authRealname);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "update_user_mobile");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/otc_order_chat.html")
	public String otc_order_chat(String orderSequence, String buyerId, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals("1")) {
				response.sendRedirect("login.html");
				return null;
			}
			if (!this.validateAction(request, AdminActionConst.user)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			List<OtcChat> list = otcOrderService.selectChatByOrder(orderSequence, 0, Integer.MAX_VALUE);
			model.addAttribute("otcOrderChat", list);
			model.addAttribute("buyerId", buyerId);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "otc_order_chat");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

    /**
     * 去处理申诉页面
     */
	@RequestMapping(value = "/otc_order_complaint.html")
	public String otc_order_complaint(Integer orderId, String buyerId, HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals("1")) {
				response.sendRedirect("login.html");
				return null;
			}
			if (!this.validateAction(request, AdminActionConst.user)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			model.addAttribute("buyerId", buyerId);
			model.addAttribute("orderId", orderId);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "otc_order_complaint");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

    /**
     * 申诉处理提交
     */
	@RequestMapping(value = "/otc_order_complaint_submit.html")
	public String otc_order_complaint_submit(OtcUserComplaint complaint, VictoryStatus victoryStatus,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			} else if (!this.validateAction(request, AdminActionConst.cmsAdvertAdd)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			if (null == complaint || StringUtils.isBlank(complaint.getComplaintResult())) {
				jsonStr.put("result", EXCEPTION_ONE);
				jsonStr.put("message", "订单状态异常");
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (complaint != null && null != victoryStatus) {
				complaint.setRemark(getSafeUtf8(complaint.getRemark().trim(), request));
				// 如果提交了图片附件
				MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
				MultipartFile file = multipartRequest.getFile("file");
				if (file != null) {
					// 上传图片到服务器，以及插入确认记录
					String img = file.getOriginalFilename();
					String imageType = "jpg";
					if (img.indexOf("image/png") != -1) {
						imageType = "png";
					} else if (img.indexOf("image/bmp") != -1) {
						imageType = "bmp";
					} else if (img.indexOf("image/jpeg") != -1) {
						imageType = "jpeg";
					}

					String ossFullFileName = ""; // 创建新的图片名

					try {
						if (StringUtils.isNotBlank(file.getOriginalFilename())) {
							ossFullFileName = "otc_advert_complaint/" + System.currentTimeMillis()
									+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

							OssClient.uploadObject(file.getInputStream(), file.getSize(), ossFullFileName);
						}

						complaint.setImageUrl(ossFullFileName);
					} catch (IllegalStateException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				complaint.setCtime(new Date());
				complaint.setMtime(new Date());
				complaint.setUserId(0);
				complaint.setOperateId(adminUser.getId());
				// 查询相应订单，根据订单中买卖方的id来更新ext表的信任度

				OtcOrder order = otcOrderService.findById((long) complaint.getOrderId());
				if (order == null) {
					MyEConfig config = CommonContainer.getSite();
					FrontUtils.frontData(request, model, config);
					model.addAttribute("error", getLocalMsg("noaction_error", request));
					return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
				}
				if( !order.getStatus().equals( (byte)OtcOrderStatus.APPEAL.value)) {
					jsonStr.put("result", EXCEPTION_ONE);

					writeJson(jsonStr.toString(), request, response);
					return null;
				}
				otcOrderService.saveOtcUserComplaint(complaint , victoryStatus,order);

				// if(VictoryStatus.BUYER.value.equals(victoryStatus.value)) {
				// //买家胜诉
				// //买家是申诉人 ， 证明卖家的败诉量要加1
				// if(order.getBuyerId() == (long)complaint.getUserId()) {
				// otcUserExrService.updateComplain(order.getSellerId(), 0, 1,
				// 0);
				// }
				// //卖家是申诉人 ， 证明买家的胜诉量要加1
				// if(order.getSellerId() == (long)complaint.getUserId()) {
				// otcUserExrService.updateComplain(order.getBuyerId(), 0, 0,
				// 1);
				// }
				// }
				// if(VictoryStatus.SELLER.value.equals(victoryStatus.value)) {
				// //卖家胜诉
				// //买家是申诉人，卖家胜诉量加1
				// if(order.getBuyerId() == (long)complaint.getUserId()) {
				// otcUserExrService.updateComplain(order.getSellerId(), 0, 0,
				// 1);
				// }
				// //卖家是申诉人 ， 买家的败诉量加1
				// if(order.getSellerId() == (long)complaint.getUserId()) {
				// otcUserExrService.updateComplain(order.getBuyerId(), 0, 1,
				// 0);
				// }
				// }
	
				result = SUCCESS_ONE;
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (OtcException e) {
			e.printStackTrace();
			jsonStr.put("result", e.getCode());
			jsonStr.put("key", e.getMessageKey());
			jsonStr.put("message", OtcMessage.getByCode(e.getCode()));
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			jsonStr.put("result", e.getMessage());
			writeJson(jsonStr.toString(), request, response);
			return null;
		}
	}

	@RequestMapping(value = "/update_mobile.html")
	public String update_mobile(@RequestBody String param, HttpServletRequest request, HttpServletResponse response,
								ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			// 验证token
			if (!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}

            if (!this.execute(request, response, model).equals("1")) {
                jsonStr.put("result", -1);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            if(!this.validateAction(request, AdminActionConst.updateStatus)){
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }
            User user = JSON.parseObject(param, User.class);
            UserExample example = new UserExample();
            Criteria criteria = example.createCriteria();
            criteria.andCountryCodeEqualTo(user.getCountryCode());
            criteria.andMobileNumberEqualTo(user.getMobileNumber());
            List<User> userList = userService.findAll(example);
            if(userList!=null && userList.size()>0){
                if(!userList.get(0).getId().equals(user.getId())){//电话号码已使用
                    jsonStr.put("result", 0);
                    writeJson(jsonStr.toString(), request, response);
                    return null;
                }
            }
            user.setWithdrawStatus((byte)0);
            user.setWithdrawexpireTime(DateUtils.addHour(new Date(), 24d));
            User getUserInfo = userService.findById(user.getId());
            if(userService.updateUserStatus(user) > 0) {
                if(getUserInfo.getMobileNumber()!=null){
                    String mobile = StringUtil.formatMobileNO(getUserInfo.getMobileNumber());
                    String content = String.format( getLocalMsg("user.page.nobile.tip", request), this.getCompanyName(request))+mobile+
                    		getLocalMsg("user.page.nobile.tip1", request)+getLocalMsg("user.page.notixina", request)+getLocalMsg("user.page.nobile.tip2", request);
                    ValidateCodeUtil.sendSmsValidataCode(getUserInfo.getCountryCode(), getUserInfo.getMobileNumber(), content);
                }
                writeManagerLog(request, user.getId(), AdminOperationLogService.OPERATION_LOG_MODIY_MOBILE, getUserInfo.getCountryCode()+getUserInfo.getMobileNumber(),  user.getCountryCode()+user.getMobileNumber());
            }
            jsonStr.put("result", SUCCESS_ONE);
            writeJson(jsonStr.toString(), request, response);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	//取消异常订单
	@RequestMapping(value = "/cancle_all_expired_order.html")
	public String cancle_all_expired_order(Integer uid, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals("1")) {
				response.sendRedirect("login.html");
				return null;
			}
			//和更新用户状态放在一起，权限也一样
			if(!this.validateAction(request, AdminActionConst.updateStatus)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}

			exOrderService.cancleAllExpiredOrder(uid);
			JSONObject jsonStr = new JSONObject();
			jsonStr.put("result", SUCCESS_ONE);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			logger.error("cancle_all_expired_order exception = {}",e);
			return null;
		}
	}
	/**
	 * 生成新的文件名称
	 *
	 * @param ext
	 * @return
	 */
	private String createNewFileName(String ext) {
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String datetime = tempDate.format(new java.util.Date());
		Random random = new Random();
		String newName = datetime.toString() + random.nextInt(100) + "." + ext;
		return newName;
	}
	@RequestMapping(value = "/delete_google_auth.html", method = RequestMethod.POST)
	public String delete_google_auth(Integer id, HttpServletRequest request, HttpServletResponse response,
									 ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			logger.info("id = {}", id.toString());
			if (!this.execute(request, response, model).equals("1")) {
				jsonStr.put("result", -1);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.validateAction(request, AdminActionConst.deleteGoogleAuth)) {
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			User user = new User();
			user.setId(id);
			user.setGoogleAuthenticatorKey("");
			user.setGoogleAuthenticatorStatus(Byte.parseByte("0"));
			userService.updateByPrimaryKey(user);
			jsonStr.put("result", SUCCESS_ONE);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
