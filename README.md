

# HashMap in Java
### Overview
-HashMap is a part of the Java Collections Framework and is used for storing key-value pairs. It provides efficient data retrieval and allows null keys and values. It is not synchronized, making it faster than some other collection types, but it is not thread-safe.

- ## Structure
A HashMap consists of:

Keys: Unique identifiers used to access values.
Values: Data associated with the keys.
Buckets: An array of linked lists used to handle collisions.

## How It Works
**Hashing:** When a key-value pair is added, the key is hashed to determine its bucket index.

**Collision Handling:** If multiple keys hash to the same bucket, a linked list (or tree, if **the list gets too long) is used to store multiple key-value pairs.

**Load Factor:** The load factor determines when to resize the HashMap. The default load factor is 0.75, meaning that when 75% of the HashMap is filled, it will resize to double its capacity.

Basic Methods
1. Declaration and Initialization
```HashMap<KeyType, ValueType> hashMap = new HashMap<>();```
Example:
```HashMap<String, Integer> ageMap = new HashMap<>();```
2. Adding Key-Value Pairs
java
Copy code
hashMap.put(key, value);
Example:
java
Copy code
ageMap.put("Alice", 30);
ageMap.put("Bob", 25);
3. Accessing Values
java
Copy code
ValueType value = hashMap.get(key);
Example:
java
Copy code
Integer age = ageMap.get("Alice"); // Returns 30
4. Checking for Keys
java
Copy code
boolean exists = hashMap.containsKey(key);
Example:
java
Copy code
boolean hasAlice = ageMap.containsKey("Alice"); // Returns true
5. Removing Key-Value Pairs
java
Copy code
hashMap.remove(key);
Example:
java
Copy code
ageMap.remove("Bob"); // Removes Bob from the map
6. Iterating Through the HashMap
Using entrySet():

java
Copy code
for (Map.Entry<KeyType, ValueType> entry : hashMap.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
Example:
java
Copy code
for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
    System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
}
7. Checking the Size
java
Copy code
int size = hashMap.size();
Example:
java
Copy code
int numberOfEntries = ageMap.size(); // Returns the number of key-value pairs
