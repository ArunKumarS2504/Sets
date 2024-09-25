package Hashmap;

import java.util.*;

public class Non_repeat_char {
	public int findIndex(String input) {
		
		HashMap<Character,Integer> find = new HashMap<>();
		
		if(input.length()==0) {
			return -1;
		}
		
		for(int i=0;i<input.length();i++) {
				char c = input.charAt(i);
				find.put(c, find.getOrDefault(c,0)+1);
		}
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if(find.get(c)==1) {
				return i;
			}
		}
		
		return -1;
		
	}
	public static void main(String args[]) {
		
		String str1 = "leetcode";
		String str2 = "loveleetcode";
		
		Non_repeat_char NRC = new Non_repeat_char();
		
		NRC.findIndex(str1);
		NRC.findIndex(str2);
		
		
	}
}


// input = "leetcode"; output = 0;
//Input: "loveleetcode"
//Output: 2
//
//Input: "aabb"
//Output: -1