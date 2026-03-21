class A
{
    void display()
    {
        System.out.println("Hello world.... From Outer Class");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {

        A obj = new A() {
            void display() {
                System.out.println("Anonymous Inner Class");
            }
        };
       obj.display();
    }
}
/*
🔥 1. Anonymous Inner Class kya hota hai?
👉 Anonymous = without name

👉 Aisi inner class:
jiska koi naam nahi hota
ek hi baar use hoti hai
object banate time hi define hoti hai

💡 Simple line:
“Class bhi ban gayi + object bhi ban gaya → ek hi line me”
*/
