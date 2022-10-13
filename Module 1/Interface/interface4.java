
interface Shows {
	void show();

	interface Message {
		void msg();
}
}

class interface4 implements Shows.Message, Shows{
	
	public void msg() {
		System.out.println("Hello nested interface");
	}
	
	public void show() {
	}
	

	public static void main(String[] args) {
		
		Shows.Message obj = new interface4();  //upcasting
		obj.msg();
	}

}
