package CHAPTER14_Lambda.example01;

// 매개변수가 있고 리턴값이 없는 람다식

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		
		MyFunctionalInterface2 fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
			
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(3);
		
		fi = x -> System.out.println(x*5);
		fi.method(4);
		
		
	}

}
