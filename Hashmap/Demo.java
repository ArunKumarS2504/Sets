package Hashmap;
//Importing basic classes

import java.util.*;

public class Demo {

 public static void main(String args[])
 {
     // No need to mention the generic type twice
     HashMap<Integer, String> hm1
         = new HashMap<>(5, 0.75f);

     // Initialization of a HashMap using Generics
     HashMap<Integer, String> hm2
         = new HashMap<Integer, String>(3, 0.5f);
     
     Map<Integer,Integer> quantity = new HashMap<>();
     
     quantity.put(1,2);
     quantity.put(2, 3);
     
     for(int key:quantity.keySet()) {
    	 System.out.println(key + quantity.get(key));
     }

     // Add Elements using put() method
     // Custom input elements
     hm1.put(1, "one");
     hm1.put(2, "two");
     hm1.put(3, "three");

     hm2.put(4, "four");
     hm2.put(5, "five");
     hm2.put(6, "six");

     // Print and display elements in object of hashMap 1
     System.out.println("Mappings of HashMap hm1 are : "
                        + hm1);

     // Print and display elements in object of hashMap 2
     System.out.println("Mapping of HashMap hm2 are : "
                        + hm2);
 }
}
