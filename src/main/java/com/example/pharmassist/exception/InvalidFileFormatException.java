package com.example.pharmassist.exception;

public class InvalidFileFormatException extends RuntimeException {
	
	private String message;

	public InvalidFileFormatException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	

}
