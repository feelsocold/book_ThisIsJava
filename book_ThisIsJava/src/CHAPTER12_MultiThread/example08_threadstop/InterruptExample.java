package CHAPTER12_MultiThread.example08_threadstop;

public class InterruptExample extends Thread{

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt(); 	// interrupt() 메소드 실행시 바로 예외가 발생하지 않고, 해당 스래드가 일시정지 상태가 되면 예외가 발생한다.
	
	}

}
