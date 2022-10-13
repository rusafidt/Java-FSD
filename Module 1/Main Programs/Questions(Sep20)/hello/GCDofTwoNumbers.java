package hello;

import java.util.Scanner;

public class GCDofTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");  
		int a = sc.nextInt();  
		
		System.out.print("Enter the second number: ");  
		int b = sc.nextInt();
		
		int gcd = 0;
		
		for(int i = 1; i <= a && i <= b; i++)  {  

			if(a%i==0 && b%i==0)  {
				gcd = i;  
			}
		}
		
		System.out.printf("GCD of %d and %d is : %d", a, b, gcd); 
	}

}
