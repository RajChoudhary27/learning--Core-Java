class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}
public class MultilevelInheri {
    public static void main(String[] args) {
        // Creating an object of the most derived class
        Puppy myPuppy = new Puppy();
        myPuppy.eat(); // Inherited from Animal
        myPuppy.bark(); // Inherited from Dog
        myPuppy.weep(); // Subclass method
    }
}
/*
Multilevel Inheritance mai ek class doosri class se inherit karti hai, aur teesri class pehli class se inherit karti hai. Is example mai, Puppy class Dog class se inherit karti hai, aur Dog class Animal class se inherit karti hai. Is tarah, Puppy class ke paas Animal aur Dog dono ke properties aur behaviors hote hain.
Multilevel Inheritance promotes code reusability and establishes a natural hierarchical relationship between classes. It allows for more specific implementations in subclasses while still maintaining the general behavior defined in the superclass.
!  Example of Multilevel Inheritance:
iska usecase tab hota hai jab aapko ek class se properties aur behaviors inherit karne hain, aur phir us class se aur specific properties aur behaviors inherit karne hain. For example, aap ek general class "Vehicle" bana sakte hain, phir usse "Car" class inherit kar sakti hai, aur phir "ElectricCar" class "Car" class se inherit kar sakti hai. Is tarah, ElectricCar class ke paas Vehicle aur Car dono ke properties aur behaviors hote hain, aur aap ElectricCar class me specific properties aur behaviors add kar sakte hain.
*/
