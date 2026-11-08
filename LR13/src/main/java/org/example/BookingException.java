package org.example;

public class BookingException extends RuntimeException {
    private int requested;
    private int available;
    public BookingException(String message, int requested, int available) {
        super(message);
        this.requested = requested;
        this.available = available;
    }
    public int getRequested() { return requested; }
    public int getAvailable() { return available; }
}
