package CHAPTER16_Stream.example02_StreamKind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import CHAPTER16_Stream.example01.Student;

//컬렉션으로부터 스트림 얻기

public class FromCollectionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("조휴일", 90),
			new Student("엘비스", 95),
			new Student("스팅", 85)
		);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach( s -> System.out.println(s.getName()));
	}

}
