package com.mavrick.datastructures.queue;

public class Queue {

    Node head;
    Node tail;
    public Queue(){
        head = null;
        tail = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            tail = newNode;
            tail.next = null;
        }else{
            //Insertion from head and deletion from tail
//            newNode.next = head;
//            head = newNode;
            //Insertion from tail and deletion from head
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }

    public void pop(){
        if(head == null){
            System.out.println("Queue is empty pop operation can not be performed");
        }else{
            //Insertion from head and deletion from tail
//            Node tem = head;
//            while(tem.next != tail) {
//                tem = tem.next;
//            }
//
//            tail = tem;
//            tail.next = null;
            //Insertion from tail and deletion from head
            head = head.next;
        }
    }

    public int front(){

        if(head == null){
            System.out.println("Queue is empty can not perform front operation");
            return -1;
        }else{
            return tail.getData();
        }
    }

    public void display(){
        Node tem = head;
        if(head != null) {
            while (tem != null) {
                System.out.print(tem.data + " ");
                tem = tem.next;
            }
        }else{
            System.out.println("Queue is empty can not perform display operation");
        }
        System.out.println();
    }

}
