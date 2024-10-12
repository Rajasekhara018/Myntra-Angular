package com.myntra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)	
public class UserNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public UserNotFound(String message) {
		super(message);
		this.message = message;
	}

	
//	Users user = repo.findById(id).orElseThrow( ( ) -> new UserNotFound(String.fromat("user id %d not found",userid)))
}
