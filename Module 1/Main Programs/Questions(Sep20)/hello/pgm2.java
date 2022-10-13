package hello;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the year to check if its Leap Year : ");
		int age = sc.nextInt();
		
		if (age%4==0) {
							
			//if year is century
			if (age%100==0) {
				
				if (age%400==0) {
					System.out.println("The year " + age + " is a Leap year");
				}
				
				else {
					System.out.println("The year " + age + " is not a Leap year");
				}
			}
			
			else {
			System.out.println("The year " + age + " is a Leap year");
		}
	}
}
}
		
		