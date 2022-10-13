package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class qn11 {

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
	      
			LinkedList <String> L2=  (LinkedList <String>)L1.clone();
		       System.out.println("Cloned Linked List : " + L2);

	        }
	}
