import java.sql.Time;
import java.util.Scanner;

public class Qn1 {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of litres to fill the tank : ");
		double litre = sc.nextDouble();
		
		if (litre> 0) {
		
		System.out.print("Enter the distance covered : ");
		double dist = sc.nextDouble();
		
		if (dist>0) {
		
		
		System.out.print("\nConversion ");
		Thread.sleep(1000);
		System.out.print(". ");
		Thread.sleep(1000);
		System.out.print(". ");
		Thread.sleep(1000);
		System.out.print(".  ");
		Thread.sleep(1000);
		
		double fuelconsump = (litre/dist)*100;
		System.out.println();
		System.out.println("\nLitres/100KM  -  " + fuelconsump);
		
		double miles = dist*0.624;
		double gallons = litre * 0.2642;
		double fuelconsump1 = (miles/gallons);
		System.out.println();
		System.out.println("Miles/Gallons  -  " + fuelconsump1);
		
	}
		else {
			System.out.println(dist + " is an invalid input");
		}
		
		
	}
		else {
			System.out.println(litre + " is an invalid input");
		}
}
}