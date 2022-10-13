interface Printable {
	void print();
}

interface Showable {
	void show();
}


class interface3 implements Printable, Showable{
	
	public void print() {
		System.out.println("Hi");
	}
	
	public void show() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		
		interface3 i = new interface3();
		i.print();
		i.show();
		
	}

}
