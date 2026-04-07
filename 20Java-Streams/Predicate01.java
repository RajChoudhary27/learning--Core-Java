import java.util.function.Predicate;
public class Predicate01 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(5)); // Output: false
    }
}
/*
Predicate is used to test a condition on a given input and return a boolean value (true or false). It is a functional interface that has a single abstract method called test(). The test() method takes an input of type T and returns a boolean value based on the condition defined in the lambda expression. In the example above, we define a Predicate that checks if a given integer is even. We then use the test() method to check if the numbers 4 and 5 are even, which returns true for 4 and false for 5.

ye condition ko variable me store karne ke liye use hota hai, jise hum baad me use kar sakte hai. Predicate ka use mainly filtering operations me hota hai, jaha hum kisi collection ke elements ko filter karna chahte hai based on a certain condition. For example, we can use a Predicate to filter out all the even numbers from a list of integers.
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
System.out.println(evenNumbers); // Output: [2, 4]
In this example, we use the filter() method of the Stream API to filter out all the even numbers from the list of integers using the isEven Predicate. The resulting list of even numbers is then collected into a new list using the collect() method and printed to the console.
*/