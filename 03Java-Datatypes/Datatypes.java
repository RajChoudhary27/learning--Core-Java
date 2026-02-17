
public class Datatypes {
    public static void main(String[] args) {
        //example of all primitive data types in Java
        byte a = 100; // 8-bit signed integer
        short b = 10000; // 16-bit signed integer
        int c = 100000; // 32-bit signed integer
        long d = 10000000000L; // 64-bit signed integer
        float e = 3.14f; // 32-bit floating-point number
        double f = 3.141592653589793; // 64-bit floating-point number
        char g = 'A'; // 16-bit Unicode character
        boolean h = true; // boolean value (true or false)
        // Printing the variables
        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Int value: " + c);              
        System.out.println("Long value: " + d);
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);
        System.out.println("Char value: " + g);
        System.out.println("Boolean value: " + h);
    }
}
/*
! DataTypes in Java :-
In Java, data types are used to specify the type of data that a variable can hold. Java has two main categories of data types: primitive data types and reference data types.
*1. Primitive Data Types: These are the most basic data types in Java and include:
   - byte: 8-bit signed integer
   - short: 16-bit signed integer
   - int: 32-bit signed integer
   - long: 64-bit signed integer
   - float: 32-bit floating-point number
   - double: 64-bit floating-point number
   - char: 16-bit Unicode character
   - boolean: represents true or false values

*2. Reference Data Types: These are more complex data types that refer to objects. They include:
   - String: represents a sequence of characters
   - Arrays: a collection of elements of the same type
   - Classes: user-defined data types that can contain fields and methods
   - Interfaces: abstract types that define a set of methods that a class must implement
   - Enums: a special type that represents a group of constants
   - Annotations: a form of metadata that provides information about the code
   - Objects: instances of classes that can hold data and have behavior
   
In Java, you must declare a variable with a specific data type before using it. This helps the compiler understand what kind of data the variable will hold and allows for type checking at compile time.
*/
