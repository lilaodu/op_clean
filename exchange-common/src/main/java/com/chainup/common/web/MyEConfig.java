package com.chainup.common.web;

import org.springframework.stereotype.Service;

@Service
public class MyEConfig {
	

	public MyEConfig() {
		//updateConfigFromDB();
	}
	
	private String newsolutionPath;
	private String solutionPath="/pages";
	private String loginUrl;
	private String processUrl;
	private java.lang.Boolean on;
	private java.lang.Integer minWidth;
	private java.lang.Integer minHeight;
	private java.lang.String imagePath;
	private java.lang.String outfilePath;
	private java.lang.String content;
	private java.lang.Integer size;
	private java.lang.String color;
	private java.lang.Integer alpha;
	private java.lang.Integer pos;
	private java.lang.Integer offsetX;
	private java.lang.Integer offsetY;
	
	public static String Cn_MyE_DataSource_Key = "ds";
	public static String MyE_Monitor_DataSource_Key = "dds";
	public static String MyE_ALGORITHM_DataSource_Key = "ads";
	public static String MYE_BASE_DataSource_Key = "bds";
	
	public static String Temperature_Controller = "00"; //美国温度控制器:根据T-ID的第一字节来判断
	public static String Infrared_Repeater = "01";	//红外转发器:根据T-ID的第一字节来判断
	public static String Intelligence_Control_Star = "01-0";	//智控星
	public static String Air_Condition_Mate = "01-1";	//空调伴侣
	public static String Air_Condition_Mate_V2 = "01-2";	//空调伴侣
	public static String Smart_Socket = "02"; //智能插座:根据T-ID的第一字节来判断
	public static String Universal_Controller = "03"; //通用控制器:根据T-ID的第一字节来判断
	public static String Security_Equipment = "04";	//安防设备:根据T-ID的第一字节来判断
	public static String Gateway = "05";	//网关
	public static String Smart_Switch = "06";	//智能开关
	public static String Sub_Switch = "07";		//从开关
	public static String Invade_Detect = "08";		//红外入侵探测器
	public static String Smog_Detect = "09";		//烟雾探测器
	public static String Door_Magnet = "0A";		//门磁
	public static String Sound_Lignt_Alarm = "0B";	//声光报警器
	
	public static Integer Mediator_Net_Firmware = 1;
	public static Integer Mediator_Soft_Firmware = 2;
	public static Integer Terminal_Soft_Firmware = 3;
	public static String Mediator_Net_Ver = "MNETV";
	public static String Mediator_Soft_Ver = "MZGBV";
	public static String Terminal_Soft_Ver = "TIRSV";
	public static String Socket_Soft_ver = "SKTSV";
	public static String Simple_Socket_ver = "SPLUGSV";
	public static String Switch_Soft_Ver = "TSSSV";
	public static String Mediator_2_Hard_Ver = "MRFHV";	//二代网关硬件版本号前缀
	public static String Mediator_2_Soft_Ver = "MRFSV";	//二代网关无线芯片版本号前缀
	public static String Air_Mate_Soft_Ver = "ACMSV";	//空调伴侣软件版本号前缀
	public static String Air_Mate_Hard_Ver = "ACMHV";	//空调伴侣硬件版本号前缀
	public static Integer Download_Command_Count = 0;	//下载空调指令是否用ftp方式的最小条数，当达到这个值时用ftp方式下载，否则用发指令方式
	
	/**
	 * 判断硬件断网时间 5分钟.300000   
	 */
	public static final long TERMINAL_TIME_OUT = 300000;
	
	/**
	 * 判断session超时时间1小时   
	 */
	public static final long SESSION_TIME_OUT = 3600000;
	
	/**
	 * 判断登录帐号输入错误超时时间10分钟
	 */
	public static final long LOGIN_ERROR_CHECK_TIME_OUT = 600000;
	
	/* Email */
	private String host;
	private String username;
	private String password;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.lang.Boolean getOn() {
		return on;
	}
	public void setOn(java.lang.Boolean on) {
		this.on = on;
	}
	public java.lang.Integer getMinWidth() {
		return minWidth;
	}
	public void setMinWidth(java.lang.Integer minWidth) {
		this.minWidth = minWidth;
	}
	public java.lang.Integer getMinHeight() {
		return minHeight;
	}
	public void setMinHeight(java.lang.Integer minHeight) {
		this.minHeight = minHeight;
	}
	public java.lang.String getContent() {
		return content;
	}
	public void setContent(java.lang.String content) {
		this.content = content;
	}
	public java.lang.Integer getSize() {
		return size;
	}
	public void setSize(java.lang.Integer size) {
		this.size = size;
	}
	public java.lang.String getColor() {
		return color;
	}
	public void setColor(java.lang.String color) {
		this.color = color;
	}
	public java.lang.Integer getAlpha() {
		return alpha;
	}
	public void setAlpha(java.lang.Integer alpha) {
		this.alpha = alpha;
	}
	public java.lang.Integer getPos() {
		return pos;
	}
	public void setPos(java.lang.Integer pos) {
		this.pos = pos;
	}
	public java.lang.Integer getOffsetX() {
		return offsetX;
	}
	public void setOffsetX(java.lang.Integer offsetX) {
		this.offsetX = offsetX;
	}
	public java.lang.Integer getOffsetY() {
		return offsetY;
	}
	public void setOffsetY(java.lang.Integer offsetY) {
		this.offsetY = offsetY;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getSolutionPath() {
		return solutionPath;
	}

	public void setSolutionPath(String solutionPath) {
		this.solutionPath = solutionPath;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getProcessUrl() {
		return processUrl;
	}

	public void setProcessUrl(String processUrl) {
		this.processUrl = processUrl;
	}

	public String getNewsolutionPath() {
		return newsolutionPath;
	}

	public void setNewsolutionPath(String newsolutionPath) {
		this.newsolutionPath = newsolutionPath;
	}

	public void setOutfilePath(java.lang.String outfilePath) {
		this.outfilePath = outfilePath;
	}

	public java.lang.String getOutfilePath() {
		return outfilePath;
	}

	
	
	
	
}
