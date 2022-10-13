package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap6 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Original Hash Map : " +hash_map);
		
		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		hash_map1 = (HashMap<Integer, String>) hash_map.clone();
		
		System.out.println("Cloned Hash Map : " +hash_map1);
	}

}
