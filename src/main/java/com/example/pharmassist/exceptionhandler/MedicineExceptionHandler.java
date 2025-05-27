package com.example.pharmassist.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.pharmassist.exception.InvalidDataException;
import com.example.pharmassist.exception.InvalidDateFormatException;
import com.example.pharmassist.exception.InvalidFileFormatException;
import com.example.pharmassist.util.AppResponseBuilder;
import com.example.pharmassist.util.ErrorStructure;

import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class MedicineExceptionHandler {
	
	private final AppResponseBuilder responseBuilder;

	public MedicineExceptionHandler(AppResponseBuilder responseBuilder) {
		super();
		this.responseBuilder = responseBuilder;
	}

	@ExceptionHandler(InvalidDataException.class)
	public static <T> ResponseEntity<ErrorStructure<String>> handleInvalidData(InvalidDataException ex) {
		return AppResponseBuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(),"Data Is Invalid");
	}

	@ExceptionHandler(InvalidDateFormatException.class)
	public static <T> ResponseEntity<ErrorStructure<String>> handleInvalidDateFormat(InvalidDateFormatException ex) {
		return AppResponseBuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(),"Date Format is Invalid");
	}

	@ExceptionHandler(InvalidFileFormatException.class)
	public static <T> ResponseEntity<ErrorStructure<String>> handleInvalidFileFormat(InvalidFileFormatException ex) {
		return AppResponseBuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(),"File Format is Inavlid");
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public static <T> ResponseEntity<ErrorStructure<String>> handleConstraintViolationException(ConstraintViolationException ex) {
		return AppResponseBuilder.error(HttpStatus.BAD_REQUEST, ex.getMessage(),"Invalid Data Format");
	}


}
