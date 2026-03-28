class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread is running in A...");
        }
    }
}
class B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread is running in B...");
        }
    }
}
public class ImplementRun {
    public static void main(String[] args) {
        Runnable obj1 = new A();        //A is a Runnable object
        Runnable obj2 = new B();       

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

/*
Implementing the Runnable interface to create a thread:
1. Create a class that implements the Runnable interface.
2. Override the run() method to define the code that will be executed by the thread.
3. Create an instance of the thread class and pass it to a Thread object, then call the start() method to begin execution.

ye tab use hota hai jab aapko apni class ko kisi aur class se inherit karna hota hai, kyunki Java me ek class sirf ek hi class ko extend kar sakti hai. Agar aap Thread class ko extend karte hain, to aap apni class ko kisi aur class se extend nahi kar sakte. Isliye Runnable interface ka use karke aap apni class ko Thread ke saath integrate kar sakte hain bina inheritance ke restriction ke.

internally implemnting runnable interface thread class ke run method ko call karta hai, aur run method me jo code likha hota hai wo thread ke execution ke liye responsible hota hai. start() method call karne se thread run() method ko execute karta hai.


*/
