package com.mavrick.datastructures.stack;

public class Main {

    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push("Bansode");
        stack.push("rahul");
        stack.pop();
        stack.push("Rahul");
        stack.push("Rajendra");
        stack.peek();

        System.out.println("The stack elements are: ");
        stack.printStack();
    }
}
