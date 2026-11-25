package com.example.pharmassist.exceptionhandler;

public class AdminAlreadyHasPharmacyException extends RuntimeException {

    public AdminAlreadyHasPharmacyException(String message) {
        super(message);
    }
}