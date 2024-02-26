package org.exception.handel.singletondesignpattern;

public class StaticSingletonDesignPattern {
    private static StaticSingletonDesignPattern singletonDesignPattern = null;

    private StaticSingletonDesignPattern(){}
    static {
        try {
            singletonDesignPattern = new StaticSingletonDesignPattern();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static StaticSingletonDesignPattern getInstance(){
        return singletonDesignPattern;
    }
}
class Main2{
    public static void main(String[] args){
        StaticSingletonDesignPattern sdp1 = StaticSingletonDesignPattern.getInstance();
        StaticSingletonDesignPattern sdp2= StaticSingletonDesignPattern.getInstance();
        if(sdp1 == sdp2){
            System.out.println("Both objects are same");
        }else {
            System.out.println("Both object are different");
        }
    }
}
