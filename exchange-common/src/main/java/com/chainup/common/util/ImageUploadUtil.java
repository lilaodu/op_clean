package com.chainup.common.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public class ImageUploadUtil {
	
	// 图片类型
    public static List<String> fileTypes = new ArrayList<String>();

    static {
        fileTypes.add(".jpg");
        fileTypes.add(".jpeg");
        fileTypes.add(".bmp");
        fileTypes.add(".gif");
        fileTypes.add(".png");
    }
    
    /**
     * 图片上传
     * 
     * @Title upload
     * @param file
     * @param fullPathName 文件全路径：/home/work/temp/xxx.jpg
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    public static void upload(MultipartFile file, String fullPathName) throws IllegalStateException, IOException {
        if (file != null) {
            File uploadFile = new File(fullPathName);
            file.transferTo(uploadFile);
        }
    }
    public static void delete(String fullPathName) throws IllegalStateException, IOException {
        if (fullPathName != null) {
            File file = new File(fullPathName);
            file.delete();
        }
    }

}
