class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpCasting {
    public static void main(String[] args) {
         Animal obj = new Dog();   // Upcasting
         //Or
         //Animal obj = (Animal) new Dog();  // explicit (not needed)

        obj.sound();  // allowed
        // obj.bark(); ❌ not allowed
    }
}
/*
Upcasting is used to achieve runtime polymorphism and make code flexible and reusable.
🔥 1. What is Upcasting?
💡 Definition
Upcasting = Child object ko Parent reference me assign karna
👉 Simple words:
Jab hum child class ke object ko parent class ke reference me store karte hain, usse Upcasting bolte hain.
* Important *
Reference decides → kaunsa method accessible hai  
Object decides → kaunsa method run hoga
*/
