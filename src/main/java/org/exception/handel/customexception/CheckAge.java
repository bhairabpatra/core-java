package org.exception.handel.customexception;

public class CheckAge {
    public int age;

    public CheckAge(int age) {
        this.age = age;
    }

    public void checkAge() {
        try {
            if (isValidNumber(this.age)) {
                try {
                    if (this.age > 18) {
                        System.out.println("Candidate can vote");
                    } else {
                        throw new AgeValidateException();
                    }

                } catch (AgeValidateException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        } catch (NumberFormatException | AgeValidateException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isValidNumber(Object age) throws AgeValidateException  {
        if (age instanceof Integer) {
            return true;
        } else {
            throw new AgeValidateException("The input is not a valid number for age");
        }
    }
}
