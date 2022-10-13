package hello;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		
		int num = s.length();
		String Rev = "";
		
		for (int i=num-1; i>=0;i--) {
			Rev = Rev + s.charAt(i);
		}
		
		System.out.println("Reversed String : " + Rev);
	}

}
