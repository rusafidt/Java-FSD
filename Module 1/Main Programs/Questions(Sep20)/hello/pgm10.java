package hello;

abstract class Animals {
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animals {
	void cats() {
		System.out.println("Cats meow ");
	}
	void dogs() {
	}
}

class Dogs extends Animals {
	void dogs() {
		System.out.println("Dogs bark");
	}
	void cats() {
		
	}
}

public class pgm10 {

	public static void main(String[] args) {
		
		Cats s1 = new Cats();
		s1.cats();
		
		Dogs s2 = new Dogs();
		s2.dogs();
	}

}
