package com.code.java.practice.mislenious;

public class FindPairForTargetValue {
    public static void main(String[] args) {
        int[] arr = {8,2,6,4,7,9,1};
        int target = 10;
        findThePair(arr, target);
    }

    public static void findThePair(int[] arr , int target){
        for(int i =0;i <= arr.length-1;i++){
           // System.out.println(i);
            for(int j=i+1;j<arr.length;j++){
              //  System.out.println("j"+j);
                if(arr[i] + arr[j]==target){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}
