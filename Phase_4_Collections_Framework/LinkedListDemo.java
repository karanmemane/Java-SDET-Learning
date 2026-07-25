import java.util.LinkedList;
public class LinkedListDemo {

    public static void main(String[] args) {

        System.out.println("Learning Topic: LinkedList");
        LinkedList<String> Cars = new LinkedList<String>();
        // LinkedList is a class that implements the List interface, it is a doubly linked list, which can be found in the java.util package.
        // LinkedList is a generic class, which means it can hold any type of object, in this case we are using String type.
        // LinkedList is a part of the Collections Framework, which is a set of classes and interfaces that implement commonly reusable collection data structures.
        // LinkedList is a dynamic data structure, which means it can grow and shrink in size as needed, unlike arrays which have a fixed size.
        //List allowed duplicate values, and it maintains the insertion order of the elements. It allows random access to elements, but it is slower than ArrayList for accessing elements by index, because it has to traverse the list from the beginning or end to reach the desired index.
        //LinkedList, each node is linked to the next node. Each node has two parts:
        // Data – stores the value.
        // Next – stores the reference (address) of the next node.
        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Ford");// add is used to add elements in the list
        System.out.println(Cars);
        Cars.add(2, "Mazda");// add is used to add elements in the list, add uses index to add the element
        System.out.println(Cars);
        Cars.remove("Volvo");// remove is used to remove elements from the list
        System.out.println(Cars);
        Cars.set(0, "Audi");// set is used to replace an element in the list
        System.out.println(Cars);
        System.out.println(Cars.get(0));// get is used to get an element from the list
        System.out.println(Cars.size());// size is used to get the number of elements in the list

    }
}
