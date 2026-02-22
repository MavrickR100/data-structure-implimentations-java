# Circular Linked List (Java)

This module contains a **basic implementation of a Circular Singly Linked List**
written from scratch in Java.

Unlike a standard linked list, the last node in a circular linked list
points back to the head node, forming a cycle.

This implementation maintains both:
- `head` pointer
- `tail` pointer

---

## 📌 Features Implemented

- Insert at the beginning (`insertAtBeginning`)
- Insert at the end (`insertAtEnding`)
- Delete from the beginning (`deleteFromBeginning`)
- Delete from the end (`deleteFromEnding`)
- Traverse and print the circular list (`print`)

---

## 🧱 Data Structure Design

Each node contains:
- `data` (String)
- `next` reference

The key property:
tail.next → head

This ensures the list remains circular.

---

## 🗂 Package Structure

```
com.mavrick.datastructures.circularlinkedlist
├── Node.java
├── CircularLinkedList.java
└── Main.java
```
---

## ▶️ How It Works

### Insert at End
- If list is empty → head and tail point to new node
- Otherwise:
    - `tail.next` → new node
    - `newNode.next` → head
    - update `tail`

### Insert at Beginning
- New node becomes head
- `tail.next` updated to maintain circular structure

### Delete from End
- Traverse until node before tail
- Update tail reference
- Reconnect to head

---

## ▶️ How to Run

Navigate to the module directory and run:

```powershell
.\mvnw.cmd clean compile

Or 

execute Main.java from IntelliJ.
```

## 🧠 Learning Objectives

- Understand circular reference linking
- Practice pointer manipulation
- Learn difference between linear and circular traversal
- Implement cycle-based traversal logic

## 📎 Author
Rahul Bansode  
Java | Backend Development | Data Structures