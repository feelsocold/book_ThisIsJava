package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
			new Member("조휴일", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시 : " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member("조휴일", "joe", new Address("미국", "뉴욕"))
		);
		System.out.println("거주 도시 : " + city);
				
	}

}
