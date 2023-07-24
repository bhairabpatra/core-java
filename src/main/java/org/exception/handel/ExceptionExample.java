package org.exception.handel;

public class ExceptionExample {
    public String name ="Bhairab patra";
    public int val1 , val2;
    public ExceptionExample(int val1, int val2 ) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public void display(int val1, int val2){
        System.out.println("This is exception class");
        try {
            int result = val1 / val2;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is exception class finally block");
        }
    }
}
