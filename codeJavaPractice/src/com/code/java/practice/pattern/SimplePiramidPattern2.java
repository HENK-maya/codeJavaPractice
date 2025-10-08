package com.code.java.practice.pattern;

public class SimplePiramidPattern2 {

    public static void main(String[] args) {
        int row = 4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j%2 != 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
