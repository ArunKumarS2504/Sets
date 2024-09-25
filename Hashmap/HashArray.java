package Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashArray {
	
	public static void main(String[] args) {
		
		int[] number = {1,1,2,3,3,3,2,1,5,3,6};
		
		HashMap<Integer,Integer> FrequencyNum = new HashMap<>();
		
		for(int num : number) {
				FrequencyNum.put(num, FrequencyNum.getOrDefault(num, 0)+1);
		}
		
		for(Entry<Integer, Integer> entry : FrequencyNum.entrySet()) {
			System.out.println("Number : "+ entry.getKey() + " count : "+entry.getValue() );
		}

	}

}
