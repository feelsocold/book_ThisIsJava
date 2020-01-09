package CHAPTER16_Stream.example11_Collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ToListExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("이보한", 10, Student.Sex.MALE),
			new Student("한지민", 20, Student.Sex.FEMALE),
			new Student("김동현", 50, Student.Sex.MALE),
			new Student("전지현", 40, Student.Sex.FEMALE)
		);
		
		// 남학생들만 묶어 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 여학생들만 묶어 Hashset 생성
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		
		femaleSet.stream()
			.forEach(s->System.out.println(s.getName()));
		
	}

}
