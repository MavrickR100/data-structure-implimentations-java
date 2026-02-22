package com.mavrick.datastructures.minstack;

public class Main {

    public static void main(String[] args){
        MinStack stack = new MinStack();

        stack.push(20);
        stack.push(10);
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.peek();
        stack.push(15);
        stack.getMin();
    }
}
