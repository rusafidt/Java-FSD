package day3;

class Shape {
	void print() {
		System.out.println("This is a Shape");
	}
}

class Rectangle extends Shape{
	void print() {
		super.print();
		System.out.println("This is Rectanglular Shape");
	}
}

class Circle extends Shape{
	void print() {
		System.out.println("This is a Circular Shape");
	}
}

class Square extends Rectangle{
	void print() {
		super.print();
		System.out.println("Square is a Rectangle");
	}
}

public class inherit3 {

	public static void main(String[] args) {
		Square s = new Square();
		s.print();
	}

}
;