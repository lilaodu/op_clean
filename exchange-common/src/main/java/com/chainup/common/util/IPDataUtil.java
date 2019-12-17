package com.chainup.common.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chainup.common.entity.IPData;


/**
 * IPDataUtil IP地址管理类
 * 
 * @author lilp
 *
 */
public class IPDataUtil {
    private static final Logger logger = LoggerFactory.getLogger(IPDataUtil.class);
    private static final String CONFIG_PROPERTY = "ipdata.properties";
    private static List<IPData> ipDatas = null;
    static {
    	loadData();
    }

    public static IPData getIPData(String ip) {
    	if(ip.contains(":")) {//本地测试地址
    		return new IPData();
    	}
		long addr = ip2Long(ip);
		return findIPDataInner(0,ipDatas.size()-1,addr);
	}
    
    private static IPData findIPDataInner(Integer start,Integer end,long addr) {
    	if(start<0 || end>=ipDatas.size() || start>end) {
    		return new IPData();
    	}
    	
    	Integer mid = (start+end)/2;
    	if(ipDatas.get(mid).getMinIP()>addr) {
    		return findIPDataInner(start,mid-1,addr);
    	}
    	else if(ipDatas.get(mid).getMaxIP()<addr) {
    		return findIPDataInner(mid+1,end,addr);
    	}
    	return ipDatas.get(mid);
    }
    
    synchronized static private void loadData() {
    	logger.info("开始加载IP数据包.........");
    	
    	ipDatas = new ArrayList<IPData>();
        InputStream in = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        
        try {
        	in = IPDataUtil.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTY);
            isr=new InputStreamReader(in, "UTF-8");
            br = new BufferedReader(isr);
            String line="";
            while ((line=br.readLine())!=null) {
                IPData data = parserIPData(line);
                if(data != null) {
                	ipDatas.add(data);
                }
            }
        } catch (FileNotFoundException e) {
            logger.error(CONFIG_PROPERTY + "文件未找到");
        } catch (IOException e) {
            logger.error("出现IOException");
        } finally {
            try {
            	if (null != br) {
            		br.close();
                }
            	if (null != isr) {
            		isr.close();
                }
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error(CONFIG_PROPERTY + "文件流关闭出现异常");
            }
        }
        logger.info("加载IP数据包完成.........");
    }

    private static IPData parserIPData(String data) {
    	try {
    		String ips[] = data.split(" ");
			IPData ipData = new IPData();
			ipData.setMinIP(ip2Long(ips[0]));
			ipData.setMaxIP(ip2Long(ips[1]));
			if(ips.length >= 3) {
				ipData.setAddress(ips[2]);
			}
			if(ips.length >= 4) {
				ipData.setOperate(ips[3]);
			}
			return ipData;
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }
    
    private static Long ip2Long(String ip) { 
    	String[] ipArr = ip.split("\\.");
    	long addr = Long.parseLong(ipArr[3]) & 0xFF;  
        addr |= ((Long.parseLong(ipArr[2]) << 8) & 0xFF00);  
        addr |= ((Long.parseLong(ipArr[1]) << 16) & 0xFF0000);  
        addr |= ((Long.parseLong(ipArr[0]) << 24) & 0xFF000000);  
        return addr;  
    }  
    
    public static void main(String[] args) {
        System.out.println(getIPData("1.0.8.100").getAddress());
        System.out.println(getIPData("121.204.80.2").getAddress());
        System.out.println(getIPData("218.22.143.7").getAddress());
    }
}
