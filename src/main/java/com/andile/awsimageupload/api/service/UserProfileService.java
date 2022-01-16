package com.andile.awsimageupload.api.service;

import com.andile.awsimageupload.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    /**
     * method used to get the list of user profile
     * @return List objects
     */
    public List<UserProfile> getUserProfile() {
        return userProfileDataAccessService.getUserProfiles();
    }

    /**
     * method used for uploading the profile image
     * @param userProfileId
     * @param file
     */
    public void uploadProfileImage(UUID userProfileId, MultipartFile file) {
        //todo : list of todos
        //1. Check if image is not empty
        // if file is an image
        // user exits in the database
        //grab metadata from the file if any
        //store the image in s3 an update the data with s3 image link
    }
}
