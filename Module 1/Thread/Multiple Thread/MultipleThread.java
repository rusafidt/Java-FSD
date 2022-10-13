
class Threads extends Thread {
	private Thread thread;
	private String threadName;
	
	Threads (String msg) {
		threadName = msg;
		System.out.println("Creating Thread : " + threadName);
	}
	
	public void run () {
		
		System.out.println("\n Running Thread : " + threadName);
		try { 
			for (int i=0; i<5 ; i++) {
				System.out.println("Thread :" + threadName + "," + i);
				thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Exception in thread : " + threadName);
		}
		System.out.println("Thread "+ threadName + " continue...");
	}
	
	public void start () {
		System.out.println("Start method : " + threadName );
		if(thread==null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}


public class MultipleThread {

	public static void main(String[] args) {
		Threads t1 = new Threads("First Thread");
		t1.start();
		
		Threads t2 = new Threads("Second Thread");
		t2.start();
	}

}
