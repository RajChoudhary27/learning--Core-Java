public class LambaThread {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread is running using Lambda...");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
/*
Thread creation using Lambda Expressions:
1. Lambda expressions provide a concise way to create instances of functional interfaces, such as Runnable.
2. Instead of creating a separate class that implements Runnable, you can directly define the run() method using a lambda expression.   
3. This approach reduces boilerplate code and enhances readability.

*/