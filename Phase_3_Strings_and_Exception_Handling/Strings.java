public class Strings {

    public static void main(String[] args) {

        System.out.println("Learning Topic: Strings");
        // String is a class that represents a sequence of characters, which can be found in the java.lang package.
        // String is a generic class, which means it can hold any type of object, in this case we are using String type.
        // String is a part of the Collections Framework, which is a set of classes and interfaces that implement commonly reusable collection data structures.
        // String is a dynamic data structure, which means it can grow and shrink in size as needed, unlike arrays which have a fixed size.
        /*  String is an immutable class, which means that once a String object is created, it cannot be changed. Any operation that seems to modify a String 
        actually creates a new String object. This is because Strings are stored in a special memory area called the String pool, which is a collection of String 
        objects that are stored in memory. When a new String object is created, the JVM checks the String pool to see if an identical String object already exists.
         If it does, the new String object is not created, and the reference to the existing String object is returned. If it does not, a new String object is created
          and added to the String pool. This is done to save memory and improve performance, as String objects are used frequently in Java programs. However, this also 
          means that String objects are not thread-safe, as multiple threads can access the same String object and modify it, leading to unexpected behavior. To avoid this, 
          the String class provides a set of methods that can be used to create new String objects based on existing ones, such as substring(), concat(), and replace(). 
          These methods create new String objects and do not modify the original String object, ensuring that the String pool remains consistent and thread-safe.*/
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // concatenation of strings
        System.out.println(str3);
        String str4 = str3.replace("World", "Java"); // replace method is used to replace a character or a substring in a string with another character or substring
        System.out.println(str4);
        String str5 = str4.substring(6); // substring method is used to extract a substring from a string, it takes two parameters, the starting index and the ending index,
        // and returns a new string that contains the characters from the starting index to the ending index
        System.out.println(str5);
        String str6 = str5.toUpperCase(); // toUpperCase method is used to convert a string to uppercase, it returns a new string that contains the same characters as the original string
        System.out.println(str6);
        String str7 = str6.toLowerCase(); // toLowerCase method is used to convert a string to lowercase, it returns a new string that contains the same characters as the original string
        System.out.println(str7);
        String str8 = str7.trim(); // trim method is used to remove the leading and trailing whitespace characters from a string, it returns a new string that contains the same characters as the original string, but without the leading and trailing whitespace characters
        System.out.println(str8);
        String str9 = str8.replace(" ", ""); // replace method is used to replace a character or a substring in a string with another character or substring
        System.out.println(str9);
        String str10 = str9.concat("!"); // concat method is used to concatenate two strings, it returns a new string that contains the characters from the original string followed by the characters from the concatenated string
        System.out.println(str10);
        String str11 = str10.intern(); // intern method is used to return a canonical representation of the string object, it returns a reference to the string object that is equal to the original string object, but is guaranteed to be from the string pool
        System.out.println(str11);
        String str12 = new String("Hello World"); // new keyword is used to create a new string object, it creates a new string object in the heap memory, and returns a reference to the new string object
        System.out.println(str12);
        String str13 = str12.intern(); // intern method is used to return a canonical representation of the string object, it returns a reference to the string object that is equal to the original string object, but is guaranteed to be from the string pool
        System.out.println(str13);
        System.out.println(str11 == str13); // == operator is used to compare the references of two string objects, it returns true if the references are equal, otherwise it returns false
        System.out.println(str11.equals(str13)); // equals method is used to compare the contents of two string objects, it returns true if the contents are equal, otherwise it returns false      

    }
}
