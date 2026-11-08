package org.example;

public class InvalidRestaurantDataException extends RuntimeException {
    public InvalidRestaurantDataException(String message)
    {
        super(message);
    }
}
