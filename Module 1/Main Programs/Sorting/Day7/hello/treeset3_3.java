package hello;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;

public class treeset3_3 {

	public static void main(String[] args) {
		TreeSet <String> list = new TreeSet<String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Bye");
		
		System.out.println("Original Tree Set : " + list);
		
		Iterator <String> it = list.descendingIterator();
		
		System.out.println("Reversed Tree Set : ");
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
