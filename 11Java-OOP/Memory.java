public class Memory {
    public static void main(String[] args) {
        System.out.println("Learn about Memory in Java");
    }
}
/*
Memory in Java refers to the amount of RAM (Random Access Memory) that is allocated to an object when it is created. Every object in Java has a memory footprint, which is the amount of memory it occupies in the heap.
if we create class and its object and inside class we also create methods and variables then all these things will take memory. The memory is allocated to the object when it is created using the new keyword. The memory allocated to an object includes the memory for the instance variables, methods, and any other data associated with the object. The memory for an object is released when the object is no longer referenced and is eligible for garbage collection

Now, What is stored in heap or stack memory?

1. Heap Memory: The heap is a region of memory used for dynamic memory allocation. It is where all the objects and their instance variables are stored. When you create an object using the new keyword, it is allocated memory in the heap. The heap is shared among all threads in a Java application, and it is managed by the Java Virtual Machine (JVM). The heap is also where the garbage collector operates to free up memory that is no longer in use.

2. Stack Memory: The stack is a region of memory used for storing local variables and method call information. When a method is called, a new frame is created on the stack to hold the local variables and the return address. When the method returns, the frame is popped off the stack, and the memory is freed. The stack is thread-specific, meaning that each thread has its own stack. Primitive data types (such as int, float, boolean) and references to objects are stored in the stack, while the actual objects they reference are stored in the heap.

In summary, heap memory is used for storing objects and their instance variables, while stack memory is used for storing local variables and method call information. Understanding the difference between heap and stack memory is crucial for efficient memory management in Java applications.
*/
