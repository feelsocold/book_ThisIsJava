package CHAPTER12_MultiThread.example11_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);	// 최대 스레드 개수가 2인 스레드풀 생성
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// 스레드  개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수 : " + poolSize + "] 작업 스레드 이름 : " + threadName);
					
					// 예외 발생 시킴
					int value = Integer.parseInt("삼");
					
				}
			};
			//executorService.execute(runnable);	// 작업 처리 도중 예외 발생시 : 해당 스레드는 제거되고 새로운 스레드가 계속 생성된다.
			executorService.submit(runnable);		// 작업 처리 도주 예외 발생시 : 해당 스레드는 종료되지 않고 재사용된다. 
			
			Thread.sleep(10);
	
		}
		
		executorService.shutdown();
	}
	
}
