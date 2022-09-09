package com.flightofdream.calculator;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String message) {
        super(message);
    }
}
