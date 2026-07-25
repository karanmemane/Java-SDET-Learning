// Import the Scanner class to read input from the user
import java.util.Scanner;
public class inputAndOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display a greeting message
        System.out.println("Hello, " + name + "! Welcome to Java programming!");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
