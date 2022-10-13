package hello;

import java.util.Iterator;
import java.util.LinkedList;

public class list2 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//Inserting element
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Bye");
		
		//Traversing element
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
