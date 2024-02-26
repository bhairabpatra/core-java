package org.exception.handel.string;

public class StringDemo {

    public void reverseString(){

        String name=new String("bhairab");
//        System.out.println(name[5]);
//        StringBuffer stringBuffer = new StringBuffer(name);
//        System.out.println(stringBuffer.reverse());
        StringBuffer stringBuffer = new StringBuffer();
        for(int i= name.length() - 1  ; i> 0 ; i--){

            stringBuffer.append(name.charAt(i));
        }
        System.out.println(stringBuffer);

    }

    public static void main(String[] args){
//        System.out.println("This si string");
//        String s = new String("Bhairab");
//        s.concat("patra");
//        System.out.println(s.concat("patra").hashCode());
//        System.out.println(s.toUpperCase().hashCode());
//        System.out.println(s.hashCode());
//
//        StringBuffer stringBuffer = new StringBuffer("Bhairab");
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.hashCode());
//        stringBuffer.append("patra");
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.hashCode());

        StringDemo stringDemo = new StringDemo();
        stringDemo.reverseString();
    }
}
