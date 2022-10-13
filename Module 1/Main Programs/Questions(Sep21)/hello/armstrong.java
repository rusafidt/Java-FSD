package hello;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the armstrong number ");
		int num = sc.nextInt();
		int num1 = num;
		int ams = 0, n=0;
		
		while (num!=0) {
			n = num%10;
			ams = (int) (ams + Math.pow(n, 3));
			num = num/10;
		}
		
		if (num1==ams) {
			System.out.println(num1 + " is armstrong number");
		}
		else {
			System.out.println(num1 + " is not armstrong number");
		}
		
	}
	

}
