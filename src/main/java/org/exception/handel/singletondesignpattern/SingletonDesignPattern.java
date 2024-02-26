package org.exception.handel.singletondesignpattern;

public class SingletonDesignPattern {

    private static SingletonDesignPattern singletonDesignPattern = new SingletonDesignPattern();

    private SingletonDesignPattern(){}

    public static SingletonDesignPattern getInstance(){
                return singletonDesignPattern;
    }
}

class Main{
    public static void main(String[] args){
           SingletonDesignPattern sdp1 = SingletonDesignPattern.getInstance();
           SingletonDesignPattern sdp2= SingletonDesignPattern.getInstance();
           if(sdp1 == sdp2){
               System.out.println("Both objects are same");
           }else {
               System.out.println("Both object are different");
           }
    }
}