package com.social.media.user.UserService.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.user.UserService.JPAEntities.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("")
	public User registerUser(@RequestBody User user) {
		return user;
	}
}
