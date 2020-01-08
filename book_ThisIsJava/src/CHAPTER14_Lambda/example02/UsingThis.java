package CHAPTER14_Lambda.example02;

// this 사용

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			// 람다식
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField);	
											//	바깥 객체의 참조를 얻기 위해서는 클래스명 .this 사용
				
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField);
											// 람다식 내부에서 this는 Inner 객체를 참조
			};
			fi.method();
		}
	}
}
