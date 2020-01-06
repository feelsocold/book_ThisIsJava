package CHAPTER12_MultiThread.example02_name;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("쓰레드A");
	}
	
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용 ");
		}
	}
	
}




