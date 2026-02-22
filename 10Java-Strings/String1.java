
public class String1 {
   public static void main(String[] args) {
    
   } 
}
/*
Strings in Java:
A string in Java is a sequence of characters. It is an object that represents a sequence of characters and is widely used for storing and manipulating text. In Java, strings are immutable, meaning that once a string is created, it cannot be changed. Instead, any operation that modifies a string will create a new string object.

String is a class in the java.lang package, and it provides various methods for string manipulation, such as concatenation, substring extraction, character replacement, and more. Strings can be created using string literals (enclosed in double quotes) or by using the String class constructor.
Example of creating strings:
String str1 = "Hello, World!"; // Using string literal
String str2 = new String("Welcome to Java Programming."); // Using String constructor

here String is a class.
str1 is a reference variable that points to the string object "Hello, World!" in memory.
reference variable is a variable that holds the memory address of an object. In this case, str1 holds the memory address of the string object "Hello, World!".

? IMP
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String str3 = new String(charArray); // Creating a string from a character array
System.out.println(str3); // Output: Hello

new keyword is used to create a new string object in heap memory.
*/

/*
* Heap and String Pool in Java:
In Java, the heap is a region of memory where objects are allocated. When you create a new string object using the new keyword, it is stored in the heap. However, Java also has a special area of memory called the string pool (or string intern pool) that is used to store string literals.

String literals are stored in the string pool to optimize memory usage. When you create a string literal, Java checks if an identical string already exists in the pool. If it does, it returns a reference to the existing string instead of creating a new one. This is known as string interning.
Example:
String str1 = "Hello"; // String literal, stored in string pool
String str2 = "Hello"; // Reuses the same string from the pool
System.out.println(str1 == str2); // Output: true (both reference the same string object)

String str3 = new String("Hello"); // Creates a new string object in the heap
System.out.println(str1 == str3); // Output: false (str1 and str3 reference different objects)
System.out.println(str1.equals(str3)); // Output: true (str1 and str3 have the same content)
*/