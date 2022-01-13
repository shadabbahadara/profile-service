package com.reliance.profile.service;

import java.util.List;

import com.reliance.profile.model.Profile;

public interface ProfileService {
	
	List<Profile> getProfiles();

	Profile getProfile(Integer id);
	
	Profile createProfile(Profile profile);
	
	Profile updateProfile(Integer id, Profile profile);
	
	void deleteProfile(Integer id);

}
