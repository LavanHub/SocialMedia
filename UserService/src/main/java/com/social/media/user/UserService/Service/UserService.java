package com.social.media.user.UserService.Service;

import org.springframework.stereotype.Service;

import com.social.media.user.UserService.JPAEntities.User;

public interface UserService {
	
	public User registerUser(User user);
	
}
