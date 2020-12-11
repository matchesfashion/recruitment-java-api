package com.matchesfashion.papi.exceptions;

public class NoItemFoundException extends RuntimeException {

    public NoItemFoundException(String message){
        super(message);
    }
}
