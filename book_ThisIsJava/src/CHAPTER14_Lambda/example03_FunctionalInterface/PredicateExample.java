package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	private static List<Student2> list = Arrays.asList(
			new Student2("조휴일", "men", 90),
			new Student2("조여정", "women", 75),
			new Student2("이보한", "men", 88),
			new Student2("전지현", "women", 98)
			
	);
	
	public static double avg( Predicate<Student2> predicate ) {
		int count = 0;
		int sum =0;
		
		for (Student2 student2 : list) {
			count++;
			sum += student2.getScore();
			System.out.println(student2.getName());
		}
		return (double) sum / count;
	}
		
	public static void main(String[] args) {
		double maleAvg = avg( t-> t.getSex().equals("men") );
		System.out.println("남자 평균 점수 : " + maleAvg);
		
		double femaleAvg = avg ( t-> t.getSex().equals("women"));
		System.out.println("여자 평균 점수 : " + femaleAvg);
	
	}
	

	
}
