package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.function.ToIntBiFunction;

// 매개 변수의 메소드 참조

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		System.out.println(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		System.out.println(function.applyAsInt("Java8", "JAVA8"));
		
	}

}
