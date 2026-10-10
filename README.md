Student Record System

Description
The Student Record System is a console-based Java application developed to manage student records using fundamental Data Structures and Object-Oriented Programming concepts.
The system uses a Singly Linked List to store student records and a Stack to implement the Undo Delete feature.

Data Structures Used
1. Singly Linked List
Used to store and manage student records dynamically.
Each student record contains:
- Student ID
- Student Name
- GPA

2. Stack
Used for the Undo Delete functionality. It follows the LIFO (Last In, First Out) principle.
Features
- Add Student – Adds a new student record and prevents duplicate IDs.
- Display Students – Displays all stored student records.
- Search Student – Searches for a student by ID.
- Delete Student – Deletes a student and stores the deleted record in the stack.
- Undo Delete – Restores the most recently deleted student.
- Sort by GPA – Sorts students by GPA.
- Check Stack Empty – Checks whether the undo stack is empty.
- Show Stack Size – Displays the number of records in the undo stack.

Time Complexity
| Operation | Data Structure | Time Complexity |
|---|---|---:|
| Add Student | Linked List | O(n) |
| Display Students | Linked List | O(n) |
| Search Student | Linked List | O(n) |
| Delete Student | Linked List + Stack | O(n) |
| Undo Delete | Linked List + Stack | O(n) |
| Sort by GPA | Linked List | O(n²) |
| Check Stack Empty | Stack | O(1) |
| Show Stack Size | Stack | O(1) |
| Push | Stack | O(1) |
| Pop | Stack | O(1) |
| Peek | Stack | O(1) |

Note: The `O(n)` complexity for Add Student assumes the implementation checks the existing list for duplicate student IDs before insertion.

Technologies
- Language: Java
- Application Type: Console-based
- Data Structures: Singly Linked List, Stack
- Concepts: Classes, Objects, Methods, Searching, Sorting, Loops, Input Validation

Project Structure
```text
Student Record System
│
├── InputValidation.java
├── Menu.java
├── Node.java
├── Student.java
├── StudentLinkedList.java
├── StudentRecordSystem.java
└── StudentStack.java
```

How to Run
1. Open the project in a Java-supported IDE such as IntelliJ IDEA, Eclipse, NetBeans, or VS Code.
2. Make sure all files are inside the `studentrecord` package.
3. Compile the Java files.
4. Run `StudentRecordSystem.java`.
5. Use the displayed menu to manage student records.

Main Menu
```text
1. Add Student
2. Display Students
3. Search Student
4. Delete Student
5. Undo Delete
6. Sort by GPA
7. Check Stack Empty
8. Show Stack Size
0. Exit
```

GitHub Repository
Repository:  
[Add your GitHub repository link here]

License
This project is licensed under the MIT License.
