package com.code.java.practice.mislenious;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstOccuranceOfChar {
    public static void main(String[] args) {
        String str = "aaAAABBbbbCccc";
        StringBuilder builder = new StringBuilder();
        builder.append(str.charAt(0));
        for(int i = 0; i < str.length()-1 ;i ++){
            if(!str.valueOf(str.charAt(i)).equals(str.valueOf(str.charAt(i+1)))){
                builder.append(str.charAt(i+1));
            }
        }
        System.out.println(builder);
        System.out.println("using stream");
        String collect = IntStream.range(0, str.length() - 1)
                .filter(i -> !String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(i + 1))))
                .mapToObj(i -> String.valueOf(str.charAt(i + 1)))
                .collect(Collectors.joining("", String.valueOf(str.charAt(0)), ""));
        System.out.println(collect);

    }
}
