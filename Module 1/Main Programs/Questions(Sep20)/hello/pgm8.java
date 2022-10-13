package hello;

abstract class Parent {
	abstract void method();
}

class subclass1 extends Parent {
	void method() {
		System.out.println("This is first subclass");
	}
}

class subclass2 extends Parent {
	void method() {
		System.out.println("This is second subclass");
	}
}

public class pgm8 {

	public static void main(String[] args) {
		
		subclass1 s1 = new subclass1();
		s1.method();
		
		subclass2 s2 = new subclass2();
		s2.method();
	}

}
