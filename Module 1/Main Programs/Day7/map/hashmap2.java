package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap2 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Hash Map = " +hash_map);
		
		System.out.println("Size of the Hash Map : " + hash_map.size());
	}

}
