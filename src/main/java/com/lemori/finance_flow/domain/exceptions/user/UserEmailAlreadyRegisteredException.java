package com.lemori.finance_flow.domain.exceptions.user;

public class UserEmailAlreadyRegisteredException extends RuntimeException {
    public UserEmailAlreadyRegisteredException(String message) {
        super(message);
    }
}
