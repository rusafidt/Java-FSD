package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap5 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		Boolean result = hash_map.isEmpty();
		System.out.println("Is Hash Map empty? : " +result);
		
		hash_map.clear();
		
		Boolean result1 = hash_map.isEmpty();
		
		System.out.println("Is Hash Map Empty? : " +result1);
	}

}
