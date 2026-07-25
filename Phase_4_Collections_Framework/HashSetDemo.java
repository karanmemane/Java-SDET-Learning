import java.util.HashSet;
public class HashSetDemo {

    public static void main(String[] args) {

        System.out.println("Learning Topic: HashSet");
        HashSet<String> Cars = new HashSet<String>();// HashSet is a class that implements the Set interface, it is a collection that contains no duplicate elements, which can be found in the java.util package.
        // HashSet is a generic class, which means it can hold any type of object, in this case we are using String type.
        // HashSet is a part of the Collections Framework, which is a set of classes and interfaces that implement commonly reusable collection data structures.
        // HashSet is a dynamic data structure, which means it can grow and shrink in size as needed, unlike arrays which have a fixed size.
        // Set does not allow duplicate values, and it does not maintain the insertion order of the elements. It allows random access to elements, and it is faster than LinkedList for accessing elements by index, because it uses a hash table to store the elements.
        // HashSet, each element is stored in a hash table, which is an array of linked lists. Each element has a hash code, which is used to determine the index of the array where the element is stored. If two elements have the same hash code, they are stored in the same linked list, and the linked list is traversed to find the element.
        // set is an interface that extends the Collection interface, and it is a part of the Collections Framework. It is a collection that contains no duplicate elements, and it does not maintain the insertion order of the elements. It allows random access to elements, and it is faster than LinkedList for accessing elements by index, because it uses a hash table to store the elements.

        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Ford");// add is used to add elements in the set
        Cars.add("Volvo");// add is used to add elements in the set, but it will not add duplicate elements
        System.out.println(Cars);       
        Cars.contains("Volvo");// contains is used to check if an element is present in the set
        System.out.println(Cars.contains("Volvo"));// contains is used to check if an element is present in the set, it returns true if the element is present, otherwise it returns false
        Cars.remove("Volvo");// remove is used to remove elements from the set
        System.out.println(Cars);
        
    }
}
