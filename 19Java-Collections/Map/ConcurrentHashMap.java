class ConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
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
ConcurrentHashMap
It is a thread-safe implementation of the Map interface that allows concurrent access and modifications by multiple threads without the need for external synchronization. It is designed to provide high concurrency and scalability in multi-threaded environments. ConcurrentHashMap achieves thread safety by using a combination of locking and non-blocking techniques, allowing multiple threads to read and write to the map concurrently without blocking each other. It is a good choice for scenarios where multiple threads need to access and modify a shared map without the overhead of synchronization, making it more efficient than HashTable in concurrent applications. ConcurrentHashMap does not allow null keys or null values, and it uses the hashCode() method of the keys to determine their position in the map. It provides methods such as putIfAbsent(), remove(), and replace() that allow for atomic operations on the map, making it easier to work with in concurrent programming scenarios.

It divides the map into segments and locks only the segment that is being accessed or modified, allowing other threads to access and modify different segments concurrently. This approach reduces contention and improves performance in multi-threaded applications compared to HashTable, which locks the entire map for every operation.

It is occur in Java 7 and later versions, and it is part of the java.util.concurrent package. It is recommended to use ConcurrentHashMap instead of HashTable for thread-safe operations, as ConcurrentHashMap provides better performance and scalability in concurrent environments.

it follow compare and swap mechanism to ensure thread safety, which allows multiple threads to access and modify the map concurrently without blocking each other. This makes it more efficient than HashTable in concurrent applications, as HashTable uses synchronized methods that can lead to contention and reduced performance in multi-threaded scenarios.
*/