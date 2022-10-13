package day3;


class inherit1 {
	void show() { 
		System.out.println("This is parent class");
	}
}

class Child extends inherit1{
	void show() {
		System.out.println("This is child class");
		super.show();
	}
}

public class parents1 {

	public static void main(String[] args) {
		inherit1 p = new inherit1();
		Child c = new Child();
		p.show();
		c.show();
	}

}
