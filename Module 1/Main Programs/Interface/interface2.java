interface Printable {
	void print();
}

interface Showable {
	void print();
}


public class interface2 implements Printable, Showable {

	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		interface2 i = new interface2();
		i.print();

	}

}
