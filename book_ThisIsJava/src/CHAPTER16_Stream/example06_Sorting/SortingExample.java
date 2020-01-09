package CHAPTER16_Stream.example06_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// 정렬
public class SortingExample {

	public static void main(String[] args) {
		//숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] { 5,4,3,2,1 });
		intStream
			.sorted()	// 숫자를 오름차순으로 정렬
			.forEach( n -> System.out.print(n+","));
		System.out.println();

		//객체 요소일 경우
		List<Student> studentList = Arrays.asList(
			new Student("조휴일", 10),
			new Student("이보한", 20),
			new Student("사브리나", 30)
		);
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		studentList.stream()
			.sorted( Comparator.reverseOrder() )
			.forEach( s -> System.out.print(s.getScore() + ","));
	}
}
