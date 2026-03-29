interface GenericInterfaceExample<T> {
    void display(T data);
}
class GenericInterfaceImpl<T> implements GenericInterfaceExample<T> {
    public void display(T data) {
        System.out.println("Data: " + data);
    }
}
public class GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceExample<String> impl = new GenericInterfaceImpl();
        impl.display("Hello, World!");
    }
}
/*
Generic Interfaces in Java allow you to define an interface with type parameters, which can be specified when implementing the interface. This provides flexibility and type safety when working with different types of data. For example, you can create a generic interface like this:
interface GenericInterfaceExample<T> {
    void display(T data);
}
In this example, T is a type parameter that can be replaced with any type when you implement the interface. When you create a class that implements this interface, you can specify the type you want to use. For example:
class GenericInterfaceImpl<T> implements GenericInterfaceExample<T> {
    public void display(T data) {
        System.out.println("Data: " + data);
    }
}
In this implementation, the display method can accept any type of data specified by T. When you create an instance of the GenericInterfaceImpl class, you can specify the type you want to use. For example:
GenericInterfaceExample<String> impl = new GenericInterfaceImpl();
impl.display("Hello, World!");
This allows you to use the same implementation for different types of data without having to write separate classes for each type. Generic interfaces provide better code reusability and maintainability, as it allows you to write more flexible and type-safe code.
*/
