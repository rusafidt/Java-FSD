package hello;

import java.util.LinkedList;
import java.util.Scanner;

public class list9 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the number of entries to insert elements : ");
		int num1 = sc1.nextInt();
		
		list.add("Hi");
		list.add("Black");
		list.add("Pink");
		list.addLast("Bye");
		
		
		for (int i=0 ; i<num1 ; i++) {
			
		//position to insert
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the position to insert the element : ");
		int num = sc.nextInt();
		
		//inserting elements
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the element to insert : ");
		String s = scan.next();
		
		System.out.println("Inserted !!");
		list.add(num, s);
		}

		//traversing :)
		System.out.println();
		System.out.println("The Linked List : " + list);
	}

}
