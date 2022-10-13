package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class qn12 {

	public static void main(String[] args) {
		
		LinkedList <String> L1 = new LinkedList <String>();
		  L1.add("Red");
	      L1.add("Green");
	      L1.add("Black");
	      L1.add("White");
	         
	       
	      System.out.println("Linked List 1 : " + L1);
	      
	      LinkedList <String> L2=  (LinkedList <String>)L1.clone();
	      L2.add("Pink");
		  L2.add("Rose");
		  L2.add("Blue");
		       
		  System.out.println("Linked List 2 : " + L2);
		  
		  L2.addAll(L1);
		  
		  System.out.println("Joined Linked List : " + L2);
	        }
	}
