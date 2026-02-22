package com.mavrick.datastructures.stack;

import java.util.ArrayList;

public class Stack {

    int top;
    ArrayList<String> stack;
    public Stack(){
        top = 0;
        stack = new ArrayList<>();
    }

    public void push(String data){
        stack.add(data);
        System.out.println("Data -> "+data+" pushed to stack");
        top++;
    }

    public String pop(){
        String tem = "null";
        if(top == 0){
            System.out.println("Stack is empty can not perform pop operation");
        }else {
            top--;
            tem = stack.remove(top);
            System.out.println("Data -> " + tem + " is poped from stack");
        }
        return tem;
    }

    public String peek(){
        if(top == 0 ){
            System.out.println("Stack is empty can not see peek");
            return "null";
        }else{
            System.out.println("Peek element is: "+stack.getLast());
            return stack.getLast();
        }
    }

    public void printStack() {
        if(top == 0){
            System.out.println("Stack is empty");
        }else{

            for(String element : stack){
                System.out.print(element+" ");
            }
        }
    }
}
