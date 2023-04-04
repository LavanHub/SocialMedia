package com.social.media.user.UserService.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RegistrationException extends RuntimeException {
	
	@java.io.Serial
    static final long serialVersionUID = -7034897190745766939L;
	
	public RegistrationException(String message) { super(message); }
}
