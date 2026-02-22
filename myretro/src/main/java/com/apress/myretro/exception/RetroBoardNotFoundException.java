package com.apress.myretro.exception;

public class RetroBoardNotFoundException extends RuntimeException {
    public RetroBoardNotFoundException(){
        super("RetroBoard Not Found");
    }
    // replaced "{}" with "%s" as argument convention for String.format() requires
    public RetroBoardNotFoundException(String message) {
        super(String.format("RetroBoard Not Found: %s", message));
    }

    // replaced "{}" with "%s" as well
    public RetroBoardNotFoundException(String message, Throwable cause) {
        super(String.format("RetroBoard Not found: %s", message), cause);
    }
}
