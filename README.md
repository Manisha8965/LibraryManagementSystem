# Library Management System

A robust, object-oriented Library Management System implemented in Java. This project demonstrates core Object-Oriented Programming (OOP) architectures, clean encapsulation design, and dynamic data collections management across multiple system implementation milestones.

## 🚀 System Architecture Overview

The codebase is organized under a uniform package space (`com.library`) and implements a highly integrated module layout:

*   **Interface Layer (`Lendable`)**: Defines the behavioral contract for all transactional library assets.
*   **User Hierarchy (`User`, `Member`, `Librarian`)**: Explores abstract foundations, deep inheritance structures, constructor chaining, copy routines, and dynamic runtime polymorphism via custom user dashboards.
*   **Inventory Hierarchy (`Book`, `TextBook`, `NovelBook`)**: Tracks multi-tiered resource types using specialized domain tracking attributes.
*   **Management Framework (`LibraryManagementSystem`)**: Manages system state tracking engines using dynamic collection APIs.

---

## 🛠️ Key Technical Implementations

### 1. Encapsulation & Data Integrity
All core model variables are locked behind strict `private` visibility rules. Mutator access is restricted via safe getters and explicit setter criteria to maintain total entity validation security.

### 2. Static & Final State Control
*   **Global Counter**: Tracks accurate total system execution metrics across unique user initialization instances using static parameters.
*   **ID Generator**: A `final` utility layout that produces permanent unique identifier strings (`USR-0001`, `USR-0002`) while preventing downstream inheritance overriding bugs.

### 3. Compile-Time Polymorphism (Method Overloading)
The application search routing architecture uses method signature overloading variations within the central management engine to provide dual lookup capabilities:
*   `searchBooks(String criteria)`: Matches search entries against titles or authors globally.
*   `searchBooks(String criteria, String type)`: Filters matched results by specific book subclass structures (`TextBook` vs. `NovelBook`) using `instanceof` validations.

### 4. Runtime Polymorphism (Method Overriding)
Abstract declaration boundaries in parent templates dynamically route actions at execution runtime, allowing individual subclasses to print distinct dashboard logs depending on the active calling entity profile.

---

## 📂 Project Structure

```text
LibraryManagementSystem/
├── src/
│   └── com/
│       └── library/
│           ├── Lendable.java                 # Core transactional behavior interface
│           ├── User.java                     # Abstract core user framework model
│           ├── Member.java                   # Subscriber subclass with borrowing constraints
│           ├── Librarian.java                # Administration controls subclass
│           ├── Book.java                     # Abstract foundational catalog asset model
│           ├── TextBook.java                 # Academic course asset subclass
│           ├── NovelBook.java                 # General consumer fiction asset subclass
│           ├── LibraryManagementSystem.java  # Registry collections engine 
│           └── Main.java                     # Transaction pipeline verification runner
└── .gitignore                                # Hidden IDE artifact filter rules
```

---

## 💻 Sample Execution Output

The console runner validates complete lifecycle setup, transactional borrowing validation transformations, and overloaded search filtering rules without errors:

```text
INITIAL SYSTEM STATE
--- Library Inventory ---
Type: TextBook | Title: Advanced Calculus | Author: Gilbert Strang | Subject: Mathematics | Available: true
Type: NovelBook | Title: The Great Gatsby | Author: F. Scott Fitzgerald | Genre: Fiction | Available: true

--- Registered Users ---
=== MEMBER DASHBOARD ===
ID: USR-0001
Name: Alice Smith
Books Borrowed: 0
========================

=== LIBRARIAN DASHBOARD ===
ID: USR-0002
Name: Bob Jones
Employee Number: EMP-99
===========================

TESTING TRANSACTION SYSTEM
Borrowing 'The Great Gatsby' for Alice...
Lend Transaction Status: true

UPDATED SYSTEM STATE AFTER BORROW
--- Library Inventory ---
Type: TextBook | Title: Advanced Calculus | Author: Gilbert Strang | Subject: Mathematics | Available: true
Type: NovelBook | Title: The Great Gatsby | Author: F. Scott Fitzgerald | Genre: Fiction | Available: false

=== MEMBER DASHBOARD ===
ID: USR-0001
Name: Alice Smith
Books Borrowed: 1
========================

TESTING ADVANCED POLYMORPHIC OVERLOADED SEARCH
Search by title count: 1
Search by title and specific type count: 1

Total Registered Users across active system tracking state: 2

Process finished with exit code 0
```
