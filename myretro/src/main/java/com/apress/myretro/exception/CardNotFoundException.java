package com.apress.myretro.exception;

public class CardNotFoundException extends RuntimeException {
    public CardNotFoundException(){
        super("Card Not Found");
    }

    // Better use the format with "%s" rather than format("Whatever: {}", message)
    public CardNotFoundException(String message){
        super(String.format("Card Not Found: %s", message));
    }

    public CardNotFoundException(String message, Throwable cause){
        super(String.format("Card Not Found: %s", message), cause);
    }
}
