package com.andile.awsimageupload.filestore;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FileStore {

    private final AmazonS3 amazonS3;

    /**
     * @param path
     * @param fileName represents the name of the file to be uploaded
     * @param optionalMetadata
     * @param inputStream
     */
    public void save(String path,
                     String fileName,
                     Optional<Map<String,String>> optionalMetadata,
                     InputStream inputStream){
        ObjectMetadata metadata = new ObjectMetadata();
        optionalMetadata.ifPresent(map -> {
            if (!map.isEmpty()){
                map.forEach(metadata::addUserMetadata);
            }
        });
        try {
            amazonS3.putObject(path,fileName,inputStream,metadata);
        }catch (AmazonServiceException e){
            throw new IllegalStateException("Failed to store file to S3",e);
        }
    }
}
