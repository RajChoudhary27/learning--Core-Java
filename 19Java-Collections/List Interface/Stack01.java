
import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30); 
        System.out.println(stack);  //Output : [10,20,30]
        stack.pop();  //ye last element ko remove kar deta hai
        System.out.println(stack);  //Output : [10,20]
        stack.peek();  //ye last element ko access karne ke liye use hota hai
        System.out.println(stack);  //Output : [10,20]
        System.out.println(stack.size());  //Output : 2
        System.out.println(stack.isEmpty());  //Output : false
        stack.clear();  //ye stack ko empty kar deta hai
        System.out.println(stack);  //Output : []
    }
}
