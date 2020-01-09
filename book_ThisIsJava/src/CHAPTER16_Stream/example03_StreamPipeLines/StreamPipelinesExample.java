package CHAPTER16_Stream.example03_StreamPipeLines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("검정치마", Member.MALE, 40),
				new Member("파랑치마", Member.MALE, 50),
				new Member("빨강치마", Member.MALE, 30),
				new Member("노랑치마", Member.MALE, 20));
	
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이 : " + ageAvg);
		
	}

}
