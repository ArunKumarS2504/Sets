package Hashmap;

import java.util.*;
import java.util.Map.Entry;

public class HashString {

	public static void main(String[] args) {
		
		String[] c = {"Apple","Orange","mango","Divya","Nani"};
		HashMap<String,Integer> FrequencyString = new HashMap<>();
		
		for(String value:c) {
			FrequencyString.put(value, FrequencyString.getOrDefault(value, 0)+1);
		}
		
		for(Entry<String, Integer> entry : FrequencyString.entrySet()) {
			System.out.println("String : "+ entry.getKey() + ", count : "+entry.getValue());
		}
	}
}
