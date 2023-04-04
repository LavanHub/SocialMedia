package com.social.media.user.UserService.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.social.media.user.UserService.Models.Response;
import com.social.media.user.UserService.Utils.Constants;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class UserServiceExceptionHandler {
	
	@ExceptionHandler({RegistrationException.class})
	public ResponseEntity<Object> handleRegistrationException(final RegistrationException ex) {
		log.error(ex.getMessage(), ex);
		Response response = new Response(Constants.FAILURE_STATUS, ex.getMessage(), ex);
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
}
