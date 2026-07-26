public class Arrays {

    public static void main(String[] args) {

        System.out.println("Learning Topic: Arrays");
        // An array is a data structure that can hold a fixed number of values of a single type, it is a collection of variables that are accessed with an index number.
        // In Java, arrays are objects that can hold multiple values of the same type, and they are used to store a collection of data. The size of an array is fixed, which means that once it is created, it cannot be changed. However, you can create a new array with a different size and copy the values from the old array to the new one if needed.
        // Here are some examples of array declarations and initializations in Java:
        int[] myIntArray = new int[5]; // Integer array with a size of 5
        double[] myDoubleArray = {3.14, 2.71, 1.41}; // Double array with initial values
        char[] myCharArray = new char[3]; // Character array with a size of 3
        boolean[] myBooleanArray = {true, false, true}; // Boolean array with initial values
        String[] myStringArray = new String[4]; // String array with a size of 4
        System.out.println("Integer Array: " + java.util.Arrays.toString(myIntArray));
        System.out.println("Double Array: " + java.util.Arrays.toString(myDoubleArray));
        System.out.println("Character Array: " + java.util.Arrays.toString(myCharArray));
        System.out.println("Boolean Array: " + java.util.Arrays.toString(myBooleanArray));
        System.out.println("String Array: " + java.util.Arrays.toString(myStringArray));
        // In this example, we declare arrays of different data types and initialize them with values. The array names (myIntArray, myDoubleArray, myCharArray, myBooleanArray, myStringArray) are used to reference the values stored in the arrays. You can use these arrays in your Java programs to store and manipulate collections of data. Now you can try declaring and using arrays in your own Java programs!
        
    }
}
