package day3;

class PrintNumber {
	void printn(int x) {
		System.out.println(x + " is integer");
	}
	void printn(float x) {
		System.out.println(x + " is float");
	}
	void printn(double x) {
		System.out.println(x + " is double");
	}
	void printn(char x) {
		System.out.println(x + " is char");
	}
	void printn(String x) {
		System.out.println(x + " is string");
	}
}

public class inherit4 {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		p.printn("a");
		p.printn(12);
		p.printn(12.5);
		p.printn("hi hello");
		

	}

}
