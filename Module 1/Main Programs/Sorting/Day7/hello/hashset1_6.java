package hello;

import java.util.HashSet;

public class hashset1_6{

	public static void main(String[] args) {
		HashSet <String> list = new HashSet<String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		
		//inserting last element
		list.add("Bye");
		
		System.out.println("Hash Set : " + list);
	}



	}
