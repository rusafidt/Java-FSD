package day2;

import java.util.Scanner;

public class pgm13 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		for(int i=2; i<=num;i++) {
			while(num%i==0) {
				System.out.println(i + "");
				num=num/i;
			}
		}
}
}