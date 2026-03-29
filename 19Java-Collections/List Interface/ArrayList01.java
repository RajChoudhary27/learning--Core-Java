import java.util.*;
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        // ArrayList<Integer> list =new ArrayList<>(10);  //ye bhi kar sakte hai initial capacity de sakte hai
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);    // Output : [10, 20, 30]
        list.sort(null);  //ye list ko sort kar deta hai
        for(int x: list)
        {
            System.out.println(x);
        }

        list.remove(2);  
        System.out.println(list);     //Output :[10,20]

       int y= list.get(1);      
       System.out.println(y); //output  :20

       System.out.println(list.size());  //Output : 2

       list.add(1,30);   //ye aage kiska deta hai phele wale ko
       System.out.println(list);  //Output :[10,30,20]

       list.set(1,80);    //ye replace kar deta hai
       System.out.println(list);

       //Second way to crrate ArrayList
       List<String> list2=Arrays.asList("A","B","C");  //ye list ko array me convert kar deta hai
       System.out.println(list2);  //Output :[A,B,C]

       List<String> list3=List.of("X","Y","Z");  //ye bhi list ko array me convert kar deta hai
       System.out.println(list3);  //Output :[X,Y,Z]

       List<String> list4=new ArrayList<>(list3);
       list4.add("B");
       System.out.println(list4);  //Output :[X,Y,Z,B]
       System.out.println(list.contains(y));
       System.out.println(list.isEmpty());

       //converting list to array
       String[] arr=list2.toArray(new String[0]);
       System.out.println(Arrays.toString(arr));  //Output :[A,B,C]

        

    }
}
/*
ArrayList is a resizable array implementation of the List interface in Java. It allows us to store and manipulate a dynamic collection of elements. The ArrayList class provides various methods to add, remove, and access elements in the list. In the example above, we create an ArrayList of Integer type and add three integers (10, 20, and 30) to the list. Finally, we print the contents of the list, which outputs [10, 20, 30].

When you create an ArrayList , it has an initial capacity of 10. This means that it can hold up to 10 elements before it needs to resize itself. If you add more than 10 elements, the ArrayList will automatically resize itself by creating a new array with a larger capacity and copying the existing elements to the new array.

^ Operations on ArrayList:
1. Adding Elements: We can use the add() method to add elements to the ArrayList. It appends the specified element to the end of the list.
2. Removing Elements: We can use the remove() method to remove elements from the ArrayList. It can remove an element by index or by value.
3. Accessing Elements: We can use the get() method to access elements in the ArrayList by their index. The index starts from 0.
4. Size of the List: We can use the size() method to get the number of elements in the ArrayList.
5. Iterating through the List: We can use a for loop or an enhanced for loop to iterate through the elements of the ArrayList.
6. Clearing the List: We can use the clear() method to remove all elements from the ArrayList, making it empty.
7. Checking if the List is Empty: We can use the isEmpty() method to check if the ArrayList is empty or not.
8. Checking for an Element: We can use the contains() method to check if a specific element is present in the ArrayList.
9. Converting to an Array: We can use the toArray() method to convert the ArrayList to an array.
10. Sorting the List: We can use the Collections.sort() method to sort the elements in the ArrayList in natural order or using a custom comparator.


Time Complexity:
1. Adding an element at the end of the list: O(1) (amortized time complexity)
2. Adding an element at a specific index: O(n) (because elements need to be shifted)
3. Removing an element by index: O(n) (because elements need to be shifted)
4. Removing an element by value: O(n) (because it needs to search for the element first)
5. Accessing an element by index: O(1)
6. Checking if an element is present: O(n) (because it needs to search through the list)
7. Iterating through the list: O(n)
*/
