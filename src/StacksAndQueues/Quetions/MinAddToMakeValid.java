package StacksAndQueues.Quetions;

import java.util.Stack;

class MinAddToMakeValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((()))(")); // ))())(
    }
   static public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.add(ch);
                }
            }
            else{
                stack.add(ch);
            }
        }
        return stack.size();
    }
}