package hello;

public class Arithmeticexception {

	static void validate_Age(int age) {
		if (age<18) {
			throw new ArithmeticException("Ineligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) {
		validate_Age(10);
		System.out.println("The program then continues....");

	}

}
