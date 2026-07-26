import java.util.TreeMap;
public class TreeMapDemo {

    public static void main(String[] args) {

        System.out.println("Learning Topic: TreeMap");
        TreeMap<String, Integer> cars = new TreeMap<String, Integer>();
        // TreeMap is a class that implements the Map interface, it is a collection that contains key-value pairs, which can be found in the java.util package
        // TreeMap is a generic class, which means it can hold any type of object, in this case we are using String type for keys and Integer type for values.
        // TreeMap is a part of the Collections Framework, which is a set of classes and interfaces that implement commonly reusable collection data structures.
        // TreeMap is a dynamic data structure, which means it can grow and shrink in size as needed, unlike arrays which have a fixed size.
        // Map is an interface that extends the Collection interface, and it is a part of the Collections Framework. It is a collection that contains key-value pairs, and it does not allow duplicate keys. It allows random access to elements, and it is faster than LinkedList for accessing elements by index, because it uses a hash table to store the elements. 
        cars.put("Volvo", 1);
        cars.put("BMW", 2);
        cars.put("Ford", 3);
        System.out.println(cars);
        cars.remove("Volvo"); // remove is used to remove key-value pairs from the map
        System.out.println(cars);   
        System.out.println(cars.containsKey("Volvo"));// containsKey is used to check if a key is present in the map, it returns true if the key is present, otherwise it returns false
        cars.get("BMW"); // get is used to get the value associated with a key in the map
        System.out.println(cars.get("BMW"));// get is used to get the value associated with a key in the map, it returns the value associated with the key, otherwise it returns null
    }
}
