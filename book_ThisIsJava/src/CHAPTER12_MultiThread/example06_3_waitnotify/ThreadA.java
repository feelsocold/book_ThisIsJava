package CHAPTER12_MultiThread.example06_3_waitnotify;

public class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;	// 공유 객체를 매개값으로 받아 필드에 저장 
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
