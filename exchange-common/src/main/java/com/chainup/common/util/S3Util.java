package com.chainup.common.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class S3Util {

    private static String aws_access_key_id = PropertyUtil.getProperties("aws_access_key_id");
    private static String aws_secret_access_key = PropertyUtil.getProperties("aws_secret_access_key");
    private static String bucketName = PropertyUtil.getProperties("aws_bucketName");
    private static String endpoint = PropertyUtil.getProperties("aws_endpoint");
    private static AmazonS3 s3;

    static {

        AWSCredentials credentials = new BasicAWSCredentials(aws_access_key_id,aws_secret_access_key);
        ClientConfiguration configuration = new ClientConfiguration();
        configuration.setMaxConnections(20);
        configuration.setConnectionTimeout(10*1000);
        configuration.setMaxErrorRetry(5);
        configuration.setSocketTimeout(5*1000);
        configuration.setProtocol(Protocol.HTTP);
        //地区
        Region region = Region.getRegion(Regions.AP_NORTHEAST_1);

//        s3  = AmazonS3ClientBuilder.standard()
//                .withCredentials(new AWSStaticCredentialsProvider(credentials))
//                .withClientConfiguration(configuration)
//                .build();
//        s3.setEndpoint(endpoint);


        s3 = new AmazonS3Client(credentials,configuration);
        s3.setEndpoint(endpoint);
        s3.setRegion(region);
    }

    /**
     * 上传文件
     * @param file
     * @param keyName
     */
    public static void uploadObjectS3(MultipartFile file, String keyName) {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(file.getSize());
//        metadata.setContentType(file.getContentType());
        try {
            s3.putObject(new PutObjectRequest(
                    bucketName,
                    keyName,
                    file.getInputStream(),
                    metadata).withCannedAcl(CannedAccessControlList.PublicReadWrite)
            );
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     */
    public String uploade_object(){

        return "";
    }

    /**
     *  删除文件
     * @param keyName
     */
    public static void deleteObjectS3(String keyName){
        try {
            s3.deleteObject(bucketName,keyName);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    /**
     * 获取访问url
     * @param bucketName
     * @param remoteFileName
     * @return
     */
    public static String getFileUrl(String bucketName,String remoteFileName){
        GeneratePresignedUrlRequest urlRequest = new GeneratePresignedUrlRequest(bucketName, remoteFileName);
        URL url = s3.generatePresignedUrl(urlRequest);
        return url.toString();
    }


}
