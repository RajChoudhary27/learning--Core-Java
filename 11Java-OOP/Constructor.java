class Person {
    private String name;
    private int age;
    
    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Constructor {
    public static void main(String[] args) {
       // Example of parameterized constructor
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
      // Example of default constructor
        Person person3 = new Person();
      // Example of copy constructor
        Person person4 = new Person(person1);
        
        person1.displayInfo();
        person2.displayInfo(); 
    }
}
/*
Constructor in Java is a special method that is used to initialize objects. It is called when an instance of a class is created. A constructor has the same name as the class and does not have a return type. It can be used to set initial values for object attributes or to perform any setup required when an object is created.

Types of Constructors:
1. Default Constructor: A constructor that takes no arguments and initializes the object with default values.
2. Parameterized Constructor: A constructor that takes arguments to initialize the object with specific values.
3. Copy Constructor: A constructor that creates a new object as a copy of an existing object.

Important points about constructors for placement  in Java:
1. A constructor is called automatically when an object is created using the new keyword.
2. If no constructor is defined in a class, the Java compiler provides a default constructor that initializes the object with default values.
3. A constructor can be overloaded, meaning you can have multiple constructors with different parameter lists in the same class.
4. A constructor cannot be abstract, static, final, or synchronized.
5. The constructor can call another constructor in the same class using the this() syntax, which is known as constructor chaining.
*/