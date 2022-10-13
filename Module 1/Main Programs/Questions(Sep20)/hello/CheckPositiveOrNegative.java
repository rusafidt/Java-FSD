package hello;

import java.util.Scanner;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");  
		int a = sc.nextInt();  
		
		if (a>0) {
			System.out.println(a + " is a positive number");
		}
		else if (a<0) {
			System.out.println(a + " is a negative number");
		}
		else {
			System.out.println(a + " is zero");
		}
		
	}

}
