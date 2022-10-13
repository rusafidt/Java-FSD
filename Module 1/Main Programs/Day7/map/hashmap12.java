package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap12 {

	private static final Object Blue = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Original Hash Map : " +hash_map);
		
		//Creating collection view for values
		System.out.println("Set (containing values) : " + hash_map.values());
	}

}
