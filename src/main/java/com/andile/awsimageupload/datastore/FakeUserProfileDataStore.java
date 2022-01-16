package com.andile.awsimageupload.datastore;

import com.andile.awsimageupload.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"andilegumada",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"siphodecember",null));
    }

    public  List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
