package hello;

import java.util.Scanner;

public class SmallestusingTernaryOp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");  
		int a = sc.nextInt();  
		
		System.out.print("Enter the second number : ");  
		int b = sc.nextInt();
		
		System.out.print("Enter the third number : ");  
		int c = sc.nextInt();
		
		int temp = a<b?a:b;  
		int smallest = c<temp?c:temp;  
 
		System.out.println("\nThe smallest number is: "+smallest);  

		}
	}


