package Hashmap;


import java.util.HashMap;
import java.util.Map;

public class Practice {
	
	public int Highestgrade(Map<String, Integer> studentGrades) {
		
		int grade = Integer.MIN_VALUE;
		
		
		for(Map.Entry<String,Integer> entry : studentGrades.entrySet()) {
        	Integer value = entry.getValue();
        	if(value>grade) {
        		grade=value;
        	}
        }
		return grade;
	}
	
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John", 85);
        studentGrades.put("Jane", 90);
        studentGrades.put("Sam", 78);
        studentGrades.put("Alice", 92);
        
        
        Practice p1 = new Practice();
        
        System.out.println("The highest grade is : "+p1.Highestgrade(studentGrades));
        
        System.out.println();
        
//        System.out.println("Students: "+ entry.getKey()+ ", Grade :"+entry.getValue());

//        You iterate directly over the entries (Map.Entry<String, Integer> entry), 
//        where each entry contains both the key and value.
        
    }
}
