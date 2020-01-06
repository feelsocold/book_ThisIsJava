package CHAPTER12_MultiThread.example06_1_threadyield;


public class YieldExample {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// ThreadA,B 모두 실행 
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
		// ThreadB만 실행  
		threadA.work = false;

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
		// ThreadA,B 모두 실행  
		threadA.work =true;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		// ThreadA,B 모두 실행  
		threadA.stop = true;
		threadB.stop = true;
		
		
		
		
		
	}

}
