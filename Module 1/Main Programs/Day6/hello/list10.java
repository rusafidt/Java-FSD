package hello;

import java.util.LinkedList;

public class list10 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.addLast("Bye");
		
		System.out.println("The Linked List : " + list);
		
		System.out.println();
		System.out.println("First occurence in Linked List : " + list.getFirst());
		
		System.out.println();
		System.out.println("Last occurence in Linked List : " + list.getLast());

	}

}
