package hello;

import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		Scanner sc1 = new Scanner (System.in);
		System.out.print("Enter Sex (M/F) : ");
		char sex = sc1.next().charAt(0);
		
		Scanner sc2 = new Scanner (System.in);
		System.out.print("Enter Marital Status (Y/N): ");
		char marital_status = sc2.next().charAt(0);
		
		
		if (sex=='F') {
			System.out.println("Can work only in Urban areas");
		}
		
		if (sex=='M') {
			
			if ((age>=20) && (age<40)) {
				System.out.println("Can work in Anywhere");
			}
		
			else if ( (age>=40) && (age<=60)) {
				System.out.println("Can work only in Urban areas");
			}
			else {
				System.out.println("ERROR");
			}
				
	}
	}
}


