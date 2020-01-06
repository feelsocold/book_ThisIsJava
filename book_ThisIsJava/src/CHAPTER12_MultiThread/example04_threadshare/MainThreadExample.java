package CHAPTER12_MultiThread.example04_threadshare;

public class MainThreadExample {

	// 공유 객체를 사용할 떄의 주의할 점
	// ; 서로 다른 스레드가 하나의 객체를 사용 중 일 때, 메모리 필드에 저장된 값이 바뀔 수 있다.
	
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
