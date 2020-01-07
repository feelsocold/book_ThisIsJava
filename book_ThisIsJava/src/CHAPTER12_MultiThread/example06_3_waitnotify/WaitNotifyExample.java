package CHAPTER12_MultiThread.example06_3_waitnotify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
	
		threadA.start();
		threadB.start();
		
	}

}
