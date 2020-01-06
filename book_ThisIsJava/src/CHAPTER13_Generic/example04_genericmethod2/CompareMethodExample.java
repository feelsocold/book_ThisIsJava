package CHAPTER13_Generic.example04_genericmethod2;

public class CompareMethodExample {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);	// compare 앞에 구체적인 타입을 명시적으로 지정했지만 생략도 가능하다. 
		if(result1) {
			System.out.println("result1은 논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("result은 논리적으로 동등하지 않는 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1", "BOHANLEE");
		Pair<String, String> p4 = new Pair<>("user2", "LEEBOHAN");
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("result2는 논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("result2는 논리적으로 동등하지 않는 객체입니다.");
		}
		
	}

}
