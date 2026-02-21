package com.mavrick.datastructures.circularlinkedlist;

public class Main {


    public static void main(String args[]) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBeginning("20");
        cll.insertAtEnding("30");
        cll.insertAtBeginning("10");
        cll.deleteFromBeginning();
        cll.deleteFromEnding();
        cll.print();

    }
}
