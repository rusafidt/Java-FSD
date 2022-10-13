package hello;

import java.util.Scanner;

public class pgm3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the second number : ");
		int num1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter the third number : ");
		int num2 = scan1.nextInt();
		
		if (num < num1 && num < num2) {
			System.out.println(num+" is the smallest number");
		}
		else if (num1<num && num1<num2) {
			System.out.println(num1+" is the smallest number");
		}
		else if (num==num1 && num==num2){
			System.out.println("All the 3 numbers are equal");
		}
		else {
			System.out.println(num2+" is the smallest number");
		}
		
		
		

	}

}
