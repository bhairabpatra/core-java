package org.exception.handel;

import org.exception.handel.customexception.CheckAge;
import org.exception.handel.throwable.ThrowableException;
import org.exception.handel.throwable.checkProductExist;
public class Main {
    public static void main(String[] args) throws ThrowableException {
        System.out.println("Hello world!");
        ExceptionExample ex = new ExceptionExample(20, 5);
        try {
            int result = ex.val1 / ex.val2;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ex.display(200, 0);

        CheckAge age = new CheckAge(22);
        age.checkAge();

        checkProductExist pro = new checkProductExist();

        boolean result = pro.checkValidProduct("mobile");
        try {
            if (result) {
                System.out.println("Product exist");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
