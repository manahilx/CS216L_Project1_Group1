
package studentrecord;

import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentLinkedList students = new StudentLinkedList();
        StudentStack undoStack = new StudentStack();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Undo Delete");
            System.out.println("6. Sort by GPA");
            System.out.println("7. Check Stack Empty");
            System.out.println("8. Show Stack Size");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    if (students.search(id) != null) {
                        System.out.println("ID already exists.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter GPA: ");
                    double gpa = Double.parseDouble(sc.nextLine());

                    Student s = new Student(id, name, gpa);
                    students.add(s);

                    System.out.println("Student added.");
                    break;

                case 2:
                    students.display();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    id = Integer.parseInt(sc.nextLine());

                    Student found = students.search(id);

                    if (found == null) {
                        System.out.println("Student not found.");
                    } else {
                        found.display();
                    }
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    id = Integer.parseInt(sc.nextLine());

                    Student deleted = students.delete(id);

                    if (deleted == null) {
                        System.out.println("Student not found.");
                    } else {
                        undoStack.push(deleted);
                        System.out.println("Student deleted.");
                    }
                    break;

                case 5:
                    Student old = undoStack.pop();

                    if (old == null) {
                        System.out.println("Nothing to undo.");
                    } else if (students.search(old.id) != null) {
                        System.out.println("ID already exists.");
                        undoStack.push(old);
                    } else {
                        students.add(old);
                        System.out.println("Deletion undone.");
                    }
                    break;

                case 6:
                    for (Node i = students.head; i != null; i = i.next) {
                        for (Node j = i.next; j != null; j = j.next) {
                            if (i.data.gpa > j.data.gpa) {
                                Student temp = i.data;
                                i.data = j.data;
                                j.data = temp;
                            }
                        }
                    }

                    System.out.println("Sorted by GPA.");
                    students.display();
                    break;

                case 7:
                    System.out.println(undoStack.isEmpty()
                            ? "Stack is empty."
                            : "Stack is not empty.");
                    break;

                case 8:
                    System.out.println("Stack size: " + undoStack.size());
                    break;

                case 0:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Wrong choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
