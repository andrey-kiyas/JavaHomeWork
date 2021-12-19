package com.pb.andrejkijas.hw11.exception;

public class InvalidPhoneNumberException extends Exception{
    private String message;

    public InvalidPhoneNumberException(String message) {
        this.message = message;
    }
}