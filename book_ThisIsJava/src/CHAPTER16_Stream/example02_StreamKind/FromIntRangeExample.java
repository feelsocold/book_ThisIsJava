package CHAPTER16_Stream.example02_StreamKind;

import java.util.stream.IntStream;

//정수 범위를 소스로 하는 스트림

public class FromIntRangeExample {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("sum : " + sum);
	}

}
