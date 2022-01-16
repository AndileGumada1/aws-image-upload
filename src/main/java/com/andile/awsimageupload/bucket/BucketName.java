package com.andile.awsimageupload.bucket;


public enum BucketName {

    PROFILE_IMAGE("andile-image-upload-123");

    private final String bucketName;

    /**
     * @param bucketName
     */
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    public String getBucketName() {
        return bucketName;
    }
}
