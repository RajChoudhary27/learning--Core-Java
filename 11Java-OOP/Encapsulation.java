class Person {
    private String name; // Private variable
    private int age;     // Private variable

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
/*
Encapsulation in Java is a fundamental object-oriented programming principle that involves bundling data (variables) and methods (functions) that operate on the data into a single unit, known as a class. It also restricts direct access to some of the object's components, which is a means of preventing accidental interference and misuse of the data.

Data hiding + controlled access = Encapsulation
Matlab:
Variables ko private banate hain
Access ke liye getter aur setter methods use karte hain
*/