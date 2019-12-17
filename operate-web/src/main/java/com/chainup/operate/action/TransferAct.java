package com.chainup.operate.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chainup.common.enums.TransactionScene;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.Transaction;
import com.chainup.common.stats.entity.TransferVO;
import com.chainup.common.util.StringTool;
import com.chainup.common.util.StringUtil;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.web.wallet.SignUtil;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.TransferService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by mfXing.
 */
@Controller
@Scope("prototype")
public class TransferAct extends BaseAct{
    private static final Logger logger = LoggerFactory.getLogger(TransferAct.class);

    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/transfer.html")
    public String transfer(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        try {
            // 验证是否登录以及是否有权限操作转账工具
            if (!this.execute(request, response, model).equals("1")) {
                response.sendRedirect("login.html");
                return null;
            } else if (!this.validateAction(request, AdminActionConst.transfer)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }

            // 账户类型
            List<Map<String, String>> typeList =  transferService.getTypeList();
            // 账户类型国际化
            if (typeList != null && typeList.size() > 0) {
                Map<String, String> map = typeList.get(0);
                for (String key : map.keySet()) {
                    String localMsg = getLocalMsg("finance.transfer.account.type." + key, request);
                    if (!StringUtils.isBlank(localMsg)) {
                        map.put(key, localMsg);
                    }
                }
            }
            // 币种
            List<String> symbolList = transferService.getSymbolList();

            // 转账类型
            String scene = transferService.getScene();

            model.addAttribute("typeList",typeList);
            model.addAttribute("symbolList",symbolList);
            model.addAttribute("scene",scene);

            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            return FrontUtils.getTplPath(config.getSolutionPath(), "finance", "transfer");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/transfer_check.html",method = RequestMethod.GET)
    public String transferCheck(@Valid TransferVO transferVO, BindingResult result,
                                                       HttpServletRequest request, HttpServletResponse response, ModelMap model){
        JSONObject jsonStr = new JSONObject();
        // 校验参数是否为空
        if(result.hasErrors()){
            jsonStr.put("code", -1);
            jsonStr.put("message", "请求参数错误");
            logger.info("transferVO request params error, {}",result);
            writeJson(jsonStr.toString(), request, response);
            return null;
        }

        logger.info("transferCheck transferVO={}", transferVO);

        try {
            // 校验Token是否合法
            if(!this.validToken(request)) {
                jsonStr.put("code", FAIL_VALID_TOKEN);
                jsonStr.put("message", "校验不通过");
                logger.info("Token validation failed");
                writeJson(jsonStr.toString(), request, response);
                return null;
            }

            // 校验是否登录以及是否有权限操作该模块
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                jsonStr.put("code", -1);
                jsonStr.put("message", "请登录");
                logger.info("please login first");
                writeJson(jsonStr.toString(), request, response);
                return null;
            } else if (!this.validateAction(request, AdminActionConst.transfer)) {
                jsonStr.put("code", -1);
                jsonStr.put("message", "无权限操作");
                logger.info(getLocalMsg("noaction_error", request));
                writeJson(jsonStr.toString(), request, response);
                return null;
            }

            // 校验转出账户UID是否合法
            if(!transferService.uidCheck(transferVO.getUidOut())){
                jsonStr.put("code", -2);
                jsonStr.put("message", "转出账户UID不合法，请确认后提交");
                logger.info("transferVO request param uidOut error: {}", transferVO.getUidOut());
                writeJson(jsonStr.toString(), request, response);
                return null;
            }

            // 校验转入账户UID是否合法
            if(!transferService.uidCheck(transferVO.getUidIn())){
                jsonStr.put("code", -2);
                jsonStr.put("message", "转入账户UID不合法，请确认后提交");
                writeJson(jsonStr.toString(), request, response);
                logger.info("transferVO request param uidIn error: {}", transferVO.getUidIn());
                return null;
            }

            // 记录操作人
            transferVO.setOpUid(adminUser.getId());

            // 转账
            transferService.transfer(transferVO);

            jsonStr.put("code", 0);
            jsonStr.put("message", "转账成功");
            writeJson(jsonStr.toString(), request, response);
            logger.info("Transfer accounts success!");
        } catch (Exception e) {
            jsonStr.put("code", -10);
            jsonStr.put("message", e.getMessage());
            logger.info(e.getMessage());
            writeJson(jsonStr.toString(), request, response);
            return null;
        }
        return null;
    }

    @RequestMapping(value = "/record.html")
    public String transferRecord(Integer pageSize, String ctimeStart, String ctimeEnd, HttpServletRequest request, HttpServletResponse response, ModelMap model){
        try {
            // 验证是否登录以及是否有权限查看转账记录
            if (!this.execute(request, response, model).equals("1")) {
                response.sendRedirect("login.html");
                return null;
            } else if (!this.validateAction(request, AdminActionConst.transferRecord)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }

            // 设置转账类型
            String scene = TransactionScene.TRANSFER_COMMON.value;

            // 设置每页显示条数
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
            jpc.setPageSize(pageSize);

            // 设置用户请求
            jpc.setRequest(request);

            // 查询并设置转账记录数
            int recordCount = transferService.recordCount(ctimeStart,ctimeEnd,scene);
            jpc.setRecordTotal(recordCount);

            // 提交分页信息
            jpc.commit();

            int pageStart = jpc.getRecordStart();
            int pageCount = jpc.getRecordLength();

            // 转账记录列表
            List<Transaction> transactionList = transferService.transferRecord(ctimeStart,ctimeEnd,pageStart,pageCount,scene);

            // 记录分页反馈信息的对象
            JPage jpage = jpc.getJpage();

            // url字符串里的servlet名
            jpage.setUrlServlet(request.getContextPath() + "/record.html");

            // 设置用户请求属性
            request.setAttribute("jpage", jpage);

            model.addAttribute("ctimeStart", ctimeStart);
            model.addAttribute("ctimeEnd", ctimeEnd);
            model.addAttribute("request", request);
            model.addAttribute("transactionList",transactionList);

            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            return FrontUtils.getTplPath(config.getSolutionPath(), "finance", "record");
        } catch (Exception e) {
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
        }
    }
    /**
     * HKDT活动奖励
     * @param transferVO
     * @param result
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/transfer_check_hkdt.html",method = RequestMethod.POST)
    public @ResponseBody
    String transferCheck_HKDT(@RequestBody Map<String, String> paramsMap){
    	logger.info("transferCheck transferVO={}", paramsMap);
    	Map responseMap = new HashMap();
    	if(checkOtcSign(paramsMap)) {
    		String code;
    		String message;
    		TransferVO transferVO = new TransferVO();
			//出币用户及类型
			transferVO.setUidOut(Integer.parseInt(paramsMap.get("uidOut")));
			//hkdt余额账户
			transferVO.setTypeOut(Integer.parseInt(paramsMap.get("typeOut")));
			//收币用户
			transferVO.setUidIn(Integer.parseInt(paramsMap.get("uidIn")));
			//hkdt余额账户
			transferVO.setTypeIn(Integer.parseInt(paramsMap.get("typeIn")));
			transferVO.setSymbolOut(paramsMap.get("symbolOut"));
			transferVO.setSymbolIn(paramsMap.get("symbolIn"));
			//奖励hkdt数量
			transferVO.setMoney(new BigDecimal(paramsMap.get("money")));
			transferVO.setRemarks(paramsMap.get("remarks"));
    		try {
    			// 校验转出账户UID是否合法
    			if(!transferService.uidCheck(transferVO.getUidOut())){
    				code = "-2";
    				message ="转出账户UID不合法，请确认后提交";
    				logger.error("transferVO request param uidOut error: {}", transferVO.getUidOut());
    				throw new Exception(message);
    			}
    			
    			// 校验转入账户UID是否合法
    			if(!transferService.uidCheck(transferVO.getUidIn())){
    				code = "-2";
    				message = "转入账户UID不合法，请确认后提交";
    				logger.error("transferVO request param uidIn error: {}", transferVO.getUidIn());
    	    		throw new Exception(message);
    			}
    			// 记录操作人(活动赠送)
    			transferVO.setOpUid(0);
    			// 转账
    			transferService.transfer(transferVO);
    			code = "0";
    			message = "转账成功" ;
    			logger.info("Transfer accounts success!");
    		} catch (Exception e) {
    			code = "-10";
    			message = e.getMessage();
    			logger.error(e.getMessage());
    		}
    		responseMap.put("code", code);
    	}else {
    		responseMap.put("code", "-2");
    		responseMap.put("msg", "sign fail");
    	}
        
        return JSON.toJSONString(responseMap);
    }
    protected boolean checkOtcSign(Map<String, String> paramsMap) {

        logger.info("request params: {}", paramsMap);
        String paramSign = paramsMap.get("sign");
        paramsMap.remove("sign");
        String newSign = SignUtil.sign(paramsMap, "ylb_hkdt_otc_activity");
        logger.info("new sign: " + newSign);
        return paramSign.equals(newSign);

    }
}
