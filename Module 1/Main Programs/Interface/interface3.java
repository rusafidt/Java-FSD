interface printable1 {
	void print();
}

interface showable1 {
	void show();
}


class interface3 implements printable1, showable1{
	
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
