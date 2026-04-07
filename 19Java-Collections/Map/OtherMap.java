public class OtherMap {
   public static void main(String[] args) {
    
   } 
}

/*
~WeakHashMap
It is a Map implementation that uses weak references for its keys. This means that if a key is no longer referenced elsewhere in the program, it can be garbage collected, and the corresponding entry in the map will be removed. This is useful for caching scenarios where you want to allow entries to be automatically removed when they are no longer needed.

~IdentityHashMap
It is a Map implementation that uses reference equality (==) instead of object equality (equals()) for comparing keys. This means that two keys are considered equal only if they are the same object in memory.
example:
IdentityHashMap<String, String> map = new IdentityHashMap<>();
map.put(new String("key"), "value1");
map.put(new String("key"), "value2");
In this example, even though the two keys are equal in terms of their content, they are different objects in memory, so both entries will be stored in the map.


~SortedMap
It is an interface that extends the Map interface and provides additional methods for working with sorted maps. A sorted map is a map that maintains its entries in a sorted order based on the keys. The most common implementation of the SortedMap interface is TreeMap, which uses a red-black tree to store its entries. The keys in a SortedMap must implement the Comparable interface or be provided with a Comparator to define the sorting order. The SortedMap interface provides methods such as firstKey(), lastKey(), headMap(), tailMap(), and subMap() to retrieve specific ranges of entries based on the keys.

~ImmutableMap
It is a Map implementation that is immutable, meaning that once it is created, it cannot be modified. ImmutableMap is part of the Guava library and provides a convenient way to create unmodifiable maps. It is useful in scenarios where you want to ensure that a map cannot be changed after it has been created, such as when you want to create a constant map or when you want to share a map across multiple threads without the need for synchronization. ImmutableMap provides various factory methods for creating immutable maps, such as of() and copyOf(), and it also provides methods for retrieving values based on keys, similar to other Map implementations.
example:
ImmutableMap<String, String> map = ImmutableMap.of("key1", "value1", "key2", "value2");
System.out.println(map.get("key1")); // Output: value1
System.out.println(map.get("key2")); // Output: value2   

~EnumMap
It is a Map implementation that is designed to work with enum keys. EnumMap is a specialized implementation of the Map interface that is optimized for use with enum types. It uses an array internally to store the values, which allows for very fast access and low memory overhead. EnumMap requires that the keys be of a specific enum type, and it provides methods for retrieving values based on enum keys.
example:
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}  
EnumMap<Day, String> map = new EnumMap<>(Day.class);
map.put(Day.MONDAY, "Work");
map.put(Day.SATURDAY, "Relax");
System.out.println(map.get(Day.MONDAY)); // Output: Work
System.out.println(map.get(Day.SATURDAY)); // Output: Relax 
*/
