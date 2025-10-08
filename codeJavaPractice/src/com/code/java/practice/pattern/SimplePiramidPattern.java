package com.code.java.practice.pattern;

public class SimplePiramidPattern {

    public static void main(String[] args) {
        int row = 5;
        for(int i = 1; i <= row ;i++){ //Outer loop controls number of lines
            for(int j = 1 ; j <= i ; j++){ //Inner loop controls numbers in each lines
                if(j % 2 != 0){ //If column is odd (1,3,5...)
                    System.out.print("1 ");
                }else { //If column is even (2,4,6...)
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println("*******************************************");
        //for middle triangle

        for (int i = 1; i <= row; i++){
            for(int j =1; j <=row ;j++){
                if(i == 1 || i == row){
                    System.out.print((j %2 !=0 ? "1 " : "0 "));
                }else if(j ==1 || j == row){
                    System.out.print("1 ");
                }else if(j==i || j == (row-i+1)){
                    System.out.print("0 ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }




    }
}
