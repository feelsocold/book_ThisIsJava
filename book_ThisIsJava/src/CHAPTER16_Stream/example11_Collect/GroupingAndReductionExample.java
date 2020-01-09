package CHAPTER16_Stream.example11_Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("조휴일", 10, Student.Sex.MALE, Student.City.Seould),
				new Student("한지민", 20, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("김보리", 10, Student.Sex.FEMALE, Student.City.Seould)
		);
		
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
			.collect(
				Collectors.groupingBy(
					Student :: getSex,
					Collectors.averagingDouble(Student :: getScore)
				)
		 );
		System.out.println("남학생 평균 점수 : " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균 점수 : " + mapBySex.get(Student.Sex.FEMALE));
					
		//성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student :: getSex,
						Collectors.mapping(
							Student :: getName,
							Collectors.joining(",")
						)
					)
				);
		System.out.println("남학생 전체 이름 : " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 전체 이름 : " + mapByName.get(Student.Sex.FEMALE));
	}

}
