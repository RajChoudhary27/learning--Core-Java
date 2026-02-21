public class StackAndHeap {
    public static void main(String[] args) {
        
    }
}
/*
Stack and Heap in Java :-
In Java, memory is divided into two main areas: the stack and the heap.
1. Stack:
- The stack is a region of memory that stores local variables and function call information.
- It operates in a last-in, first-out (LIFO) manner, meaning that the most recently added item is the first one to be removed.
- Each time a method is called, a new block of memory is allocated on the stack for that method's local variables and parameters. When the method finishes executing, that block of memory is deallocated.
- The stack is generally faster than the heap because of its simple structure and the way it manages memory.

2. Heap:
- The heap is a region of memory used for dynamic memory allocation. It is where objects and class instances are stored.
- Unlike the stack, the heap does not have a fixed size and can grow or shrink as needed during the execution of a program.
- Memory in the heap is allocated and deallocated manually by the programmer (using new and delete in languages like C++) or automatically by the garbage collector in Java.
- The heap is generally slower than the stack because of its more complex structure and the way it manages memory.
*/
