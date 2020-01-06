package CHAPTER12_MultiThread.example01;

public class BeepPrintExample3 {

	public static void main(String[] args) {

		Thread thread = new BeepThread();	// 스레드 객체 생성 
		thread.start();						// start메서드 실행 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		
	}

}
