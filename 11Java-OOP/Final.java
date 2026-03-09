class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}
final class MyFinalClass {
    // Class implementation
}   
public class Final {
    public static void main(String[] args) {
        // Final variable example
        final int MAX_VALUE = 100;
        System.out.println("Final Variable MAX_VALUE: " + MAX_VALUE);
        // Final method example
        Parent parent = new Parent();
        parent.display();
        // Final class example
        MyFinalClass myFinalClass = new MyFinalClass();
        System.out.println("Final Class example: " + myFinalClass);
    }
}
/*
final- variable, method, class
1. Final Variable: A final variable is a constant variable that cannot be changed once it has been initialized. It must be initialized at the time of declaration or within a constructor. Once assigned a value, it cannot be modified. For example:
final int MAX_VALUE = 100; // This variable cannot be changed after initialization

2. Final Method: A final method is a method that cannot be overridden by subclasses. This means that if a method is declared as final in a superclass, any subclass cannot provide its own implementation of that method. For example:
class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}   
class Child extends Parent {
    // This will cause a compile-time error because display() is final in the Parent class
    void display() {
        System.out.println("Trying to override a final method.");
    }
}

3. Final Class: A final class is a class that cannot be subclassed. This means that no other class can extend a final class. For example:
final class MyFinalClass {
    // Class implementation
}
// This will cause a compile-time error because MyFinalClass is final and cannot be extended
class AnotherClass extends MyFinalClass {
    // Class implementation             
}
In summary, the final keyword in Java is used to restrict the modification of variables, methods, and classes. It helps in creating constants, preventing method overriding, and ensuring that a class cannot be subclassed.
*/

