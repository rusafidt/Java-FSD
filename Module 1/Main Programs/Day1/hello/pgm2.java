package hello;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the second number : ");
		int num1 = scan1.nextInt();
		
		if (num1 > num) {
			System.out.println(num1+" is the greatest number");
		}
		else if (num1 == num) {
			System.out.println("Both the numbers are equal");
		}
		else {
			System.out.println(num+" is the greatest number");
		}
		
		
		
		

	}

}
