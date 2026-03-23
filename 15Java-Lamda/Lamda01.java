


// interface A {

//     void show();
// }
interface B
{
    int display(int x);
    
}
public class Lamda01 {

    public static void main(String[] args) {
        /* Old Version */
        //  A obj=new A(){
        //     public void show()
        //    {
        //     System.out.println("in Anonymous class..");
        //  }
        //    } ;
        //    obj.show();

        /*New Version */
        // A obj = () -> {
        //     System.out.println("in show..");
        // };
        // obj.show();

        /* or Short */
        // A obj= ()->System.out.println("in show");
        // obj.show();

        /* For Return type */
           B ob= x-> x;      //internally it returns x;
           ob.display(5);
    }
}

/*
👉 Simple definition:
Lambda expression = anonymous function (naam ke bina function)
Matlab:
Function hai ✔️
Naam nahi hai ❌
Direct use hota hai ✔️

🔹Functional Interface (VERY IMPORTANT ⚡)
👉 Lambda tabhi use hota hai jab:
Interface me sirf 1 abstract method ho
Isko bolte hai:
👉 Functional Interface

*  Different Lambda Forms
1️⃣ No parameter
() -> System.out.println("Hello");

2️⃣ One parameter
(a) -> System.out.println(a);

👉 Shortcut:
a -> System.out.println(a);

3️⃣ Multiple parameters
(a, b) -> a + b;

4️⃣ Multi-line body

(a, b) -> {
    int c = a + b;
    return c;
};
*/
