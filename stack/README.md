# Stack Implementation (Java)

This module contains a basic implementation of a **Stack** data structure
using Java and the `ArrayList` class as the underlying storage mechanism.

The stack follows the **LIFO (Last In, First Out)** principle.

---

## 📌 Features Implemented

- Push element onto the stack (`push`)
- Pop element from the stack (`pop`)
- Peek the top element (`peek`)
- Print stack elements (`printStack`)

---

## 🧱 Internal Design

The stack is implemented using:

- `ArrayList<String>` for dynamic storage
- `int top` to track the current size / top index

```java
int top;
ArrayList<String> stack;
```

Each push operation:

- Adds an element to the end of the list
- Increments top

Each pop operation:
- Removes the last inserted element
- Decrements top

---

## 🗂 Package Structure

com.mavrick.datastructures.circularlinkedlist

├── Stack.java

└── Main.java

---


## ▶️ How to Run

Navigate to the module directory and run:

```powershell
.\mvnw.cmd clean compile

Or 

execute Main.java from IntelliJ.
```

## 🧠 Learning Objectives

- Understand LIFO behavior
- Learn stack operations (push, pop, peek)
- Practice implementing a stack without using Java’s built-in Stack class
- Manage dynamic data using ArrayList

## 📎 Author
Rahul Bansode  
Java | Backend Development | Data Structures