class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
 
    void eat() {
        super.eat();    
        System.out.println("The dog eats dog food.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
 
    void eat() {
        super.eat();
        System.out.println("The cat eats cat food.");
    }
}
public class HierarchicalInheri {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Subclass method
       
        //to acess the eat method of the parent class we can use super keyword
        myDog.eat(); // Accessing the eat method of the parent class

        myCat.eat(); // Inherited from Animal
        myCat.meow(); // Subclass method
       
        //to acess the eat method of the parent class we can use super keyword
         myCat.eat(); // Accessing the eat method of the parent class
    }
}
