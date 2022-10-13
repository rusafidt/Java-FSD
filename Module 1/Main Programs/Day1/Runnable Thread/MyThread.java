class MyThread implements Runnable {
	String message;
	MyThread(String msg) {
		message = msg;
	}
	
	public void run() {
		for (int count =0 ; count <=5 ; count++) {
			try {
				System.out.println("Run Method : " + message);
				Thread.sleep(1000);
			}catch (InterruptedException e) { 
				System.out.println("Exception thread : " + e.getMessage());
			}
		}
	}
}