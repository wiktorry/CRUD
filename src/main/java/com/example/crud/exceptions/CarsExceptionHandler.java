package com.example.crud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CarsExceptionHandler {
    @ExceptionHandler(value = {CarNotFoundException.class, InvalidCarException.class})
    public ResponseEntity<Object> handleCarException(RuntimeException exc){
        if(exc instanceof CarNotFoundException){
            CarsExceptionResponse exception = new CarsExceptionResponse(exc.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
            return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
        }
        if(exc instanceof InvalidCarException) {
            CarsExceptionResponse exception = new CarsExceptionResponse(exc.getMessage(), HttpStatus.BAD_REQUEST.value(), System.currentTimeMillis());
            return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
        }
        CarsExceptionResponse exception = new CarsExceptionResponse(exc.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), System.currentTimeMillis());
        return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
