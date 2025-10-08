package com.code.java.practice.string;

public class StringCheckEmptyOrBlank {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = " ";
        //Returns: true if length() is 0, otherwise false
        System.out.println(s1.isEmpty()); //true
        System.out.println(s2.isEmpty());//false
        //Returns true if the string is empty or contains only
        // white space codepoints, otherwise false.
        System.out.println(s1.isBlank());//true
        System.out.println(s2.isBlank());//true
    }
}
