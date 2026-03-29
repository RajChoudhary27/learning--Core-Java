
import java.util.ArrayList;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);    // Output : [10, 20, 30]
        list.sort(null);  //ye list ko sort kar deta hai
        for(int x: list)
        {
            System.out.println(x);
        }

        //comparator is used to sort the list in a specific order
        list.sort((a,b)->b-a);  //ye list ko reverse order me sort kar deta hai
        System.out.println(list);  //Output :[30,20,10]

        ArrayList<String> list2 =new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        System.out.println(list2);  //Output :[Apple, Banana, Cherry]

        list2.sort((s1,s2)->s1.compareTo(s2));  //ye list ko alphabetical order me sort kar deta hai
        System.out.println(list2);  //Output :[Apple, Banana, Cherry]

        list2.sort((a,b)->a.length()-b.length());  //ye list ko length ke hisab se sort kar deta hai
        System.out.println(list2);  //Output :[Apple, Banana, Cherry]
    }
}

/*Comparator is a functional interface in Java that is used to define a custom sorting order for collections. It provides a method called compare() that takes two objects as parameters and returns an integer value based on the comparison of those objects. The compare() method returns a negative integer if the first object is less than the second object, zero if they are equal, and a positive integer if the first object is greater than the second object.

agar minus aata hai to pehla object chhota hai dusre se
agar zero aata hai to dono object barabar hai
agar plus aata hai to pehla object bada hai dusre se

*/
