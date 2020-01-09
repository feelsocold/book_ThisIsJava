package CHAPTER16_Stream.example05_Mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		
		List<Student> studentList = Arrays.asList(
				new Student("김동현", 10),
				new Student("조휴일", 20),
				new Student("이보한", 30)
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
		
	}

}
