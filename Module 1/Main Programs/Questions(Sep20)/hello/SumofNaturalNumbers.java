package hello;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");  
		int a = sc.nextInt(); 
		int sum=1;
		
		for (int i = 1; i<=a; i++) {
			sum+=i;
		}
		
		System.out.println("Sum of given natural numbers are : " + sum);
	}

}
