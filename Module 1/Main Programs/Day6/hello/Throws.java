package hello;

import java.io.*;
class throwsexample {
	void testMethod(int num) throws NullPointerException, ArithmeticException {
		if (num==1)
			throw new NullPointerException ("NullPointer Exception occurs...!!!");
		else
			throw new ArithmeticException ("ArithmeticException Occurs...!!!");
	}
}

public class Throws {

	public static void main(String[] args) {
		try {
			throwsexample obj = new throwsexample();
			obj.testMethod(1);
		}
		catch(Exception e) {
			System.out.print(e);
		}

	}

}
