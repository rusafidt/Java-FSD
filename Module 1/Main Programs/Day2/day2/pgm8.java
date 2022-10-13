package day2;

import java.util.Scanner;

public class pgm8 {

	public static void main(String[] args) {
		float s = 0;
		for (int i = 1; i<=10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number " + i + " :");
			int num = scan.nextInt();
			s = s+num;
		}
		s = s/10;
		System.out.println(s);
		}

	}
