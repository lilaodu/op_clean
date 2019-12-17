package com.chainup.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 邀请码工具类
 *
 * @author Autorun
 */
public class InviteCodeUtils {

    private InviteCodeUtils() {
    }

    private static final char[] LETTERS = {'A', 'E', 'Q', 'W', 'Z', 'T', 'V', 'L', 'H', 'G'};

    /**
     * 生成用户邀请码
     *
     * @param uid
     * @return
     */
    public static String encodeInviteCode(String uid) {
        StringBuilder inviteBuilder = new StringBuilder();
        if (!"".equals(uid)) {
            for (int i = 0; i <= uid.length() - 1; i++) {
                inviteBuilder.append(LETTERS[Character.getNumericValue(uid.charAt(i))]);
            }
            return inviteBuilder.toString();
        }
        return "";
    }

    /**
     * 根据邀请码解出用户id
     *
     * @param inviteCode
     * @return
     */
    public static String decodeInviteCode(String inviteCode) {
        if (StringUtils.isNotBlank(inviteCode)) {
            StringBuilder decodeCode = new StringBuilder();
            char[] chars = inviteCode.toCharArray();
            for (char c : chars) {
                for (int i = 0; i < LETTERS.length - 1; i++) {
                    if (c == LETTERS[i]) {
                        decodeCode.append(i);
                    }
                }
            }
            return decodeCode.toString();
        }
        return "";
    }
}
