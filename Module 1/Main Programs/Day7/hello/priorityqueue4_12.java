package hello;

import java.util.PriorityQueue;

public class priorityqueue4_12{

	public static void main(String[] args) {
		PriorityQueue <String> list = new PriorityQueue <String> ();
	
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Yellow");
		
		System.out.println("Priority Queue 1 : " + list);
		
		PriorityQueue <String> list2 = new PriorityQueue <String> ();
		
		list2.add("Red");
		list2.add("Violet");
		list2.add("Pink");
		list2.add("Yellow");
		
		System.out.println("Priority Queue 2 : " + list2);
		
		for (String element : list2) {
			System.out.print(list.contains(element) ? "Yes  "  : "No  ");
		}
		
	}



	}
