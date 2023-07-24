package org.exception.handel.customexception;

public class AgeValidateException extends Exception {

    public String errMessage;

    AgeValidateException() {
        super("Age is not valid");
    }

    AgeValidateException(String message) {
        super(message);
    }

}
