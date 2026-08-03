package Polymorphism;
//Polymorphism means “many forms.” In Java, it lets one name represent multiple behaviors.
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
 /*The class has multiple add(...) methods.
Each method has the same name but different parameter lists:
add(int, int)
add(int, int, int)
add(double, double)
This is called compile-time polymorphism (method overloading).

Key idea
The same method name can work with different inputs.
The compiler chooses the right version based on the arguments. */
    class add extends Calculator {
        // Method 4: Same method name, but different parameter types
        @override
        String add(String a, String b) { // method overloading with different parameter types   
            return a + b;
        }

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