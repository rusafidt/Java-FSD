package day2;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to print Days : ");
		int num = scan.nextInt();
		switch(num) {
		case 1: System.out.println("1 - Sunday");
		break;
		case 2: System.out.println("2 - Monday");
		break;
		case 3: System.out.println("3 - Tuesday");
		break;
		case 4: System.out.println("4 - Wednesday");
		break;
		case 5: System.out.println("5 - Thursday");
		break;
		case 6: System.out.println("6 - Friday");
		break;
		case 7: System.out.println("7 - Saturday");
		break;
		default: System.out.println("Invalid input");
		}

	}

}
