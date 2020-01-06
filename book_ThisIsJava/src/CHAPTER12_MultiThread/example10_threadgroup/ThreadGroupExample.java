package CHAPTER12_MultiThread.example10_threadgroup;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");	// myGroup에 포함시킴
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();		// 현재 스레드 그룹의 이름과 최대 우선순위를 헤더로 출력 
								// + 현재 스레드 그룹에 포함된 스레드와 하위 스레드 그룹의 내용을 보여준다.
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();
	}

}
