package StacksAndQueues;

import java.util.*;

public class Main {
    public static void main(String[] args) throws StackException, Exception{
//        Stack<Integer> stack = new Stack<>();
//        stack.add(10);
//        stack.add(20);
//        stack.add(30);
//        stack.add(40);
//        stack.add(50);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        /////////////////////////////////////////////
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        queue.clear();
//        queue.peek();

//        /////////////////////////////////////////
//        Deque<Integer> deque = new LinkedList<>();
//        deque.add(89);
//        deque.addLast(78);
//        deque.addFirst(33);
//        System.out.println(deque.remove());
//        System.out.println(deque.removeLast());
//
//        Deque<Integer> deque1 = new ArrayDeque<>();
//        deque1.add(33);
//        System.out.println(deque1.removeLast());
//        ArrayList<Integer> list = new ArrayList<>();

//        CustomStack<Integer> stack = new CustomStack<>(5);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        ///////////////////////////
//        CustomStack<Integer> stack = new DynamicStack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
////        System.out.println(stack.pop());
//////////////////////Queue main///////////////////
//        CustomQueue<Integer> queue = new CustomQueue<>(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        System.out.println( queue.dequeue());
//
//        queue.display();
//        queue.enqueue(99);
//        queue.display();
//
//        System.out.println( queue.dequeue());
//        System.out.println( queue.dequeue());
//        System.out.println( queue.dequeue());
//        System.out.println( queue.dequeue());

        ///////////////////////////////////////////

        CircularQueue<Integer> queue = new DynamicQueue<>(5);
        queue.enqueue(10);
//        System.out.println(queue.dequeue());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println( queue.dequeue());
//
//        System.out.println( queue.dequeue());
////        queue.display();
        queue.enqueue(99);
        queue.enqueue(1000);
        queue.display();
//
//        System.out.println( queue.dequeue());
//        System.out.println( queue.dequeue());
//        System.out.println( queue.dequeue());
//        System.out.println( queue.dequeue());


    }
}
