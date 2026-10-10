
package studentrecord;

public class Student {

    int id;
    String name;
    double gpa;

    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    void display() {
        System.out.println(
            id + " - " + name + " - GPA: " + gpa
        );
    }
}
