
import java.util.*;

public class Generics01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
/*
Generics in Java allow you to create classes, interfaces, and methods that can operate on any type of data. This provides type safety at compile time and eliminates the need for casting. For example, you can create a generic class like this:
class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}
In this example, T is a type parameter that can be replaced with any type when you create an instance of the Box class. For example:
Box<String> stringBox = new Box<>();
stringBox.set("Hello");
String value = stringBox.get();
This allows you to use the Box class with different types without having to write separate classes for each type. Generics also provide better code readability and maintainability, as it makes it clear what type of data is being used with the generic class or method.
*/