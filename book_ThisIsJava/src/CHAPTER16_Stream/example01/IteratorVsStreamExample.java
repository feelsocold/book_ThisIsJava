package CHAPTER16_Stream.example01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList( "조휴일", "조니뎁", "사브리나" );
		
		// Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		// Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name) );
			// foreach() 메소드는 다음과 같이 Consumer 함수적 인터페이스 타입의 매개값을 가지므로 
			// 컬렉션의 요소를 소비할 코드를 람다식으로 기술할 수 있다.
		
	}

}
