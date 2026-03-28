class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread is running in A...");
                Thread.sleep(1000); // sleep for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread is running in B...");
           
        }
    }
}
public class ExtendThread01 {
    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(9);  // setting priority of thread obj1 to 9 (high priority)
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
/*
Make a thread by extending the Thread class:
1. Create a class that extends the Thread class.
2. Override the run() method to define the code that will be executed by the thread.
3. Create an instance of the thread class and call the start() method to begin execution.

iss tarah se hum multiple threads create kar sakte hain aur unko concurrently run kar sakte hain.
run() method likhna zaruri hai kyunki wahi method thread ke execution ke liye responsible hota hai. start() method call karne se thread run() method ko execute karta hai.
or bhi method apan ek thread class me define kar sakte hain, lekin run() method ko override karna zaruri hai taki thread ke execution ke liye code define ho sake.

*/
