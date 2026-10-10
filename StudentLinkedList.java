package studentrecord;

public class StudentLinkedList {

    Node head;
    int size = 0;

    // Add student
    void add(Student student) {

        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    // Delete student
    Student delete(int id) {

        if (head == null) {
            return null;
        }

        // Delete first student
        if (head.data.id == id) {

            Student student = head.data;
            head = head.next;
            size--;

            return student;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data.id == id) {

                Student student = current.next.data;

                current.next = current.next.next;

                size--;

                return student;
            }

            current = current.next;
        }

        return null;
    }

    // Search student
    Student search(int id) {

        Node current = head;

        while (current != null) {

            if (current.data.id == id) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    // Display students
    void display() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        while (current != null) {

            current.data.display();

            current = current.next;
        }
    }

    // Check empty
    boolean isEmpty() {
        return head == null;
    }

    // Return size
    int size() {
        return size;
    }


}
