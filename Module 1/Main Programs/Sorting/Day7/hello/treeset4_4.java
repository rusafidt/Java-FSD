package hello;

import java.util.TreeSet;

public class treeset4_4 {

	public static void main(String[] args) {
		TreeSet <String> list = new TreeSet <String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Bye");
		
		System.out.println("Tree Set : " + list);
		
		System.out.println();
		System.out.println("First occurence in Tree Set : " + list.first());
		
		System.out.println();
		System.out.println("Last occurence in Tree Set : " + list.last());

	}

}
