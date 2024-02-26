package org.exception.handel.string;

import java.util.Arrays;
import java.util.List;

public class StringPrograms {

    public String name = "bhairab patra";
    public String originalValue ;
    public void test(){
        //reverse a string -1
        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println(stringBuffer.reverse());
System.out.println(stringBuffer.toString());
        StringBuffer sb = new StringBuffer();
        for(int i = name.length() - 1 ; i >= 0 ; i--){
            sb.append(name.charAt(i));
        }
        System.out.println(sb);
    }

    public void isPalindrome(String pal){
         originalValue = pal;
        StringBuffer sb = new StringBuffer(pal);
        String newValue = String.valueOf(sb.reverse());
        if(newValue.equals(originalValue)){
            System.out.println("This is palindrome " + pal);
        }else {
            System.out.println("This is not palindrome " + pal);
        }

    }

    public void countVowelsAndConsonants(){
        String test = "Check Palindrome";
        List<Character> vowel = Arrays.asList('a','e','i','o','u');
        int v = 0;
        int c =0;
        for(int i =0 ; i < test.length() ; i++){
            int finalI = i;
            if(vowel.stream().anyMatch(x -> x.equals(test.toLowerCase().charAt(finalI)))){
                v ++;
            }else {
                c++;
            }
        }
        System.out.println("Length of the string -> " + test.length());
        System.out.println("Vowels -> " + v);
        System.out.println("Consonants -> " + c);

    }

    public static void main(String[] args){
        StringPrograms stringPrograms = new StringPrograms();
        stringPrograms.test();
        stringPrograms.countVowelsAndConsonants();
//        stringPrograms.isPalindrome("madam");
    }
}
