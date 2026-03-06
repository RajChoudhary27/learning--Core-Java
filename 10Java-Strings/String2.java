public class String2 {
    public static void main(String[] args) {
        // Example of using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!"); // Appends ", World!" to the StringBuilder
        System.out.println(sb);
      
        System.out.println(sb.toString()); // Output: Hello, World!
        //tostring() method is used to convert the StringBuilder object to a String representation for printing.
        //tostring() nahi lena to output me StringBuilder ka reference print hoga, jo ki kuch is tarah dikhega: java.lang.StringBuilder@15db9742.lekin aab bina tostring() ke bhi output me "Hello, World!" print hoga kyunki StringBuilder class me toString() method override kiya gaya hai, jisse jab bhi StringBuilder object ko print kiya jata hai, to uska content print hota hai na ki uska reference.
        sb.insert(5, " Java"); // Inserts " Java" at index 5
        System.out.println(sb.toString()); // Output: Hello Java, World!
        sb.delete(5, 10); // Deletes characters from index 5 to 9
        System.out.println(sb.toString()); // Output: Hello, World! 

        // Example of using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(", World!"); // Appends ", World!" to the StringBuffer
        System.out.println(sbf.toString()); // Output: Hello, World!
        sbf.insert(5, " Java"); // Inserts " Java" at index 5
        System.out.println(sbf.toString()); // Output: Hello Java, World!
        sbf.delete(5, 10); // Deletes characters from index 5 to 9
        System.out.println(sbf.toString()); // Output: Hello, World!
     
    }
}
/*  
! StringBuilder and StringBuffer in Java:
StringBuilder and StringBuffer are classes in Java that are used to create mutable strings, which means that their content can be modified after they are created. They are part of the java.lang package and provide methods for appending, inserting, deleting, and modifying strings.

StringBuilder is not synchronized, which means it is not thread-safe and should be used in single-threaded environments for better performance. StringBuffer, on the other hand, is synchronized and is thread-safe, making it suitable for use in multi-threaded environments.

* differences between StringBuilder and StringBuffer:
1. Synchronization: StringBuilder is not synchronized, while StringBuffer is synchronized.
2. Performance: StringBuilder is generally faster than StringBuffer because it does not have the overhead of synchronization.
3. Use Case: StringBuilder is recommended for use in single-threaded environments, while StringBuffer is recommended for use in multi-threaded environments where thread safety is a concern. 

synchronization ka matlab hai ki ek time par sirf ek thread hi StringBuffer object ko access kar sakta hai, jabki StringBuilder me aisa nahi hota, isliye StringBuilder zyada efficient hota hai jab aapko thread safety ki zarurat nahi hoti. 

or thread safety ki zarurat tab hoti hai jab aap multiple threads ke saath kaam kar rahe hote hain aur aapko ensure karna hota hai ki ek thread ke changes doosre thread ke liye visible hon aur data corruption na ho. 

*/
