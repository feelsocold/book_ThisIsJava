package CHAPTER12_MultiThread.example04_threadshare;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch(InterruptedException e) {}
//		
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}

	// 멀티 스레드 프로그램에서 단 하나의 메소드만 실행할 수 있는 코드 영역을 '임계영역(critical section)'이라고 부른다.
	// 자바는 임계 영역을 지정하기 위해 동기화 메소드와 동기화 블록을 제공한다.  === synchronized

	
	// 1.동기화 메소드로 수정
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch(InterruptedException e) {}
//		
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//
//	}

	
	// 2. 동기화 블록으로 수정
	public void setMemory(int memory) {
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory + " 저장");
		}

	}
	
}
