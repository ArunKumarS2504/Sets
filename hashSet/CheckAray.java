package hashSet;

import java.util.Arrays;
//Import the HashSet class
import java.util.HashSet;

public class CheckAray {
public static void main(String[] args) {
		
    
  // Create a HashSet object called numbers
 HashSet<Integer> numbers = new HashSet<Integer>();

 // Add values to the set
 numbers.addAll(Arrays.asList(new Integer[] {4,7,8,2}));

 // Show which numbers between 1 and 10 are in the set
 for(int i = 1; i <= 10; i++) {
   if(numbers.contains(i)) {
     System.out.println(i + " was found in the set.");
   } else {
     System.out.println(i + " was not found in the set.");
   }
 }
}
}
