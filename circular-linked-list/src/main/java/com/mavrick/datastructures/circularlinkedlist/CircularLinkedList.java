package com.mavrick.datastructures.circularlinkedlist;

public class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtEnding(String data){
        Node newNode = new Node(data);

        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void insertAtBeginning(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
        //if head pointer does not exist in implementation

//        if(tail == null){
//            tail = newNode ;
//        }else{
//            Node tem = tail.next;
//            tail.next = newNode;
//            newNode.next = tem;
//        }
    }

    public void deleteFromBeginning(){

        if(head == null){
            System.out.print("Linked list is empty");
        }else{
            head = head.next;
            tail.next=head;
        }
    }

    public void deleteFromEnding(){
        if(head == null){
            System.out.print("Linked list is empty");
        }else{
            Node tem =head;

            while(tem.next != tail){
                tem = tem.next;
            }
            tail = tem;
            tail.next =head;
        }
    }

    public void print(){

        if(head == null){
            System.out.println("Linked list is empty");
        }
        else if(head==tail){
            System.out.print(head.data);
        }else{
            Node tem = head;
            while(tem.next != head){
                System.out.print(tem.data+"->");
                tem = tem.next;
            }
            System.out.print(tem.data);
            head=head.next;
            System.out.print("->()");
        }
    }
}
