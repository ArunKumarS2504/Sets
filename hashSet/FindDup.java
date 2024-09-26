package hashSet;
import java.util.*;
public class FindDup {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(1,2,3);
		
		HashSet<Integer> Duplicate = new HashSet<>();
		
		boolean ans = false;
		
		for(int i : number) {
			if(!Duplicate.add(i)) {
				ans = true;
				System.out.println("Duplicate found :" + i);
			}
		}
		
		System.out.println(ans);
	}

}
