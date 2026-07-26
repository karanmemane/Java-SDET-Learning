public class Constructors {
    Constructors(){
        System.out.println("This is a constructor");
    }
    public static void main(String[] args) {

        System.out.println("Learning Topic: Constructors");
        /* A constructor is a special method that is used to initialize objects. It is called when an object of a class is created. 
        A constructor has the same name as the class and does not have a return type. It can be used to set initial values for 
        object attributes or perform any setup steps required when an object is created.*/
        Constructors myObject = new Constructors(); // Creating an object of the Constructors class, this will call the constructor
        //System.out.println(myObject.Constructors()); // Calling the constructor method explicitly, this is not necessary as the constructor is called automatically when the object is created
        
        /* In this example, we define a constructor for the Constructors class. When we create an object of the Constructors class using the new keyword, the constructor is called automatically, and the message "This is a constructor" is printed to the console.
        Note that we can also call the constructor method explicitly, but this is not necessary as the*/
        // constructor is called automatically when the object is created. Now you can try creating your own constructors in your Java programs!*/
    }
}
