package com.chainup.common.enums;

/**
 * pc滑动验证语言 H5只支持中英文
 * Created by zhongjingyun 
 */
public enum NcLanguage {
			AR_SA("ar_SA","ar_SA","阿拉伯文 "),
			DE_DE("de_DE","de_DE","德文   "),
			ES_ES("es_ES","es_ES","西班牙文 "),
			FR_FR("fr_FR","fr_FR","法文   "),
			IN_ID("in_ID","in_ID","印尼语  "),
			IT_IT("it_IT","it_IT","意大利文 "),
			IW_HE("iw_HE","iw_HE","希伯来语 "),
			JA_JP("ja_JP","ja_JP","日文   "),
			KO_KR("ko_KR","ko_KR","韓文   "),
			NL_NL("nl_NL","nl_NL","荷蘭文  "),
			PT_BR("pt_BR","pt_BR","波蘭文  "),
			RU_RU("ru_RU","ru_RU","俄文   "),
			TH_TH("th_TH","th_TH","泰文   "),
			TR_TR("tr_TR","tr_TR","土耳其文 "),
			VI_VN("vi_VN","vi_VN","越南文  "),
			CN   ("zh_CN","cn","简体中文 "),
			TW   ("zh_TW   ","tw","繁体中文 "),
			EN   ("en_US","en","英文   "),
			;

    public String languageKey;
    public String nc_lang;
    public String description;

    private NcLanguage(String languageKey, String nc_lang, String description) {
		this.languageKey = languageKey;
		this.nc_lang = nc_lang;
		this.description = description;
	}
    

	public String getLanguageKey() {
		return languageKey;
	}


	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
	}


	public String getNc_lang() {
		return nc_lang;
	}


	public void setNc_lang(String nc_lang) {
		this.nc_lang = nc_lang;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public static NcLanguage fromValue(String languageKey) {
        for (NcLanguage t : NcLanguage.values()) {
        	if (t.languageKey.equalsIgnoreCase(languageKey)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static NcLanguage fromName(String name) {
    	for (NcLanguage t : NcLanguage.values()) {
    		if (t.name().equalsIgnoreCase(name)) {
    			return t;
    		}
    	}
    	return null;
    }
    
}
