package hello;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class list11 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String> ();
		
		//Inserting element
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Green");
		list.add("Bye");
		
		//Displaying the Linked List
		System.out.println("The Linked List : " +list);
		System.out.println();
		
		//Displaying the Linked List after deletion
		list.remove(1);
		System.out.println("The Linked List after deletion : " + list);
		
		
		}
	}

