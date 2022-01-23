package com.andile.awsimageupload.api.service;

import com.andile.awsimageupload.model.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

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
     * @param file represents the file object to be uploaded
     */
    public void uploadProfileImage(UUID userProfileId, MultipartFile file) {
        //todo : list of todos
        //todo :Check if image is not empty
        //todo : if file is an image
        //todo: user exits in the database
        //todo grab metadata from the file if any
        //todo store the image in s3 an update the data with s3 image link
    }
}
