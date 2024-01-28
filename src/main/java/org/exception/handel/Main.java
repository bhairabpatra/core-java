package org.exception.handel;

import org.exception.handel.customexception.CheckAge;
import org.exception.handel.throwable.ThrowableException;
import org.exception.handel.throwable.checkProductExist;

public class Main {


    public void exceptionDemo() {
        ExceptionExample ex = new ExceptionExample(20, 10);
        System.out.println("The ex value is -> " + ex.val1);
        try {
            int result = ex.val1 / ex.val2;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ex.display(200, 10);
        ex.testException(10,0);
        CheckAge age = new CheckAge(30);
        age.checkAge();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.exceptionDemo();

    }
}
