package com.pb.andrejkijas.hw8.exception;

public class WrongLoginException extends Throwable {
    public WrongLoginException(String login) {
        super(login);
    }

    public WrongLoginException() {
        super();
    }
}
