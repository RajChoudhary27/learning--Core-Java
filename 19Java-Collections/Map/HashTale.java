
import java.util.Hashtable;

public class HashTale {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map.get("key1")); // Output: value1
        System.out.println(map.get("key2")); // Output: value2
        System.out.println(map.containsKey("key1")); // Output: true
        System.out.println(map.containsKey("key3")); // Output: false
        map.remove("key1");
        System.out.println(map.containsKey("key1")); // Output: false
        
    }
}

/*
HashTable
It is a legacy class that implements the Map interface and is part of the Java Collections Framework. It is similar to HashMap but is synchronized, which means that it is thread-safe and can be used in multi-threaded environments without the need for external synchronization. However, due to its synchronized nature, it can be less efficient than HashMap in single-threaded scenarios. HashTable does not allow null keys or null values, and it uses the hashCode() method of the keys to determine their position in the table. It is generally recommended to use HashMap instead of HashTable in modern Java programming, unless you specifically require the thread-safety provided by HashTable.

Now it is recommended to use ConcurrentHashMap instead of HashTable for thread-safe operations, as ConcurrentHashMap provides better performance and scalability in concurrent environments.

It is slower than HashMap because of its synchronized methods, which can lead to contention and reduced performance in multi-threaded applications. In contrast, HashMap is not synchronized and can provide better performance in single-threaded scenarios.


*/
