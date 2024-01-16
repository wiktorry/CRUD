package com.example.crud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CarExceptionHandler {
    @ExceptionHandler(value = {CarException.class})
    public ResponseEntity<Object> handleCarException(CarException exc){
        CarExceptionResponse exception = new CarExceptionResponse(exc.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }
}
