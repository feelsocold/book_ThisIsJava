package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

// 생성자 참조
public class ConstructorReferencesExample {

	public static void main(String[] args) {
		Function<String, Member2> function1 = Member2 :: new; 	//	생성자 참조
		Member2 member1 = function1.apply("angel");				//	매개값 1개
		
		BiFunction<String, String, Member2> function2 = Member2 :: new;
		Member2 member2 = function2.apply("신천사", "angel");
		
	}
	
}
