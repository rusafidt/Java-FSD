package hello;

import java.util.LinkedList;
import java.util.Scanner;

public class list8 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//inserting element at last
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the element to insert at last : ");
		String s = scan.next();
		
		list.add("Hi");
		list.add("Blue");
		list.add("Black");
		list.add("Pink");
		list.addLast(s);

		//traversing :)
		System.out.println("The Linked List : " + list);
	}

}
