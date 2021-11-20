package com.pb.andrejkijas.hw8.exception;

public class WrongPasswordException extends Throwable {
    public WrongPasswordException(String password) {
        super(password);
    }

    public WrongPasswordException() {
        super();
    }
}
