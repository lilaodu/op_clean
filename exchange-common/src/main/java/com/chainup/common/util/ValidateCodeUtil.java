package com.chainup.common.util;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.afs.model.v20180112.AuthenticateSigRequest;
import com.aliyuncs.afs.model.v20180112.AuthenticateSigResponse;
import com.aliyuncs.jaq.model.v20161123.AfsCheckRequest;
import com.aliyuncs.jaq.model.v20161123.AfsCheckResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.chainup.common.entity.AliyunValidateCode;

/**
 * 短信、邮箱验证码
 * 
 * @author zouyj
 *
 */
public class ValidateCodeUtil {
	private static final Logger logger = LoggerFactory.getLogger(ValidateCodeUtil.class);
	private static final Integer SUCCESS = 100;
	
	
	static final String smsUrl = "http://115.28.89.201:8888/v2sms.aspx";
	static final String smsAccout = "090325";
	static final String smsPwd = "321456";
	static final String companyId = "17";
	
	/**
	 * 创建指定数量的随机字符串
	 * 
	 * @param numberFlag
	 *            是否是数字:true-纯数字 false-非纯数字
	 * @param length
	 * 			  长度
	 * @return
	 */
	public static String createValidateCode(boolean numberFlag, int length) {
		String retStr = "";
		String strTable = numberFlag ? "1234567890" : "1234567890abcdefghijkmnpqrstuvwxyz";
		int len = strTable.length();
		boolean bDone = true;
		do {
			retStr = "";
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retStr += strTable.charAt(intR);
			}
			if (count >= 2) {
				bDone = false;
			}
		} while (bDone);

		return retStr;
	}
	
	/**
	 * 调用接口，发送短信验证码
	 * @param countryCode:国家区号
	 * @param mobile：手机号
	 * @param content:短信内容
	 * @return
	 */
	public static Boolean sendSmsValidataCodeOld(String countryCode,String mobile,String content){
		try{
			logger.info("countryCode={},mobile={},content={}",countryCode,mobile,content);
			/** 兼容 mobile="+86-13800000000" 格式的手机号处理 */
			boolean mobileStatus = mobile.contains("-");
			if(mobileStatus){
				String[] strs = mobile.split("-");
				countryCode = strs[0];
				mobile = strs[1];
			}

			/** 原有逻辑 */
			countryCode = countryCode.trim().replace("+", "");
			//String code = ValidateCodeUtil.createValidateCode(true, 6);
			HttpClient client = new HttpClient();
			client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");// 指定传送字符集为UTF-8格式
			client.getHttpConnectionManager().getParams().setConnectionTimeout(30000);// 设置连接超时时间为30秒（连接初始化时间）
			String url = PropertyUtil.getProperties("sms_url");
			String sms_proxy = PropertyUtil.getProperties("sms_proxy");
			PostMethod method = new PostMethod(url);// 带参数的那个请求的访问串
			NameValuePair[] data = { new NameValuePair("proxy", sms_proxy), new NameValuePair("type", "10"),
					new NameValuePair("number", "00"+countryCode+mobile), // 手机号码
					new NameValuePair("msg", content) };// 设置短信内容
			method.setRequestBody(data);
			client.executeMethod(method);
			Header[] headers = method.getResponseHeaders();
			int statusCode = method.getStatusCode();
			System.out.println("statusCode:" + statusCode);
			for (Header h : headers) {
				System.out.println(h.toString());
			}
			String status = new String(method.getResponseBodyAsString().getBytes("utf-8"));
			System.out.println(status);
			method.releaseConnection();
			client.getHttpConnectionManager().closeIdleConnections(1);
			if (statusCode != HttpStatus.SC_OK) {
				// 失败
				return false;
			} else {
				// 成功
				return true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	
	/**
	 * 调用接口，发送短信验证码
	 * @param countryCode:国家区号
	 * @param mobile：手机号
	 * @param content:短信内容
	 * @return
	 */
	public static Boolean sendMoreTypeSmsValidataCodeOld(String countryCode,String mobile,String content,String smsProxy){
		try{
			logger.info("countryCode={},mobile={},content={}",countryCode,mobile,content);
			/** 兼容 mobile="+86-13800000000" 格式的手机号处理 */
			boolean mobileStatus = mobile.contains("-");
			if(mobileStatus){
				String[] strs = mobile.split("-");
				countryCode = strs[0];
				mobile = strs[1];
			}

			/** 原有逻辑 */
			countryCode = countryCode.trim().replace("+", "");
			//String code = ValidateCodeUtil.createValidateCode(true, 6);
			HttpClient client = new HttpClient();
			client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");// 指定传送字符集为UTF-8格式
			client.getHttpConnectionManager().getParams().setConnectionTimeout(30000);// 设置连接超时时间为30秒（连接初始化时间）
			String url = PropertyUtil.getProperties("sms_url");
			//System.out.println("sms_proxy::"+smsProxy);
			PostMethod method = new PostMethod(url);// 带参数的那个请求的访问串
			NameValuePair[] data = { new NameValuePair("proxy", smsProxy), new NameValuePair("type", "10"),
					new NameValuePair("number", "00"+countryCode+mobile), // 手机号码
					new NameValuePair("msg", content) };// 设置短信内容
			method.setRequestBody(data);
			client.executeMethod(method);
			Header[] headers = method.getResponseHeaders();
			int statusCode = method.getStatusCode();
			//System.out.println("statusCode:" + statusCode);
			/*for (Header h : headers) {
				System.out.println(h.toString());
			}*/
			String status = new String(method.getResponseBodyAsString().getBytes("utf-8"));
			//System.out.println(status);
			method.releaseConnection();
			client.getHttpConnectionManager().closeIdleConnections(1);
			if (statusCode != HttpStatus.SC_OK) {
				// 失败
				return false;
			} else {
				// 成功
				return true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}
	
	
	//post方式请求
	public static boolean sendSmsValidataCode(String countryCode,String mobile,String content) {
		Map<String, String> map = new HashMap<String, String>();
		// 创建默认的httpClient实例.
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httppost
		HttpPost httppost = new HttpPost(smsUrl);
		RequestConfig requestConfig = RequestConfig.custom()  
		        .setConnectTimeout(30000).build();  
		httppost.setConfig(requestConfig);
		// 创建参数队列
		Date nowTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String timeStr = sdf.format(nowTime);
		String sign = MD5Util.getMD5(smsAccout + smsPwd + timeStr);
		List<org.apache.http.NameValuePair> formparams = new ArrayList<org.apache.http.NameValuePair>();
		formparams.add(new BasicNameValuePair("action", "send"));
		formparams.add(new BasicNameValuePair("userid", companyId));
		formparams.add(new BasicNameValuePair("timestamp", timeStr));
		formparams.add(new BasicNameValuePair("sign", sign));
		formparams.add(new BasicNameValuePair("mobile", mobile));
		formparams.add(new BasicNameValuePair("extno", ""));
		formparams.add(new BasicNameValuePair("sendTime", ""));
		formparams.add(new BasicNameValuePair("content", content));
		UrlEncodedFormEntity uefEntity;
		try {
			uefEntity = new UrlEncodedFormEntity(formparams, "utf-8");
			httppost.setEntity(uefEntity);
			System.out.println("executing request " + httppost.getURI());
			CloseableHttpResponse response = httpclient.execute(httppost);
			try {
				HttpEntity entity = response.getEntity();
				int statusCode = response.getStatusLine().getStatusCode();
		        if(statusCode != HttpStatus.SC_OK){
		        	return false;
		        }else{
		        	if (entity != null) {
		        		String str = EntityUtils.toString(entity, "UTF-8");
		        		System.out.println("Response content: " + str);
		        		org.dom4j.Document document = DocumentHelper.parseText(str);
		        		org.dom4j.Element rootElement = document.getRootElement();
		        		String code = rootElement.element("returnstatus").getText();
		        		String result = rootElement.element("message").getText();
		        		System.out.println("code content: " + code);
		        		System.out.println("result content: " + result);
		        		if (code.equals("Success")) {
		        			return true;
		        		} else {
		        			return false;
		        		}
		        	}else {
		        		return false;
		        	}
		        }
			} catch (DocumentException e) {
				e.printStackTrace();
			} finally {
				response.close();
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return false;
	}
	
	
	//post方式请求
		public static boolean sendMoreTypeSmsValidataCode(String countryCode,String mobile,String content,String smsProxy) {
			Map<String, String> map = new HashMap<String, String>();
			// 创建默认的httpClient实例.
			CloseableHttpClient httpclient = HttpClients.createDefault();
			// 创建httppost
			HttpPost httppost = new HttpPost(smsUrl);
			RequestConfig requestConfig = RequestConfig.custom()  
			        .setConnectTimeout(30000).build();  
			httppost.setConfig(requestConfig);
			// 创建参数队列
			Date nowTime = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String timeStr = sdf.format(nowTime);
			String sign = MD5Util.getMD5(smsAccout + smsPwd + timeStr);
			List<org.apache.http.NameValuePair> formparams = new ArrayList<org.apache.http.NameValuePair>();
			formparams.add(new BasicNameValuePair("action", "send"));
			formparams.add(new BasicNameValuePair("userid", companyId));
			formparams.add(new BasicNameValuePair("timestamp", timeStr));
			formparams.add(new BasicNameValuePair("sign", sign));
			formparams.add(new BasicNameValuePair("mobile", mobile));
			formparams.add(new BasicNameValuePair("extno", ""));
			formparams.add(new BasicNameValuePair("sendTime", ""));
			formparams.add(new BasicNameValuePair("content", content));
			UrlEncodedFormEntity uefEntity;
			try {
				uefEntity = new UrlEncodedFormEntity(formparams, "utf-8");
				httppost.setEntity(uefEntity);
				System.out.println("executing request " + httppost.getURI());
				CloseableHttpResponse response = httpclient.execute(httppost);
				try {
					HttpEntity entity = response.getEntity();
					int statusCode = response.getStatusLine().getStatusCode();
			        if(statusCode != HttpStatus.SC_OK){
			        	return false;
			        }else{
			        	if (entity != null) {
			        		String str = EntityUtils.toString(entity, "UTF-8");
			        		System.out.println("Response content: " + str);
			        		org.dom4j.Document document = DocumentHelper.parseText(str);
			        		org.dom4j.Element rootElement = document.getRootElement();
			        		String code = rootElement.element("returnstatus").getText();
			        		String result = rootElement.element("message").getText();
			        		System.out.println("code content: " + code);
			        		System.out.println("result content: " + result);
			        		if (code.equals("Success")) {
			        			return true;
			        		} else {
			        			return false;
			        		}
			        	}else {
			        		return false;
			        	}
			        }
				} catch (DocumentException e) {
					e.printStackTrace();
				} finally {
					response.close();
				}

			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// 关闭连接,释放资源
				try {
					httpclient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return false;
		}
		
	
	
	
	/**
	 * 调用接口，发送邮箱验证码
	 * @param email:邮箱地址
	 * @param subject：邮件标题
	 * @param content：邮件内容
	 * @return
	 */
	public static Boolean sendEmailValidataCode(String email,String subject,String content){
		try{
			//String code = ValidateCodeUtil.createValidateCode(false, 8);
			HttpClient client = new HttpClient();
			client.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");// 指定传送字符集为UTF-8格式
			client.getHttpConnectionManager().getParams().setConnectionTimeout(30000);// 设置连接超时时间为30秒（连接初始化时间）
			String url = PropertyUtil.getProperties("email_send_url");
			String from = PropertyUtil.getProperties("email_send_from");
			PostMethod method = new PostMethod(url);// 带参数的那个请求的访问串
			//String content = content1+" "+code+" "+content2;
			NameValuePair[] data = { new NameValuePair("from", from), new NameValuePair("to", email),
					new NameValuePair("subject", subject), // 邮件标题
					new NameValuePair("content", content) };// 设置邮件内容
			method.setRequestBody(data);
			client.executeMethod(method);
			Header[] headers = method.getResponseHeaders();
			int statusCode = method.getStatusCode();
			System.out.println("statusCode:" + statusCode);
			for (Header h : headers) {
				System.out.println(h.toString());
			}
			String status = new String(method.getResponseBodyAsString().getBytes("utf-8"));
			System.out.println(status);
			method.releaseConnection();
			if (statusCode == HttpStatus.SC_OK) {
				return true;
			}else{
				return false;
			}
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 阿里云滑动验证
	 * @return
	 */
	public static boolean checkAliyunValidate(AliyunValidateCode aliyunValidateCode){
		try {
			AfsCheckRequest request = new AfsCheckRequest();
	        request.setPlatform(3);//必填参数，请求来源： 1：Android端； 2：iOS端； 3：PC端及其他
	        request.setSession(aliyunValidateCode.getCsessionid());// 必填参数，从前端获取，不可更改
	        request.setSig(aliyunValidateCode.getSig());// 必填参数，从前端获取，不可更改
	        request.setToken(aliyunValidateCode.getToken());// 必填参数，从前端获取，不可更改
	        request.setScene(aliyunValidateCode.getScene());// 必填参数，从前端获取，不可更改 
	        String accessKeyId = PropertyUtil.getProperties("aliyun_access_key_id");
	        String accessKeySecret = PropertyUtil.getProperties("aliyun_access_key_secret");
	        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
	        IAcsClient client = new DefaultAcsClient(profile);
	        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Jaq", "jaq.aliyuncs.com");

	        logger.info("checkAliyunValidate, accessKeyId={}, accessKeySecret={}, aliyunValidateCode={}",accessKeyId, accessKeySecret, aliyunValidateCode);
            AfsCheckResponse response = client.getAcsResponse(request);
            if(response.getErrorCode() == 0 && response.getData() == true) {
                System.out.println("验签通过");
                return true;
            } else {
            	logger.info("checkAliyunValidate, code={}, msg={}, data={}", response.getErrorCode(), response.getErrorMsg(), response.getData());
                System.out.println("验签失败");
                return false;
            }
            // TODO
        } catch (Exception e) {
            e.printStackTrace(); 
            return false;
        }        
	}

    /**
     * 阿里sdk升级,滑动验证v2
     * @param aliyunValidateCode
     * @return
     */
	public static boolean checkAliyunValidateV2(AliyunValidateCode aliyunValidateCode){
		try {
			String accessKeyId = PropertyUtil.getProperties("aliyun_access_key_id");
			String accessKeySecret = PropertyUtil.getProperties("aliyun_access_key_secret");
			String appKey = PropertyUtil.getProperties("aliyun_nc_appkey");
			IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
			IAcsClient client = new DefaultAcsClient(profile);

			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "afs", "afs.aliyuncs.com");
			AuthenticateSigRequest request = new AuthenticateSigRequest();
			// 必填参数，从前端获取，不可更改，android和ios只变更这个参数即可，下面参数不变保留xxx
			request.setSessionId(aliyunValidateCode.getCsessionid());
			// 必填参数，从前端获取，不可更改
			request.setSig(aliyunValidateCode.getSig());
			request.setToken(aliyunValidateCode.getToken());
			request.setScene(aliyunValidateCode.getScene());
			// 必填参数，后端填写
			request.setAppKey(appKey);
			request.setRemoteIp(StringUtils.isBlank(aliyunValidateCode.getRemoteId())? "0:0:0:0" : aliyunValidateCode.getRemoteId());

			logger.info("checkAliyunValidate, accessKeyId={}, accessKeySecret={}, appKey={}, aliyunValidateCode={}"
                    ,accessKeyId, accessKeySecret, appKey, aliyunValidateCode);
			AuthenticateSigResponse response = client.getAcsResponse(request);
			if(response.getCode().equals(SUCCESS) ) {
			    logger.info("checkAliyunValidateV2 success");
				return true;
			} else {
			    logger.info("checkAliyunValidateV2 failure, code={}, msg={}, detail={}, requestId={}",
                        response.getCode(), response.getMsg(), response.getDetail(), response.getRequestId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
