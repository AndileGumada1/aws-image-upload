package com.andile.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    /**
     * method create an amazonS3 object with aws credentials
     * @return AmazonS3 object
     **/
    @Bean
    public AmazonS3 amazonS3(){
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "AKIA4PHKXPNVC6BA5KGH" ,
                "pzpmLa/WVRDBKCf9acQqJYzdebaMyPs/69gMAxeA"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("US East (Ohio) us-east-2")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
