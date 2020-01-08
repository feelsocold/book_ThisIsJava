package CHAPTER14_Lambda.example01;

// 매개변수가 있고 리턴값이 있는 람다식

public class MyFunctionalInterfaceExample3 {

	public static void main(String[] args) {
		
		MyFunctionalInterface3 fi;
		
		fi = (x,y) -> {
			int result = x + y;
			return result;
			
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> x + y;				// return문만 있을 경우 중괄호{}와 return문 생략
		System.out.println(fi.method(2, 5));
		
		
		
	}
	
	
}
