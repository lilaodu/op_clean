package com.chainup.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 字符串相关的工具类
 * 
 * @author lilp
 *
 */
public class StringTool {
	/**
	 * List<String>转化为以spiltStr-","隔开的字符串的方法
	 * 
	 * @param stringList
	 * @param spiltStr 分割字符, 如, ; > 等
	 * @return
	 */
	public static String listToString(List<String> stringList, String spiltStr) {
		if (stringList == null || stringList.size() == 0) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (String string : stringList) {
			if (flag) {
				result.append(spiltStr);
			} else {
				flag = true;
			}
			result.append(string.trim());
		}
		return result.toString();
	}
	
	/**
	 * 以spiltStr 如","隔开的字符串转化为List<String>
	 * 
	 * @param strs
	 * @param spiltStr 分割字符, 如, ; > 等
	 * @return
	 */
	public static List<String> stringToStrList(String strs, String spiltStr) {
		List<String> list = new ArrayList<String>();
		if (strs != null && !strs.equals("")) {
			String str[] = strs.split(spiltStr);
			list = Arrays.asList(str);
		}
		return list;
	}

	/**
	 * 以spiltStr 如","隔开的字符串转化为List<T>
	 * 
	 * @param strs
	 * @param spiltStr 分割字符, 如, ; > 等
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> stringToList(String strs, String spiltStr) {
		List<T> list = new ArrayList<T>();
		if (strs != null && !strs.equals("")) {
			String str[] = strs.split(spiltStr);
			list = (List<T>) Arrays.asList(str);
		}
		return list;
	}
	
	/**
	 * 将object 是""字符串，null字符串，undefined字符串，都转化为null对象
	 * 
	 * @param object
	 * @return
	 */
    public static Object parsentObjectNull(Object object) {
        try {
            if (object.equals("")) {
                return null;
            } else if (object.equals("null")) {
                return null;
            } else if (object.equals("undefined")) {
                return null;
            }
            return object;
        } catch (Exception e) {
            return null;
        }
    }
	

	/**
     * 根据国际化文件中配置的key的值组装前端需要的list
     * 
     * @param keyValue
     * @return
     */
	public static List<Map<String, String>> getListByKeyValue(String keyValue) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        List<String> strList = StringTool.stringToList(keyValue, ",");
        if (strList == null || strList.size() == 0) {
            return null;
        } else {
            int i = 1;
            for (String str : strList) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("value", String.valueOf(i++));
                map.put("name", str);
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 根据索引值获取对应内容
     * 
     * @param key_value_index
     * @return
     */
	public static String getKeyValueByIndex(String keyValue, Byte key_value_index) {
        try {
            List<String> strList = StringTool.stringToList(keyValue, ",");
            return strList.get(key_value_index - 1);
        } catch (Exception e) {
            return "";
        }
    }
	
	/**
	 * 随机生成字符串
	 * @param length
	 * @return
	 */
	public static String randString(int length) { //length表示生成字符串的长度  
        String base = "0123456789";     
        Random random = new Random();     
        StringBuffer sb = new StringBuffer();     
        for (int i = 0; i < length; i++) {     
            int number = random.nextInt(base.length());     
            sb.append(base.charAt(number));     
        }     
        return sb.toString();     
     }
}
