package Hashmap;
import java.util.*;

public class HashmapLoop {
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> Items = new HashMap<>();
		
		Items.put(1,"Apple");
		Items.put(2,"tomoto");
		Items.put(3,"Orange");
		Items.put(4,"Pine");
		Items.put(5,"Mango");
		
		for(Integer Key : Items.keySet()) 
		{
			String value = Items.get(Key);
			System.out.println("Key :"+ Key + " Value :"+ value);
		}
	}

}
