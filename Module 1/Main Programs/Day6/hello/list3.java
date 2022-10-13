package hello;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class list3 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//Inserting element
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Bye");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position to traverse the list : ");
		int num = sc.nextInt();
		//Traversing element at specified position onwards
		Iterator<String> itr = list.listIterator(num);
		System.out.println("Elements from Position " + num + " in Linked List are : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
