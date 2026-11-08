package org.example;

public class RestaurantNotFoundException extends RuntimeException {
    private String name;
    public RestaurantNotFoundException(String message) {
        super(message);
        this.name = name;
    }
    public String getName() { return name; }
}
