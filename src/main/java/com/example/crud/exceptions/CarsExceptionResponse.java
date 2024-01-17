package com.example.crud.exceptions;

public class CarsExceptionResponse {
    private final String message;
    private final int status;
    private final long timeStamp;

    public CarsExceptionResponse(String message, int status, long timeStamp) {
        this.message = message;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

}
