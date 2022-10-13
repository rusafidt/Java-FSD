package hello;

abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank {
	void getBalance() {
		System.out.println("100$ deposited in Bank A");
	}
}

class BankB extends Bank {
	void getBalance() {
		System.out.println("200$ deposited in Bank B");
	}
}

class BankC extends Bank {
	void getBalance() {
		System.out.println("300$ deposited in Bank C");
	}
}


public class pgm9 {

	public static void main(String[] args) {
		
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();
		
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
		

}
}
