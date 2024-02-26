package org.exception.handel.singletondesignpattern;

public class LazySingletonDesignPattern {

    private static LazySingletonDesignPattern lazySingletonDesignPattern = null;

    private LazySingletonDesignPattern(){}

    public static synchronized LazySingletonDesignPattern getInstance(){
        if(lazySingletonDesignPattern == null){
            lazySingletonDesignPattern = new LazySingletonDesignPattern();
        }
        return lazySingletonDesignPattern;
    }
}

class Main3{
    public static void main(String[] args){
        LazySingletonDesignPattern l1 = LazySingletonDesignPattern.getInstance();
        LazySingletonDesignPattern l2 = LazySingletonDesignPattern.getInstance();
        if(l1 == l2){
            System.out.println("Both objects are same");
        }else {
            System.out.println("Both object are different");
        }
    }
}
