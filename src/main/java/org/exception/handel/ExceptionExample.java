package org.exception.handel;

public class ExceptionExample {
    public String name ="Bhairab patra";
    public int val1 , val2;
    public ExceptionExample(int val1, int val2 ) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public void display(int val1, int val2){
        try{
            int result = val1 / val2;
            System.out.println(result);
            String[] arr  = new String[3];
            arr[0] ="Test1";
            arr[1]="test2";
            arr[2] ="tesr5";
            System.out.println("The value of array" + arr[2]);
        }
        catch (ArithmeticException | NumberFormatException e){

            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("The error message is " + exception);
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("This is exception class finally block");
        }
    }
    public void testException(int numerator , int denominator){

        try {
            // Perform division operation within try block
            if (denominator != 0) {
                int result = numerator / denominator;
                System.out.println("Result of division: " + result);
            } else {
                // If denominator is zero, throw ArithmeticException
                throw new ArithmeticException("Denominator cannot be zero");
            }
        } catch (ArithmeticException e) {
            // Catch ArithmeticException and handle it
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Optional finally block for cleanup or additional actions
            System.out.println("Inside finally block");
        }
    }
}
