package hello;

import java.util.ArrayList;
import java.util.LinkedList;

public class qn9 {

	public static void main(String[] args) {
		
		LinkedList <String> L1 = new LinkedList <String>();
		  L1.add("Red");
	        L1.add("Green");
	        L1.add("Black");
	        L1.add("White");
	        L1.add("Pink");
	       L1.add("Rose");
	       L1.add("Blue");
	       
	       System.out.println("Linked List : " + L1);
	       
	       ArrayList <String> l1 = new ArrayList <String> (L1);
	       System.out.println("Array List : " + l1);

	        }
	}
