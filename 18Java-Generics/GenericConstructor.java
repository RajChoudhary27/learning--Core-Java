class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
public class GenericConstructor {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Hello, World!");
        System.out.println(box.getValue());
    }
}
/*
Generic Constructors in Java allow you to create constructors that can accept parameters of any type. This is useful when you want to create a class that can work with different types of data without having to write separate constructors for each type. For example, you can create a generic constructor like this:
*/
