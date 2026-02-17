public class Literals {
    public static void main(String[] args) {
        
        //Literals in Java are fixed values that are directly represented in the code. They can be of various types, such as integer literals, floating-point literals, character literals, string literals, and boolean literals.
        //Here are some examples of literals in Java:
        int intLiteral = 100; // Integer literal
        double doubleLiteral = 3.14; // Floating-point literal
        char charLiteral = 'A'; // Character literal
        String stringLiteral = "Hello, World!"; // String literal
        boolean booleanLiteral = true; // Boolean literal
        //Printing the literals
        System.out.println("Integer Literal: " + intLiteral);
        System.out.println("Double Literal: " + doubleLiteral);
        System.out.println("Character Literal: " + charLiteral);
        System.out.println("String Literal: " + stringLiteral);
        System.out.println("Boolean Literal: " + booleanLiteral);
       // **EXTRA HIDDEN THING**
       int x=0b1010; // Binary literal (10 in decimal)
       int y=0x1A; // Hexadecimal literal (26 in decimal)
       int z=012; // Octal literal (10 in decimal)
       int w=10_000; // Underscore in numeric literal for readability (10000 in decimal)
       System.out.println("Binary Literal (0b1010): " + x);
       System.out.println("Hexadecimal Literal (0x1A): " + y);
       System.out.println("Octal Literal (012): " + z);
       System.out.println("Underscore Literal (10_000): " + w);
    }
}
/*
java Literals in Java :-
Literals in Java are fixed values that are directly represented in the code. They can be of various types, such as integer literals, floating-point literals, character literals, string literals, and boolean literals. Each type of literal has its own syntax and rules for representation.

1. Integer Literals: These are whole numbers without a decimal point. They can be represented in decimal (base 10), binary (base 2), octal (base 8), or hexadecimal (base 16) formats. For example:
   - Decimal: `int decimalLiteral = 100;`
   - Binary: `int binaryLiteral = 0b1010;` (10 in decimal)
   - Octal: `int octalLiteral = 012;` (10 in decimal)
   - Hexadecimal: `int hexLiteral = 0x1A;` (26 in decimal)
 */
