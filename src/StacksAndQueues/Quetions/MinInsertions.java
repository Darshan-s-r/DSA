package StacksAndQueues.Quetions;

import java.util.Stack;

////////////////NOT CORECT
class MinInsertions {
    public static void main(String[] args) {
        System.out.println(minInsertions("))())(")); //   ))())(
    }
////////////NOT CORECT//
    static public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (stack.isEmpty()) {
                    count += count + 2;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        count++;
                    } else {
                        stack.pop();
                    }
                }
            } else {
                stack.push(ch);
            }
        }
        int size = stack.size();
return stack.size();
    }
}