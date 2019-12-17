package com.chainup.common.util;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.entity.AliyunValidateCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @Description: .极验行为验证工具类
 * @Date: 11:33 2019/3/27 created by dong.y
 */
public class GeetestStartCaptchaServlet extends HttpServlet {

   public static org.slf4j.Logger logger = LoggerFactory.getLogger(GeetestStartCaptchaServlet.class);

    /**
     *初始化（APl1），获取流水标识并设置状态码
     * @param userid
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public static String GeetestStartCaptchaServletApi1(String userid,HttpServletRequest request, HttpServletResponse response) throws ServletException {

        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(),
                GeetestConfig.isnewfailback());
        String resStr = "{}";

        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("user_id", userid); //网站用户id
        param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
        param.put("ip_address", request.getRemoteAddr()); //传输用户请求验证时所携带的IP

        //进行验证预处理
        int gtServerStatus = gtSdk.preProcess(param);
        //将服务器状态设置到session中
        request.getSession().setAttribute(gtSdk.gtServerStatusSessionKey, gtServerStatus);
        //将userid设置到session中
        request.getSession().setAttribute("userid", userid);

        resStr = gtSdk.getResponseStr();
        logger.info("geetest_api1:{}", JSONObject.parseObject(resStr));
        return resStr;
    }

    /**
     * 二次校验
     * @param request
     * @param response
     * @return
     */
    public static Boolean GeetestStartCaptchaServletApi2(AliyunValidateCode aliyunValidateCode, HttpServletRequest request, HttpServletResponse response){

        GeetestLib gtSdk = new GeetestLib(GeetestConfig.getGeetest_id(), GeetestConfig.getGeetest_key(),
                GeetestConfig.isnewfailback());

        String challenge = aliyunValidateCode.getGeetest_challenge();
        String validate = aliyunValidateCode.getGeetest_validate();
        String seccode = aliyunValidateCode.getGeetest_seccode();

        //从session中获取gt-server状态
        int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);
        //从session中获取userid
        String userid = (String)request.getSession().getAttribute("userid");

        //自定义参数,可选择添加
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("user_id", userid); //网站用户id
        param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式  unknown（未知）
        param.put("ip_address", request.getRemoteAddr()); //传输用户请求验证时所携带的IP

        int gtResult = 0;
//        if (gt_server_status_code == 1) {
            //gt-server正常，向gt-server进行二次验证
            gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
//            System.out.println(gtResult);
//        } else {
//            // gt-server非正常情况下，进行failback模式验证
//            System.out.println("failback:use your own server captcha validate");
//            gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
//            System.out.println(gtResult);
//        }
        logger.info("geetest_api2:{}",gtResult);
        if (gtResult == 1) {
            // 验证成功
           return true;
        }
        else {
            // 验证失败
            return false;
        }
    }


}
