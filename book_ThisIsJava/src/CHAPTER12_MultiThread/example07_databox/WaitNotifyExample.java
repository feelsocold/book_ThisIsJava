package CHAPTER12_MultiThread.example07_databox;

public class WaitNotifyExample {

	public static void main(String[] args) {
		Databox dataBox = new Databox();
		
		ProducerThread producer = new ProducerThread(dataBox);
		ConsumerThread consumer = new ConsumerThread(dataBox);
		
		producer.start();
		consumer.start();
		
		
	}
}

