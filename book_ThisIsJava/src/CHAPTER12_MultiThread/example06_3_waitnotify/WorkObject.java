package CHAPTER12_MultiThread.example06_3_waitnotify;

public class WorkObject {
	int cnt = 0 ;
	
	public synchronized void methodA() {
		cnt++;
		System.out.println("ThreadA의 methodA() 작업 실행 - " + cnt);
		notify();		// 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만든다.
		
		try {
			wait();		// ThreadA를 일시 정지 상태로 만든다.
		} catch(InterruptedException e) {
		}
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();		// 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만든다.
		
		try {
			wait();		//ThreadB를 일시 정지 상태로 만든다.
		} catch (InterruptedException e) {
		}
	}
}
