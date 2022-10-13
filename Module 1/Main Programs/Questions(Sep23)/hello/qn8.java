package hello;

import java.util.LinkedList;

public class qn8 {

	public static void main(String[] args) {
		
		LinkedList <String> L1 = new LinkedList <String>();
		  L1.add("Red");
	        L1.add("Green");
	        L1.add("Black");
	        L1.add("White");
	        L1.add("Pink");
	        
	        String element1 = "Green";
	        String element2 = "Black";

	        
	        	        
	        for (String i : L1) {
	            System.out.print(i + " ");
	        }
	        int index1 = L1.indexOf(element1);
	        int index2 = L1.indexOf(element2);
	  
	        
	        if (index1 == -1 || index2 == -1) {
	            System.out.println("no element found ");
	            System.exit(0);
	        }
	            L1.set(index1, element2);
	            L1.set(index2, element1);
	       
	        System.out.println("\n\nLinked List After Swapping :-");
	        for (String i : L1) {
	            System.out.print(i + " ");
	       
	        }
	}
	
}
