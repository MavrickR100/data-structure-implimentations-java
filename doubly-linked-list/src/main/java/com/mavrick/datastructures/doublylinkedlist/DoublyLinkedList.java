package com.mavrick.datastructures.doublylinkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    DoublyLinkedList(){
        tail = null;
        head = null;
    }

    public void pushFront(String data ){
        Node current = new Node(data);

        if(head == null){
            head = current;
            tail = current;
        }else{
            current.next = head;
            head.previous = current;
            head = current;
        }
    }

    public void pushBack(String data){
        Node current = new Node(data);

        if(head == null){
            head = current;
            tail = current;
        }else{
            tail.next = current;
            current.previous = tail;
            tail = current;
        }
    }

    public void popFront(){
        Node current = head;

        if(current == null){
            System.out.println("Linked list is empty, can not perform popFront()");
        }else{
            if(head.next != null) {
                head = head.next;
                head.previous = null;
                current.next = null;
                System.out.println(current.data + " is poped.");
            }else{
                System.out.println(head.data + " is poped.");
                head = null;
                tail = null;
            }
        }
    }

    public void popBack(){
        if(tail == null){
            System.out.println("Linked list is empty, can not perform popFront()");
        }else{
            if(tail.previous != null) {
                System.out.println(tail.data + " is poped.");
                tail = tail.previous;
                tail.next.previous = null;
                tail.next = null;
            }else{
                System.out.println(tail.data + " is poped.");
                head = null;
                tail = null;
            }
        }
    }

    public void printDoublyLinkedList(){
        Node current = head;
        if(current == null){
            System.out.println("The doubly linked list is empty");
        }else{
            while(current != tail.next){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.println("null");
        }
    }


}
