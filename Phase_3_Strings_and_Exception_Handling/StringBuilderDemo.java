
public class StringBuilderDemo {

    public static void main(String[] args) {

        System.out.println("Learning Topic: StringBuilder");
        /* In Java, the StringBuilder class is used to create mutable (modifiable) strings. 
        Unlike the String class, which creates immutable strings, the StringBuilder class allows 
        you to modify the contents of a string without creating a new object each time. 
        This can be more efficient when you need to perform multiple string manipulations, 
        such as concatenation or insertion.*/
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appending a string to the StringBuilder
        System.out.println(sb.toString()); // Output: Hello World
        sb.insert(5, ","); // Inserting a character at a specific index
        System.out.println(sb.toString()); // Output: Hello, World
        sb.replace(5, 6, "!"); // Replacing a character at a specific index
        System.out.println(sb.toString()); // Output: Hello! World
        sb.delete(5, 6); // Deleting a character at a specific index
        System.out.println(sb.toString()); // Output: Hello World
        /* In this example, we create a StringBuilder object with the initial value "Hello". 
        We then use various methods of the StringBuilder class to modify the string, such as append(), insert(), replace(), and delete(). 
        Finally, we convert the StringBuilder back to a String using the toString() method and print the result to the console. 
        The StringBuilder class provides a convenient way to work with mutable strings in Java, allowing for efficient string manipulation without creating multiple string objects.
         Now you can try using the StringBuilder class in your own Java programs to see how it works!*/
    }
}
