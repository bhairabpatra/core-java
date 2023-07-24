package org.exception.handel.customexception;

public class CheckAge {
    public int age;

    public CheckAge(int age) {
        this.age = age;
    }

    public void checkAge() {
        if (isValidNumber(this.age)) {
            if (this.age > 18) {
                System.out.println("Candidate can vote");
            } else {
                System.out.println("Candidate can not vote");
                try {
                    throw new AgeValidateException("This not valid age");
                } catch (AgeValidateException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
    }

    public boolean isValidNumber(int age) {
        try {
            if ((int) age == age) {
                return true;
            } else throw new AgeValidateException("This not a number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
