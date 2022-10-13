package hello;

import java.util.PriorityQueue;

public class priorityqueue3_11{

	public static void main(String[] args) {
		PriorityQueue <String> list = new PriorityQueue <String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		list.add("Bye");
		
		System.out.println("Priority Queue : " + list);
		System.out.println();
		System.out.print("Number of elements in Priority Queue : " + list.size());
	}



	}
