package CHAPTER16_Stream.example12_ParellelStream;

import java.util.Arrays;
import java.util.List;

import CHAPTER16_Stream.example11_Collect.MaleStudent;
import CHAPTER16_Stream.example11_Collect.Student;

public class MaleStudentExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("조휴일", 10, Student.Sex.MALE, Student.City.Seould),
				new Student("한지민", 20, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("김보리", 10, Student.Sex.FEMALE, Student.City.Seould)
					
		);
		
//		MaleStudent maleStudent = totalList.parallelStream()
//				.filter(s -> s.getSex() == Student.Sex.MALE)
//				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
//		
//		maleStudent.getList().stream()
//			.forEach(s -> System.out.println(s.getName()));
	}

}
