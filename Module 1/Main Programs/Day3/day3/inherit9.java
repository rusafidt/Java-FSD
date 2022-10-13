package day3;

class x{
	int i;
	void printNum() {
		System.out.println("i = " + i);
	}
}
class y extends x{
	int j;
	void printNum() {
		System.out.println("j = " + j);
	}
}
public class inherit9 {

	public static void main(String[] args) {
		y c = new y();
		c.i = 10;
		c.j = 15;
		c.printNum();
		c.j = c.i;
		c.printNum();
		}

}
