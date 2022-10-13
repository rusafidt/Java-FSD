package day2;

import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to print months : ");
		int num = scan.nextInt();
		switch(num) {
		case 1: System.out.println("1 - January");
		break;
		case 2: System.out.println("2 - February");
		break;
		case 3: System.out.println("3 - March");
		break;
		case 4: System.out.println("4 - April");
		break;
		case 5: System.out.println("5 - May");
		break;
		case 6: System.out.println("6 - June");
		break;
		case 7: System.out.println("7 - July");
		break;
		case 8: System.out.println("8 - August");
		break;
		case 9: System.out.println("9 - September");
		break;
		case 10: System.out.println("10 - October");
		break;
		case 11: System.out.println("11 - November");
		break;
		case 12: System.out.println("12 - December");
		break;
		default: System.out.println("Invalid input");
		}
	}

}
	