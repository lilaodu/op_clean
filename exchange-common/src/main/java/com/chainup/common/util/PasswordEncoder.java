package com.chainup.common.util;
import org.apache.commons.codec.digest.DigestUtils;
/**
 * 密码加密
 * @author zhangfx
 *
 */
public class PasswordEncoder {
	public final static String encodePassword(String rawPass, Object salt) {
		return DigestUtils.md5Hex(DigestUtils.md5Hex(rawPass)+salt);
	}

}
