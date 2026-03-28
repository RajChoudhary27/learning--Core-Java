//example of race condition
class Counter{
    int count = 0;
    public synchronized void increment() {
        count++;
    }

}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final count: " + c.count);
    }
}
/*
Race Condition occurs when two or more threads access shared data and try to change it at the same time. If the sequence of execution is not controlled, it can lead to unpredictable results. For example, if two threads are trying to increment the same counter variable, they might read the same value before either of them updates it, resulting in lost updates. To avoid race conditions, you can use synchronization mechanisms such as synchronized blocks or locks to ensure that only one thread can access the critical section of code that modifies the shared data at a time.    
*/
