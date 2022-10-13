package hello;

import java.util.Scanner;

public class pgm6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("\nEnter the string : ");
        String str = sc.nextLine();
        
        System.out.print("\nEnter substring : ");
        String substr = sc.nextLine();
        
        System.out.print("\nEnter substring to replace : ");
        String newsubstr = sc.nextLine();
        
        String newstr = "";
        
        if(str.contains(substr))
            newstr += str.replaceAll(substr,newsubstr);
        System.out.println("\nNew string : "+newstr);
        
	}
}