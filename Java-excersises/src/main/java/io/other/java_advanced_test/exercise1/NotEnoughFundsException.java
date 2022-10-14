package io.other.java_advanced_test.exercise1;

public class NotEnoughFundsException extends RuntimeException{
    public NotEnoughFundsException(String errorMessage) {
        super(errorMessage);
    }
}

