interface Bank {
	float rateofinterest();
}

class SBI implements Bank {
	 
	public float rateofinterest() { return 9.15f;}
}

class QNB implements Bank {
	
	public float rateofinterest() { return 10.1f;}
}


public class Interface1 {

	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI : "+b.rateofinterest());
		
	}

}
