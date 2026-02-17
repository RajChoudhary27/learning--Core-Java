public class TypeConversion {
    public static void main(String[] args) {
        // Example of type conversion in Java
        int intValue = 100;
        double doubleValue = intValue; // Implicit type conversion (widening)
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value (after implicit conversion): " + doubleValue);

        double anotherDoubleValue = 3.14;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit type conversion (narrowing)
        System.out.println("Another double value: " + anotherDoubleValue);
        System.out.println("Another integer value (after explicit conversion): " + anotherIntValue);
    }
}
/*
Type Conversion in Java :-
Type conversion in Java refers to the process of converting one data type into another. There are two main types of type conversion in Java: implicit type conversion (also known as widening) and explicit type conversion (also known as narrowing).

Types of Type Conversion:
1. Implicit Type Conversion (Widening): This occurs when a smaller data type is automatically converted to a larger data type. For example, an `int` can be implicitly converted to a `double` because a `double` can hold a wider range of values than an `int`. This type of conversion is done automatically by the Java compiler and does not require any special syntax.

2. Explicit Type Conversion (Narrowing): This occurs when a larger data type is explicitly converted to a smaller data type. For example, a `double` can be explicitly converted to an `int` using a cast operator. This type of conversion requires explicit syntax and can lead to loss of data if the value being converted exceeds the range of the target data type.
In the example above, we demonstrate both types of type conversion. The `intValue` is implicitly converted to a `double`, while the `anotherDoubleValue` is explicitly converted to an `int` using a cast operator. The output of the program will show the results of both conversions.
*/
