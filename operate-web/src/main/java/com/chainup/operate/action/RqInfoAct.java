package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainup.common.result.CommonResult;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.Constants;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.exchange.entity.RqImage;
import com.chainup.common.exchange.entity.RqImageExample;
import com.chainup.common.exchange.entity.RqInfo;
import com.chainup.common.exchange.entity.RqInfoExample;
import com.chainup.common.exchange.entity.RqInfoExample.Criteria;
import com.chainup.common.exchange.entity.RqReply;
import com.chainup.common.exchange.entity.RqReplyExample;
import com.chainup.common.exchange.entity.User;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.AdminUserService;
import com.chainup.operate.service.RqImageService;
import com.chainup.operate.service.RqInfoService;
import com.chainup.operate.service.RqReplyService;
import com.chainup.operate.service.UserService;
import com.chainup.operate.util.OperatePropertyUtil;
import com.chainup.common.util.PropertyUtil;
import com.chainup.common.util.StringTool;

@Controller
@Scope("prototype")
public class RqInfoAct extends BaseAct {
    private static final Logger logger = LoggerFactory.getLogger(RqInfoAct.class);
    @Autowired
    private RqInfoService rqInfoService;
    @Autowired
    private UserService userService;
    @Autowired
    private RqReplyService rqReplyService;
    @Autowired
    private RqImageService rqImageService;
    @Autowired
    private AdminUserService adminUserService;

    private static final String UNKNOWN_METHOD_NAME = "unknownMethodName";

    /**
     * 问题工单列表
     *
     * @param rqTitle
     * @param rqType
     * @param rqStatus
     * @param pageSize
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/rq_info.html")
    public String rqInfoList(String id, String userId, String rqTitle, String ctimeEnd, String ctimeStart, String rqType, String rqStatus, Integer pageSize, HttpServletRequest request, HttpServletResponse response,
                             ModelMap model) {
        try {
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                response.sendRedirect("login.html");
                return null;
            } else if (!this.validateAction(request, AdminActionConst.rqInfoManager)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }

            rqTitle = (String) StringTool.parsentObjectNull(rqTitle);
            id = (String) StringTool.parsentObjectNull(id);
            userId = (String) StringTool.parsentObjectNull(userId);
            ctimeEnd = (String) StringTool.parsentObjectNull(ctimeEnd);
            ctimeStart = (String) StringTool.parsentObjectNull(ctimeStart);
            rqType = (String) StringTool.parsentObjectNull(rqType);
            rqStatus = (String) StringTool.parsentObjectNull(rqStatus);
            pageSize = (Integer) StringTool.parsentObjectNull(pageSize);
            if (pageSize == null) {
                pageSize = CURRENT_PAGE_SIZE;
            }
            JPageConfig jpc;
            try {
                jpc = new JPageConfig();
            } catch (JPageException e) {
                e.printStackTrace();
                return "view";
            }
            RqInfoExample example = new RqInfoExample();
            Criteria criteria = example.createCriteria();
            if (rqTitle != null) {
                criteria.andRqTitleLike("%" + rqTitle.trim() + "%");
            }
            String systemFormat = OperatePropertyUtil.getProperties("system_date_format");
            SimpleDateFormat sdhmsf = new SimpleDateFormat(systemFormat);
            if (ctimeStart != null) {
                criteria.andCtimeGreaterThanOrEqualTo(sdhmsf.parse(ctimeStart));
            }
            if (ctimeEnd != null) {
                criteria.andCtimeLessThanOrEqualTo(sdhmsf.parse(ctimeEnd));
            }
            if (rqType != null) {
                criteria.andRqTypeEqualTo(Byte.parseByte(rqType));
            }
            if (rqStatus != null) {
                criteria.andRqStatusEqualTo(Byte.parseByte(rqStatus));
            }
            if (id != null) {
                criteria.andIdEqualTo(Integer.valueOf(id));
            }
            if (userId != null) {
                criteria.andUserIdEqualTo(Integer.valueOf(userId));
            }
            jpc.setPageSize(pageSize);
            jpc.setRequest(request);
            int count = rqInfoService.count(example);
            jpc.setRecordTotal(count);
            jpc.commit();
            int start = jpc.getRecordStart();
            int length = jpc.getRecordLength();
            example.setLimitStart(start);
            example.setLimitEnd(length);
            // 默认按创建时间倒序
            example.setOrderByClause("ctime desc");
            List<RqInfo> rqInfoList = rqInfoService.findAll(example);
            String rqTypes = getLocalMsg("rq.info.type", request);
            String rqStatuses = getLocalMsg("rq.info.status", request);

            List<Integer> userIds;
            if (rqInfoList != null && rqInfoList.size() > 0) {
                userIds = new ArrayList<>(rqInfoList.size());
                for (RqInfo rqInfo : rqInfoList) {
                    userIds.add(rqInfo.getUserId());
                    if (rqInfo.getRqType() != null) {
                        rqInfo.setRqTypeName(getKeyValueByIndex(rqTypes, rqInfo.getRqType()));
                    }
                    if (rqInfo.getRqStatus() != null) {
                        rqInfo.setRqStatusName(getKeyValueByIndex(rqStatuses, rqInfo.getRqStatus()));
                    }
                }

                // batch set userName
                Map<Integer, User> userMap = userService.findId2UserByUids(userIds);
                if (userMap != null && userMap.size() > 0) {
                    for (RqInfo rqInfo : rqInfoList) {
                        User user = userMap.get(rqInfo.getUserId());
                        if (user != null) {
                            String mobileNumber = (String) StringTool.parsentObjectNull(user.getMobileNumber());
                            // 当用户没有绑定手机号的时候，显示邮箱
                            rqInfo.setUserName(StringUtils.isNotBlank(mobileNumber) ?
                                    user.getMobileNumber() : user.getEmail());
                        }
                    }
                }
            }

            List<Map<String, String>> rqTypelist = getListByKeyValue(rqTypes);
            List<Map<String, String>> rqStatuslist = getListByKeyValue(rqStatuses);
            JPage jpage = jpc.getJpage();
            jpage.setUrlServlet(request.getContextPath() + "/rq_info.html");
            request.setAttribute("jpage", jpage);
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            model.addAttribute("rqInfoList", rqInfoList);
            model.addAttribute("rqTypelist", rqTypelist);
            model.addAttribute("rqStatuslist", rqStatuslist);
            model.addAttribute("count", count);
            model.addAttribute("pageSize", pageSize);
            model.addAttribute("rqTitle", rqTitle);
            model.addAttribute("ctimeStart", ctimeStart);
            model.addAttribute("ctimeEnd", ctimeEnd);
            model.addAttribute("rqType", rqType);
            model.addAttribute("rqStatus", rqStatus);
            model.addAttribute("id", id);
            model.addAttribute("userId", userId);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "rq_info");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getStackTrace().length > 0 ? e.getStackTrace()[0].getMethodName() : UNKNOWN_METHOD_NAME, e);
            return null;
        }
    }

    /**
     * 根据主键id, 删除
     *
     * @param id
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/rq_info_del.html")
    public String rq_info_del(Integer id, HttpServletRequest request, HttpServletResponse response,
                              ModelMap model) {
        JSONObject jsonStr = new JSONObject();
        Integer result = 0;
        try {
            //验证token
            if (!this.validToken(request)) {
                jsonStr.put("result", FAIL_VALID_TOKEN);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                jsonStr.put("result", EXCEPTION_ONE);
                writeJson(jsonStr.toString(), request, response);
                return null;
            } else if (!this.validateAction(request, AdminActionConst.rqInfoDel)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }
            if (id != null) {
                rqInfoService.deleteById(id);
                result = SUCCESS_ONE;
                String desc = getLocalMsg("rq.info.delete.title", request) + "： id=" + id;
                writeLog(request, "rq_info", AdminOptLogService.ADMIN_LOG_TYPE_DEL, desc);
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
     * 根据主键id, 关闭工单，修改状态-3
     *
     * @param id
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/rq_info_close.html")
    public String rq_info_close(Integer id, HttpServletRequest request, HttpServletResponse response,
                                ModelMap model) {
        JSONObject jsonStr = new JSONObject();
        Integer result = 0;
        try {
            //验证token
            if (!this.validToken(request)) {
                jsonStr.put("result", FAIL_VALID_TOKEN);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                jsonStr.put("result", EXCEPTION_ONE);
                writeJson(jsonStr.toString(), request, response);
                return null;
            } else if (!this.validateAction(request, AdminActionConst.rqInfoClose)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }
            if (id != null) {
                RqInfo rqInfo = rqInfoService.findById(id);
                if (rqInfo != null) {
                    rqInfo.setRqStatus(Constants.NUM_THREE); // 3-工单关闭状态
                    rqInfo.setMtime(new Date());
                    rqInfoService.update(rqInfo);
                    result = SUCCESS_ONE;
                    String desc = getLocalMsg("rq.info.close.title", request) + "： id=" + id;
                    writeLog(request, "rq_info", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, desc);
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
     * 加载回复问题工单页面
     *
     * @param id
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/rq_info_reply.html")
    public String rq_info_reply(Integer id, HttpServletRequest request, HttpServletResponse response,
                                ModelMap model) {
        try {
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                response.sendRedirect("login.html");
                return null;
            } else if (!this.validateAction(request, AdminActionConst.rqInfoReply)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            RqInfo rqInfo = rqInfoService.findById(id);
            List<RqReply> rqReplyList = new ArrayList<>();
            if (rqInfo != null) {
                // 获取问题详细信息
                User user = userService.findById(rqInfo.getUserId());
                String userName = user == null ? null : user.getMobileNumber();
                rqInfo.setUserName(userName);
                if (rqInfo.getRqType() != null) {
                    String rqTypes = getLocalMsg("rq.info.type", request);
                    rqInfo.setRqTypeName(getKeyValueByIndex(rqTypes, rqInfo.getRqType()));
                }
                if (rqInfo.getRqStatus() != null) {
                    String rqStatuses = getLocalMsg("rq.info.status", request);
                    rqInfo.setRqStatusName(getKeyValueByIndex(rqStatuses, rqInfo.getRqStatus()));
                }
                // 获取该工单问题的所有回复列表
                RqReplyExample example = new RqReplyExample();
                RqReplyExample.Criteria criteria = example.createCriteria();
                criteria.andRqIdEqualTo(rqInfo.getId());
                example.setOrderByClause("ctime asc"); // 默认按创建时间倒序
                rqReplyList = rqReplyService.findAll(example);
                if (rqReplyList != null && rqReplyList.size() > 0) {
                    for (RqReply rqReply : rqReplyList) {
                        if (rqReply.getUserType() == 2) { // 前端提问用户
                            rqReply.setUserName(userName);
                        } else if (rqReply.getUserType() == 1) { // 前端提问用户
                            AdminUser adminUser = adminUserService.findById(rqReply.getUserId());
                            rqReply.setUserName(adminUser == null ? null : adminUser.getMobileNumber());
                        }
                    }
                }

                // 获取问题的上传的图片附件
                RqImageExample rqImageExample = new RqImageExample();
                RqImageExample.Criteria rqImageCriteria = rqImageExample.createCriteria();
                rqImageCriteria.andRqIdEqualTo(rqInfo.getId());
                rqImageCriteria.andTypeEqualTo(Constants.NUM_ONE); // 1-提交工单的图片
                List<RqImage> rqImageList = rqImageService.findAll(rqImageExample);
                if (rqImageList != null && rqImageList.size() > 0) {
                    rqInfo.setImageData(rqImageList.get(0).getImageData());
                    String imgStr = new String(rqImageList.get(0).getImageData());
                    rqInfo.setImageDataStr(imgStr.replaceAll("<|>|'|\"", ""));
                }
            }
            String ad_base = PropertyUtil.getProperties("ad_base");
            logger.info("rq_info_reply ad_base = {} ", ad_base);
            model.addAttribute("ad_base", ad_base);
            model.addAttribute("rqInfo", rqInfo);
            model.addAttribute("rqReplyList", rqReplyList);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "rq_info_reply");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 回复问题工单 提交请求
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/rq_info_reply_submit.html", method = RequestMethod.POST)
    public String rq_info_reply_submit(Integer rqId, String rqReplyContent, HttpServletRequest request,
                                       HttpServletResponse response, ModelMap model) {
        JSONObject jsonStr = new JSONObject();
        Integer result = 0;
        try {
            //验证token
            if (!this.validToken(request)) {
                jsonStr.put("result", FAIL_VALID_TOKEN);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                jsonStr.put("result", EXCEPTION_ONE);
                writeJson(jsonStr.toString(), request, response);
                return null;
            } else if (!this.validateAction(request, AdminActionConst.rqInfoReply)) {
                MyEConfig config = CommonContainer.getSite();
                FrontUtils.frontData(request, model, config);
                model.addAttribute("error", getLocalMsg("noaction_error", request));
                return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
            }
            // 问题工单回复内容，上传图片，新增一条回复信息到工单回复表，同时更新问题工单状态为已回复
            if (rqId != null && rqReplyContent != null) {
                RqReply rqReply = new RqReply();
                rqReply.setRqId(rqId);
                rqReply.setUserId(adminUser.getId()); // 当前登录用户
                rqReply.setUserType(Constants.NUM_ONE); // 后台用户回复
                rqReply.setReplayContent(getSafeUtf8(rqReplyContent.trim(), request));
                rqReply.setCtime(new Date());
                rqReplyService.add(rqReply);
                RqInfo rqInfo = rqInfoService.findById(rqId);
                rqInfo.setRqStatus(Constants.NUM_TWO); // 2-已回复
                rqInfo.setMtime(new Date());
                rqInfoService.update(rqInfo);
                String desc = getLocalMsg("rq.info.reply.title", request) + "：rqId" + rqId;
                writeLog(request, "rq_info", AdminOptLogService.ADMIN_LOG_TYPE_EDIT, desc);
                // 如果提交了图片附件
                MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
                MultipartFile file = multipartRequest.getFile("file");
                if (file != null) {
                    // 对字节数组Base64编码
                    Base64 base64 = new Base64();
                    // 上传图片到服务器，以及插入确认记录
                    RqImage rqImage = new RqImage();
                    rqImage.setRqId(rqId);
                    rqImage.setImageData(base64.encode(file.getBytes()));
                    rqImage.setType(Constants.NUM_TWO); // 2-回复工单图片附件
                    rqImageService.add(rqImage);
                    desc = getLocalMsg("rq.info.reply.title", request) + "：rqId" + rqId;
                    writeLog(request, "rq_image", AdminOptLogService.ADMIN_LOG_TYPE_ADD, desc);
                }
                result = SUCCESS_ONE;
                desc = getLocalMsg("rq.info.reply.title", request) + "：rqId" + rqId;
                writeLog(request, "rq_reply", AdminOptLogService.ADMIN_LOG_TYPE_ADD, desc);
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
     * 根据id 获取工单信息以及该工单的回复信息列表
     *
     * @param id
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/find_rq_info.html")
    public String find_rq_info(Integer id, HttpServletRequest request, HttpServletResponse response,
                               ModelMap model) {
        JSONObject jsonStr = new JSONObject();
        try {
            //验证token
            if (!this.validToken(request)) {
                jsonStr.put("result", FAIL_VALID_TOKEN);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                jsonStr.put("result", EXCEPTION_ONE);
                writeJson(jsonStr.toString(), request, response);
                return null;
            }
            RqInfo rqInfo = rqInfoService.findById(id);
            List<RqReply> rqReplyList = new ArrayList<>();
            if (rqInfo != null) {
                // 获取工单的上传的图片附件
                RqImageExample rqImageExample = new RqImageExample();
                RqImageExample.Criteria rqImageCriteria = rqImageExample.createCriteria();
                rqImageCriteria.andRqIdEqualTo(rqInfo.getId());
                rqImageCriteria.andTypeEqualTo(Constants.NUM_ONE); // 1-提交工单的图片
                List<RqImage> rqInfoImageList = rqImageService.findAll(rqImageExample);
                if (rqInfoImageList != null && rqInfoImageList.size() > 0) {
                    rqInfo.setImageData(rqInfoImageList.get(0).getImageData());
                    String imgStr = new String(rqInfoImageList.get(0).getImageData());
                    rqInfo.setImageDataStr(imgStr.replaceAll("<|>|'|\"", ""));
                }
                // 获取该工单的回复信息列表
                RqReplyExample example = new RqReplyExample();
                RqReplyExample.Criteria criteria = example.createCriteria();
                criteria.andRqIdEqualTo(rqInfo.getId());
                //criteria.andUserIdEqualTo(adminUser.getId());  // 加载当前用户回复的列表，或是加载该工单所有回复列表
                example.setOrderByClause("ctime desc"); // 默认按创建时间倒序
                rqReplyList = rqReplyService.findAll(example);
                if (rqReplyList != null && rqReplyList.size() > 0) {
                    for (RqReply rqReply : rqReplyList) {
                        rqImageCriteria.andRqIdEqualTo(rqReply.getId());
                        rqImageCriteria.andTypeEqualTo(Constants.NUM_TWO); // 2-回复工单的图片
                        List<RqImage> rqReplyImageList = rqImageService.findAll(rqImageExample);
                        if (rqReplyImageList != null && rqReplyImageList.size() > 0) {
                            rqReply.setImageData(new String(rqReplyImageList.get(0).getImageData()));
                        }
                    }
                }
            }
            jsonStr.put("rqInfo", rqInfo);
            jsonStr.put("rqReplyList", rqReplyList);
            jsonStr.put("result", SUCCESS_ONE);
            writeJson(jsonStr.toString(), request, response);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/rq_info_show.html")
    public String rqInfoShowList(Integer id, Integer pageSize, HttpServletRequest request, HttpServletResponse response,
                                 ModelMap model) {
        try {
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                response.sendRedirect("login.html");
                return null;
            }
            id = (Integer) StringTool.parsentObjectNull(id);
            pageSize = (Integer) StringTool.parsentObjectNull(pageSize);
            if (pageSize == null) {
                pageSize = CURRENT_PAGE_SIZE;
            }
            JPageConfig jpc;
            try {
                jpc = new JPageConfig();
            } catch (JPageException e) {
                e.printStackTrace();
                return "view";
            }
            RqInfo rqInfo = rqInfoService.findById(id);
            List<RqReply> rqReplyList = new ArrayList<>();
            int count = 0;
            if (rqInfo != null) {
                // 获取工单的上传的图片附件
                RqImageExample rqImageExample = new RqImageExample();
                RqImageExample.Criteria rqImageCriteria = rqImageExample.createCriteria();
                rqImageCriteria.andRqIdEqualTo(rqInfo.getId());
                // 1-提交工单的图片
                rqImageCriteria.andTypeEqualTo(Constants.NUM_ONE);
                List<RqImage> rqInfoImageList = rqImageService.findAll(rqImageExample);
                if (rqInfoImageList != null && rqInfoImageList.size() > 0) {
                    rqInfo.setImageData(rqInfoImageList.get(0).getImageData());
                    String imgStr = new String(rqInfoImageList.get(0).getImageData());
                    rqInfo.setImageDataStr(imgStr.replaceAll("<|>|'|\"", ""));
                }

                // 获取该工单的回复信息列表
                RqReplyExample example = new RqReplyExample();
                RqReplyExample.Criteria criteria = example.createCriteria();
                criteria.andRqIdEqualTo(rqInfo.getId());
                // criteria.andUserIdEqualTo(adminUser.getId()); // 加载当前用户回复的列表，或是加载该工单所有回复列表
                // 默认按创建时间倒序
                example.setOrderByClause("ctime desc");
                jpc.setPageSize(pageSize);
                jpc.setRequest(request);
                count = rqReplyService.count(example);
                jpc.setRecordTotal(count);
                jpc.commit();
                int start = jpc.getRecordStart();
                int length = jpc.getRecordLength();
                example.setLimitStart(start);
                example.setLimitEnd(length);
                // 默认按创建时间倒序
                example.setOrderByClause("ctime desc");
                rqReplyList = rqReplyService.findAll(example);
                if (rqReplyList != null && rqReplyList.size() > 0) {
                    for (RqReply rqReply : rqReplyList) {
                        AdminUser adminUser = adminUserService.findById(rqReply.getUserId());
                        if (adminUser != null) {
                            rqReply.setUserName(adminUser.getMobileNumber());
                        }
                        rqImageCriteria.andRqIdEqualTo(rqReply.getId());
                        // 2-回复工单的图片
                        rqImageCriteria.andTypeEqualTo(Constants.NUM_TWO);
                        List<RqImage> rqReplyImageList = rqImageService.findAll(rqImageExample);
                        if (rqReplyImageList != null && rqReplyImageList.size() > 0) {
                            rqReply.setImageData(new String(rqReplyImageList.get(0).getImageData()).replaceAll("<|>|'|\"", ""));
                        }
                    }
                }
            }
            JPage jpage = jpc.getJpage();
            jpage.setUrlServlet(request.getContextPath() + "/rq_info_show.html");
            request.setAttribute("jpage", jpage);
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            model.addAttribute("rqInfo", rqInfo);
            model.addAttribute("rqReplyList", rqReplyList);
            model.addAttribute("count", count);
            model.addAttribute("pageSize", pageSize);
            model.addAttribute("request", request);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "rq_info_show");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查看工单的回复详情页面
     *
     * @param id
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/rq_reply_detail.html")
    public String rq_reply_detail(Integer id, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        try {
            if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
                response.sendRedirect("login.html");
                return null;
            }
            MyEConfig config = CommonContainer.getSite();
            FrontUtils.frontData(request, model, config);
            RqReply rqReply = rqReplyService.findById(id);
            if (rqReply != null) { // 获取工单回复问题上传的图片附件
                AdminUser adminUser = adminUserService.findById(rqReply.getUserId());
                if (adminUser != null) {
                    rqReply.setUserName(adminUser.getMobileNumber());
                }
                RqImageExample rqImageExample = new RqImageExample();
                RqImageExample.Criteria rqImageCriteria = rqImageExample.createCriteria();
                rqImageCriteria.andRqIdEqualTo(rqReply.getId());
                rqImageCriteria.andTypeEqualTo(Constants.NUM_TWO); // 2-回复工单的图片
                List<RqImage> rqReplyImageList = rqImageService.findAll(rqImageExample);
                if (rqReplyImageList != null && rqReplyImageList.size() > 0) {
                    rqReply.setImageData(new String(rqReplyImageList.get(0).getImageData()).replaceAll("<|>|'|\"", ""));
                }
            }
            model.addAttribute("rqReply", rqReply);
            return FrontUtils.getTplPath(config.getSolutionPath(), "", "rq_reply_detail");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
