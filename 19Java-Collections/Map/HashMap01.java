import java.util.*;
public class HashMap01 {
    public static void main(String[] args) {        
       HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieving a value based on a key
        int value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Checking if a key exists in the map
        boolean containsKey = map.containsKey("Three");
        System.out.println("Does the map contain key 'Three'? " + containsKey);

        // Removing a key-value pair from the map
        map.remove("One");

        // Iterating over the keys and values in the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        } 
        map.remove("Two");
         for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}

/*
! Map in java
Map is an interface in Java that represents a collection of key-value pairs. It allows you to store and retrieve values based on their associated keys. The HashMap class is one of the most commonly used implementations of the Map interface.

Map does not extend the Collection interface, but it is still considered a part of the Java Collections Framework. It provides methods for adding, removing, and accessing key-value pairs, as well as methods for checking if a key or value exists in the map.

? Key Characteristics of Map:
1. Key-Value Pairs: Each entry in a Map consists of a key and a corresponding value. Keys are unique, meaning that each key can only be associated with one value. Values can be duplicated, meaning that multiple keys can be associated with the same value.
2. No Order: The order of the key-value pairs in a Map is not guaranteed. The order may change as elements are added or removed from the map.
3. Null Keys and Values: HashMap allows one null key and multiple null values. However, other implementations of the Map interface, such as TreeMap, do not allow null keys.
4. Performance: HashMap provides constant-time performance for basic operations like get and put, assuming the hash function disperses the elements properly among  the buckets. However, the performance can degrade if there are many hash collisions (i.e., multiple keys hashing to the same bucket).
5. Iteration: You can iterate over the keys, values, or key-value pairs in a Map using various methods, such as keySet(), values(), and entrySet().

! HASHMAP:
HashMap is a widely used implementation of the Map interface that uses a hash table to store key-value pairs. It provides constant-time performance for basic operations like get and put, making it a popular choice for many applications. However, it is important to note that HashMap is not synchronized, meaning that it is not thread-safe. If you need a thread-safe implementation of the Map interface, you can use ConcurrentHashMap or Collections.synchronizedMap().

! How data is stored in HashMap:
~ step 1: Hashing the key
When you put a key-value pair into a HashMap, the key is hashed using its hashCode() method. The hash code is an integer that represents the key and is used to determine where to store the value in the underlying array.
~ step 2: Index calculation
The hash code is then used to calculate the index in the array where the key-value pair should be stored. This is typically done using the formula: index = hashCode % arrayLength. The array length is usually a power of 2, which helps to distribute the keys more evenly across the array.
~ step 3: Handling collisions
Since multiple keys can have the same hash code (called a collision), HashMap uses a linked list or a balanced tree (in Java 8 and later) to store multiple key-value pairs at the same index. When a collision occurs, the new key-value pair is added to the list or tree at that index.
~  step 4: Retrieving values
When you retrieve a value from the HashMap using a key, the key is hashed again to calculate the index. The HashMap then checks the list or tree at that index for the key and returns the corresponding value if the key is found. If the key is not found, it returns null.

hashmap resizes itself when the number of key-value pairs exceeds a certain threshold (called the load factor). When resizing occurs, the HashMap creates a new array with a larger capacity and rehashes all the existing key-value pairs into the new array. This helps to maintain the performance of the HashMap as it grows in size.
*/
