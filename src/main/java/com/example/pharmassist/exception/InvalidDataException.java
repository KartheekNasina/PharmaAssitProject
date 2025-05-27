package com.example.pharmassist.exception;

public class InvalidDataException extends RuntimeException {
	
	private String message;

	public InvalidDataException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	

}
