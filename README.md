Student Record System

Overview
The Student Record System is a console-based Java application designed to manage student records efficiently. The project demonstrates the use of fundamental Data Structures and Object-Oriented Programming concepts in Java.

The system stores student records using a Singly Linked List and uses a Stack to provide an Undo Delete feature.

Features
The system provides the following features:

1. Add Student
   - Add a new student record.
   - Each student has:
     - Student ID
     - Student Name
     - GPA
   - Duplicate student IDs are not allowed.

2. Display Students
   - Displays all students currently stored in the system.

3. Search Student
   - Searches for a student using their ID.
   - Displays the student's information if found.

4. Delete Student
   - Deletes a student using their ID.
   - The deleted student is stored in the stack so that the deletion can be undone.

5. Undo Delete
   - Restores the most recently deleted student.
   - This feature follows the **LIFO (Last In, First Out)** principle of a stack.

6. Sort by GPA
   - Sorts student records according to GPA.
   - Students are displayed in ascending order of GPA.

7. Check Stack Empty
   - Checks whether the undo stack contains any deleted student records.

8. Show Stack Size
   - Displays the number of students currently stored in the undo stack.

Technologies Used
- Programming Language: Java
- Data Structure: Singly Linked List
- Data Structure: Stack
- Concepts: Classes, Objects, Methods, Arrays, Loops, Searching, Sorting, Encapsulation of data structures
- Application Type: Console-based application

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
├── StudentStack.java
│
└── StudentStack.zip
```

File Descriptions

Student.java
Contains the student information:
- Student ID
- Student Name
- GPA
It also contains a method to display student information.

Node.java
Represents a node of the linked list.
Each node contains:
- Student data
- Reference to the next node

StudentLinkedList.java
Implements the student linked list.
It provides methods for:
- Adding students
- Deleting students
- Searching students
- Displaying students
- Checking whether the list is empty
- Checking the list size

StudentStack.java
Implements a stack using a fixed-size array.
It provides:
- `push()` – adds a deleted student to the stack
- `pop()` – removes the most recently deleted student
- `peek()` – views the top student
- `isEmpty()` – checks whether the stack is empty
- `size()` – returns the stack size

StudentRecordSystem.java
Contains the main program and menu-driven functionality.
It connects the linked list and stack to provide the complete student record system.

Menu.java
Provides another menu-based version of the student record system.

InputValidation.java
Contains methods for validating user input, including:
- Integer values
- Positive student IDs
- Student names
- Semester values
- GPA values

Data Structures Used
1. Singly Linked List
The linked list is used to store student records dynamically.
Each node contains a student object and a reference to the next node.

```text
Head
 ↓
[Student 1] → [Student 2] → [Student 3] → NULL
```
The linked list allows students to be added, searched, displayed, and deleted.

2. Stack
A stack is used to implement the Undo Delete functionality.

The stack follows the:
LIFO – Last In, First Out principle.
For example:
```text
Delete Student A
Delete Student B
Delete Student C

Stack:
Top → Student C
       Student B
       Student A


When Undo Delete is selected, Student C is restored first.
How to Run the Project
Step 1: Open the Project
Open the project in a Java-supported IDE such as:
- IntelliJ IDEA
- Eclipse
- NetBeans
- VS Code with Java support

Step 2: Check the Package
All Java files belong to the following package:

```java
package studentrecord;
```

Make sure the files are located correctly inside the `studentrecord` package.

Step 3: Compile the Project
Compile all `.java` files.

Step 4: Run the Main Class
Run:
```text
StudentRecordSystem.java
```

The program will display the main menu.
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

Example
Adding a Student
```text
Enter choice: 1
Enter ID: 101
Enter Name: Ali
Enter GPA: 3.50

Student added.
```

Displaying Students

```text
Enter choice: 2

101 - Ali - GPA: 3.5
```

Deleting a Student
```text
Enter choice: 4
Enter ID: 101

Student deleted.
```

The deleted student is stored in the undo stack.
Undoing a Delete
```text
Enter choice: 5
Deletion undone.
```
The deleted student is added back to the linked list.

Important Concepts Demonstrated
This project demonstrates several important programming and Data Structures concepts:
- Classes and Objects
- Constructors
- Methods
- Arrays
- Singly Linked Lists
- Nodes
- Stacks
- LIFO principle
- Searching
- Sorting
- Loops
- Conditional statements
- Menu-driven programming
- Basic input handling
- Data validation

Limitations
- Student records are stored only while the program is running.
- No database or permanent file storage is used.
- The stack has a fixed capacity of 100 students.
- The program is console-based and does not have a graphical user interface.
- Invalid input handling is not applied consistently in the main menu.

Future Improvements
The project can be improved by adding:
- File handling for permanent student records
- Database connectivity
- Update/Edit Student functionality
- Delete All Students functionality
- Sorting by name or student ID
- A graphical user interface
- Better input validation
- Dynamic stack implementation
- Login/authentication system

The project provides a simple and effective way to understand the practical implementation of fundamental Data Structures in Java.
