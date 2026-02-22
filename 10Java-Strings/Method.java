
public class Method {
    public static void main(String[] args) {
      //Example of common interview question on String methods
      String str = "Hello, World!";
      System.out.println("Length of the string: " + str.length()); // Output: 13
      System.out.println("Character at index 7: " + str.charAt(7)); // Output: W
      System.out.println("Substring from index 0 to 5: " + str.substring(0, 5)); // Output: Hello
      System.out.println("Index of 'World': " + str.indexOf("World")); // Output: 7
      System.out.println("Does the string contain 'Hello'? " + str.contains("Hello")); // Output: true
      System.out.println("String in uppercase: " + str.toUpperCase()); // Output: HELLO, WORLD!
      System.out.println("String in lowercase: " + str.toLowerCase()); // Output: hello, world!
      
      
    }
}
/*
Methods of String class in Java:
1. length(): Returns the length of the string.
2. charAt(int index): Returns the character at the specified index.
3. substring(int beginIndex): Returns a new string that is a substring of this string starting from the specified index to the end of the string.
4. substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string starting from the specified beginIndex to the specified endIndex (exclusive).
5. indexOf(String str): Returns the index of the first occurrence of the specified substring, or -1 if it is not found.
6. lastIndexOf(String str): Returns the index of the last occurrence of the specified substring, or -1 if it is not found.
7. equals(Object obj): Compares this string to the specified object for equality.
8. equalsIgnoreCase(String anotherString): Compares this string to another string, ignoring case considerations.
9. toUpperCase(): Converts all characters in the string to uppercase.
10. toLowerCase(): Converts all characters in the string to lowercase.
11. trim(): Removes leading and trailing whitespace from the string.
12. replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
13. replaceAll(String regex, String replacement): Replaces each substring of this string that matches the given regular expression with the given replacement.
14. split(String regex): Splits this string around matches of the given regular expression and returns an array of strings.
15. contains(CharSequence s): Returns true if this string contains the specified sequence of char values.
16. startsWith(String prefix): Tests if this string starts with the specified prefix.
17. endsWith(String suffix): Tests if this string ends with the specified suffix.
18. isEmpty(): Returns true if this string is empty (length() == 0).
19. concat(String str): Concatenates the specified string to the end of this string.
20. toCharArray(): Converts this string to a new character array.
21. valueOf(int i): Returns the string representation of the int argument.


*/
