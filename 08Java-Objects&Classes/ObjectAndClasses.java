
public class ObjectAndClasses {

    // Defining a simple class named Car
    static class Car {

        String make;
        String model;
        int year;

        // Constructor to initialize the Car object
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        // Method to display car information
        public void displayInfo() {
            System.out.println("Car Make: " + make);
            System.out.println("Car Model: " + model);
            System.out.println("Car Year: " + year);
        }
    }

    public static void main(String[] args) {
        // Example of a simple class and object in Java

        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        // Calling the method to display car information
        myCar.displayInfo();

    }
}

/*
What is a Class in Java?
A class in Java is a user-defined data type that serves as a blueprint for creating objects. It encapsulates data for the object and methods to manipulate that data. A class can contain fields (variables) and methods (functions) that define the behavior of the objects created from the class. It can also include constructors, which are special methods used to initialize objects. Classes are fundamental to object-oriented programming in Java, allowing developers to create modular and reusable code.

What is an Object in Java?
An object in Java is an instance of a class. It is a real-world entity that has state (attributes) and behavior (methods). When you create an object from a class, you are allocating memory for that object and initializing its state using the class's constructor. Objects can interact with each   other and can be used to represent complex data structures and behaviors in a program. Each object has its own unique identity and can have different values for its attributes, even if they are created from the same class.

Why Use Classes and Objects in Java?
1. Encapsulation: Classes allow you to encapsulate data and methods together, which helps in hiding the internal implementation details and exposing only what is necessary through public methods.
2. Reusability: Once a class is defined, you can create multiple objects from that class, which promotes code reusability and reduces redundancy.
3. Modularity: Classes help in organizing code into logical units, making it easier to manage and maintain.
4. Inheritance: Classes can be extended to create new classes, allowing for code reuse and the creation of a hierarchical relationship between classes.
5. Polymorphism: Classes and objects enable polymorphism, which allows for methods to be used in different ways based on the object that is calling them, enhancing flexibility and integration in code design.

How class and object internally works in memory?
When a class is defined in Java, it is loaded into memory by the Java Class Loader. The class definition includes the structure of the class, such as its fields and methods. When an object is created from a class, memory is allocated for that object on the heap. The object's state (values of its fields) is stored in this allocated memory. The reference to the object is stored in a variable, which can be used to access the object's methods and fields. When the object is no longer needed, it becomes eligible for garbage collection, and the memory it occupies can be reclaimed by the Java Virtual Machine (JVM).
 */
