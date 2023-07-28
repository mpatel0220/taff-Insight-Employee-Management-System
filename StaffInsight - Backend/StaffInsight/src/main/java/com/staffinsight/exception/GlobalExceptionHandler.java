package com.staffinsight.exception;

import com.staffinsight.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityExistsException.class)
    public ResponseEntity<ApiResponse<?>> entityExistsExceptionHandler(EntityExistsException exception) {
        return new ResponseEntity<>(
                ApiResponse.builder()
                        .status(2)
                        .message(exception.getMessage())
                        .build(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<ApiResponse<?>> classNotFoundExceptionHandler(ClassNotFoundException exception) {
        return new ResponseEntity<>(
                ApiResponse.builder()
                        .status(2)
                        .message(exception.getMessage())
                        .build(),
                HttpStatus.BAD_REQUEST);
    }

}
