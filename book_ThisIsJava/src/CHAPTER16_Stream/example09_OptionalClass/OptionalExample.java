package CHAPTER16_Stream.example09_OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/*
		//예외 발생(java.util.NoSuchElemenExeception)
		 	double avg = list.stream()
		 		.mapToInt(Integer :: intValue)
		 		.average()
		 		.getAsDouble();
		*/
		
		// 방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		
		if( optional.isPresent() ) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());
		}else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		// 방법2 
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);	// 값이 저장되어 있지 않을 경우 default값 설정
			System.out.println("방법2_평균 : " + avg);
			
		// 방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균 : " + a));	// 값이 있을 때만, 람다식을 실행
		
		
		
	}

}
