package CHAPTER12_MultiThread.example10_threadgroup;

public class WorkThread extends Thread {

	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); 		// 스레드그룹과 이름을 설정한다.
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(getName() + "interrupted");
				break;
			}
			System.out.println(getName() + " 종료됨");
		}
	}
}
