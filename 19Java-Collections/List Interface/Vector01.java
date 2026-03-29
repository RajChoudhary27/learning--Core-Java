import java.util.*;
public class Vector01 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,3);  
        //ye bhi kar sakte hai initial capacity de sakte hai aur increment value bhi de sakte hai
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector.capacity());  //Output : 5
         vector.add(40);
         vector.add(50);
         System.out.println(vector.capacity());  //Output : 5
         vector.add(60);
         System.out.println(vector.capacity());  //Output : 8 (5+3)
        System.out.println(vector);  //Output : [10,20,30]
        vector.get(1);  //ye index ke hisab se element ko access karne ke liye use hota hai
        vector.remove(1);  //ye index ke hisab se element ko remove karne ke liye use hota hai
        System.out.println(vector);  //Output : [10,30]
        vector.add(1,20);  //ye index ke hisab se element ko add karne ke liye use hota hai
        System.out.println(vector);  //Output : [10,20,30]
        vector.set(1,40);  //ye index ke hisab se element ko replace karne ke liye use hota hai
        System.out.println(vector);  //Output : [10,40,30]
        System.out.println(vector.size());  //Output : 3
        System.out.println(vector.isEmpty());  //Output : false
        vector.clear();  //ye list ko empty kar deta hai
        System.out.println(vector);  //Output : []
        vector.add(10);
        vector.add(20);
        System.out.println(vector);  //Output : [10,20] 
    }
}

/*
Vector is a legacy class in Java that implements the List interface. It is similar to ArrayList but is synchronized, which means that it is thread-safe. However, due to its synchronization overhead, it is generally recommended to use ArrayList instead of Vector in modern Java programming. The Vector class provides methods to add, remove, and access elements in the list, as well as methods to check the size of the list and whether it is empty or not. In the example above, we create an empty Vector of Integer type. We can add elements to the Vector using the add() method, remove elements using the remove() method, and access elements using the get() method. The Vector class also provides methods to check the size of the list, check if the list is empty, and perform other operations on the list.

? Features of Vector:
1. Synchronized: Vector is synchronized, which means that it is thread-safe. Multiple threads can access a Vector object without causing any issues.
2. Dynamic Resizing: Like ArrayList, Vector can dynamically resize itself as elements are added or removed. It automatically increases its capacity when needed.
3. Legacy Class: Vector is a legacy class in Java, which means that it has been around since the early versions of Java. It is not recommended to use Vector in modern Java programming, and it is generally recommended to use ArrayList instead.
4. Methods: Vector provides various methods to add, remove, and access elements in the list, as well as methods to check the size of the list and whether it is empty or not.
5. Performance: Due to its synchronization overhead, Vector may have slower performance compared to ArrayList in single-threaded scenarios. However, in multi-threaded scenarios where thread safety is required, Vector can be a suitable choice.

! Methods of Vector:
1. add(E e): Adds the specified element to the end of the Vector.
2. add(int index, E element): Inserts the specified element at the specified position in the Vector.
3. remove(int index): Removes the element at the specified position in the Vector.  
4. get(int index): Returns the element at the specified position in the Vector.
5. set(int index, E element): Replaces the element at the specified position in the
Vector with the specified element.
6. size(): Returns the number of elements in the Vector.
7. isEmpty(): Returns true if the Vector contains no elements, false otherwise.
8. clear(): Removes all elements from the Vector, making it empty.
*/
