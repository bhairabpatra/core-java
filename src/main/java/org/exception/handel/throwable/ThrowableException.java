package org.exception.handel.throwable;

public class ThrowableException extends Exception{
    ThrowableException(String message, Throwable cause){
        super(message,cause);
    }
}
