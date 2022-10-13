package hello;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset2_2 {

	public static void main(String[] args) {
		TreeSet <String> list = new TreeSet<String> ();
		
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
