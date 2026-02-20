
class Calculator {
    // Static method to add two numbers

    public int add(int a, int b) {
        return a + b;
    }
}

public class Methods {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        // Example of methods in Java
        int result = c.add(5, 10);
        System.out.println("The sum is: " + result);
    }

}
/*
Methods in Java are blocks of code that perform a specific task and can be called upon to execute whenever needed. They are defined within a class and can take parameters, return values, and contain a body of code that defines what the method does. Methods help in breaking down complex problems into smaller, manageable pieces, promoting code reusability and improving readability.

Types of Methods in Java:
1. Instance Methods: These methods belong to an instance of a class and can access instance variables and other instance methods. They require an object of the class to be invoked.

2. Static Methods: These methods belong to the class itself rather than any particular instance. They can be called without creating an object of the class and can only access static variables and other static methods.

3. Abstract Methods: These methods are declared without an implementation and must be implemented by subclasses.

4. Final Methods: These methods cannot be overridden by subclasses, ensuring that the method's behavior remains unchanged in any subclass.

 */
