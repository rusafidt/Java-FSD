package hello;

import java.util.HashSet;

public class hashset3_8{

	public static void main(String[] args) {
		//first hashset 
		HashSet <String> list = new HashSet<String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		list.add("Bye");
		
		System.out.println("First Hash Set : "+ list);
		
		//second hashset
		HashSet <String> list1 = new HashSet <String> ();
		
		list1.add("Hi");
		list1.add("How are you?");
		list1.add("What are you doing ?");
		list1.add("Bye");
		
		System.out.println("Second Hash Set : " + list1);
		
		list1.retainAll(list);
		
		System.out.println();
		System.out.println("Retained Hash Set : " + list1);
	}



	}
