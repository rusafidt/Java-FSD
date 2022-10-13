package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class qn10 {

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
	      
	       Collections.shuffle(L1);
	       System.out.println("Linked List after first shuffle : " + L1);

	       Collections.shuffle(L1);
	       System.out.println("Linked List after second shuffle :  " + L1);

	        }
	}
