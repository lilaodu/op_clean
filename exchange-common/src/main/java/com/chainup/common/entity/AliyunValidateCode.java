package com.chainup.common.entity;

public class AliyunValidateCode {

    //阿里滑动验证
	private String csessionid;
	private String sig;
	private String token;
	private String scene;
	private String remoteId;
	//极验滑动验证
	private String geetest_challenge;
    private String geetest_validate;
    private String geetest_seccode;


	public String getCsessionid() {
		return csessionid;
	}
	public void setCsessionid(String csessionid) {
		this.csessionid = csessionid;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getScene() {
		return scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getRemoteId() {
		return remoteId;
	}

	public void setRemoteId(String remoteId) {
		this.remoteId = remoteId;
	}

    public String getGeetest_challenge() { return geetest_challenge; }

    public void setGeetest_challenge(String geetest_challenge) { this.geetest_challenge = geetest_challenge; }

    public String getGeetest_validate() { return geetest_validate; }

    public void setGeetest_validate(String geetest_validate) { this.geetest_validate = geetest_validate; }

    public String getGeetest_seccode() { return geetest_seccode; }

    public void setGeetest_seccode(String geetest_seccode) { this.geetest_seccode = geetest_seccode; }

    @Override
	public String toString() {
		return "AliyunValidateCode{" +
				"csessionid='" + csessionid + '\'' +
				", sig='" + sig + '\'' +
				", token='" + token + '\'' +
				", scene='" + scene + '\'' +
				", remoteId='" + remoteId + '\'' +
				'}';
	}
}
