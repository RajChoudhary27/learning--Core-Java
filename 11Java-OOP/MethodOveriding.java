class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class MethodOveriding {
    public static void main(String[] args) {
        Dog g=new Dog();
         g.sound();

    }
}
/*
Method overriding tab hota hai jab child class parent class ke method ko same name, same parameters ke saath dobara define karti hai.
*/
