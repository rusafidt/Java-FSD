package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap8 {

	public static void main(String[] args) {
		HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
		hash_map.put(1, "Black");
		hash_map.put(2, "Blue");
		hash_map.put(3,  "Red");
		hash_map.put(4, "Green");
		
		System.out.println("Original Hash Map : " +hash_map);
		System.out.println();
		
		System.out.println("1-> Does Value 'Green' exists ? ");
		if (hash_map.containsValue("Green")) {
			System.out.println("Yes  :) ");
		}
		else {
			System.out.println("No  :(");
		}
		
		System.out.println();
		
		System.out.println("2-> Does Value 'Rose' exists ? ");
		if (hash_map.containsKey("Rose")) {
			System.out.println("Yes :) ");
		}
		else {
			System.out.println("No :(");
		}
	}

}
