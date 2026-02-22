package com.mavrick.datastructures.minstack;

import java.util.Stack;

public class MinStack {

    Stack<Pair> stack;

    public MinStack(){
        stack = new Stack<>();
    }

    public void push(int data){
        Pair element = new Pair();
        if(stack.size() == 0){
            element.setMin(data);
            element.setVal(data);
            stack.push(element);
        }else{
            Pair tem = stack.peek();
            if(tem.getMin() > data){
                element.setMin(data);
                element.setVal(data);
                stack.push(element);
            }else{
                element.setMin(tem.getMin());
                element.setVal(data);
                stack.push(element);
            }
        }
    }

    public int pop(){
        if(stack.size() == 0){
            System.out.println("MinStack is empty can not perform pop operation");
            return 0;
        }else{
            Pair tem = stack.pop();
            return tem.getVal();
        }
    }

    public  void peek(){
        if(stack.size() == 0){
            System.out.println("MinStack is empty can not perform peek operation");
        }else{
            System.out.println(stack.peek().getVal());
        }
    }

    public int getMin(){
        if(stack.size() == 0){
            System.out.println("MinStack is empty can not perform getMin operation");
            return 0;
        }else{
            System.out.println(stack.peek().getMin());
            return stack.peek().getMin();
        }
    }

}
