import java.util.function.Function;
public class Function02 {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello")); // Output: 5

        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: 25
        Function<Integer,Integer> cube = x -> x * x * x;
        System.out.println(cube.apply(3)); // Output: 27

        // Chaining functions
        Function<String, Integer> lengthSquared = stringLength.andThen(square);
        System.out.println(lengthSquared.apply("Hello")); // Output: 25
    }
}

/*
Function is a functional interface that represents a function that takes an input of type T and produces a result of type R. It has a single abstract method called apply() that takes an argument of type T and returns a value of type R. In the example above, we define a Function that takes a String as input and returns its length as an Integer. We then use the apply() method to calculate the length of the string "Hello", which returns 5.
Function<T,R> ka use tab hota hai jab hume kisi input ko process karke ek output generate karna hota hai. For example, we can use a Function to convert a String to an Integer, or to perform some mathematical operation on a number. The Function interface also provides default methods such as andThen() and compose() that allow us to chain multiple functions together to create more complex operations. For example, we can use the andThen() method to chain two functions together:
Function<String, Integer> stringLength = s -> s.length();
Function<Integer, Integer> square = x -> x * x;
Function<String, Integer> lengthSquared = stringLength.andThen(square);
System.out.println(lengthSquared.apply("Hello")); // Output: 25
In this example, we first define a Function that calculates the length of a string, and then we define another Function that squares an integer. We then use the andThen() method to chain these two functions together, creating a new Function that calculates the length of a string and then squares that length. When we apply this new Function to the string "Hello", it first calculates the length (5) and then squares it, resulting in 25.   
*/
