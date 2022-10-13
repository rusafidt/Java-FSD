package hello;

class MyClass {
	public static MyClass init() {
	return null;
	}
	public void print(String s) {
		System.out.println(s.toLowerCase());
	}
}

public class NullPointer2 {

	public static void main(String[] args) {
			try {
				MyClass t = MyClass.init(); //creating new object for null :)
				t.print("Hi Guys.. !!");
			}
			catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println();
				System.out.println("Null Pointer Exception occurs");
			}
			System.out.println();
			System.out.println("The program then continues....");
	}
}
