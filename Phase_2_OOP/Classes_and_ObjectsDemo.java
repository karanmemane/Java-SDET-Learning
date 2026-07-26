public class Classes_and_ObjectsDemo {
    int a = 10;//Inside the class, we can define properties (also known as fields or attributes)
    int b = 20;
    int add(){ // behaviors (also known as methods or functions).
            return a+b;
        }
    int subtract(){
            return a-b;
        }
    int multiply(){
            return a*b;
        }
    int divide(){
            return a/b;
        }
    public static void main(String[] args) {

        System.out.println("Learning Topic: Classes_and_Objects");
        /*  A class is a blueprint for creating objects, it defines the properties and behaviors of an object. 
        An object is an instance of a class, it is created from a class and has its own state and behavior. 
        In Java, we can create a class by using the class keyword, followed by the class name and a pair of curly braces. 
        Inside the class, we can define properties (also known as fields or attributes) and behaviors (also known as methods or functions). 
        We can create an object by using the new keyword, followed by the class name and a pair of parentheses. We can access 
        the properties and behaviors of an object by using the dot operator (.) followed by the property or method name.*/
        Classes_and_ObjectsDemo  myObject = new Classes_and_ObjectsDemo(); // Creating an object of the Classes_and_ObjectsDemo class
        myObject.a = 30; // Accessing the property 'a' of the object and changing its value
        myObject.b = 40; // Accessing the property 'b' of the object
        System.out.println(myObject.add()); // Accessing the method 'add' of the object
        System.out.println(myObject.a);// Accessing the property 'a' of the object
        System.out.println(myObject.b);// Accessing the property 'b' of the object
        System.out.println(myObject.subtract()); // Accessing the method 'subtract' of the object
        System.out.println(myObject.multiply()); // Accessing the method 'multiply' of the object
        System.out.println(myObject.divide()); // Accessing the method 'divide' of the object
    }   
}
