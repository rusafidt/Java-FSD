package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap10 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Original Hash Map : " +hash_map);
		System.out.println();
		
		String val;
		val = hash_map.get(1);
		System.out.println("Value for Key '1' is : " + val);
	}

}
