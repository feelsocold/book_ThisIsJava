package CHAPTER16_Stream.example01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("조휴일", 100),
				new Student("엘비스", 95)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		
	
	}

}
