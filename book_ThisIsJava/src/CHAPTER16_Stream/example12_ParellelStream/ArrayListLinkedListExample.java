package CHAPTER16_Stream.example12_ParellelStream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 스트링 소스와 병렬 처리 성능

public class ArrayListLinkedListExample {

	//요소 처리
	public static void work(int value) {
		try {
			Thread.sleep(100);
		} catch (Exception e) {}
	}
	//순차 처리
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
	}
	//병렬 처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
	}
	
	public static void main(String[] args) {
		
		//소스컬렉션
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		//워밍업
		long arrayListListParallel = testParallel(arrayList);
		long linkedListParallel = testParallel(linkedList);
		
		//병렬 스트림 처리 시간 구하기
		arrayListListParallel = testParallel(arrayList);
		linkedListParallel = testParallel(linkedList);
		
		System.out.println(arrayListListParallel);
		System.out.println(linkedListParallel);
		
		if(arrayListListParallel < linkedListParallel) {
			System.out.println("성능 테스트 결과 : ArrayList 처리가 더 빠름");
		}else {
			System.out.println("성능 테스트 결과 : LinedList 처리가 더 빠름");
		}
		
	
	
	}

}
