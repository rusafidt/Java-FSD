package day3;

class area{
	void area(int a, int b) {
		System.out.println("Area of Rectangle having length " + a + " and breadth " +b + " is : "+ a*b);
	}
	void area(int a) {
		System.out.println("Area of Square having side " + a +" is : "+ a*a);
	}
	
}

public class inherit6 {

	public static void main(String[] args) {
		area a = new area();
		a.area(15,30);
		a.area(5);
	}

}
