package hello;

import java.util.LinkedList;
import java.util.Scanner;

public class list7 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//insert string at first
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to insert at first : ");
		String num = sc.next();
		
		
		list.add("Hi ");
		list.add("Black");
		list.add("Pink");
		list.addLast("Bye");
		list.addFirst(num);

		//traversing :)
		System.out.println("The Linked List : " + list);
	}

}
