package Polymorphism;
public class Calculator {

    // Method 1: Takes two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Same method name, but three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Same method name, but double parameters
    double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Calls add(int, int)
        System.out.println(cal.add(10, 20));

        // Calls add(int, int, int)
        System.out.println(cal.add(10, 20, 30));

        // Calls add(double, double)
        System.out.println(cal.add(10.5, 20.5));
    }
}