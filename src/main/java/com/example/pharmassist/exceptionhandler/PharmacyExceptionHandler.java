package com.example.pharmassist.exceptionhandler;

import com.example.pharmassist.exception.DuplicateGstNumberException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.pharmassist.exception.AdminNotFoundByIdException;
import com.example.pharmassist.exception.PharmacyNotFoundByIdException;
import com.example.pharmassist.util.AppResponseBuilder;
import com.example.pharmassist.util.ErrorStructure;

@RestControllerAdvice
public class PharmacyExceptionHandler {
	private final AppResponseBuilder appResponseBuilder;

	public PharmacyExceptionHandler(AppResponseBuilder appResponseBuilder)	{
		super();
		this.appResponseBuilder = appResponseBuilder;
	}

	@ExceptionHandler(PharmacyNotFoundByIdException.class)
	public static <T> ResponseEntity<ErrorStructure<String>> handlePharmacyNotFoundById(PharmacyNotFoundByIdException ex) {
		
		return AppResponseBuilder.error(HttpStatus.NOT_FOUND, ex.getMessage(),"Pharmacy not found by Id");

	}

	@ExceptionHandler(DuplicateGstNumberException.class)
	public ResponseEntity<ErrorStructure<String>> handleDuplicateGstNumber(
			DuplicateGstNumberException ex) {

		return AppResponseBuilder.error(
				HttpStatus.CONFLICT,
				ex.getMessage(),
				"Duplicate GST number"
		);
	}

	@ExceptionHandler(AdminAlreadyHasPharmacyException.class)
	public ResponseEntity<ErrorStructure<String>> handleAdminAlreadyHasPharmacy(
			AdminAlreadyHasPharmacyException ex) {

		return AppResponseBuilder.error(
				HttpStatus.CONFLICT,
				ex.getMessage(),
				"Admin already has a pharmacy"
		);
	}
	

}
