package org.exception.handel.wrapper;
public class WrapperDemo {
    public int age = 10;
    public void primitiveToWrapper() {
        Integer value = Integer.valueOf(age); // Manual boxing
        System.out.println("value is " + value);
    }

    public void wrapperToPrimitive() {
        int num = 100;
        Integer obj = Integer.valueOf(num);  // Manual boxing

        // Using the Integer object
        System.out.println("Value of Integer object obj: " + obj);

        // Unboxing the Object to primitive
        int num2 = obj.intValue();
        System.out.println("Value of Integer object obj: " + num2);
    }

    public static void main(String[] args) {
        WrapperDemo wrapperDemo = new WrapperDemo();
        wrapperDemo.primitiveToWrapper();
        wrapperDemo.wrapperToPrimitive();
    }
}
