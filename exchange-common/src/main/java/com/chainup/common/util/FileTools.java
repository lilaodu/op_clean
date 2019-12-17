/*
 * Copyright (C) 2014-2015 by ywx.co.,ltd.
 * All Rights Reserved.
 * YWX CONFIDENTIAL AND TRADE SECRET
 */
package com.chainup.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 文件操作工具类
 * @author fangyi
 */
public class FileTools {


	private static String charsetName = "UTF-8";

	public static void setCharsetName(String charsetName){
		FileTools.charsetName = charsetName;
	}



	/**
	 * 获得完整路径
	 * @param path
	 * @param name
	 * @return
	 */
	public static String getFullPathFileName(String path,String name){
		if("//".equals(name.substring(0,2))){
			return name.substring(2,name.length());
		}else{
			if(path.charAt(path.length()-1)=='/'){
				if(name.charAt(0)=='/'){
					return path.substring(0,path.length()-1) + name;
				}else{
					return path + name;
				}
			}else{
				if(name.charAt(0)=='/'){
					return path + name;
				}else{
					return path + '/' + name;
				}
			}
		}
	}


	/**
	 * 读取二进制文件
	 * @param fileName 路径+文件全名
	 * @return
	 * @throws IOException
	 */
	public static byte[] readByteFile(String fileName) throws IOException{
		if(StringUtil.isNullOrEmpty(fileName)){
			return null;
		}
		return readByteFile(new File(fileName));
	}



	/**
	 * 读取二进制文件
	 * @param file 文件
	 * @return
	 * @throws IOException
	 */
	public static byte[] readByteFile(File file) throws IOException{
		BufferedInputStream inputStream = null;
		if(file==null){
			return null;
		}

		try{
			inputStream = new BufferedInputStream(new FileInputStream(file));
			ByteBuffer byteBuffer = new ByteBuffer(1*1024*512); //512KB
			byte[] b = new byte[1*1024*256]; //256KB
			int i = 0;
			while((i=inputStream.read(b))!=-1){
				byteBuffer.append(b,0,i);
			}
			return byteBuffer.array();
		}finally{
			try{
				if(inputStream!=null)inputStream.close();
			} catch (IOException e) {
			}
		}
	}



	/**
	 * 写二进制文件
	 * @param fileName 路径+文件全名
	 * @param fileData 数据
	 * @throws IOException
	 */
	public static void writeByteFile(String fileName, byte[] fileData) throws IOException{
		if(StringUtil.isNullOrEmpty(fileName)){
			return;
		}

		writeByteFile(new File(fileName),fileData);
	}


	/**
	 * 写二进制文件
	 * @param file文件
	 * @param fileData 数据
	 * @throws IOException
	 */
	public static void writeByteFile(File file, byte[] fileData) throws IOException{
		if(file==null || fileData==null || fileData.length<1){
			return;
		}

		BufferedOutputStream outputStream = null;

		try{
			outputStream = new BufferedOutputStream(new FileOutputStream(file));
			outputStream.write(fileData);
		}finally{
			try{
				if(outputStream!=null)outputStream.close();
			} catch (IOException e) {
			}
		}
	}


	/**
	 * 读取字符文件
	 * @param fileName 路径+文件全名
	 * @return
	 * @throws IOException
	 */
	public static String readCharFile(String fileName) throws IOException{
		if(StringUtil.isNullOrEmpty(fileName)){
			return null;
		}

		return readCharFile(new File(fileName));
	}




	/**
	 * 读取字符文件
	 * @param file 文件
	 * @return
	 * @throws IOException
	 */
	public static String readCharFile(File file) throws IOException{
		InputStreamReader reader = null;
		if(file==null){
			return null;
		}

		try{
			reader = new InputStreamReader(new FileInputStream(file),charsetName);
			StringBuffer strBuffer = new StringBuffer(1*1024*256); //256KB
			char[] b = new char[1024];
			int i = 0;
			while((i=reader.read(b))!=-1){
				strBuffer.append(new String(b,0,i));
			}
			return strBuffer.toString();
		}finally{
			try{
				if(reader!=null)reader.close();
			} catch (IOException e) {
			}
		}


	}




	/**
	 * 写字符文件
	 * @param fileName 路径+文件全名
	 * @param fileData 数据
	 * @throws IOException
	 */
	public static void writeCharFile(String fileName,String fileData) throws IOException{
		if(StringUtil.isNullOrEmpty(fileName)){
			return;
		}

		writeCharFile(new File(fileName),fileData);
	}



	/**
	 * 写字符文件
	 * @param fileName 路径+文件全名
	 * @param fileData 数据
	 * @throws IOException
	 */
	public static void writeCharFile(File file, String fileData) throws IOException{
		if(file==null || fileData==null || fileData.length()<1){
			return;
		}

		OutputStreamWriter writer = null;

		try{
			writer = new OutputStreamWriter(new FileOutputStream(file), charsetName);
			writer.write(fileData.toCharArray());
		}finally{
			try{
				if(writer!=null)writer.close();
			} catch (IOException e) {
			}
		}
	}



	/**
	 * 删除文件
	 * @param fileName 路径+文件全名
	 */
	public static boolean deleteFile(String fileName){
		if(StringUtil.isNullOrEmpty(fileName)){
			return false;
		}

		return deleteFile(new File(fileName));
	}
	
	/**
	 * 删除文件
	 */
	public static boolean deleteFile(File file){
		if (file == null) {
			return false;
		}
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File sonFile : listFiles) {
				deleteFile(sonFile);
			}
		}
		boolean delete = file.delete();
		System.out.print("删除文件："+ file.getName());
		System.out.println(delete?"成功":"失败");
		return delete;
	}



	/**
	 * 获取文件后缀名
	 * @param fileName
	 * @return
	 */
	public static String getFileSuffix(String fileName){
		if(StringUtil.isNullOrEmpty(fileName)){
			return null;
		}
		return fileName.substring(fileName.lastIndexOf("."));
	}


	public static String getFileName(String fullPath){
		if(StringUtil.isNullOrEmpty(fullPath)){
			return null;
		}

		return fullPath.substring(fullPath.lastIndexOf(File.separator)+1, fullPath.lastIndexOf("."));

	}


	/**
	 * 可以用于文件校验, 将byte数组以无符号int相加, 返回相加后的结果
	 * @param b
	 * @return
	 */
	public static int checkSum(byte[] b){
		int sum = 0;

		for (int i = 0; i < b.length; i++) {
			sum += (b[i] & 0x0FF);
		}

		return sum;
	}

	/**
     * 追加文件：使用FileWriter
     *
     * @param fileName
     * @param content
     */
    public static void appendFile(String fileName, String content) {
        FileWriter writer = null;
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            writer = new FileWriter(fileName, true);
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * 验证是否存在
     * @param filePath
     * @param mkdir 是否要创建目录
     * @return mkdir为false时是存在或不存在，mkdir为true时是成功或不成功
     * @throws: 
     * @author: xuxy
     * @update:[2016年6月14日 上午9:39:13] xuxy 变更描述
     */
    public static boolean checkExist(String filePath,boolean mkdir){
    	File folder = new File(filePath);
    	if (folder.exists()) {
    		return true;
    	}else if(mkdir){
			if (folder.mkdirs()) {
				return true;
			}
    	}
    	return false;
    }
}
