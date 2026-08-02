/*
 An interface in Java is a contract that defines a set of methods without
 providing their implementations. A class that implements an interface must
 provide concrete implementations for all its abstract methods.

 Interfaces allow different classes to share common behavior while keeping
 implementation details separate. They also support polymorphism: you can use
 an interface type to refer to any object whose class implements that interface.
*/

interface Shape {
    double area();
    void draw();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
    public void draw() {
        System.out.println("Drawing a rectangle of " + width + " x " + height);
    }
}

public class interface_example {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);

        circle.draw();
        System.out.println("Circle area: " + circle.area());

        rectangle.draw();
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
