class A{
    void show()
    {
        System.out.println("Show Method of A...");
    }
    int x=10;
 class B
    {
        void display()
        {
            System.out.println("Display Method of B"+x);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
         obj1.display();
//inner class outer class ka data bhi use kar sakti hai ......bus inner class static nahi honi chaiyea.
        //if inner class is static then
        // A.B obj1=new A.B();
        // obj1.display();
        
    }
}

/*
🎯 2. Why Inner Class use karte hain?

👉 Jab:
code ko logically group karna ho
outer class ke data ko access karna ho
security & encapsulation improve karna ho

🔥 3. Types of Inner Classes (VERY IMPORTANT)
Java me 4 types hote hain:
! Member Inner Class (Regular)
✔ Features:
Outer class ke private members bhi access kar sakti hai
Outer object ke bina create nahi hoti

! Static Nested Class
✔ Features:\
Outer object ki need nahi
Sirf static members access kar sakti hai outer ke
example -> Outer.Inner obj = new Outer.Inner();
            obj.show();

! Local Inner Class
👉 Definition:
Method ke andar defined class

class Outer {
    void display() {
        class Inner {
            void show() {
                System.out.println("Local Inner");
            }
        }
        Inner obj = new Inner();
        obj.show();
    }
}
✔ Features:
Sirf us method ke andar use hoti hai
Method ke bahar access nahi

! Anonymous Inner Class


*/
