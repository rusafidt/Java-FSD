package hello;

import java.util.HashSet;

public class hashset2_7{

	public static void main(String[] args) {
		HashSet <String> list = new HashSet<String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		list.add("Bye");
		
		System.out.println("Hash Set : " + list);
		
		HashSet <String> list1 = (HashSet<String>) list.clone();
		
		System.out.println("Hash Set after cloning : " + list1);
		}



	}
