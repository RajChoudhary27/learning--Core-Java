class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name; // Using this to refer to instance variable
        this.age = age;   // Using this to refer to instance variable
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name); // Using this to refer to instance variable
        System.out.println("Age: " + this.age);   // Using this to refer to instance variable
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
     // Example of using this keyword to differentiate between instance variables and local variables
        Person person = new Person("John", 30);
        person.displayInfo();   
    }
} 
/*
This keyword in Java is a reference variable that refers to the current object. It is used to differentiate between instance variables and local variables when they have the same name. The this keyword can also be used to call other constructors in the same class, and to pass the current object as an argument to a method or constructor.
*/