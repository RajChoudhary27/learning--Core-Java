class Calc{
  static void add(int a,int b)
{
    System.out.println(a+b);
}
static void add (double a,double b)
{
    System.out.println(a+b);
}
}
class Vechicle{
    void wheel()
    {
        System.out.println("wheel to honge sab vechicle mai..");
    }
}
class Car extends Vechicle{
     @Override
    void wheel() {
        System.out.println("Car has 4 wheels");
    }

    void Name()
    {
        System.out.println("Toyata -> Fortuner is my dream Car..");
    }
}
public class Poly {
    public static void main(String[] args) {
    //Compile time Polymorphism
        Calc c= new Calc();
        c.add(1,2);
        c.add(1.2,2.1);

      // Runtime Polymorphism
        Vechicle v = new Car();   // Upcasting
        v.wheel();               // Calls child method at runtime

    //Dynamic Method Dispatch:
    //Method call is resolved at runtime based on object type, not reference type.
    }
}
/*
1. What is Polymorphism?
Polymorphism = One name, many forms
In Java:
Polymorphism allows a method or object to behave differently in different situations.
Example (real life):
A person can be → student, employee, player (same person, different roles)

2. Types of Polymorphism in Java
Java supports 2 types of polymorphism:
1️⃣ Compile-Time Polymorphism (Static Binding)
Achieved by Method Overloading

2️⃣ Runtime Polymorphism (Dynamic Binding)
Achieved by Method Overriding


*/
