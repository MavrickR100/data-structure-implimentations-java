package com.mavrick.datastructures.doublylinkedlist;

public class Main {

    public static void main(String args[]){
        System.out.println("This is main execution method");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.pushFront("rajendra");
        dll.popFront();
        dll.pushBack("bansode");
        dll.popBack();
        dll.pushBack("Rajendra");
        dll.pushFront("Rahul");
        dll.pushBack("Bansode");
        dll.printDoublyLinkedList();
    }
}
