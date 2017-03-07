package com.imaginea.spring.webservices.dataUtility;

/**
 * Created by satyad on 30/12/16.
 */
public class CustomException extends Exception {
    public CustomException(String message, Throwable exception) {
        super(message, exception);
    }
}
