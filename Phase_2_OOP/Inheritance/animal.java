package Inheritance;

public class animal {
    public void eat() {
        System.out.println("Animal is eating");
    }   
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    
}

class dog extends animal { //extends keyword is used to inherit the properties and methods of the animal class
    public void bark() {
        System.out.println("Dog is barking");
    }
}
