public class add {
    add(){// constructor 
        System.out.println("This is a constructor");
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("The sum of a and b is: " + c);
    }
    int add(int a, int b){ /*Method overloading is a feature in Java that allows a class to have more than one method with the same name, but with different parameters (different type or number of parameters). 
        It allows us to define multiple methods with the same name, but with different parameter lists. This is useful when we want to perform similar operations on different types of data or with different numbers of arguments.
         For example, we can have a method called "add" that takes two integers as parameters and another method called "add" that takes three integers as parameters. 
    When we call the "add" method, the Java compiler will determine which version of the method to call based on the number and type of arguments passed to it.*/
        return a+b;
    }
    int add(int a, int b, int c){ // method overloading
        return a+b+c;
    }
    int sum(int a, int b){ // normal method
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Learning Topic: add");
        add myObject = new add();
        System.out.println("The sum of 5 and 10 is: " + myObject.add(5, 10));
        System.out.println("The sum of 5, 10, and 15 is: " + myObject.add(5, 10, 15));// method overloading
        System.out.println("The sum of 5 and 10 is: " + myObject.sum(5, 10));// normal method
    }
}
