package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class qn16 {

	public static void main(String[] args) {
		
		HashSet <String> L1 = new HashSet <String>();
		  L1.add("Red");
	      L1.add("Green");
	      L1.add("Black");
	      L1.add("White");
	         
	       
	      L1.add("Pink");
		  L1.add("Rose");
		  L1.add("Blue");
		       
		  System.out.println("Hash Set : " + L1);

		  Set<String> hashtotree = new TreeSet<String>(L1);
			System.out.println("Tree Set : " + hashtotree);
	    
}
}