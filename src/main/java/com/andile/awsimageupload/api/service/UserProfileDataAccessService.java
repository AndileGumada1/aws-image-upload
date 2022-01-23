package com.andile.awsimageupload.api.service;

import com.andile.awsimageupload.datastore.FakeUserProfileDataStore;
import com.andile.awsimageupload.model.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStore fakeUserProfileDataStore;

    /**
     * @return
     */
    List<UserProfile> getUserProfiles(){
        return fakeUserProfileDataStore.getUserProfiles();
    }
}
