package com.chainup.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.chainup.common.enums.Language;
import com.chainup.common.exchange.entity.Country;


public class XmlUtil {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Object> getListFromXml(URL xmlFile, String nodeName, Class pojo) {
		StringBuffer str = new StringBuffer("");
		Document doc = null;
		List<Object> list = new ArrayList<Object>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(xmlFile.openStream(),"utf-8"));
			String s;
			while ((s = reader.readLine()) != null) {
				str.append(s);
			}
			reader.close();
			// 读取并解析XML文档
			// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			// SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
			// Document document = reader.read(new File("User.hbm.xml"));
			// 下面的是通过解析xml字符串的

			doc = DocumentHelper.parseText(str.toString()); // 将字符串转为XML
			Element rootElt = doc.getRootElement(); // 获取根节点
			System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
			/*
			 * String returnCode = rootElt.elementTextTrim("desc"); if
			 * (!"0".equals(returnCode)) { System.out.println("后台数据返回有问题");
			 * return null; }
			 */
			Iterator<Element> it = rootElt.elementIterator(nodeName);// 获取根节点下所有content
			while (it.hasNext()) {
				Element elementGroupService = (Element) it.next();
				Object baseBean = fromXmlToBean(elementGroupService, pojo);
				list.add(baseBean);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("数据解析错误");
		}
		return list;

	}

	/**
	 * json 数据转换对象
	 * 
	 * @param
	 *
	 * @param pojo
	 *            要转换的目标对象类型
	 * @return 转换的目标对象
	 * @throws Exception
	 *             转换失败
	 */
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static Object fromXmlToBean(Element rootElt, Class pojo) throws Exception {
		// 首先得到pojo所定义的字段
		Field[] fields = pojo.getDeclaredFields();
		// 根据传入的Class动态生成pojo对象
		Object obj = pojo.newInstance();
		for (Field field : fields) {
			// 设置字段可访问（必须，否则报错）
			field.setAccessible(true);
			// 得到字段的属性名
			String name = field.getName();
			// 这一段的作用是如果字段在Element中不存在会抛出异常，如果出异常，则跳过。
			try {
				rootElt.elementTextTrim(name);
			} catch (Exception ex) {
				continue;
			}
			if (rootElt.elementTextTrim(name) != null && !"".equals(rootElt.elementTextTrim(name))) {
				// 根据字段的类型将值转化为相应的类型，并设置到生成的对象中。
				if (field.getType().equals(Long.class) || field.getType().equals(long.class)) {
					field.set(obj, Long.parseLong(rootElt.elementTextTrim(name)));
				} else if (field.getType().equals(String.class)) {
					field.set(obj, rootElt.elementTextTrim(name));
				} else if (field.getType().equals(Double.class) || field.getType().equals(double.class)) {
					field.set(obj, Double.parseDouble(rootElt.elementTextTrim(name)));
				} else if (field.getType().equals(Integer.class) || field.getType().equals(int.class)) {
					field.set(obj, Integer.parseInt(rootElt.elementTextTrim(name)));
				} else if (field.getType().equals(Date.class)) {
					field.set(obj, Date.parse(rootElt.elementTextTrim(name)));
				} else {
					continue;
				}
			}
		}
		return obj;
	}
	public static List<HashMap<String, String>> getListFromXml(URL xmlFile, String nodeName) {
        StringBuffer str = new StringBuffer("");
        Document doc = null;
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(xmlFile.openStream(),"utf-8"));
            String s;
            while ((s = reader.readLine()) != null) {
                str.append(s);
            }
            reader.close();
            // 读取并解析XML文档
            // SAXReader就是一个管道，用一个流的方式，把xml文件读出来
            // SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
            // Document document = reader.read(new File("User.hbm.xml"));
            // 下面的是通过解析xml字符串的

            doc = DocumentHelper.parseText(str.toString()); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点
            System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
            /*
             * String returnCode = rootElt.elementTextTrim("desc"); if
             * (!"0".equals(returnCode)) { System.out.println("后台数据返回有问题");
             * return null; }
             */
            Iterator<Element> it = rootElt.elementIterator(nodeName);// 获取根节点下所有content
            while (it.hasNext()) {
                Element elementGroupService = (Element) it.next();
                HashMap<String, String> baseBean = fromXmlToBean(elementGroupService);
                list.add(baseBean);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("数据解析错误");
        }
        return list;
    }
	/**
     * json 数据转换对象
     * 
     * @param
     *
     * @param
     *
     * @return 转换的目标对象
     * @throws Exception
     *             转换失败
     */
    @SuppressWarnings({ "rawtypes", "deprecation" })
    public static HashMap<String, String> fromXmlToBean(Element rootElt) throws Exception {
        //Country country = new Country();
    	HashMap<String, String> country = new HashMap<String,String>();
    	for (Language language : Language.values()) {
    		String langName = language.phoneCountryName;
			if (rootElt.elementTextTrim(langName) != null && !"".equals(rootElt.elementTextTrim(langName))) {
				country.put(langName, rootElt.elementTextTrim(langName));
			}
		}
        if (rootElt.elementTextTrim("dialingCode") != null && !"".equals(rootElt.elementTextTrim("dialingCode"))) {
        	country.put("dialingCode", "+"+rootElt.elementTextTrim("dialingCode"));
        }
        if (rootElt.elementTextTrim("NumberCode") != null && !"".equals(rootElt.elementTextTrim("NumberCode"))) {
        	country.put("NumberCode", rootElt.elementTextTrim("NumberCode"));
        }
        return country;
    }
	public static void main(String[] args) {
		
	}
	
	public static List<Country> getCountryListFromXml(URL xmlFile, String nodeName) {
        StringBuffer str = new StringBuffer("");
        Document doc = null;
        List<Country> list = new ArrayList<Country>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(xmlFile.openStream(),"utf-8"));
            String s;
            while ((s = reader.readLine()) != null) {
                str.append(s);
            }
            reader.close();
            // 读取并解析XML文档
            // SAXReader就是一个管道，用一个流的方式，把xml文件读出来
            // SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
            // Document document = reader.read(new File("User.hbm.xml"));
            // 下面的是通过解析xml字符串的

            doc = DocumentHelper.parseText(str.toString()); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点
            System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
            /*
             * String returnCode = rootElt.elementTextTrim("desc"); if
             * (!"0".equals(returnCode)) { System.out.println("后台数据返回有问题");
             * return null; }
             */
            Iterator<Element> it = rootElt.elementIterator(nodeName);// 获取根节点下所有content
            while (it.hasNext()) {
                Element elementGroupService = (Element) it.next();
                Country baseBean = fromXmlToCountryBean(elementGroupService);
                list.add(baseBean);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("数据解析错误");
        }
        return list;
    }
    /**
     * json 数据转换对象
     * 
     * @param
     *
     * @param
     *
     * @return 转换的目标对象
     * @throws Exception
     *             转换失败
     */
    @SuppressWarnings({ "rawtypes", "deprecation" })
    public static Country fromXmlToCountryBean(Element rootElt) throws Exception {
        Country country = new Country();
        if (rootElt.elementTextTrim("enName") != null && !"".equals(rootElt.elementTextTrim("enName"))) {
            country.setEnName(rootElt.elementTextTrim("enName"));
        }
        if (rootElt.elementTextTrim("cnName") != null && !"".equals(rootElt.elementTextTrim("cnName"))) {
            country.setCnName(rootElt.elementTextTrim("cnName"));
        }
        if (rootElt.elementTextTrim("dialingCode") != null && !"".equals(rootElt.elementTextTrim("dialingCode"))) {
            country.setDialingCode(rootElt.elementTextTrim("dialingCode"));
        }
        if (rootElt.elementTextTrim("NumberCode") != null && !"".equals(rootElt.elementTextTrim("NumberCode"))) {
            country.setNumberCode(rootElt.elementTextTrim("NumberCode"));
        }
        return country;
    }
}
