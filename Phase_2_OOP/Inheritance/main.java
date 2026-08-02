package Inheritance;
public class main { 
    public static void main(String[] args) {
        System.out.println("Learning Topic: Inheritance");
        dog myDog = new dog();
        myDog.eat(); // calling the eat method from the animal class
        myDog.sleep(); // calling the sleep method from the animal class
        myDog.bark(); // calling the bark method from the dog class
    }
}