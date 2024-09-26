package hashSet;
import java.util.*;


public class Demo {
	public static void main(String[] args) {
		
		HashSet <Integer> nums = new HashSet<>();
		nums.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		
		HashSet <Integer> nums1 = new HashSet<>();
		nums1.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5  }));
	
		HashSet<Integer> Union = new HashSet<>(nums);
		Union.addAll(nums1);
		System.out.print("Union of the two Set :");
		System.out.print(Union);
		
		System.out.println();
		
		HashSet<Integer> Intesc = new HashSet<>(nums);
		Intesc.retainAll(nums1);
		System.out.print("Intersection of the two Set :");
		System.out.print(Intesc);
		
		System.out.println();
		
		Set<Integer> difference = new HashSet<Integer>(nums);
        difference.removeAll(nums1);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
	
	}

}
