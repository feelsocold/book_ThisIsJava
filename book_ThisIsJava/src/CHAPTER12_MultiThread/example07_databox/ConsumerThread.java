package CHAPTER12_MultiThread.example07_databox;

public class ConsumerThread extends Thread {

	private Databox dataBox;
	
	public ConsumerThread(Databox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 3 ; i++) {
			String data = dataBox.getData();
		}
		
	}
	
}
