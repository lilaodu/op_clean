package com.chainup.common.google;


import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base32;

import com.chainup.common.util.ZxingUtils;

public class GoogleAuthUtils {
	 // 最多可偏移的时间 
	public static int window_size = 1; // default 3 - max 17 

	/**
	 * 随机获取密钥
	 * @return
	 */
	public static String genSecret() {// 生成密钥
		String secret = GoogleAuthenticator.generateSecretKey();
		return secret;
	}
	
	/**
	 * 根据密钥和地址生成KEY
	 * @param user
	 * @param secret
	 * @return
	 */
	public static String getQRCode(String user,String secret) {// 生成密钥
		return GoogleAuthenticator.getQRBarcode(user, secret);
	}
	
	/**
	 * IO流字符串
	 * @param qrCode
	 * @return
	 */
	public static String getImageByZxing(String qrCode,int width){
		return ZxingUtils.getQRCodeImge(qrCode, width);
	}
	
	/**
	 * 根据密钥和地址生成二维码扫描
	 * @param user
	 * @param company
	 * @param secret
	 * @return
	 */
	public static String genCaoLiaoUrlBySecret(String user,String company,String secret) {// 生成密钥
		return GoogleAuthenticator.generateCaoLiaoUrl(user,secret,company, "sELPDFnok80gPHovKdI");
	}
	
	/**
	 * 根据密钥和code验证是否正确
	 * @param secret
	 * @param code
	 * @return
	 */
	/*public static Boolean verify(String secret,long code){
		long t = System.currentTimeMillis();
		GoogleAuthenticator ga = new GoogleAuthenticator();
		ga.setWindowSize(5); 
		boolean r = ga.check_code(secret, code, t);
		return r;
	}*/
	
	/** 
	 * Check the code entered by the user to see if it is valid 验证code是否合法 
	 * 
	 * @param secret 
	 *  The users secret. 
	 * @param code 
	 *  The code displayed on the users device 
	 * @param t 
	 *  The time in msec (System.currentTimeMillis() for example) 
	 * @return 
	 */
	 public static boolean verify(String secret, long code) { 
		 long timeMsec = System.currentTimeMillis();
//		 System.out.println("timeMsec:"+timeMsec);
		 Base32 codec = new Base32(); 
		 byte[] decodedKey = codec.decode(secret); 
		 // convert unix msec time into a 30 second "window" 
		 // this is per the TOTP spec (see the RFC for details) 
		 long t = (timeMsec / 1000L) / 30L; 
//		 System.out.println("t:"+t);
		 // Window is used to check codes generated in the near past. 
		 // You can use this value to tune how far you're willing to go. 
		 for (int i = -window_size; i <= window_size; ++i) { 
		  long hash; 
		  try { 
		  hash = verify_code(decodedKey, t + i); 
		  } catch (Exception e) { 
		  // Yes, this is bad form - but 
		  // the exceptions thrown would be rare and a static 
		  // configuration problem 
		  e.printStackTrace(); 
		  throw new RuntimeException(e.getMessage()); 
		  // return false; 
		  } 
		  if (hash == code) { 
		  return true; 
		  } 
		 } 
		 // The validation code is invalid. 
		 return false; 
	 } 
	  
	 private static int verify_code(byte[] key, long t) throws NoSuchAlgorithmException, InvalidKeyException { 
		 byte[] data = new byte[8]; 
		 long value = t; 
		 for (int i = 8; i-- > 0; value >>>= 8) { 
		  data[i] = (byte) value; 
		 } 
		 SecretKeySpec signKey = new SecretKeySpec(key, "HmacSHA1"); 
		 Mac mac = Mac.getInstance("HmacSHA1"); 
		 mac.init(signKey); 
		 byte[] hash = mac.doFinal(data); 
		 int offset = hash[20 - 1] & 0xF; 
		 // We're using a long because Java hasn't got unsigned int. 
		 long truncatedHash = 0; 
		 for (int i = 0; i < 4; ++i) { 
		  truncatedHash <<= 8; 
		  // We are dealing with signed bytes: 
		  // we just keep the first byte. 
		  truncatedHash |= (hash[offset + i] & 0xFF); 
		 } 
		 truncatedHash &= 0x7FFFFFFF; 
		 truncatedHash %= 1000000; 
		 return (int) truncatedHash; 
	} 

	public static void main(String[] args) {
		String  user  = "78964730@qq.com";
//		user += "-chainup.com";
		String secret = "6Q5D2L3U7R2HYB2D";
		long code = 85571;
//		String qrCode  =  getQRCode(user, secret);
//		String img = getImageByZxing(qrCode,200);
		System.out.println("secret:"+secret);
		System.out.println("result:"+verify(secret, code));
//		System.out.println("img:"+img);
	}

}
