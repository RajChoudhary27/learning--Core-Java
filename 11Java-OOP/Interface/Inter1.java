interface A
{
    void display();        // by default public abstract

// 👉 Interface ke andar:
// ✔ Methods → by default public abstract
// ✔ Variables → by default public static final (constant) 
}
class B implements A{
    public void display()
    {
       System.out.println("Display of Class B");
    }

}
public class Inter1 {
    public static void main(String[] args) {
        A obj =new B();        // upcasting
        obj.display();
    }
}

/*
Interface kya hota hai?
👉 Interface ek blueprint hota hai (like abstract class but more strict)

👉 Ye define karta hai:
kya karna hai (what)
kaise karna hai (how) → class decide karegi

💡 Simple:
Interface = 100% contract
& Java me multiple inheritance sirf interface se possible hai
✔ Interface ka object nahi banega
✔ Methods public hone chahiye (override me)
✔ Variables = constant
✔ Multiple interfaces implement kar sakte ho
✔ Constructor nahi hota

🧩 8. Types of Methods in Interface (Java 8+)

🔸 1. Abstract Method (default)
void show();

🔸 2. Default Method (Java 8)
👉 Why introduced?
👉 Taaki interface update hone par purani classes break na ho

👉 Definition:
Method jisme:
body hoti hai
default keyword use hota hai
ye interface mai use karte hai ..isko implement karne wali class mai compultion nahi hota ki usko use karna he karna hai..jarurat padi to override kar sakte hai.

interface A {
    default void greet() {
        System.out.println("Hello");
    }
}
⚡ Features:
✔ Body allowed
✔ Override kar sakte ho
✔ Backward compatibility

🔸 3. Static Method (Java 8)
static void info() {
    System.out.println("Static method");
}
 
🔸 4. Private Method (Java 9)
👉 Sirf internal use ke liye
private void helper() {};


*/
