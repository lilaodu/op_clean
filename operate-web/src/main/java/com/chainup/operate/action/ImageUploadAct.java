package com.chainup.operate.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainup.common.util.DateUtils;
import com.chainup.common.util.OssClient;
import com.chainup.operate.util.OperatePropertyUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.util.ImageUploadUtil;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
public class ImageUploadAct extends BaseAct {


	/**
	 * 图片上传
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/imageUpload.html")
	public void imgUpload(HttpServletRequest request,HttpServletResponse response) throws IOException {

        try {

			//OSS对应的目录：upload
			String ossDirectoryName= OperatePropertyUtil.getProperties("image_ck_upload_path");
			//服务器文件路径：/home/work/
			String serverPath = OperatePropertyUtil.getProperties("upload_url");
			//OSS文件全路径
			String ossFullFileName = uploadByRequest(request, ossDirectoryName, serverPath);
			// 结合ckeditor功能
			// imageContextPath为图片在服务器地址，如upload/123.jpg,非绝对路径
			// String imageContextPath = request.getContextPath() + "/" + DirectoryName + "/" + fileName;
			String imageContextPath = OperatePropertyUtil.getProperties("image_upload_base_url")+ "/" + ossFullFileName;
			response.setContentType("text/html;charset=UTF-8");
			String callback = request.getParameter("CKEditorFuncNum");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("window.parent.CKEDITOR.tools.callFunction(" + callback + ",'" + imageContextPath + "',''" + ")");
			out.println("</script>");
			out.flush();
			out.close();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@RequestMapping(value = "/indexImageUpload.html")
	public String indexImgUpload(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		JSONObject jsonStr = new JSONObject();
		try{
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			//OSS对应的目录：upload
			String ossDirectoryName= OperatePropertyUtil.getProperties("image_upload_path");

			//服务器文件路径：/home/work/
			String serverPath = OperatePropertyUtil.getProperties("upload_url");

			//OSS文件全路径
			String ossFullFileName = uploadByRequest(request, ossDirectoryName, serverPath);
			jsonStr.put("fileName", ossFullFileName);
			jsonStr.put("result", SUCCESS_ONE);
			writeJson(jsonStr.toString(), request, response);
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static String uploadByRequest(HttpServletRequest request, String ossDirectoryName, String serverPath){
		String ossFullFileName = "";
		try {
			//文件全路径
			String fullPathName;
			//文件名字
			String fileName;
			File realPathDirectory = new File(serverPath);
			if (realPathDirectory == null || !realPathDirectory.exists()) {
				realPathDirectory.mkdirs();
			}
			// 创建一个通用的多部分解析器
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession()
					.getServletContext());

			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();
				while (iter.hasNext()) {
					// 记录上传过程起始时的时间，用来计算上传时间
					// int pre = (int) System.currentTimeMillis();
					// 取得上传文件
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null) {
						// 取得当前上传文件的文件名称
						String myFileName = file.getOriginalFilename();
						// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
						if (myFileName.trim() != "") {
							// 获得图片的原始名称
							String originalFilename = file.getOriginalFilename();
							if (originalFilename.lastIndexOf(".") == -1) {
								continue;
							}
							// 获得图片后缀名称,如果后缀不为图片格式，则不上传
							String suffix = originalFilename.substring(originalFilename.lastIndexOf("."))
									.toLowerCase();
							if (!ImageUploadUtil.fileTypes.contains(suffix)) {
								continue;
							}

							fileName = DateUtils.format(new Date(), DateUtils.FORMAT_TIME_FULL_MILLI) + suffix;
							fullPathName = serverPath + fileName;
							ImageUploadUtil.upload(file, fullPathName);
							ossFullFileName = ossDirectoryName + fileName;
							OssClient.uploadObject(fullPathName, ossFullFileName);
							ImageUploadUtil.delete(fullPathName);
						}
					}
				}
			}
		}catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ossFullFileName;
	}

}
