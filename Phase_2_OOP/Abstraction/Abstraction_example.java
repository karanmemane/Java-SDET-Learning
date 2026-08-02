public class Abstracrion_example {
    // abstraction example using abstract class and interface
    // abstract class
    abstract class Animal {
        abstract void sound(); // abstract method
        void eat() { // concrete method: has an implementation/body in the abstract class
            System.out.println("This animal eats food");        
        }
    }
    //What is the difference between abstract class and interface?
    // abstract class can have both abstract and concrete methods, while interface can only have abstract methods
    
    //What is abstract method?
    // an abstract method is a method that does not have a body and must be implemented by the subclass
    //explain in deatil with proper example
    // example of abstract class and abstract method
    class Dog extends Animal {
        void sound() { // implementation of abstract method
            System.out.println("Dog barks");
        }
    }
}
