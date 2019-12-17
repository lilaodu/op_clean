package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainup.common.util.GeetestStartCaptchaServlet;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.entity.AliyunValidateCode;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.ValidateCodeUtil;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 手机短信验证码功能和邮箱验证码功能
 * @author Administrator
 *
 */
@Controller
@Scope("prototype")
public class ValidCodeAct extends BaseAct {
	protected AdminUser adminUser;  // 登录用户  ;
	

	/**
	 * 短信验证码接口
	 * @param mobile：手机号
	 * @param countryCode：国家区号
	 * @param aliyunValidateCode：阿里验证回调参数
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/smsValidCode.html")
	public String getSmsValidCode(String mobile,String countryCode,AliyunValidateCode aliyunValidateCode ,HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			//验证token
			/*if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}*/
			this.execute(request, response, model);
			 if(mobile!=null){
				//校验码验证
//				if(!this.checkAuthCode(aliyunValidateCode)){
//					jsonStr.put("result", EXCEPTION_FOUR);
//					writeJson(jsonStr.toString(), request, response);
//					return null;
//				}
                 /**极验滑动验证校验*/
                 if(!GeetestStartCaptchaServlet.GeetestStartCaptchaServletApi2(aliyunValidateCode, request, response)){
                     jsonStr.put("result", EXCEPTION_FOUR);
                     writeJson(jsonStr.toString(), request, response);
                     return null;
                 }
			}else{
				mobile = adminUser.getMobileNumber();
			}
//			if(countryCode == null){
//				countryCode = adminUser.getCountryCode();
//			}
//
//			if(operationType == 5) {//找回密码，判断帐户是否存在
//				if(!adminUser.findUserExisted(countryCode, mobile)) {//帐户不存在
//					jsonStr.put("result", EXCEPTION_FIVE);
//					writeJson(jsonStr.toString(), request, response);
//					return null;
//				}
//			}

			boolean sendFlag = true;
			HttpSession session = request.getSession();
			if(session.getAttribute(SEND_SMS_MOBILE_TIME)!=null ){
				String historyMobileTime = session.getAttribute(SEND_SMS_MOBILE_TIME).toString();
				String[] arr = historyMobileTime.split(",");
				if(arr.length>1){
					if(arr[0].equals(mobile)){
						long sendSmsTime = Long.parseLong(arr[1]);
						long nowTime = new Date().getTime();
						long sendSmsInterval = Long.parseLong(PropertyUtil.getProperties("send_sms_interval"));
						if(nowTime-sendSmsTime<sendSmsInterval){
							sendFlag = false;
						}
					}
				}
			}
			Integer result = 0;
			if(sendFlag){
				String minute = "5";
				String left = this.getLocalMsg("sms.module.left.parenthesis", request);
				String right = this.getLocalMsg("sms.module.right.parenthesis", request);
				String companyName = this.getCompanyName(request);
				String operateType = getOperationTypeString(request);
				String valiCode =  this.getLocalMsg("sms.module.valid.code", request);
				String code = ValidateCodeUtil.createValidateCode(true, 6);
				String comma = this.getLocalMsg("sms.module.comma", request);
				String longContent1=this.getLocalMsg("sms.module.long.content1", request);
				String longContent2=this.getLocalMsg("sms.module.long.content2", request);
				String content = left+companyName+right+valiCode+code+comma+longContent1+operateType+comma+minute+longContent2;
				if(ValidateCodeUtil.sendSmsValidataCode(countryCode,mobile, content)){
					// 成功
					// 将验证码写入session
					session.setAttribute(SMS_VALID_CODE,code);
					session.setAttribute(SMS_VALID_CODE+mobile,code);
					session.setAttribute(SEND_SMS_MOBILE_TIME, mobile+","+new Date().getTime());
					result = SUCCESS_ONE;
				}else{
					// 失败
					result = EXCEPTION_TWO;
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

	private String getOperationTypeString(HttpServletRequest request){
		String str = this.getLocalMsg("sms.operation.login", request);
		if(StringUtils.isNotBlank(str)){
			return str;
		}else {
			return "";
		}
	}

	private String getEmailOperationTypeString(HttpServletRequest request){
		String str   = this.getLocalMsg("email.operation.login", request);
		if(StringUtils.isNotBlank(str)){
			return str;
		}else {
			return "";
		}
	}

	/**
	 * 邮箱验证码接口
	 * @param email：收件地址
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/emailValidCode.html")
	public String getEmailValidCode(String email,HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			//验证token
			/*if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}*/
			this.execute(request, response, model);
			Integer result = 0;
			if(email==null){
				email = adminUser.getEmail();
			}	
			
//			if(operationType==3) {//找回密码，判断帐户是否存在
//				if(!userService.findUserExisted("", email)) {//帐户不存在 
//					jsonStr.put("result", EXCEPTION_FIVE);
//					writeJson(jsonStr.toString(), request, response);
//					return null;
//				}
//			}
			
			boolean sendFlag = true;
			HttpSession session = request.getSession();
			if(session.getAttribute(SEND_EMAIL_TIME)!=null ){
				String historyEmailTime = session.getAttribute(SEND_EMAIL_TIME).toString();
				String[] arr = historyEmailTime.split(",");
				if(arr.length>1){
					if(arr[0].equals(email)){
						long sendEmailTime = Long.parseLong(arr[1]);
						long nowTime = new Date().getTime();
						long sendEmailInterval = Long.parseLong(PropertyUtil.getProperties("send_email_interval"));
						if(nowTime-sendEmailTime<sendEmailInterval){
							sendFlag = false;
						}
					}
				}
			}
			if(sendFlag){
				String companyName = this.getCompanyName(request);
				String operationTypeStr = getEmailOperationTypeString(request);
				String subject = companyName+operationTypeStr+getLocalMsg("email.module.subject.alert", request);
				String companyAbbreviations = this.getLocalMsg("email.company.abbreviations", request);
				String code = ValidateCodeUtil.createValidateCode(false, 8);
				String dear = this.getLocalMsg("email.module.content.dear", request);
				String user = this.getLocalMsg("email.module.content.user", request);
				String you = this.getLocalMsg("email.module.content.you", request);
				Date currentTime = new Date();
				String dateForm = PropertyUtil.getProperties("system_date_format");
				SimpleDateFormat formatter = new SimpleDateFormat(dateForm);
				String dateString = formatter.format(currentTime);
				String comma = this.getLocalMsg("sms.module.comma", request);
				String submit = this.getLocalMsg("email.module.content.submit", request);
				String req=this.getLocalMsg("email.module.content.request", request);
				String valicodetitle = this.getLocalMsg("email.module.content.vali.code", request);
				String longContent1= this.getLocalMsg("email.module.content.long1", request);
				String longContent2= this.getLocalMsg("email.module.content.long2", request);
				String service= this.getLocalMsg("email.module.content.service", request);
				String telTitle= this.getLocalMsg("email.module.content.tel", request);
				String emailTitle= this.getLocalMsg("email.module.content.email", request);
				String tel = "010-55558888";
				String serviceEmail="service@163.com";
				String content = dear+companyAbbreviations+user+"<br/>"+you+dateString+comma+submit+operationTypeStr+req+comma+valicodetitle+"<br/><p style=\"width:400px;text-align:center;color:red;\">"
						+code+"</p><br/>"+longContent1+"<br/>"+longContent2+companyName+service+"<br/>"+telTitle+tel+"<br/>"+emailTitle+serviceEmail;
				if(ValidateCodeUtil.sendEmailValidataCode(email, subject, content)){
					session.setAttribute(EMAIL_VALID_CODE, code);
					session.setAttribute(EMAIL_VALID_CODE+email,code);
					session.setAttribute(SEND_EMAIL_TIME, email+","+new Date().getTime());
					result = SUCCESS_ONE;
				}else{
					// 失败
					result = EXCEPTION_TWO;
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
     * 极验滑动验证初始化
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/startCaptchaGeetest.html")
	public String geeTestValidation(HttpServletRequest request, HttpServletResponse response,ModelMap model){
        try {
            JSONObject jsonObject = new JSONObject();
            String result = GeetestStartCaptchaServlet.GeetestStartCaptchaServletApi1("", request, response);
            jsonObject.put("result",JSONObject.parseObject(result));
            writeJson(jsonObject.toString(), request, response);
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
