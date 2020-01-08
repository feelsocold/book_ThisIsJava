package CHAPTER14_Lambda.example03_FunctionalInterface;

import java.util.function.Consumer;

// Cousumer의 순차적 연결

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("조휴일", "joe", null));
	}

}
