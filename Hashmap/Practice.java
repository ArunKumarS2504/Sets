package Hashmap;


import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John", 85);
        studentGrades.put("Jane", 90);
        studentGrades.put("Sam", 78);
        studentGrades.put("Alice", 92);

        // Iterate over the entry set (key-value pairs)
        for(Map.Entry<String,Integer> entry : studentGrades.entrySet()) {
        	System.out.println("Students: "+ entry.getKey()+ ", Grade :"+entry.getValue());
        }
    }
}
