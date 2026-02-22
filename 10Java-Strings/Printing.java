
public class Printing {
    
    public static void main(String[] args) {
        // Printing in Java
        System.out.println("Hello, World!"); // Prints with a new line
        System.out.print("Welcome to Java Programming."); // Prints without a new line
        System.out.println(" This is a continuation of the previous line."); // Continues on the same line
        System.out.printf("The value of pi is approximately %.2f", Math.PI); // Formatted printing
       
    }

}
/*
Types of Printing in Java:
1. System.out.println(): This method prints the specified message to the console and moves the cursor to the next line. It is commonly used for printing messages and variables.

2. System.out.print(): This method prints the specified message to the console without moving the cursor to the next line. It is useful when you want to print multiple items on the same line.

3. System.out.printf(): This method allows you to print formatted strings. It uses format specifiers (e.g., %d for integers, %f for floating-point numbers, %s for strings) to format the output. It is useful for controlling the appearance of the output.

4.System.out.format(): This method is similar to printf() and can be used for formatted output. It also uses format specifiers to format the output.
example:
System.out.format("The value of pi is approximately %.2f", Math.PI);
output: The value of pi is approximately 3.14

* Here System is a class in the java.lang package that provides several useful methods for standard input and output. 
* The out variable is a static member of the System class that represents the standard output stream (usually the console). The println(), print(), printf(), and format() methods are used to print messages and variables to the console in different ways, as described above.

! Interview Questions:
?1. What is the difference between System.out.println() and System.out.print() in Java?
Answer: System.out.println() prints the specified message and moves the cursor to the next line, while System.out.print() prints the specified message without moving the cursor to the next line.

?2. How does System.out.printf() work in Java, and what are format specifiers?
Answer: System.out.printf() allows you to print formatted strings using format specifiers. Format specifiers are placeholders in the string that are replaced by the corresponding arguments. For example, %d is used for integers, %f for floating-point numbers, and %s for strings. You can also specify precision and width for the output.

?3. Can you explain the use of System.out.format() in Java and how it differs from System.out.printf()?
Answer: System.out.format() is similar to System.out.printf() and can be used for formatted output. Both methods use format specifiers to format the output. The main difference is that format() is a more general method that can be used with any PrintStream, while printf() is specifically designed for formatted output to the console. In practice, they are often used interchangeably when printing to the console.

?4. How would you print a variable of type double with two decimal places in Java?
Answer: You can use System.out.printf() or System.out.format() with the format specifier %.2f to print a double variable with two decimal places. For example:
double pi = Math.PI;
System.out.printf("The value of pi is approximately %.2f", pi);
This will output: The value of pi is approximately 3.14

?5. What is the purpose of the System class in Java, and how does it relate to printing output to the console?
Answer: The System class in Java is a part of the java.lang package and provides several useful methods and variables for standard input and output. The out variable is a static member of the System class that represents the standard output stream (usually the console). It allows you to print messages and variables to the console using methods like println(), print(), printf(), and format(). The System class also provides other functionalities, such as accessing environment variables, exiting the program, and getting the current time.

Format specifiers in Java:
- %d: Used for integers (e.g., int, long).
- %f: Used for floating-point numbers (e.g., float, double).
- %s: Used for strings.
- %c: Used for characters (e.g., char).
- %b: Used for boolean values (e.g., true, false).
- %n: Used for a platform-independent newline character.
- %e: Used for scientific notation of floating-point numbers.
- %x: Used for hexadecimal representation of integers.

%[argument_index$][flags][width][.precision]conversion
- argument_index$: Specifies the position of the argument to be formatted (e.g., %1$d for the first argument as an integer).
- flags: Modifies the output format (e.g., - for left-justification, + for including a sign, 0 for zero-padding).
- width: Specifies the minimum number of characters to be printed (e.g., %10s for a string with a minimum width of 10).
- .precision: Specifies the number of digits after the decimal point for floating-point numbers (e.g., %.2f for two decimal places).
*/
