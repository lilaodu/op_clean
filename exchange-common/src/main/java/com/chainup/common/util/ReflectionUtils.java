package com.chainup.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;


public class ReflectionUtils {  
	//单个对象转义
	public static void escapeHtml(Object obj) {
		if(obj == null) {
			return;
		}
		
		String[] fileds = getFiledName(obj);
		for(int i=0;i<fileds.length;i++){  
            Object o = invokeGetterMethod(obj,fileds[i]);  
            if(o != null && o instanceof String) {
            	invokeSetterMethod(obj,fileds[i],htmlEncode(o.toString()));
            }
        }
	}
	
	//数组转义
	@SuppressWarnings("rawtypes")
	public static void escapeHtml(List list) {
		if(list==null || list.size()==0) {
			return;
		}
		
		for(Object obj:list) {
			escapeHtml(obj);
		}
	}
	
	//单个对象防注入
	public static Object escapeSql(Object obj) {
		if(obj == null) {
			return obj;
		}
		
		String[] fileds = getFiledName(obj);
		for(int i=0;i<fileds.length;i++){  
            Object o = invokeGetterMethod(obj,fileds[i]);  
            if(o != null && o instanceof String) {
            	invokeSetterMethod(obj,fileds[i],sqlEncode(o.toString()));
            }
        }
		return obj;
	}
	
	//数组防注入
	@SuppressWarnings("rawtypes")
	public static List escapeSql(List list) {
		if(list==null || list.size()==0) {
			return list;
		}
		
		for(Object obj:list) {
			escapeHtml(obj);
		}
		return list;
	}
	
	//获取所有字段
	private static String[] getFiledName(Object obj){  
	    Field[] fields=obj.getClass().getDeclaredFields();  
	        String[] fieldNames=new String[fields.length];  
	    for(int i=0;i<fields.length;i++){  
	        fieldNames[i]=fields[i].getName();  
	    }  
	    return fieldNames;  
   }  
	
    /**  
     * @param : obj. the operating obj  
     * @param : attribute. the attribute you want to set  
     * */  
    @SuppressWarnings({ "unchecked", "rawtypes" })  
    private static Object invokeGetterMethod(Object obj, String attribute){  
    	try {
    		Class clazz = obj.getClass();  
            Method method = clazz.getMethod(getMethodName(true,attribute));  
            return method.invoke(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
        return null;
    }  
      
    /**  
     * @param : obj. the operating obj  
     * @param : attribute. the attribute you want to set  
     * @param : value. the value you want to set  
     * */  
    @SuppressWarnings({ "unchecked", "rawtypes" })  
    public static void invokeSetterMethod(Object obj , String attribute, Object value){  
        try {
        	Class clazz = obj.getClass();  
            Field field = clazz.getDeclaredField(attribute);  
            Class paramType = field.getType();  
            Method method = clazz.getMethod(getMethodName(false,attribute), paramType);  
            method.invoke(obj, value);  
		} catch (Exception e) {
			// TODO: handle exception
		}
    }  
      
    /**  
     * @param : flag. which method you will get  
     * @param : attribute. which attribute you will get  
     * */  
    private static String getMethodName(boolean flag ,String attribute) {  
        String firstElemntOfAttribute = attribute.substring(0, 1).toUpperCase();  
        String restElementOfAttrute = attribute.substring(1);  
        return (flag ? "get"  : "set")  +  firstElemntOfAttribute + restElementOfAttrute;  
    }  
      
    public static String htmlEncode(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String html = "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            switch (c) {
            case '<':
                buffer.append("&lt;");
                break;
            case '>':
                buffer.append("&gt;");
                break;
            case '&':
                buffer.append("&amp;");
                break;
            case '"':
                buffer.append("&quot;");
                break;
            case 10:
            case 13:
                break;
            default:
                buffer.append(c);
            }
        }
        html = buffer.toString();
        return html;
    }
    
    public static String sqlEncode(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String sql = StringEscapeUtils.escapeSql(source);
        if(sql.length()>source.length()) {
        	sql = sql.substring(0,source.length());
        }
        return sql;
    }
    
/*    public static void main(String[] args) {
    	User o = new User();
    	o.setId(1);
    	o.setNickname("1' or '1'='1中文");
    	ReflectionUtils.escapeSql(o);
    	System.out.println(o.getNickname());
        
    	o.setNickname("<font>@@@@chen磊  xing</font>");
    	ReflectionUtils.escapeHtml(o);
    	System.out.println(o.getNickname());
    	
    	List<User> list = new ArrayList<>();
    	o.setNickname("<font>@@@@chen磊  xing</font>");
    	list.add(o);
    	ReflectionUtils.escapeHtml(list);
    	System.out.println(list.get(0).getNickname());
    }*/
} 
