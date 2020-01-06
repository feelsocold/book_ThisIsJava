package CHAPTER12_MultiThread.example07_databox;

public class Databox {

	private String data;
	
	// get
	public synchronized String getData() {
		if(this.data == null) {		// data가 null이면 대기상태 
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		String returnValue = data;
		System.out.println("consumerThread가 읽은 데이터 : " + returnValue);
		data = null;
		notify();					// 현재 스레드는 대기상태로 전환
		
		return returnValue;
	}
	
	// set
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}
	
	
}
