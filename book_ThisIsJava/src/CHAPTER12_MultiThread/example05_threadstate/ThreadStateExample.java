package CHAPTER12_MultiThread.example05_threadstate;

public class ThreadStateExample {

	public static void main(String[] args) {

		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		
		statePrintThread.start();
		
	}

}
