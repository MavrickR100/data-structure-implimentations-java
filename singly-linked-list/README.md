# Singly Linked List Implementation (Java)

This module contains a **basic implementation of a Singly Linked List** written from scratch in Java, without using the Java Collections Framework.

The goal of this implementation is to understand **core data structure concepts**, pointer manipulation, and traversal logic.

---

## 📌 Features Implemented

- Insert element at the beginning (`addFirst`)
- Insert element at the end (`addLast`)
- Delete a node by value (`deleteNode`)
- Traverse and print the linked list (`printList`)

---

## 🧱 Data Structure Design

- Each node stores:
    - `data` (String)
    - `next` reference to the next node
- The list maintains a reference to the `head` node

---

## 🗂 Package Structure

```
com.mavrick.datastructures.singlylinkedlist
├── Node.java
├── SinglyLinkedList.java
└── Main.java
```

---

## ▶️ How to Run

1. Clone the repository
2. Navigate to the `linked-list` module
3. Run the `Main` class

```bash
mvn clean compile
```

## 🧠 Learning Objectives

- Understand how linked lists work internally
- Learn pointer/reference manipulation
- Practice traversal, insertion, and deletion logic
- Build data structures without relying on built-in libraries

## 📎 Author

Rahul Bansode  
Java | Backend Development | Data Structures