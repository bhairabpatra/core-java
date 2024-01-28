package org.exception.handel.customexception;

public class AgeValidateException extends Exception {

    AgeValidateException() {
        super("The input is not a valid number for age");
    }

    AgeValidateException(String message) {
        super(message);
    }

}
