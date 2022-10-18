import java.util.*;

public class tempconversion{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n     Temperature Conversions     ");
		System.out.println("\n 1) Celsius to Fahrehnheit \n 2) Fahrenheit to Celsius");
		
		System.out.print("\nEnter the choice : ");
		int num = sc.nextInt();
		double f,c;
		
		switch (num) {
			case 1: System.out.print("Enter the temperature in celsius : ");
					double cel = sc.nextDouble();
					f = (cel*1.8000) + 32.00;
					System.out.println("Temperature in Fahrenheit : " + f);
					break;
			case 2: System.out.print("Enter the temperature in fahrenheit : "); 
					double fah = sc.nextDouble();
					c = (fah-32.00) * 0.5555556;
					System.out.println("Temperature in Celsius : " + c);
					break;
			default: System.out.println("Invalid Choice");
		}
			
	}
}
