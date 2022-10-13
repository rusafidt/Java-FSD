package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class qn15 {

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

	        String arr[] = new String[L1.size()];
	          
	        int i=0;
	        
	        // iterating over the hashset
	        for(String ele : L1){
	          arr[i++] = ele;
	        }
	  
	        for (String n : arr)
	            System.out.println(n);
		
	    
}
}