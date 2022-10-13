package hello;

import java.util.PriorityQueue;

public class priorityqueue2_10{

	public static void main(String[] args) {
		PriorityQueue <String> list = new PriorityQueue <String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		list.add("Bye");
		
		System.out.println("Original Priority Queue : " + list);
		
		//inserting specified element
		list.offer("Green");
		
		System.out.println("Priority Queue after insertion : " + list);
	}



	}
