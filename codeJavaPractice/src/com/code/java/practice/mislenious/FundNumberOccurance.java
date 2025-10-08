package com.code.java.practice.mislenious;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundNumberOccurance {
    public static void main(String[] args) {
        int arr[] = {2,5,2,8,5,6,8,8};
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int num : arr){
            list.add(num);
            map.putIfAbsent(num,new ArrayList<>());
            map.get(num).add(num);
        }
        map.forEach((key, val) -> {
            if(val.size()>1){
                result.addAll(val);
            }
        });
        System.out.println(result);
    }
}
