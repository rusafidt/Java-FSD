package day3;

class Bank{
	void getBalance () {
		System.out.println("0");
	}
}

class BankA extends Bank {
	void getBalance() {
		System.out.println("BankA has amount 1000$ deposited ");
	}
	
}

class BankB extends Bank {
	void getBalance() {
		System.out.println("BankB has amount 1500$ deposited ");
	}
	
}

class BankC extends Bank {
	void getBalance() {
		System.out.println("BankC has amount 2000$ deposited ");
	}
	
}


public class inherit8 {

	public static void main(String[] args) {
		BankA b = new BankA();
		b.getBalance();
		BankB a = new BankB();
		a.getBalance();
		BankC c = new BankC();
		c.getBalance();
	}

}
