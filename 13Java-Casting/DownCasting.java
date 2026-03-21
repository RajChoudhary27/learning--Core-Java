class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class DownCasting {
    public static void main(String[] args) {

        Animal obj = new Dog();   // Upcasting

        Dog d = (Dog) obj;        // Downcasting

        d.bark();  // now accessible
    }
}
/*
🔥 1. What is Downcasting?
💡 Definition
Downcasting = Parent reference ko Child type me convert karna

👉 Simple words:
Jab hum parent reference ko wapas child type me convert karte hain, usse Downcasting bolte hain.

👉 Downcasting kabhi direct nahi hota
👉 Pehle Upcasting hota hai, phir Downcasting
*/