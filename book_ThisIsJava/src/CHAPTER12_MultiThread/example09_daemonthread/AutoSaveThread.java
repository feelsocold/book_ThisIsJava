package CHAPTER12_MultiThread.example09_daemonthread;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용을 자동으로 저장합니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}

}
