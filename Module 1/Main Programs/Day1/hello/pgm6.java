package hello;

import java.util.Scanner;

public class pgm6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
			int i,num=0;
			String primeNumbers = "";
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number to print prime numbers : ");
			System.out.println();
			int num1 = sc.nextInt();
			for (i = 1; i<=num1; i++) {
				int counter = 0;
				for(num = i; num>=1 ; num--) {
					if (i%num==0) {
					counter = counter + 1;
				}
			}
			if (counter==2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
			System.out.print("Prime numbers from 1 to " + num1 +" are :");
			System.out.print(primeNumbers);

		}
		}