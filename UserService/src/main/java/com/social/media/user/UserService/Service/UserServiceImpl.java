package com.social.media.user.UserService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.user.UserService.Exceptions.RegistrationException;
import com.social.media.user.UserService.JPAEntities.User;
import com.social.media.user.UserService.JPARepositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		User exists = userRepository.findByEmailAddress(user.getEmailAddress());
		if(exists != null) {
			throw new RegistrationException("Looks you have an account already.");
		}
		user = userRepository.save(user);
		return user;
	}

}
