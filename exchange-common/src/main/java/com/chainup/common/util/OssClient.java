package com.chainup.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.InputStream;


import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;

import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;

public class OssClient {

    private static String accessKeyId = PropertyUtil.getProperties("accessKeyId");;
    private static String accessKeySecret = PropertyUtil.getProperties("accessKeySecret");
    private static String endpoint = PropertyUtil.getProperties("endpoint");
    private static String bucketName = PropertyUtil.getProperties("bucketName");
    
    private static OSSClient _ossClient;
    public static OSSClient get_ossClient() {
		return _ossClient;
	}

	static {
        ClientConfiguration conf = new ClientConfiguration();
        // 设置HTTP最大连接数为20
        conf.setMaxConnections(20);
        // 设置TCP连接超时为5000毫秒
        conf.setConnectionTimeout(5000);
        // 设置最大的重试次数为5
        conf.setMaxErrorRetry(5);
        // 设置Socket传输数据超时的时间为5000毫秒
        conf.setSocketTimeout(5000);
        _ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret, conf);
    }

    /**
     * 上传到阿里云OSS空间
     * 此方法只负责从服务器上传至阿里OSS
     *
     * @param originFullPath  文件在服务器的全路径：/home/work/temp/11111.jpg
     * @param fileName        上传到OSS后，访问路径：upload/11111.jpg
     * @throws FileNotFoundException
     */
    public static void uploadObject(String originFullPath, String fileName)
            throws FileNotFoundException {
        File file = new File(originFullPath);
        InputStream content = new FileInputStream(file);
        ObjectMetadata meta = new ObjectMetadata();
        // 必须设置ContentLength
        meta.setContentLength(file.length());
        // 上传Object.
        PutObjectResult result = _ossClient.putObject(bucketName, fileName, content,
                meta);
    }

    /**
     * 删除阿里云OSS的文件
     * @param fileName 访问路径：upload/11111.jpg
     * @throws FileNotFoundException
     */
    public static void deleteObject(String fileName) throws FileNotFoundException {

        _ossClient.deleteObject(bucketName, fileName);
    }

    public static void uploadObject(InputStream stream, long filelength,
            String path) throws FileNotFoundException {
        InputStream content = stream;
        ObjectMetadata meta = new ObjectMetadata();
        // 必须设置ContentLength
        meta.setContentLength(filelength);
        // 上传Object.
        PutObjectResult result = _ossClient.putObject(bucketName, path, content,
                meta);
    }
    public static void uploadImg(InputStream stream, long filelength,
                                    String path, String contentType) throws FileNotFoundException {
        InputStream content = stream;
        ObjectMetadata meta = new ObjectMetadata();
        // 必须设置ContentLength
        meta.setContentLength(filelength);
        meta.setContentType(contentType);
        // 上传Object.
        PutObjectResult result = _ossClient.putObject(bucketName, path, content,
                meta);
    }

    public static void main(String[] args) {
        try {
            /*File file = new File("E:\\image\\upload\\20171025233130486.jpg");
            uploadObject(file,"upload/aaa.jpg");*/
            deleteObject("upload/aaa.jpg");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }




}
