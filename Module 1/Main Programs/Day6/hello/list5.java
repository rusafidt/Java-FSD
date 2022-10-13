package hello;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//position to insert
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position to insert the element : ");
		int num = sc.nextInt();
		
		//inserting elements
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the element to insert : ");
		String s = scan.next();
		
		list.add("Hi");
		list.add("Black");
		list.add("Pink");
		list.addLast("Bye");
		list.add(num, s);

		//traversing :)
		System.out.println("The Linked List : " + list);
	}

}
