
package studentrecord;

public class StudentStack {

    Student[] stack = new Student[100];
    int top = -1;

    // Push
    void push(Student student) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
            return;
        }

        stack[++top] = student;
    }

    // Pop
    Student pop() {
        if (isEmpty()) {
            return null;
        }

        return stack[top--];
    }

    // Peek
    Student peek() {
        if (isEmpty()) {
            return null;
        }

        return stack[top];
    }

    // Check empty
    boolean isEmpty() {
        return top == -1;
    }

    // Stack size
    int size() {
        return top + 1;
    }
}
