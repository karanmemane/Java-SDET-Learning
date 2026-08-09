import java.util.ArrayList;
import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select:");
        System.out.println("1. Sum");
        System.out.println("2. Average");
        System.out.println("3. Product");
        System.out.println("4. Quotient (division) ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("We are performing addition operation.");
                System.out.println("Enter integers (type a non-number or letter to stop):");

                while (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    numbers.add(input);
                }

                int sum = 0;

                for (int number : numbers) {
                    sum += number;
                }

                System.out.println("Sum of all numbers: " + sum);
                break;

            case 2:
                System.out.println("We are performing average operation.");
                System.out.println("Enter integers (type a non-number or letter to stop):");

                while (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    numbers.add(input);
                }

                if (numbers.size() > 0) {

                    int total = 0;

                    for (int number : numbers) {
                        total += number;
                    }

                    double average = (double) total / numbers.size();

                    System.out.println("Average of all numbers: " + average);

                } else {
                    System.out.println("No numbers were entered.");
                }

                break;
            case 3:
                System.out.println("We are performing multiplication operation.");
                System.out.println("Enter integers (type a non-number or letter to stop):");

                while (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    numbers.add(input);
                }

                int product = 1;

                for (int number : numbers) {
                    product *= number;
                }

                System.out.println("Product of all numbers: " + product);
                break;
            case 4:
                System.out.println("We are performing division operation.");
                System.out.println("Enter integers (type a non-number or letter to stop):");

                while (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    numbers.add(input);
            }

            if (numbers.size() > 0) {

            int quotient = numbers.get(0);
            boolean valid = true;

            for (int i = 1; i < numbers.size(); i++) {

                if (numbers.get(i) == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                    break;
                }

                quotient /= numbers.get(i);
            }

            if (valid) {
                System.out.println("Quotient of all numbers: " + quotient);
            }

            } else {
                System.out.println("No numbers were entered.");
            }
            break;

            default:
                System.out.println("Invalid choice. Exiting.");
        }

        scanner.close();
    }
}