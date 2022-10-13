package hello;

import java.util.Scanner;

public class swap2nos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the second number : ");
		int num2 = sc1.nextInt();
		
		System.out.println("\n Before swapping, First number : " + num1 + "  and Second number : " + num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("\n After swapping, First number : " + num1 + " and Second number : " + num2);
		
	}

}
