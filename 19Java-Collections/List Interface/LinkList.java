import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkList<T> {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();   
       list.add(10);
       list.add(20);
       list.add(30);
       System.out.println(list);  //Output : [10,20,30]
       list.get(1);  //ye index ke hisab se element ko access karne ke liye use hota hai
       list.remove(1);  //ye index ke hisab se element ko remove karne ke liye use hota hai
       System.out.println(list);  //Output : [10,30]
       list.add(1,20);  //ye index ke hisab se element ko add karne ke liye use hota hai
       System.out.println(list);  //Output : [10,20,30]
       list.set(1,40);  //ye index ke hisab se element ko replace karne ke liye use hota hai
       System.out.println(list);  //Output : [10,40,30]
       System.out.println(list.size());  //Output : 3
       System.out.println(list.isEmpty());  //Output : false
       list.clear();  //ye list ko empty kar deta hai
       System.out.println(list);  //Output : []
       list.addFirst(10);
       list.addLast(20);
       System.out.println(list);  //Output : [10,20]

       LinkedList<String> list2=new LinkedList<>(Arrays.asList("A","B","C"));
       LinkedList<String> list3=new LinkedList<>(Arrays.asList("X","B","Z"));
       list2.removeAll(list3);  //ye list2 me se list3 ke elements ko remove kar deta hai
       System.out.println(list2);  //Output :[A,C]

    }
}
/*
Linklist Collection in Java is a data structure that allows us to store and manipulate a collection of elements. It is implemented as a doubly linked list, where each element (node) contains a reference to the next and previous nodes in the list. The LinkedList class provides various methods to add, remove, and access elements in the list. In the example above, we create an empty LinkedList of Integer type. We can add elements to the LinkedList using the add() method, remove elements using the remove() method, and access elements using the get() method. The LinkedList class also provides methods to check the size of the list, check if the list is empty, and perform other operations on the list.

Operations on LinkedList:
1. Adding Elements: We can use the add() method to add elements to the LinkedList. It appends the specified element to the end of the list.
2. Removing Elements: We can use the remove() method to remove elements from the LinkedList. It can remove an element by index or by value.
3. Accessing Elements: We can use the get() method to access elements in the LinkedList by their index. The index starts from 0.
4. Size of the List: We can use the size() method to get the number of elements in the LinkedList.
5. Checking if the List is Empty: We can use the isEmpty() method to check if the LinkedList is empty or not. It returns true if the list is empty, and false otherwise.
6. Iterating through the List: We can use a for-each loop or an iterator to iterate through the elements of the LinkedList.
7. Clearing the List: We can use the clear() method to remove all elements from the LinkedList, making it empty.

*/
