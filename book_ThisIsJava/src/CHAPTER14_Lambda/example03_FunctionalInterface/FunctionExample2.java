package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("조휴일", 95, 93)
	);
	
	public static double avg( ToIntFunction<Student> function ) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);	// 람다식
		}
		double avg = (double) sum / list.size();

		return avg;
	}
	
	public static void main(String[] arg) {
		double englishAvg = avg ( s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수 : " + englishAvg);
	
		double mathAvg = avg( s -> s.gettMathScore() );
		System.out.println("수학 평균 점수 : " + mathAvg);
	}
	
	
}
