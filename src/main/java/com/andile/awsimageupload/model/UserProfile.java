package com.andile.awsimageupload.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@AllArgsConstructor
@EqualsAndHashCode
@Data
public class UserProfile {
    private UUID userProfileId;
    private String username;
    private String userProfileImageLink;//S3 key

}
