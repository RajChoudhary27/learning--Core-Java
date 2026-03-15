class Animal {
    //protected ko subclass access kar sakta hai private ko nahi
    protected void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}   
public class SingleInheri {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Subclass method
    }
}
