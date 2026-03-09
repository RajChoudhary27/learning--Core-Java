class Mobile {
    String brand;
    String model;
    int price;
    //Static block to initialize static variables or perform setup when the class is loaded
    static {
        System.out.println("Mobile class is loaded. Static block executed.");
    }
    
    // Static variable to keep track of the total number of Mobile objects created
    static int totalMobiles = 0;
    
    // Constructor to initialize Mobile object and increment totalMobiles
    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        totalMobiles++; // Increment the static variable whenever a new Mobile object is created
    }
    
    // Static method to get the total number of Mobile objects created
    static int getTotalMobiles() {
        return totalMobiles;
    }
}
public class Static {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple", "iPhone 12", 799);
        Mobile m2 = new Mobile("Samsung", "Galaxy S21", 699);
        Mobile m3 = new Mobile("Google", "Pixel 5", 599);

        System.out.println("Total Mobiles Created: " + Mobile.getTotalMobiles());
    }
}
/*
! Static in Java:
In Java, the static keyword is used to indicate that a particular member (variable or method) belongs to the class rather than to instances of the class. This means that static members are shared among all instances of the class, and they can be accessed without creating an instance of the class.

* Static Variables:
- A static variable is shared among all instances of a class. It is initialized only once and retains its value across all instances. In the example above, totalMobiles is a static variable that keeps track of the total number of Mobile objects created. Whenever a new Mobile object is instantiated, the totalMobiles variable is incremented, and it reflects the total count of Mobile objects created.
* Static Variable Features
✔ Class se belong karta hai
✔ Sab objects share karte hain
✔ Memory me sirf ek copy hoti hai
✔ Class load hone par create hota hai
✔ Object create hone se pehle exist karta hai

? Static Methods:
- A static method belongs to the class and can be called without creating an instance of the class. It can only access static variables and other static methods directly. In the example above, getTotalMobiles() is a static method that returns the total number of Mobile objects created. It can be called using the class name (Mobile.getTotalMobiles()) without needing to create an instance of the Mobile class.
* Static Method Features
✔ Class se belong karta hai
✔ Sab objects share karte hain
✔ Memory me sirf ek copy hoti hai
✔ Class load hone par create hota hai
✔ Object create hone se pehle exist karta hai

* Rules for static methods:
1. Static methods can only access static variables and call other static methods directly. They cannot access instance variables or instance methods directly because they do not belong to any specific instance of the class.
2. Static methods can be called using the class name without creating an instance of the class. However, they can also be called using an instance of the class, but this is not recommended as it can lead to confusion about whether the method is static or instance-based.
3. Static methods cannot use the this keyword because they do not belong to any instance of the class. The this keyword refers to the current instance of the class, and since static methods are not associated with any instance, they cannot use it.

^ Static Blocks:
- A static block is a block of code that is executed when the class is loaded into memory. It is used to initialize static variables or perform any setup that needs to be done before the class is used. Static blocks are executed only once, and they run before any static methods or variables are accessed.
* Static Block Features
✔ Class load hone par execute hota hai
✔ Sirf ek baar execute hota hai
✔ Static variables ko initialize karne ke liye use hota hai

*/
