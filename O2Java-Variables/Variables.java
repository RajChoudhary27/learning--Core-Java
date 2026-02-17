public class Variables {
    public static void main(String[] args) {
        // Example of declaring and initializing variables
        int age = 25; // Integer variable
        double salary = 50000.50; // Double variable
        String name = "John Doe"; // String variable
        boolean isEmployed = true; // Boolean variable

        // Printing the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Employed: " + isEmployed);

    }
}
/*
Variables in Java :-
Variables are used to store data in a Java program. They are like containers that hold values which can be changed during the execution of the program. Each variable has a specific type that determines what kind of data it can hold, such as integers, floating-point numbers, characters, or boolean values.
In Java, you must declare a variable before using it. The declaration includes the variable's type and its name. You can also initialize the variable at the time of declaration by assigning it a value. 
For example:
java int age = 25; // Declares an integer variable named 'age' and initializes it with the value 25```

Types of Variables in Java:
1. Local Variables: These are declared inside a method and can only be used within that method. They are created when the method is called and destroyed when the method exits.

2. Instance Variables: These are declared inside a class but outside of any method. They are associated with an instance of the class (an object) and can be accessed using the object reference.

3. Static Variables: These are declared with the `static` keyword inside a class but outside of any method. They belong to the class rather than any specific instance and can be accessed using the class name.

4. Final Variables: These are declared with the `final` keyword and cannot be changed once they are initialized. They are often used to define constants.   
*/
