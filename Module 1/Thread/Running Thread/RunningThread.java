
public class RunningThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Main methods :");
		RunningThread obj = new RunningThread();
		
		obj.setName("\nThreadName ");
		
		obj.start();
		
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int numThreads = currentGroup.activeCount();
		Thread[] IsThreads = new Thread[numThreads];
		currentGroup.enumerate(IsThreads);
		for (int i=1; i<numThreads; i++) {
			System.out.println("Number of thread : " + i + " " + IsThreads[i].getName());
		}
		
		Thread currentThread = Thread.currentThread();
		System.out.println("current running thread : " + currentThread);
	}

}
