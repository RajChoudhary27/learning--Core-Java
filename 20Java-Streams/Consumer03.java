
import java.util.function.Consumer;

public class Consumer03 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello world"); // Output: HELLO WORLD
    }
}
/*
Consumer is a functional interface that represents an operation that takes an input of type T and returns no result. It has a single abstract method called accept() that takes an argument of type T and returns no value. In the example above, we define a Consumer that takes a String as input and prints its uppercase version. We then use the accept() method to print the uppercase version of the string "hello world", which outputs "HELLO WORLD".
*/