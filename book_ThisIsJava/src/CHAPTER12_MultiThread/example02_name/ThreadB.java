package CHAPTER12_MultiThread.example02_name;

public class ThreadB extends Thread{
	public ThreadB() {
		setName("쓰레드B");
	}
	
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용 ");
		}
	}
	
}
