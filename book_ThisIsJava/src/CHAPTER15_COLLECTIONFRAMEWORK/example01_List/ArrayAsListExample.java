package CHAPTER15_COLLECTIONFRAMEWORK.example01_List;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		
		// ArrayList를 생성하고 런타임 시 필요에 의해 객체들을 추가하는 것이 일반적이지만, 고정된 객체들로 구성된 List를 생성할 때
		// T타입 파라미터에 맞게 asList()의 매개값을 순착적으로 입력하거나, T[]배열을 매개값으로 주면된다.
		
		List<String> list1 = Arrays.asList("홍길동", "조휴일", "김사랑");
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for (Integer value : list2) {
			System.out.println(value);
		}
		
		
		
		
	}

}
