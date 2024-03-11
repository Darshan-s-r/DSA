package StacksAndQueues.Quetions;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
    }
    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
               if(ch == ')'){
                   if(stack.isEmpty() || stack.pop() != '('){
                       return false;
                   }
               }
               if(ch == '}'){
                   if(stack.isEmpty() || stack.pop() != '{'){
                       return false;
                   }
               }
               if(ch == ']'){
                   if(stack.isEmpty() || stack.pop() != '['){
                       return false;
                   }
               }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
