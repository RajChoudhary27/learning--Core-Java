
public class RegularExpression {
    public static void main(String[] args) {
        
    }
}
/*
~ Regular Expressions in Java:
A regular expression (regex) is a sequence of characters that defines a search pattern. In Java, regular expressions are used for pattern matching and manipulation of strings. The java.util.regex package provides classes for working with regular expressions, including the Pattern and Matcher classes.
Example of using regular expressions in Java:
import java.util.regex.Pattern;
import java.util.regex.Matcher;

& Pattern kya karta hai? 
It compiles the regular expression into a pattern that can be used for matching.
& Matcher kya karta hai? 
It is used to perform match operations on a character sequence by interpreting a Pattern.
Example:
String input = "Hello, World!";
String regex = "Hello"; // Regular expression to match the word "Hello"
Pattern pattern = Pattern.compile(regex); // Compile the regular expression into a pattern
Matcher matcher = pattern.matcher(input); // Create a matcher for the input string
if (matcher.find()) {
    System.out.println("Match found!"); // Output: Match found!
} else {
    System.out.println("Match not found.");
}
^ Matching Symbols in Regular Expressions:
- . (dot): Matches any single character except a newline.
- * (asterisk): Matches zero or more occurrences of the preceding element.
- + (plus): Matches one or more occurrences of the preceding element.
- ? (question mark): Matches zero or one occurrence of the preceding element.
- ^ (caret): Matches the beginning of a line.
- $ (dollar sign): Matches the end of a line.
- [] (square brackets): Matches any one of the characters enclosed within the brackets.
- () (parentheses): Groups multiple tokens together and creates a capture group for extracting a substring.
- | (pipe): Acts as a logical OR operator to match either the expression before or after the pipe.
- \ (backslash): Escapes a special character to treat it as a literal character.

* Example of using regular expressions to validate an email address:
String email = "example@example.com";
String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(email);
if (matcher.matches()) {
    System.out.println("Valid email address.");
} else {
    System.out.println("Invalid email address.");
}
^ Meta characters in Regular Expressions:
- \d: Matches any digit (equivalent to [0-9]).
- \D: Matches any non-digit character (equivalent to [^0-9]).
- \w: Matches any word character (equivalent to [a-zA-Z0-9_]).
- \W: Matches any non-word character (equivalent to [^a-zA-Z0-9_]).
- \s: Matches any whitespace character (equivalent to [ \t\n\r\f]).
- \S: Matches any non-whitespace character (equivalent to [^ \t\n\r\f]).
- \b: Matches a word boundary (the position between a word character and a non-word character).
- \B: Matches a non-word boundary (the position between two word characters or two non-word characters).
- \A: Matches the beginning of the input string.
- \Z: Matches the end of the input string.
- \G: Matches the end of the previous match.

Example of using meta characters to find all words in a string:
String input = "Hello, World! Welcome to Java.";
String regex = "\\b\\w+\\b"; // Regular expression to match words
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);
while (matcher.find()) {
    System.out.println(matcher.group()); // Output: Hello, World, Welcome, to, Java
}

^Quantifiers in Regular Expressions:
- *: Matches zero or more occurrences of the preceding element.
- +: Matches one or more occurrences of the preceding element.
- ?: Matches zero or one occurrence of the preceding element.
- {n}: Matches exactly n occurrences of the preceding element.
- {n,}: Matches n or more occurrences of the preceding element.
- {n,m}: Matches between n and m occurrences of the preceding element.
Example of using quantifiers to match a specific pattern:
String input = "aaabbbccc";
String regex = "a{3}b{3}c{3}"; // Regular expression to match exactly 3 'a's, followed by 3 'b's, followed by 3 'c's
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);
if (matcher.matches()) {
    System.out.println("Pattern matches!"); // Output: Pattern matches!
} else {
    System.out.println("Pattern does not match.");
}
*/
