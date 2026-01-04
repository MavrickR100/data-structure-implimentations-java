package com.mavrick.datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
       //Singly Linked List
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst("Rajendra");
        sll.addLast("Bansode");
        sll.addFirst("Rahul");
        sll.printList();
        sll.deleteNode("Bansode");
        sll.printList();

       //Doubly Linked List

    }
}