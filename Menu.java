
package studentrecord;

import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList students = new StudentLinkedList();
        StudentStack undoStack = new StudentStack();

        int choice;

        do {
            System.out.println("\n--- STUDENT RECORD SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Undo Delete");
            System.out.println("6. Sort by GPA");
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

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter GPA: ");
                    double gpa = Double.parseDouble(sc.nextLine());

                    students.add(new Student(id, name, gpa));
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

                case 0:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    public static void main(String[] args) {
        new Menu().showMenu();
    }
}
