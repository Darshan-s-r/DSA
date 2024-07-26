package LeetCode;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvalRPN {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String []  {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":  stack.push(num1 / num2);
                        break;
                    default:
                        // Handle unexpected tokens (optional)
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

}
