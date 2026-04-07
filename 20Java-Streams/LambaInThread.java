public class LambaInThread {
    public static void main(String[] args)  {
        // Thread t = new Thread(() -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Thread is running: " + i);
        //     }
        // });
        // t.start();

        //or short
        // new Thread(() -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Thread is running: " + i);
        //     }
        // }).start();

        MathOperation addition = (a, b) -> a + b;
        int result = addition.operation(5, 3);
        System.out.println("Result of addition: " + result); 
    }
}
interface MathOperation {
    int operation(int a, int b);
}
/*
 * This program demonstrates the use of lambda expressions in creating threads.
it is used in functional interface, which is an interface that has only one abstract method. In this case, we are using the Runnable interface, which has a single abstract method called run(). The lambda expression () -> { ... } is used to provide the implementation of the run() method. The code inside the lambda expression will be executed when the thread is started. In this example, the thread will print "Thread is running: " followed by the value of i, which ranges from 0 to 4. This allows us to create and run a thread in a more concise and readable way compared to using an anonymous inner class.
 */
