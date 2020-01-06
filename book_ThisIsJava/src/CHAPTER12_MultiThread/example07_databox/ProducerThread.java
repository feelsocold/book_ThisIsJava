package CHAPTER12_MultiThread.example07_databox;

public class ProducerThread extends Thread {

	private Databox dataBox;
	
	public ProducerThread(Databox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 3 ; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
		
	}
	
}
