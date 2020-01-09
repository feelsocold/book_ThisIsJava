package CHAPTER16_Stream.example11_Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("조휴일", 10, Student.Sex.MALE, Student.City.Seould),
			new Student("한지민", 20, Student.Sex.FEMALE, Student.City.Pusan),
			new Student("김보리", 10, Student.Sex.FEMALE, Student.City.Seould)
				
		);
		
		Map<Student.Sex, List<Student>> mapBysex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.print("[남학생]");
		mapBysex.get(Student.Sex.MALE).stream()
			.forEach(s->System.out.println(s.getName() + ", "));
		
		
		System.out.print("[여학생]");
		mapBysex.get(Student.Sex.FEMALE).stream()
			.forEach(s->System.out.print(s.getName() + ", "));
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
					Collectors.groupingBy(
							Student :: getCity,
							Collectors.mapping(Student :: getName, Collectors.toList())
					)	
				);
		System.out.print("\n[서울]");
		mapByCity.get(Student.City.Seould).stream().forEach(s->System.out.print(s + ", "));
		
		System.out.print("\n[부산]");
		mapByCity.get(Student.City.Pusan).stream().forEach(s->System.out.print(s + ", "));
				
	}

}
