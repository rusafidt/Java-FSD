package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap3 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Hash Map 1 : " + hash_map);
		
		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		hash_map1.put(5, "Brown");
		hash_map1.put(6, "Peach");
		hash_map1.put(7, "Pink");
		hash_map1.put(8, "Violet");
		
		System.out.println("Hash Map 2 : " + hash_map1);
		
		hash_map1.putAll(hash_map);
		System.out.println("Modified Hash Map 2 : " + hash_map1);
	}

}
