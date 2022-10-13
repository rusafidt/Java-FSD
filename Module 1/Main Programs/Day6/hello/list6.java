package hello;

import java.util.LinkedList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//inserting at first
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to insert at first : ");
		String num = sc.next();
		
		//inserting at last
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string to insert at last : ");
		String s = scan.next();
		
		list.add("Hi");
		list.add("Black");
		list.add("Pink");
		list.addLast(s);
		list.addFirst(num);

		//traversing :)
		System.out.println("The Linked List : " + list);
	}

}
