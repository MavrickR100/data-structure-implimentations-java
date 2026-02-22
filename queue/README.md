# Queue Implementation (Java)

This module contains a basic implementation of a **Queue** data structure
using a singly linked list.

The queue follows the **FIFO (First In, First Out)** principle.

---

## 📌 Features Implemented

- Enqueue element (`push`)
- Dequeue element (`pop`)
- Get front element (`front`)
- Display queue elements (`display`)

---

## 🧱 Internal Design

The queue is implemented using:

- `Node head` → Points to the front of the queue
- `Node tail` → Points to the rear of the queue

```java
Node head;
Node tail;
```
Enqueue (push)
- New node is added at the tail
- tail.next updated
- tail pointer moved to the new node

Dequeue (pop)
- Node removed from the head
- head pointer moved forward
- This ensures FIFO behavior.

---

## 🗂 Package Structure

```
com.mavrick.datastructures.queue
├── Node.java
├── Queue.java
└── Main.java

```

---

## ▶️ How to Run

Navigate to the queue module and run:

```
.\mvnw.cmd clean compile

or

Or execute Main.java directly from IntelliJ.
```
---
## ⏱ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| push      | O(1)            |
| pop       | O(1)            |
| front     | O(1)            |
| display   | O(n)            |

---

## 🧠 Learning Objectives

- Understand FIFO behavior
- Implement queue using linked list
- Manage head and tail pointers
- Practice insertion and deletion at different ends

---

## 📎 Author

Rahul Bansode  
Java | Backend Development | Data Structures