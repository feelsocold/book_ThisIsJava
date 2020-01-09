package CHAPTER16_Stream.example01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("조휴일", 90),
				new Student("엘비스", 95),
				new Student("스팅", 85)
		);
		
		double avg = studentList.stream()
				// 증간처리(학생 객체를 점수로 매핑)
				.mapToInt(Student :: getScore)
				.average()
				.getAsDouble();
		
			System.out.println("평균 점수 : " + avg);
		
	
	}

}
