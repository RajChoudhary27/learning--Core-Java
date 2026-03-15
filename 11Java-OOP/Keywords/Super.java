class A{
    A()
    {
        System.out.println("from A");
    }
    int x=10;
    void eat()
    {
        System.out.println("Eat Method Form Parent class..");
    }
}
class B extends A {
    B()
    {
     // super();  //Bydefault rehta hai ye 
        System.out.println("From B");
    }
    int x=20;
    void getData()
    {
        System.out.println("B ka x :- "+x);
        System.out.println("A ka x :- "+super.x);
    }2
    void eat()
    {
        super.eat();
        System.out.println("Eat Methof From Child Class..");
    }
}
public class Super {
    public static void main(String[] args) {
        B obj =new B();
        obj.getData();
        obj.eat();
        
    }
}
/*
Java me super keyword ka use parent class (superclass) ke members ko access karne ke liye hota hai.
Agar child class me same name ka method ya variable ho, to parent class ka version call karne ke liye super use karte hain.
Super Keyword ka use 3 jagah karte hai
1️⃣ Parent class ke variable ko access karne ke liye
2️⃣ Parent class ke method ko call karne ke liye
3️⃣ Parent class constructor call karne ke liye

✅ Short definition (interview ke liye)
super is a keyword in Java used to refer to the immediate parent class object. It is used to access parent class variables, methods, and constructors.

*/
