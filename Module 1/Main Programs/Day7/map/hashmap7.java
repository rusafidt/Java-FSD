package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap7 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Original Hash Map : " +hash_map);
		System.out.println();
		
		System.out.println("1-> Does Key 1 exists ? ");
		if (hash_map.containsKey(1)) {
			System.out.println("Yes - " + hash_map.get(1));
		}
		else {
			System.out.println("No ");
		}
		
		System.out.println();
		
		System.out.println("2-> Does Key '9' exists ? ");
		if (hash_map.containsKey(9)) {
			System.out.println("Yes - " + hash_map.get(9));
		}
		else {
			System.out.println("No");
		}
	}

}
