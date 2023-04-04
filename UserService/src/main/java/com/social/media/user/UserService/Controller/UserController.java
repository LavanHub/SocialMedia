package com.social.media.user.UserService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.user.UserService.JPAEntities.User;
import com.social.media.user.UserService.Models.Response;
import com.social.media.user.UserService.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("")
	public ResponseEntity<Response> registerUser(@RequestBody User user) {
		user = userService.registerUser(user);
		Response response = new Response("Success", "You have registered successfuly!", user);
		return new ResponseEntity<Response>(response, HttpStatus.CREATED);
	}
}
