package CHAPTER16_Stream.example04_Filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("어떤날","loveisall","하와이검은모래","빨간나를","어떤날");
		
		names.stream()
			.distinct()
			.forEach( System.out :: println);
		
		System.out.println();
		
		// 필터링
		names.stream()
			.filter( n -> n.startsWith("어"))
			.forEach( System.out :: println);
		
		System.out.println();
		
		// 중복 제거 후 필터링
		names.stream()	
			.distinct()
			.filter( n -> n.startsWith("어"))
			.forEach( System.out :: println);
		
	}

}
