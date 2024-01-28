package org.exception.handel.throwable;

public class ThrowableException extends RuntimeException {

    public ThrowableException() {
    }

    public ThrowableException(String message, Throwable cause) {
        super(message, cause.getCause());
    }

    public ThrowableException(Throwable cause) {
        super(cause.getMessage());
    }

}
