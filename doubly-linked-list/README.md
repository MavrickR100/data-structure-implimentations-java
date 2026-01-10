# Doubly Linked List (Java)

This module contains a **basic implementation of a Doubly Linked List**
written from scratch in Java, without using the Java Collections Framework.

The implementation focuses on understanding **bidirectional node linking**
using `previous` and `next` references.

---

## 📌 Features Implemented

- Insert element at the front (`pushFront`)
- Insert element at the back (`pushBack`)
- Remove element from the front (`popFront`)
- Remove element from the back (`popBack`)
- Traverse and print the list from head to tail (`printDoublyLinkedList`)

---

## 🧱 Data Structure Design

Each node contains:
- `data` (String)
- `next` reference
- `previous` reference

The list maintains:
- `head` pointer
- `tail` pointer

This allows efficient insertion and deletion from **both ends**.

---

## 🗂 Package Structure

com.mavrick.datastructures.doublylinkedlist

├── Node.java

├── DoublyLinkedList.java

└── Main.java


---

## ▶️ How to Run

1. Navigate to the `doubly-linked-list` module
2. Run the `Main` class

Using Maven Wrapper (Windows):
```powershell
.\mvnw.cmd clean compile
```

## 🧠 Learning Objectives

1. Understand bidirectional linking between nodes
2. Practice pointer manipulation using previous and next
3. Learn how head and tail pointers simplify operations
4. Implement deque-like operations manually

## 📎 Author
Rahul Bansode  
Java | Backend Development | Data Structures