package studentrecord;
import java.util.Scanner;

public class InputValidation {

    private Scanner input;

    // Constructor
    public InputValidation() {
        input = new Scanner(System.in);
    }
//This check is made to validate that a valid integer is entered.
    public int readInt(String message) {

        while (true) {

            System.out.print(message);

            String value = input.nextLine();

            try {
                return Integer.parseInt(value);

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid input! Please enter a whole number."
                );
            }
        }
    }

//This check is made to only get proper student ID.As,it cannot be negative
    public int readPositiveInt(String message) {

        while (true) {

            int value = readInt(message);

            if (value > 0) {
                return value;
            }

            System.out.println(
                "Value must be greater than 0."
            );
        }
    }
//checking if the name has proper data type required no special characters only alphabets and spaces
    public String readName(String message) {

        while (true) {

            System.out.print(message);

            String name = input.nextLine().trim();

            if (name.isEmpty()) {

                System.out.println(
                    "Name cannot be empty."
                );

            } else if (!name.matches("[a-zA-Z ]+")) {

                System.out.println(
                    "Name can contain letters and spaces only."
                );

            } else {

                return name;
            }
        }
    }
// This function is made to validate if the semester entered is in range 1 to 8 semester
    public int readSemester(String message) {

        while (true) {

            int semester = readInt(message);

            if (semester >= 1 && semester <= 8) {
                return semester;
            }

            System.out.println(
                "Semester must be between 1 and 8."
            );
        }
    }
//This function is made to confirm that gpa is in the right format and is between to 0 and 4.00
    public double readGPA(String message) {

        while (true) {

            System.out.print(message);

            String value = input.nextLine();

            try {

                double gpa = Double.parseDouble(value);

                if (gpa >= 0.0 && gpa <= 4.0) {
                    return gpa;
                }

                System.out.println(
                    "GPA must be between 0.0 and 4.0."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid GPA! Please enter a number."
                );
            }
        }
    }
}
