enum Color {
    RED, GREEN, BLUE;
}
public class GenericsEnum {
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);

    }
}
/*

Generic Enums in Java allow you to define enums with type parameters, which can be specified when using the enum constants. This provides flexibility and type safety when working with different types of data within the enum.

*/
