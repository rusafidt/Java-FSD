package hello;

abstract class Animals {
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animals {

	@Override
	void cats() {
		System.out.println("Cats meow");
	}
}

class Dogs extends Animals {

	@Override
	void dogs() {
		System.out.println("Dogs Bark");		
	}
}

public class abs2 {

	public static void main(String[] args) {
		Cats s1 = new Cats();
		Dogs s2 = new Dogs();
		s1.cats();
		s2.dogs();
	}

}
