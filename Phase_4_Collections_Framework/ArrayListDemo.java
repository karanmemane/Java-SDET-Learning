import java.util.ArrayList;
public class ArrayListDemo {


    public static void main(String[] args) {

        System.out.println("Learning Topic: ArrayList");
        ArrayList<String> Cars = new ArrayList<String>();// ArrayList is a class that implements the List interface, it is a resizable array, which can be found in the java.util package.
        // ArrayList is a generic class, which means it can hold any type of object, in this case we are using String type. 
        // ArrayList is a part of the Collections Framework, which is a set of classes and interfaces that implement commonly reusable collection data structures.
        // ArrayList is a dynamic array, which means it can grow and shrink in size as needed, unlike arrays which have a fixed size.
        // ArrayList is not synchronized, which means it is not thread-safe, if multiple threads access an ArrayList concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
        // List allowed duplicate values, and it maintains the insertion order of the elements. It allows random access to elements, and it is faster than LinkedList for accessing elements by index, because it uses an array to store the elements.
        //LinkedList, each node is linked to the next node. Each node has two parts:
        // Data – stores the value.
        // Next – stores the reference (address) of the next node.
        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Ford");// add is used to add elements in the list
        System.out.println(Cars);

        Cars.remove("Volvo");// remove is used to remove elements from the list
        System.out.println(Cars);
        Cars.set(0, "Audi");// set is used to replace an element in the list, set uses index to replace the element
        System.out.println(Cars);
        System.out.println(Cars.get(0));// get is used to get an element from the list, get uses index to get the element
        System.out.println(Cars.size());// size is used to get the number of elements in the list
    }
}
