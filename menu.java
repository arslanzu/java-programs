import java.util.Scanner;

public class menu{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Menu-driven program
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter student's marks");
            System.out.println("0. Quit");

            // Prompt the user to enter a choice
            System.out.print("Enter your choice (1 or 0): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // User chose to enter student's marks
                    enterStudentMarks();
                    break;
                case 0:
                    // User chose to quit
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice != 0);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to enter and evaluate student's marks
    private static void enterStudentMarks() {
        Scanner scanner = new Scanner(System.in);

        // Variables to store student's marks
        int marks;

        // Prompt the user to enter student's marks until they enter a negative value
        do {
            System.out.print("Enter student's marks (out of 100, enter a negative value to stop): ");
            marks = scanner.nextInt();

            // Evaluate and print a message based on the entered marks
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Stopping input for student's marks.");
            }
        } while (marks >= 0);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
