package hello;

import java.util.Scanner;

public class pgm13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Roll Number : ");
		int roll_no = sc.nextInt();
		
		System.out.println("Enter the Field of Interest :");
		String foi = sc.next();
		
		System.out.println("\nHey, my name is "+ name + " and my roll number is "+roll_no+". My Field of Interest are "+foi);}

}
