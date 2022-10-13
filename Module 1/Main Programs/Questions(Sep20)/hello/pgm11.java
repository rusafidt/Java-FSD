package hello;

import java.util.Scanner;

public class pgm11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Sum of " + num1 + " and " + num2 + " : " + (num1+num2));

	
		System.out.println("\nProduct of " + num1 + " and " + num2 + " : " + (num1*num2));
}

}
