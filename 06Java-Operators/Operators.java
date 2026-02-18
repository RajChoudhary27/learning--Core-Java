public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b)); // 15

        //Relational Operators
        System.out.println("Is a greater than b? " + (a > b)); // true

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false

        //Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("After += operator: " + c); // 25

        //Unary Operators
        int d = 10;
        System.out.println("Post-increment: " + (d++)); // 10 (then d becomes 11)
        System.out.println("Pre-increment: " + (++d)); // 12 (d becomes 12 before being printed)

        //Ternary Operator
        int e = 15; 
        String result = (e > 10) ? "Greater than 10" : "Less than or equal to 10";
        System.out.println("Ternary Operator Result: " + result); // Greater than 10

        //Bitwise Operators
        int f = 5; // 0101 in binary
        int g = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (f & g)); // 1         001 in binary
        System.out.println("Bitwise OR: " + (f | g)); // 7          0111 in binary
        System.out.println("Bitwise XOR: " + (f ^ g)); // 6         0110 in binary

        //Instanceof Operator
        String str = "Hello";
        boolean isString = str instanceof String; // true
        System.out.println("Is str an instance of String? " + isString); // true    

    }
}
/*
* Operators in Java :-
Operators in Java are special symbols or keywords that perform specific operations on one or more operands. They are used to manipulate data and variables in Java programs. 
Java provides a wide range of operators, which can be categorized into several types:  

1. Arithmetic Operators: These operators are used to perform basic mathematical operations such as addition (+), subtraction (-), multiplication (*), division (/), and modulus (%).

2. Relational Operators: These operators are used to compare two values and return a boolean result. Examples include equal to (==), not equal to (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=).

3. Logical Operators: These operators are used to combine multiple boolean expressions and return a boolean result. Examples include logical AND (&&), logical OR (||), and logical NOT (!).

4. Assignment Operators: These operators are used to assign values to variables. The most common assignment operator is the equals sign (=), but there are also compound assignment operators such as +=, -=, *=, /=, and %=.

5. Unary Operators: These operators operate on a single operand and include increment (++) and  decrement (--) operators, as well as the unary plus (+) and unary minus (-) operators.

6. Ternary Operator: This is a conditional operator that takes three operands and is used as a shorthand for an if-else statement. The syntax is: `condition ? expression1 : expression2;` where `expression1` is evaluated if the condition is true, and `expression2` is evaluated if the condition is false.

7. Bitwise Operators: These operators are used to perform bit-level operations on integer types. Examples include bitwise AND (&), bitwise OR (|), bitwise XOR (^), left shift (<<), right shift (>>), and unsigned right shift (>>>).

8. Instanceof Operator: This operator is used to test whether an object is an instance of a specific class or implements a specific interface. The syntax is: `object instanceof ClassName;` which returns true if the object is an instance of the specified class or interface, and false otherwise.
example:
```java
String str = "Hello";   
boolean isString = str instanceof String; // true
``` 

In Java, operators follow a specific precedence and associativity, which determines the order in which operations are performed in an expression. Understanding the different types of operators and their precedence is essential for writing correct and efficient Java code. 

*/
