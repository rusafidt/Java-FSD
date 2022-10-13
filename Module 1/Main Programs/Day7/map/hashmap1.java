package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println(hash_map);
		
		System.out.println();
		System.out.println("Or");
		System.out.println();
		
		for (Map.Entry x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}

}
