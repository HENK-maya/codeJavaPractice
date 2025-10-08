package com.code.java.practice.mislenious;

import java.util.Stack;

public class BalancedBrakets {
    public static void main(String[] args) {
        String str = "({}[])";
        if(isBalanced(str)){
            System.out.println("Brakets are balanced.");
        }else{
            System.out.println("Brakets are not balanced.");
        }
    }

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch ==']'){
                if(stack.isEmpty())
                    return false;
                char start = stack.pop();
                if(!matches(start,ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean matches(char start, char close){
        return (start == '(' && close == ')' ||
                start == '{' && close == '}' ||
                start == '[' && close == ']');
    }
}
