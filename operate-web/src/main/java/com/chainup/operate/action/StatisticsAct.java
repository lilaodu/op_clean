package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.HistoryLogin;
import com.chainup.common.exchange.entity.HistoryLoginExample;
import com.chainup.common.exchange.entity.TransactionDeposit;
import com.chainup.common.exchange.entity.TransactionDepositCrypto;
import com.chainup.common.exchange.entity.TransactionWithdraw;
import com.chainup.common.exchange.entity.TransactionWithdrawCrypto;
import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserExample;
import com.chainup.common.exchange.entity.UserExample.Criteria;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.HistoryLoginService;
import com.chainup.operate.service.TransactionDepositCryptoService;
import com.chainup.operate.service.TransactionDepositService;
import com.chainup.operate.service.TransactionWithdrawCryptoService;
import com.chainup.operate.service.TransactionWithdrawService;
import com.chainup.operate.service.UserService;
import com.chainup.common.util.StringTool;
import com.chainup.common.stats.entity.StatsUserDay;
import com.chainup.common.stats.entity.StatsUserDayExample;
import com.chainup.operate.service.StatsUserDayService;
//统计信息
@Controller
@Scope("prototype")
public class StatisticsAct extends BaseAct  {
	@Autowired
	private UserService userService;
	@Autowired
    private TransactionDepositCryptoService transactionDepositCryptoService;
	@Autowired
    private TransactionDepositService transactionDepositService;
	@Autowired
    private HistoryLoginService historyLoginService;
	@Autowired
    private TransactionWithdrawCryptoService transactionWithdrawCryptoService;
	@Autowired
    private TransactionWithdrawService transactionWithdrawService;
	@Autowired
    private StatsUserDayService statsUserDayService;

    //注册统计
    @RequestMapping(value = "/register_statistics.html")
    public String admin_action(Integer pageSize,String ctimeEnd,String ctimeStart, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        try {
            if (!this.execute(request, response, model).equals("1")) {
                response.sendRedirect("login.html");
                return null;
            }
            if(!this.validateAction(request, AdminActionConst.registerStatistics)){
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

			/*计算总汇总strart*/
            StatsUserDayExample examples = new StatsUserDayExample();
            StatsUserDayExample.Criteria criterias = examples.createCriteria();
            List<Map<String,Object>> sumCounts = statsUserDayService.selectSumCountByRegist(examples);
            /*计算总汇总end*/

			/*获取该币对时间段内汇总start*/
            List<Map<String, Object>> limitCounts = new ArrayList<>();
            if ((ctimeStart!=null && !"".equals(ctimeStart)) || (ctimeEnd != null && !"".equals(ctimeEnd))) {
                StatsUserDayExample limitExample = new StatsUserDayExample();
                StatsUserDayExample.Criteria limitCriteria = limitExample.createCriteria();
                if (ctimeStart != null && !"".equals(ctimeStart)) {
                    Date ds = format.parse(ctimeStart);
                    limitCriteria.andCreatedDateGreaterThanOrEqualTo(ds);
                }

                if (ctimeEnd != null && !"".equals(ctimeEnd)) {
                    Date dt = format.parse(ctimeEnd);
                    limitCriteria.andCreatedDateLessThanOrEqualTo(dt);
                }
                limitCounts = statsUserDayService.selectSumCountByRegist(limitExample);
            }
            /*获取该币对时间段内汇总end*/

            /*获取列表数据*/
            if (pageSize == null)
                pageSize = CURRENT_PAGE_SIZE;
            JPageConfig jpc = null;
            try {
                jpc = new JPageConfig();
            } catch (JPageException e) {
                e.printStackTrace();
                return "view";
            }
            StatsUserDayExample ListExample = new StatsUserDayExample();
            StatsUserDayExample.Criteria ListCriteria = ListExample.createCriteria();
            if (ctimeStart != null && !"".equals(ctimeStart)) {
                Date ds = format.parse(ctimeStart);
                ListCriteria.andCreatedDateGreaterThanOrEqualTo(ds);
            }

            if (ctimeEnd != null && !"".equals(ctimeEnd)) {
                Date dt = format.parse(ctimeEnd);
                ListCriteria.andCreatedDateLessThanOrEqualTo(dt);
            }
            jpc.setPageSize(pageSize);
            jpc.setRequest(request);
            int count = statsUserDayService.count(ListExample);
            jpc.setRecordTotal(count);
            jpc.commit();
            int start = jpc.getRecordStart();
            int length = jpc.getRecordLength();
            ListExample.setLimitStart(start);
            ListExample.setLimitEnd(length);
            ListExample.setOrderByClause("created_date desc"); // 默认按创建时间倒序
            List<StatsUserDay> userList = statsUserDayService.findAll(ListExample);

            JPage jpage = jpc.getJpage();
            jpage.setUrlServlet(request.getContextPath() + "/register_statistics.html");
            request.setAttribute("jpage", jpage);
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            model.addAttribute("sumCounts",sumCounts);
            model.addAttribute("limitCounts",limitCounts);
            model.addAttribute("userList", userList);
            model.addAttribute("count", count);
            model.addAttribute("ctimeEnd", ctimeEnd);
            model.addAttribute("ctimeStart", ctimeStart);
            model.addAttribute("request", request);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "register_statistics");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //登录统计
    @RequestMapping(value = "/login_statistics.html")
    public String login_statistics(Integer pageSize, String ctimeEnd,String ctimeStart,HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        try {
            if (!this.execute(request, response, model).equals("1")) {
                response.sendRedirect("login.html");
                return null;
            }
            if(!this.validateAction(request, AdminActionConst.registerStatistics)){
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

			/*计算总汇总strart*/
            StatsUserDayExample examples = new StatsUserDayExample();
            StatsUserDayExample.Criteria criterias = examples.createCriteria();
            List<Map<String,Object>> sumCounts = statsUserDayService.selectSumCountByLogin(examples);
            /*计算总汇总end*/

			/*获取该币对时间段内汇总start*/
            List<Map<String, Object>> limitCounts = new ArrayList<>();
            if ((ctimeStart!=null && !"".equals(ctimeStart)) || (ctimeEnd != null && !"".equals(ctimeEnd))) {
                StatsUserDayExample limitExample = new StatsUserDayExample();
                StatsUserDayExample.Criteria limitCriteria = limitExample.createCriteria();
                if (ctimeStart != null && !"".equals(ctimeStart)) {
                    Date ds = format.parse(ctimeStart);
                    limitCriteria.andCreatedDateGreaterThanOrEqualTo(ds);
                }

                if (ctimeEnd != null && !"".equals(ctimeEnd)) {
                    Date dt = format.parse(ctimeEnd);
                    limitCriteria.andCreatedDateLessThanOrEqualTo(dt);
                }
                limitCounts = statsUserDayService.selectSumCountByLogin(limitExample);
            }
            /*获取该币对时间段内汇总end*/

            /*获取列表数据*/
            if (pageSize == null)
                pageSize = CURRENT_PAGE_SIZE;
            JPageConfig jpc = null;
            try {
                jpc = new JPageConfig();
            } catch (JPageException e) {
                e.printStackTrace();
                return "view";
            }
            StatsUserDayExample ListExample = new StatsUserDayExample();
            StatsUserDayExample.Criteria ListCriteria = ListExample.createCriteria();
            if (ctimeStart != null && !"".equals(ctimeStart)) {
                Date ds = format.parse(ctimeStart);
                ListCriteria.andCreatedDateGreaterThanOrEqualTo(ds);
            }

            if (ctimeEnd != null && !"".equals(ctimeEnd)) {
                Date dt = format.parse(ctimeEnd);
                ListCriteria.andCreatedDateLessThanOrEqualTo(dt);
            }
            jpc.setPageSize(pageSize);
            jpc.setRequest(request);
            int count = statsUserDayService.count(ListExample);
            jpc.setRecordTotal(count);
            jpc.commit();
            int start = jpc.getRecordStart();
            int length = jpc.getRecordLength();
            ListExample.setLimitStart(start);
            ListExample.setLimitEnd(length);
            ListExample.setOrderByClause("created_date desc"); // 默认按创建时间倒序
            List<StatsUserDay> loginList = statsUserDayService.findAll(ListExample);

            JPage jpage = jpc.getJpage();
            jpage.setUrlServlet(request.getContextPath() + "/login_statistics.html");
            request.setAttribute("jpage", jpage);
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            model.addAttribute("sumCounts",sumCounts);
            model.addAttribute("limitCounts",limitCounts);
            model.addAttribute("loginList", loginList);
            model.addAttribute("count", count);
            model.addAttribute("ctimeEnd", ctimeEnd);
            model.addAttribute("ctimeStart", ctimeStart);
            model.addAttribute("request", request);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "login_statistics");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
}
