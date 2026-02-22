# Min Stack Implementation (Java)

This module contains an implementation of a **Min Stack** in Java.

A Min Stack is a special type of stack that supports retrieving
the minimum element in constant time **O(1)**.

---

## 📌 Features Implemented

- Push element (`push`)
- Pop element (`pop`)
- Peek top element (`peek`)
- Retrieve minimum element (`getMin`)

All operations run in **O(1) time complexity**.

---

## 🧱 Internal Design

This implementation uses:

- `java.util.Stack<Pair>` as the underlying storage
- A custom `Pair` class to store:
    - `val` → actual stack value
    - `min` → minimum value at that stack level

```java
Stack<Pair> stack;
```

Each time a value is pushed:

- The current minimum is compared with the new value
- The new minimum is stored inside the Pair
- This allows getMin() to simply return the top element's stored minimum

🧠 How the Minimum is Maintained

For every element pushed:
```java
Pair {
    value → actual value
    min   → minimum at this point in the stack
}
```

Example:

Push sequence: 5 → 3 → 7

Internal stack representation:

```java
| Value | Min |
| ----- | --- |
| 5     | 5   |
| 3     | 3   |
| 7     | 3   |

```

So getMin() always returns the top element’s stored min.

---

## 🗂 Package Structure

```
com.mavrick.datastructures.minstack
├── MinStack.java
├── Pair.java
└── Main.java
```

## ▶️ How to Run

Navigate to the min-stack module and run:
```java
.\mvnw.cmd clean compile

Or 

execute Main.java from IntelliJ.
```

## ⏱ Time Complexity 

```java
| Operation | Time Complexity |
| --------- | --------------- |
| push      | O(1)            |
| pop       | O(1)            |
| peek      | O(1)            |
| getMin    | O(1)            |

```
---

## 📎 Author

Rahul Bansode  
Java | Backend Development | Data Structures