package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class qn6 {

	public static void main(String[] args) {
		
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println(c1);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the element to update in 2nd position : ");
        String s = sc.next();
        
        c1.set(1, s);
        System.out.println(c1);
       
   }
	}


