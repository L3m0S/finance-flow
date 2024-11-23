package com.lemori.finance_flow.application.exceptions;

import com.lemori.finance_flow.domain.exceptions.user.UserEmailAlreadyRegisteredException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionEntityHandler {

    @ExceptionHandler(UserEmailAlreadyRegisteredException.class)
    public ResponseEntity handleEventNotFound(UserEmailAlreadyRegisteredException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }
}