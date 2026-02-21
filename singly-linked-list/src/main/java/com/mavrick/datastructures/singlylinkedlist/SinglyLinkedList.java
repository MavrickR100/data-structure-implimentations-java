package com.mavrick.datastructures.singlylinkedlist;

public class SinglyLinkedList {
    Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head=newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("Linked List Is Empty");
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("Null");
    }

    void deleteNode(String data){
        if(head == null){
            System.out.println("This linked list is empty");
            return;
        }
        if(head.data.equals(data)){
            head=head.next;
            return;
        }
        Node previousNode = head;
        while(previousNode.next != null && !previousNode.next.data.equals(data)){
            previousNode=previousNode.next;
        }
        if(previousNode.next==null){
            System.out.println("Element is not present in linked list");
            return;
        }
        previousNode.next=previousNode.next.next;
    }
}
