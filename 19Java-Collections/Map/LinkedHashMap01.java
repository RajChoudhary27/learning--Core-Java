import java.util.LinkedHashMap;
public class LinkedHashMap01 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

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

        Integer res=map.getOrDefault("Two", 0);  //ye get or default dono ka combination hai agar key exist karti hai to uska value return karega nahi to default value return karega
        System.out.println(res);  //Output :2
    }
}

/*
LinkedHashMap is a subclass of HashMap that maintains a linked list of the entries in the map, in the order in which they were inserted. This means that when you iterate over the keys or values of a LinkedHashMap, they will be returned in the order they were added to the map.

Par jo least recently used (LRU) cache hota hai usme LinkedHashMap ka use hota hai kyunki usme order maintain hota hai aur hum easily access kar sakte hai ki kaunsa entry sabse pehle access hua tha aur usko remove kar sakte hai jab cache full ho jata hai.
print karne mai jo recently use karagya tha vo last mai print hoga aur jo least recently use hua tha vo first mai print hoga.

Important about LinkedHashMap:
1. It maintains the insertion order of the key-value pairs.
2. It allows one null key and multiple null values.
3. It provides constant-time performance for basic operations like get and put, assuming the hash function disperses the elements properly among the buckets.
4. It is not synchronized, meaning that it is not thread-safe. If you need a thread-safe implementation of the Map interface, you can use Collections.synchronizedMap() or ConcurrentHashMap.
5. It can be used to implement a least recently used (LRU) cache by overriding the removeEldestEntry() method to remove the least recently accessed entry when the cache reaches a certain size.

Interview Questions:
1. What is the difference between HashMap and LinkedHashMap?
- HashMap does not maintain any order of the key-value pairs, while LinkedHashMap maintains the insertion order of the key-value pairs. This means that when you iterate over the keys or values of a HashMap, they may be returned in any order, while in a LinkedHashMap, they will be returned in the order they were added to the map.  

2. Can LinkedHashMap be used as a cache?
- Yes, LinkedHashMap can be used to implement a least recently used (LRU) cache by overriding the removeEldestEntry() method to remove the least recently accessed entry when the cache reaches a certain size. This allows you to efficiently manage the cache and ensure that it does not exceed a specified capacity.    


*/