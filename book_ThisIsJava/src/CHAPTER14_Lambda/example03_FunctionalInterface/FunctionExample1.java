package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

// Function 함수적 인터페이스

public class FunctionExample1 {

	private static List<Student> list = Arrays.asList(
			new Student("조휴일", 90, 95),
			new Student("이보한", 50, 80)
	);
	
	public static void printString( Function<Student, String> function ) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");	// 람다식 실행
		}	
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function ) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student) + "");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.gettMathScore() );
	
	}
		

}
