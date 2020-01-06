package CHAPTER12_MultiThread.example11_threadpool;

public class Result {

	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
	
}
