package hello;

import java.util.LinkedList;

public class qn7 {

	public static void main(String[] args) {
		
		LinkedList <String> L1 = new LinkedList <String>();
		  L1.add("Red");
	        L1.add("Green");
	        L1.add("Black");
	        L1.add("White");
	        L1.add("Pink");
	        
	        System.out.println("LinkedList Before Adding : " + L1);
	        
	        L1.addFirst("Haha");
	        L1.addLast("Hehe");
	        
	        System.out.println("LinkedList Before Adding : " + L1);

	}

}
