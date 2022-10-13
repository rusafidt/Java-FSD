package hello;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = scan.nextInt();
		
		if (num>18) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Ineligible to Vote");
		}
	}

}
