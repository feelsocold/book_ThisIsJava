package CHAPTER12_MultiThread.example05_threadstate;

public class StatePrintThread extends Thread {

	private Thread TargetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.TargetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = TargetThread.getState();
			System.out.println("타겟 스레드 상테 : " + state);
		
		if(state == Thread.State.NEW) {
			TargetThread.start();
		}
		
		else if (state == Thread.State.TERMINATED) {
			break;
		}
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		
		
		}
	}
}
