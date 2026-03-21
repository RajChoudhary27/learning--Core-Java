abstract class Car{
    public abstract void drive();
    public void playMusic()
    {
        System.out.println("hello music lover...");
    }
}

class Fortuner extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Car obj=new Fortuner();
        obj.playMusic();
        obj.drive();

    }
}
/*
📝 Abstract Keyword in Java (1-Page Notes)
🔹 Definition
abstract ek non-access modifier hai jo use hota hai:
abstract class banane ke liye
abstract method declare karne ke liye

👉 Abstract = incomplete / blueprint
🔹 Abstract Class
Aisi class jisme abstract methods ho sakte hain ya nahi bhi
Object create nahi kar sakte

✔ Features:
Constructor ho sakta hai
Normal + abstract methods dono allowed
Variables allowed
Static methods allowed

🔹 Abstract Method

Sirf declaration hota hai (no body)
abstract void sound();

✔ Rules:
Abstract class ke andar hi hoga
{} body nahi hoti
Child class ko override karna mandatory


*/