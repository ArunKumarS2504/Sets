package hashSet;
import java.util.*;

public class HashsetExample {
	public static void main(String[] args) {
		
		HashSet <String> Cities = new HashSet<>();
		
		Cities.add("Paris");
		Cities.add("London");
		Cities.add("Madurai");
		Cities.add("Madrid");
		Cities.add("Barcelona");
		Cities.add("Miami");
		Cities.add("Sivakasi");
		Cities.add("Florida");
		Cities.add("Theni");
		System.out.println("Contains madurai ? "+ Cities.contains("Madurai"));
		System.out.println();
		
		System.out.println(Cities);
	}
	
	
}
