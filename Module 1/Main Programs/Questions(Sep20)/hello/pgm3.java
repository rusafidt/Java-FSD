package hello;

import java.util.Scanner;

public class pgm3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		int num = s.length();
		String Rev = "";
		
		for (int i=num-1; i>=0;i--) {
			Rev = Rev + s.charAt(i);
		}
	
		if (Rev.compareTo(s)==0) {
			System.out.println("");
			System.out.println(s+" is a Palindrome");
		}
		
		else {
			System.out.println("Not Palindrome");
		}
	}

}
