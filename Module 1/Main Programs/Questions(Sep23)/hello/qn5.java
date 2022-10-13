package hello;

import java.util.ArrayList;
import java.util.Collections;

public class qn5 {

	public static void main(String[] args) {
		
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        
        System.out.println("\nBefore Sorting : " + c1);
        Collections.sort(c1);
        System.out.println("\nAfter Sorting : " + c1);

       
   }
	}


