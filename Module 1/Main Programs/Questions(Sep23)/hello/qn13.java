package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class qn13 {

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
		  
		 L1.removeFirst();
		 
		  System.out.println("Linked List after removing : " + L1);
}
}